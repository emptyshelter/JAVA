
public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*
		 * 멤버정보를 담기위한 변수선언
		 *  - 회원번호 ,이름, 주민번호, 성별, 결혼횟수, 흡연여부...
		 */
	
		
		int mnum;
		String name;
		//long rnum1;
		String rnum;
		String gender;
		int marry;
		String smoking;
		
		/*
		 * 변수내용 출력
		 */
		mnum= 1987;
		name="김민태";
		rnum= "123456-7891011";
		gender ="Male";
		marry = 0;
		smoking= "YES";
		
		
		/*
		 * 변수에 정보대입
		 */
		System.out.printf("회원번호:%d\n",mnum);
		System.out.printf("회원이름:%s\n",name);
		System.out.printf("주민번호:%s\n",rnum);
		System.out.printf("성별:%s\n",gender);
		System.out.printf("결혼횟수:%d\n",marry);
		System.out.printf("흡연여부:%s\n",smoking);		
		
		
		/*
		if (mnum >=0 && mnum <=999999999) {
			
			System.out.printf("회원님의 회원번호는 %d 입니다.",mnum);			
		} else {
			System.out.printf("%d 는 회원번호로 부적합합니다",mnum);
		
		if(true) {
			System.out.printf("%s는 회원이름으로 적합합니다\n",name);
			
		}else {
			System.out.printf("%s는 회원이름으로 부적합합니다\n",name);
		}
		*/
			
		}

	}


