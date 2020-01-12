
public class QuizAnswer {

	public static void main(String[] args) {
		/*
		 * 1. Quiz :À±³â¿©ºÎ>
		 * 	- 4ÀÇ¹è¼ö
		 * 	- 100ÀÇ¹è¼ö°¡ ¾Æ´Ñ¼ö
		 * 	- 400ÀÇ ¹è¼ö
		 */	
		
		int y = 2019;
		boolean isLeapYear = false;
		
		isLeapYear = ((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0);				
		if (isLeapYear) {
			System.out.println(y+"³âÀº À±³âÀÔ´Ï´Ù.\n");
				
		}else {
			System.out.println(y+"³âÀº Æò³âÀÔ´Ï´Ù./n");
			
		}
				/*
		 * 2. Quiz: ¹®ÀÚÆÇ´Ü
		 * 	1. ÇÑ±Û¿©ºÎ
		 * 	2. ¾ËÆÄºª´ë¹®ÀÚ, ¼Ò¹®ÀÚ, ¼ýÀÚ
		 */	
		
		char kor ='±è';
		if (kor>='°¡' &&kor <='ÆR') {
			System.out.println(kor+"Àº(´Â) ÇÑ±ÛÀÔ´Ï´Ù.");
		} 
		if (kor>='A' &&kor <='Z') {
			System.out.println(kor+"Àº(´Â) ¿µ¾îÀÔ´Ï´Ù.");
		}	
		if (kor>='0') {
			System.out.println(kor+"Àº(´Â) ¼ýÀÚÀÔ´Ï´Ù.");
		}
		/*
		 * 3. Quiz: ´ÙÀ½¹®ÀÚ´Â ¾ÆÀÌµðÀÇ Ã¹±ÛÀÚÀÔ´Ï´Ù
		 * 		 ÀÌ¹®ÀÚ°¡ ¾ÆÀÌµðÀÇ Ã¹±ÛÀÚ·Î À¯È¿ÇÑÁö ÆÇ´Ü ÈÄ Ãâ·ÂÇÏ¼¼¿ä
		 * 		 - ¾ÆÀÌµðÀÇ Ã¹±ÛÀÚ´Â ¾ËÆÄºª´ë¹®ÀÚ ÀÌ°Å³ª ¼Ò¹®ÀÚÀÌ´Ù
		 */

	}

}
