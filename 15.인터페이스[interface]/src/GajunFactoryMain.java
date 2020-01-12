
public class GajunFactoryMain {

	public static void main(String[] args) {
		System.out.println("**********가전제품공장**************");
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		GajunMobile mobile1 = new GajunMobile();
		GajunMobile mobile2 = new GajunMobile();
		GajunPower[] gajunArray = new GajunPower[6];
		gajunArray[0] = tv1;
		gajunArray[1] = tv2;
		gajunArray[2] = audio1;
		gajunArray[3] = audio2;
		gajunArray[4] = mobile1;
		gajunArray[5] = mobile2;

		GajunVolume[] gajunVolumes = new GajunVolume[6];
		/*
		 * ClassCastException 
		 * gajunVolumes= (GajunVolume[])gajunArray;
		 */
		gajunVolumes[0] = tv1;
		gajunVolumes[1] = tv2;
		gajunVolumes[2] = audio1;
		gajunVolumes[3] = audio2;
		gajunVolumes[4] = mobile1;
		gajunVolumes[5] = mobile2;
		System.out.println("**********가전제품검사*************");
		for (int i = 0; i < gajunArray.length; i++) {
			System.out.println("------------" + (i + 1) + "번 가전제품검사------------");
			gajunArray[i].on();
			GajunVolume tempGajun = (GajunVolume) gajunArray[i];
			tempGajun.up();
			tempGajun.down();
			gajunArray[i].off();
		}
		/*
		System.out.println("**********가전제품검사(Power)*************");
		for (int i = 0; i < gajunArray.length; i++) {
			gajunArray[i].on();
			gajunArray[i].off();
		}
		System.out.println("**********가전제품검사(Volume)*************");
		for (int i = 0; i < gajunVolumes.length; i++) {
			gajunVolumes[i].up();
			gajunVolumes[i].down();
		}
		*/
	}

}
