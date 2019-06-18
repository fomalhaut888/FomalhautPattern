package tw.idv.cwchen.patterns.multi_dispatch.pass_ball;

public class Client {
	
	private static East east;
	private static West west;

	public static void main(String[] args) {
			//組合1
			east = new SubEast1();
			west = new SubWest1();
			east.goEast(west);
			//組合2
			east = new SubEast1();
			west = new SubWest2();
			east.goEast(west);
	}

}
