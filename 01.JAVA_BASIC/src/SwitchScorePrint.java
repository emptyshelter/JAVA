
public class SwitchScorePrint {
	public static void main(String[] args) {
		/*
		 * 학생2명 데이타를 담을변수선언
		 */
		int no1;
		String name1;
		int kor1, eng1, math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;

		int no2;
		String name2;
		int kor2, eng2, math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;

		/*
		 * 학생2명 기본데이타대입 학번,이름,국어,영어,수학
		 */
		no1 = 1997;
		name1 = "김은정";
		kor1 = 100;
		eng1 = 100;
		math1 = 99;
		rank1 = ' ';

		no2 = 1989;
		name2 = "김상수";
		kor2 = 90;
		eng2 = 80;
		math2 = 99;


		/*
		 * 학생2명 기본데이타를 사용해서 총점 평균 평점계산후 대입
		 * 
		 */

		tot1 = kor1 + eng1 + math1;
		avg1 = 
		grade1 = ' ';
		switch ((int) avg1 / 10) {
		case 9:
			grade1 = 'A';
			break;
		case 8:
			grade1 = 'B';
			break;
		case 7:
			grade1 = 'C';
			break;
		case 6:
			grade1 = 'D';
			break;

		default:
			grade1 = 'F';
			break;
		}

		
		tot2 = kor2 + eng2 + math2;
		avg2 = ((int)((tot2 /3.0)*100+5)/10)/10.0;
		grade2 = ' ';
		switch ((int) avg2 / 10) {
		case 9:
			grade2 = 'A';
			break;
		case 8:
			grade2 = 'B';
			break;
		case 7:
			grade2 = 'C';
			break;
		case 6:
			grade2 = 'D';
			break;

		default:
			grade2 = 'F';
			break;
		}
		if (avg1>avg2) {
			rank1= 1;
			rank2= 2;
		} else {
			rank1=2;
			rank2=1;

		}
		/*
		 * - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요 
		 * - 평균은 소수점이하 1자리수까지만 출력하세요(반올림) - 출력포맷
		 * ---------------학생 성적출력------------------- 
		 * 학번  이름  국어 영어  수학  총점 평균 평점 석차
		 * ----------------------------------------------- 
		 *  1 	김경호  45 	 56    78   334  34.8  A    3 
		 *  2 	김경수  45	 56    78   334  34.8  A    2 
		 * -----------------------------------------------
		 */
		System.out.println("---------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(no1 + " " + name1 + "  " + kor1 + "  " + eng1 + "   " + math1 + "  " + tot1 + "  " + avg1
				+ "  " + grade1+"    "+rank1);
		System.out.println(no2 + " " + name2 + "   " + kor2 + "   " + eng2 + "   " + math2 + "  " + tot2 + "  " + avg2
				+ "  " + grade2+"    "+rank2);
		System.out.println("-----------------------------------------------");

 }

}



