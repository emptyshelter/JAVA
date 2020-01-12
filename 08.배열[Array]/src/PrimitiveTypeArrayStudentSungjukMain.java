
public class PrimitiveTypeArrayStudentSungjukMain {

	public static void main(String[] args) {
		System.out.println("----학생데이타를 저장하기위한배열객체의생성,초기화----------");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		String[] nameArray = { "KIM", "LEE", "PAR", "CHI", "SIM", "GOO", "PIM", "LIM", "MIN", "AIM" };
		int[] kora = { 34, 67, 78, 23, 99, 67, 56, 91, 55, 70 };
		int[] enga = { 44, 68, 79, 21, 59, 87, 54, 41, 85, 79 };
		int[] matha = { 44, 57, 68, 73, 89, 97, 86, 71, 65, 50 };
		int[] tota = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avga = { .0, .0, .0, .0, .0, .0, .0, .0, .0, .0 };
		char[] gradea = new char[10];
		int[] ranka = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		//총점,평균,평점
		for (int i = 0; i < noArray.length; i++) {
			tota[i] = kora[i]+enga[i]+matha[i];
			avga[i]=tota[i]/3;
			if(avga[i]>=90) {
				gradea[i]='A';
			}else if(avga[i]>=80) {
				gradea[i]='B';
			}else if(avga[i]>=70) {
				gradea[i]='C';
			}else if(avga[i]>=60) {
				gradea[i]='D';
			}else {
				gradea[i]='F';
			}
		}
		System.out.println("3번(primary key) 학생 한명의 성적출력");
		for (int i = 0; i < ranka.length; i++) {
			if(noArray[i]==3)
				System.out.println(noArray[i] + "   " + nameArray[i] + "   " + kora[i] + "   " + enga[i] + "   " + matha[i]
						+ "   " + tota[i] + "   " + avga[i] + "   " + gradea[i] + "   " + ranka[i]);
			break;
		}
		System.out.println("국어점수 70점 이하 학생의 성적출력");
		for (int i = 0; i < ranka.length; i++) {
			if (kora[i]< 70) {
				System.out.println(noArray[i] + "   " + nameArray[i] + "   " + kora[i] + "   " + enga[i] + "   " + matha[i]
						+ "   " + tota[i] + "   " + avga[i] + "   " + gradea[i] + "   " + ranka[i]);
				
			}
		}		
		System.out.println("평점 F 학생의 성적출력");
		System.out.println("석차계산(Quiz)");
		for (int i = 0; i < avga.length; i++) {
			if (avga[0] < avga[i]) {
				ranka[0]++;
			}
		}
		System.out.println("총점수 오름차수정렬[Quiz]");
		for (int i = 0; i < tota.length; i++) {
			for (int j = 0; j < tota.length-1; j++) {
				if (tota[j]>tota[j+1]) {			
					//총점만교환
					int tempTot= tota[j];
					tota[j]= tota[j+1];
					tota[j+1]=tempTot;
				}
			
			}
			System.out.println(noArray[i] + "   " + nameArray[i] + "   " + kora[i] + "   " + enga[i] + "   " + matha[i]
					+ "   " + tota[i] + "   " + avga[i] + "   " + gradea[i] + "   " + ranka[i]);


		}
		
		
		
		
		
		System.out.println("---------------학생 성적출력-------------------");
		System.out.println("학번 이름 국어 영어 수학 총점  평균 평점 석차");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(noArray[i] + "   " + nameArray[i] + "   " + kora[i] + "   " + enga[i] + "   " + matha[i]
					+ "   " + tota[i] + "   " + avga[i] + "   " + gradea[i] + "   " + ranka[i]);
		}
	}

}
