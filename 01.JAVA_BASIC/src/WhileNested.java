
public class WhileNested {

	public static void main(String[] args) {
	
		/*
		  �ڡڡڡڡ�
		  �ڡڡڡڡ�
		  �ڡڡڡڡ�
		  �ڡڡڡڡ�
		  �ڡڡڡڡ�
		  ��[0,0]��[0,1]��[0,2]��[0,3]��[0,4]		  
		  ��[1,0]��[1,1]��[1,2]��[1,3]��[1,4]
		  ��[2,0]��[2,1]��[2,2]��[2,3]��[2,4]
		  ��[3,0]��[3,1]��[3,2]��[3,3]��[3,4]
  		  ��[4,0]��[4,1]��[4,2]��[4,3]��[4,4]

		 */
		int i=0;
		while(i<5) {
			int j=0;
			while (j<5) {
				System.out.print("��["+i+","+j+"]");
			
			j++;
			}
			System.out.println("\n");
			i++;
		}
		/*
		  �١ڡڡڡ�
		  �ڡ١ڡڡ�
		  �ڡڡ١ڡ�
		  �ڡڡڡ١�
		  �ڡڡڡڡ�
		 */
		System.out.println("-----------------------");
		i=0;	
		while (i<5) {
			int j=0;
			while (j<5) {
				if(i==j) {
				System.out.print("��");
				}else {
				System.out.print("��");
				}
				j++;
			}
			System.out.println("\n");
			i++;
		}
		System.out.println("-----------------------");
		/*
		 �١١١١�
		 �ڡ١١١�
		 �ڡڡ١١�
		 �ڡڡڡ١�
		 �ڡڡڡڡ�
		 */
		i=0;
		while (i<5) {
			int j=0;
			while (j<5) {
				if (j>=i) {
					System.out.print("��");
				}else{
					System.out.print("��");
			}
			j++;
			}System.out.println();
		i++;
		}
		System.out.println("-----------------------");
		/*
		 ��
		 �ڡ�
		 �ڡڡ�
		 �ڡڡڡ�
		 �ڡڡڡڡ�
		 */
		i=0;
		while(i<5) {
			int j=0;
			while (j<5) {
				System.out.print("��");
				if(j==i)
					break;
				j++;
			}System.out.println();
			i++;
		}
		System.out.println("------------------");
		/*
		 �ڡڡڡڡ�
		 �ڡڡڡ�
		 �ڡڡ�
		 �ڡ�		 
		 ��
		 */
		i=0;
		while(i<5) {
			int j=0;
			while (j<5) {
				System.out.print("��");
				if(i+j>=4)
					break;
				j++;
			}System.out.println();
			i++;
		}
		System.out.println("------------------");
		/*
		 ��
		 �ڡ�
		 �ڡڡ�
		 �ڡ�
		 ��
		 */
		i=0;
		while(i<5){
			int j=0;
			while (j<5) {
				System.out.print("��");
				if (i==j) { 
					break;
				}else if(i+j>=4)
					break;
				j++;				
				}System.out.println();
				i++;
			}
		System.out.println("------------------");
		/*
		   ��
		  �ڡڡ�
		 �ڡڡڡڡ�
		  �ڡڡ�
		   ��
		 */
		i=0;
		while(i<5){
			int j=0;
			int num;			
			num =0;
			while (j<5) {
				if (i+j>=2)					
				System.out.print(" ");				
				System.out.println("��");
				System.out.println();
				j++;				
				}System.out.println();
				i++;
			}
		}
}
	



	


