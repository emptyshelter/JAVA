
public class GajunTV implements GajunPower, GajunVolume{
	public void TV_method1() {
		System.out.println("TV method1");
		
	}
	public void TV_method2() {
		System.out.println("TV method2");
		
	}	
	@Override
	public void up() {
		System.out.println("TV Volume.up");
	}
	@Override
	public void down() {
		System.out.println("TV Volume.down");
	}
	@Override
	public void on() {
		System.out.println("TV Power.on");
	}
	@Override
	public void off() {
		System.out.println("TV Power.off");
	}

}
