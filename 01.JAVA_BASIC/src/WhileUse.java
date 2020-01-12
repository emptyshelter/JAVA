
public class WhileUse {

	public static void main(String[] args) {
		/*
		 * 1~10»çÀÌÀÇ Á¤¼ö Ãâ·Â
		 */
		int i = 0;
		while (i < 10) {
			int su = i + 1;
			System.out.println(su);
			i++;

		}
		System.out.println();

		/*
		 * 1~10»çÀÌÀÇ Á¤¼öÁß È¦¼ö¸¸ Ãâ·Â
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 2 == 1) {
				System.out.print(su + ",");

			}
			i++;
		}
		System.out.println();

		/*
		 * 1~10Á¤¼öÁß¿¡¼­ 4ÀÇ ¹è¼ö¸¸ Ãâ·Â
		 */
		i = 0;
		while (i < 10) {
			int su = i + 1;
			if (su % 4 == 0) {
				System.out.print(su + ",");
			}
			i++;

		}
		System.out.println();
		/*
		 * 1~100»çÀÌÀÇ Á¤¼öÁß¿¡¼­ 3ÀÇ¹è¼öÀÌ¸é¼­ 4ÀÇ ¹è¼ö¸¸ Ãâ·Â
		 */
		i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
		System.out.println();
		/*
		 * 1~100»çÀÌÀÇ Á¤¼öÀÇ ÇÕ
		 */
		i = 1;
		int tot=0;
		int oddTot=0;
		int evenTot=0;
		while (i<= 100) {			
			tot += i;
			if (i % 2 == 0) {
				evenTot += i;
			} else {
				oddTot += i;
			}
			i++;
		}
		System.out.println("1~100»çÀÌÀÇ Á¤¼öÀÇ ÇÕ: " + tot);
		System.out.println("1~100»çÀÌÀÇ Â¦¼öÀÇ ÇÕ: " + evenTot);
		System.out.println("1~100»çÀÌÀÇ È¦¼öÀÇ ÇÕ: " + oddTot);
	    
		/*
		 * ¹®ÀÚÃâ·Â
		 */
		char c1=0;
		while(c1< 655535) {
			System.out.print(c1);
			if ((c1+1)%100==0) {
				System.out.println();
			}
			c1++;
		}
		System.out.println();
		char c2='°¡';
		int count=0;
		while (c2<='ÆR') {
			System.out.print(c2);
			count++;
			if(count%10==0) {
				System.out.print("\n");											
			}
			c2++;
			
		}
		
	}
	
}

	

