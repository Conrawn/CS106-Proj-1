package rockcountdown;

import java.io.*;
import java.util.*;

import org.apache.commons.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		String filename = in.nextLine();
		File x = new File(filename);
		String file = FileUtils.readFileToString(x);

		String[] strings = file.split("\r\n");
		ArrayList<Song> songs = new ArrayList<>();

		for (int i = 0; i < strings.length; i++) {
			songs.add(new Song(strings[i]));
		}

		StringBuilder builder = new StringBuilder();

		for (int i = songs.size() - 1; i > -1; i--) {
			builder.append(songs.get(i).getRank());
			builder.append("\t");
			builder.append(songs.get(i).getTitle());
			builder.append("\r\n");

		}
		System.out.print(builder);
		System.out.println("");
		System.out.println("Complete");

		in.close();
	}

}
