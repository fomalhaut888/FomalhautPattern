package tw.idv.cwchen.patterns.uni_dispatch;

import java.awt.Canvas;

public class Point {
	
	private int x, y;
	
	public void draw(Canvas c) {
			//do something
	}
	
	public void translate(int d) {
			x += d;
			y += d;
	}
	
	public void translate(int xd, int yd) {
			x += xd;
			y += yd;
	}
}
