
public class GajunMobile implements GajunPower,GajunVolume{

	@Override
	public void up() {
		System.out.println("Mobile Volume.up");
	}

	@Override
	public void down() {
		System.out.println("Mobile Volume.down");
	}

	@Override
	public void on() {
		System.out.println("Mobile Power.on");
	}

	@Override
	public void off() {
		System.out.println("Mobile Power.off");
	}
	

}
