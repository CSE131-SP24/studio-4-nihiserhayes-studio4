package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color orange2 = new Color(222, 137, 0);
		StdDraw.setPenColor(orange2);
		StdDraw.filledRectangle(0, 0, 10, 10);
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0, .25, 1, 0.25);
		Color pink2 = new Color(245, 85, 155);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.5, 0.6, 0.15);
		StdDraw.setPenColor(pink2);
		StdDraw.filledCircle(0.5, 0.6, 0.14);
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(0.5, 0.6, 0.08);
		Color tan = new Color(198, 156, 116);
		StdDraw.setPenColor(tan);
		double[] x = {0.39, 0.5, 0.61, 0.5};
		double[] y = {0.5, 0.2, 0.5, 0.49};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.02);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.5);
	}
}