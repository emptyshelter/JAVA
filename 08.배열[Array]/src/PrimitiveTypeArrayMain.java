/*
 배열타입:  
      - 같은데이타형을 가진 기억장소(변수)여러개의 모음타입 
      - 배열변수의 선언형식
           데이타타입[] 이름; 
           int[] ia;
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int pi;
		pi=34;
		
		int[] ia;//기본형배열
		//int ia[]; 이런식으로 쓰기도함 
		ia = new int[5];
		ia[0]=1;
		ia[1]=2;
		ia[2]=3;
		ia[3]=4;
		ia[4]=5;
		System.out.println("===============================");
		System.out.println(ia[0]);
		System.out.println(ia[1]);
		System.out.println(ia[2]);
		System.out.println(ia[3]);
		System.out.println(ia[4]);
		
		System.out.println("배열객체 멤버수:"+ia.length);
		for (int i = 0; i < ia.length; i++) {
			ia[i]=i+1;
		}
		for (int i = 0; i < ia.length; i++) {
			System.out.println("ia[+"+i+"]-->"+ia[i]);			
		}
		System.out.println("==========기본형1차원배열===========");	
		int[] korArray = new int[10];
		korArray[0]=89;
		korArray[1]=98;
		korArray[2]=56;
		korArray[3]=78;
		korArray[4]=90;
		korArray[5]=71;
		korArray[6]=59;
		korArray[7]=52;
		korArray[8]=73;
		korArray[9]=79;
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot+=korArray[i];			
		}
		System.out.println(korTot);
		System.out.println("반 국어평균"+korTot/korArray.length);
		char[] ca= new char[6];
		ca[0]='H';
		ca[1]='e';
		ca[2]='l';
		ca[3]='l';
		ca[4]='o';
		ca[5]='!';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]);
		}
		System.out.println();
		String[] nameArray= new String[5];
		nameArray[0]="김민태";
		nameArray[1]="이민태";
		nameArray[2]="최민태";
		nameArray[3]="박민태";
		nameArray[4]="정민태";
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
		
		System.out.println();
		System.out.println("==========배열객체초기화{}===========");	
		int[] scoreArray= {90,45,67,63,99};
		char[] gradeArray= {'A','B','F','C','A'};
		boolean[] marriedArray= {true,false,true,false,false};
		String[] irumArray= {"KIM","LEE","PARK","CHOI","SIM"};
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.printf("%d %c %b %s %n", 
					scoreArray[i],
					gradeArray[i],
					marriedArray[i],
					irumArray[i]);
			
	
			 
		}
	}

}
