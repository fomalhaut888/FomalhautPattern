package tw.idv.cwchen.patterns.multi_dispatch.pass_ball;

public class SubEast2 extends East {

	@Override
	public void goEast(West west) {
			west.goWest2(this);
	}
	
	public String myName2() {
			return "SubEast2";
	}
}
