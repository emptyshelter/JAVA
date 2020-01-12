
public class ForNested {

	public static void main(String[] args) {
		int k=0;
		while (k<5) {
			int m=0;
			while (m<5) {
				System.out.printf("k=%d,m=%d %n",k,m);
				m++;
			}
			k++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("================i="+i+"=================");
			for (int j = 0; j < 5; j++) {
				System.out.printf("i=%d,j=%d %n",i,j);
			}			
		}
		/*
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		  ¡Ú¡Ú¡Ú¡Ú¡Ú
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("¡Ú");
			}
			System.out.println();
		}
		
	}

}
