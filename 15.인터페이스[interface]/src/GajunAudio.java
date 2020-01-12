
public class GajunAudio implements GajunPower,GajunVolume{

	@Override
	public void up() {
		System.out.println("Audio Volume.up");
	}

	@Override
	public void down() {
		System.out.println("Audio Volume.down");
	}

	@Override
	public void on() {
		System.out.println("Audio Power.on");
	}

	@Override
	public void off() {
		System.out.println("Audio Power.off");
	}
	

}
