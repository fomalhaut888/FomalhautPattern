package tw.idv.cwchen.patterns.multi_dispatch.pass_ball;

public class SubEast1 extends East {

	@Override
	public void goEast(West west) {
			west.goWest1(this);
	}
	
	public String myName1() {
			return "SubEast1";
	}
}
