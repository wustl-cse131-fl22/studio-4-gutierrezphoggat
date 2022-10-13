package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledRectangle(0.4, 0.6, 0.2, 0.8);
		           StdDraw.setPenColor(StdDraw.BLUE);
		           StdDraw.filledRectangle(0.0, 0.6, 0.4, 0.8);
		           StdDraw.setPenColor(StdDraw.RED);
		           StdDraw.filledRectangle(1, 0.6, 0.4, 0.8);
		           StdDraw.setPenColor(StdDraw.BLACK);
		           StdDraw.setPenRadius(0.84);
		           StdDraw.rectangle(0.5, 0.5, 0.9, 0.9);
	}
}