import java.util.Scanner;

public class ForStar {

	public static void main(String[] args) {
		Scanner msg = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num= msg.nextInt();
		
		
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		*/
		for (int i= 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.printf("★");
			}
			System.out.println();
		}
		System.out.println("====================");
	
		/*
		☆★★★★
		★☆★★★
		★★☆★★
		★★★☆★
		★★★★☆
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i==j)
				System.out.print("☆");
				else
					System.out.print('★');
			}
			System.out.println();
				
			
		}
		System.out.println("====================");
		
		/*
		★
		★★
		★★★
		★★★★
		★★★★★
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(j<i)
					System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("====================");
		/*
		★★★★★
		★★★★
		★★★
		★★
		★
		*/
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if(i<j)
					System.out.print("★");
			}
			System.out.println();
		}	
		/*
		★★★★★
		  ★★★★
		    ★★★
		      ★★
		        ★
		 */
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i<j)
					System.out.print("★");
				else
					System.out.print("  ");
			}
			System.out.println();
			
		}
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i<j)
					System.out.print("★");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}

	}

}
