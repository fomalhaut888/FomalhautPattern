package tw.idv.cwchen.patterns.uni_dispatch;

import java.awt.Canvas;

public class Client {
	
	private static Point p;
	private static Point pc;
	private static Canvas cv;
	public static void main(String args[]) {
			p = new Point();
			pc = new ColorPoint();
			cv = new Canvas();
			
			//靜態多分派
			p.translate(5);//呼叫接收一個int型態參數的版本
			p.translate(1, 2);//呼叫接收兩個int型態參數的版本
			
			//動態單分派
			p.draw(cv);//呼叫 Point.draw()
			pc.draw(cv);//呼叫ColorPoint.draw();
	}
}
