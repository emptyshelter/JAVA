
public class IfNested {

	public static void main(String[] args) {
		int kor=56;
		/*
		 * 1. 입력 데이타 유효성 체크
		 */
		if(kor<0 || kor>100){
			System.out.println("점수는 1~100사이의 정수입니다.");
			/*
			 * 실행흐름 return
			 */
			return;
		}
		/*
		 * 평점산출 A,B,C,D,F
		 */
		char grade= ' ';
		if (kor >= 90) {
			grade='A';
		}else {
			if(kor>=80) {
				grade='B';
			}else {
				if (kor>=70) {
					grade='C';
				} else {
					if (kor>=60) {
						grade='D';
					}else {
						grade='F';
					}

				}
				
			}
			
		}		
		System.out.println("1.학점은 "+grade+"입니다.");	
		if(kor>=90) {
			
		}else if(kor>=80) {
			grade ='B';
		}else if(kor>=70) {
			grade ='C';			
		}else if(kor>=60) {
			grade ='D';			
		}else if(kor>=60) {
			grade ='E';			
		}else {
			grade ='F';			
		}
		System.out.println("2.학점은"+grade+"입니다.");
			
		/*
		 * Quiz : 각학점별로 메세지를 출력하세요
		 * 		A+(98점이상): 최우수
		 * 		A			: 우수
		 * 		B			: 선방
		 * 		C			: 으이그~	
		 * 		D			: 재수강
		 * 		F			: ㅠㅠ
		 */					
		return;
	}	
			
}
