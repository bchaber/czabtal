package czabtal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Precompiler {
	private static List<FileEntry> entries = new ArrayList<FileEntry>();
	
	public static String precompile(String path) {
		return precompile(path, 1);
	}

	private static String precompile(String path, int currentLine) {

		File file;
		FileReader fr;

		file = new File(path);
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			throw new PrecompilerException("File " + path + " not found.");
		}

		BufferedReader br = new BufferedReader(fr);

		Boolean importingMode = true;
		String content = "";
		String line = null;
		int lineNumber = currentLine - 1;
		int offset = 0;

		FileEntry currentFileEntry = new FileEntry(1, 1,
				file.getAbsolutePath(), 0);
		try {
			// numeracja zakladamy od 1 do n
			line = br.readLine();
			while (line != null) {
				// wczytano importa
				if (line.trim().startsWith("import ")) {
					lineNumber += 1;

					if (!importingMode)
						throw new PrecompilerException(
								"Imports are allowed only at the beginig of file.",
								lineNumber);

					String[] s = line.trim().split(" ");
					if (s.length != 2)
						throw new PrecompilerException(
								"Incorrect use of import directive in "
										+ file.getAbsolutePath() + ".",
								lineNumber);
					String filename = file.getAbsolutePath();
					filename = filename.substring(0, filename
							.lastIndexOf(File.separator));
					filename = filename + File.separator + s[1];

					String precompiledContent = precompile(filename, lineNumber);
					content = content.concat(precompiledContent);

					FileEntry fe = entries.get(entries.size() - 1);
					offset += fe.getTo() - fe.getFrom();
					lineNumber = fe.getTo();
				}
				// wczytano nowe linie
				else if (line.trim().isEmpty()) {
					lineNumber++;
					content = content.concat("\n");
				}
				// wczytano inne linie
				else {
					lineNumber++;
					if (importingMode) {
						importingMode = false;
						currentFileEntry.setFrom(lineNumber);
					}
					content = content.concat(line).concat("\n");
				}

				line = br.readLine();
			}
                        currentFileEntry.setTo(lineNumber);
			currentFileEntry.setOffset(offset);
			entries.add(currentFileEntry);

		} catch (IOException e) {
			throw new PrecompilerException("File " + path + " is unreadable.");
		}

		return content;
	}

	public static String getPositionForLine(int line) {
		for (FileEntry fe : entries) {
			if (fe.getTo() >= line) {
				int l = line - fe.getOffset();
				return fe.getFilename() + ":" + l;
			}
		}
		return String.valueOf(line);
	}
}
