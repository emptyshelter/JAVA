//변수선언(single line comment)
/*
 변수선언(multi line comment)
 변수선언(multi line comment)
 */

/*
 * 
 */
public class VariableDeclare {
	public static void main(String[] args) {
		int score1;
		score1= 100;
		System.out.println(score1);
		score1= 200;
		System.out.println(score1);
		score1= 300;
		System.out.println(score1);
		
		int score2=400;
		System.out.println(score2);
		/*
		 * <<content assist>>
		 * ctrl + space
		 */
		int _number, $number;
		/*
		int 7number;
		int number7;
		*/
		int 번호;
		_number= 333;
		$number= 555;
		번호=777;
		System.out.println(_number);
		System.out.println($number);
		System.out.println(번호);
		
		int kor, eng, math;
		kor=89;
		eng=69;
		math=88;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		
		/*
		 score3 cannot be resolved to a variable
		 score3= 500;
		 */
		/*
		Duplicate local variable score1
		int score1;
		*/
		String name;
		name="김경호";
		System.out.println(name);		
		name= "김경수";
		System.out.println(name);
	
	}

}
