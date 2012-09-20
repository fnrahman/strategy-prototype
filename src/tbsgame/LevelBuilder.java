package tbsgame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import tbsgame.tiles.GrassTile;
import tbsgame.tiles.Tile;

public class LevelBuilder {
	public static Level readLevelFile(String path) {
		Level lvl = null;
		Scanner s;
		int width = 0;
		int height = 0;
		String defaultTile;
		try {
			BufferedReader in = new BufferedReader(new FileReader(path));
			s = new Scanner(in.readLine());
			if (s.hasNextInt())
				width = s.nextInt();
			else {
				in.close();
				throw new IOException("First line missing width and height definitions");
			}
			if (s.hasNextInt())
				height = s.nextInt();
			else {
				in.close();
				throw new IOException("First line missing height definition");
			}
			
			if (s.hasNext())
				defaultTile = s.next();
			else
				defaultTile = "tile_grass";
			
			lvl = constructLevel(in, width, height, defaultTile);
			in.close();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read level file at " + path);
		}
		
		return lvl;
	}

	private static Level constructLevel(BufferedReader in, int width, 
			int height, String defaultTile) throws IOException {
		String line;
		Level lvl = new Level(width, height);
		int row = 0;
		Tile t;
		while (row < height) {
			line = in.readLine();
			char[] lineChars = line.toCharArray();
			
			if (lineChars.length != width)
				throw new IOException(String.format("INCORRECT WIDTH ERROR: Expecting %s, read in %s", 
						width, lineChars.length));
			
			for (int i=0; i<width; i++) {
				switch(lineChars[i]) {
					case '.': t = new GrassTile(); break;
					default: t = new GrassTile();
				}
				lvl.setTile(i, row, t);
			}
			++row;
		}
		return lvl;
	}
}
