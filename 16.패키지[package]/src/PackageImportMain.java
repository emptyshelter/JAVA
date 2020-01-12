import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;

/*
 * import com.itwill.shop.member.*;
 * 	- com.itwill.shop.member 패키지에있는 모든 클래스를 import한다.
 * 	- com.itwill.shop.member 패키지의 
 * 	  하위 패키지에 있는 클래스를 import하지 않는다.
 */
/*
줄인클래스이름이동일한 클래스는 import문에기술될수없다
import com.itwill.shop.admin.Member;
*/
/*
 * import 단축키 
 * 	ctrl + shift +o
 */
public class PackageImportMain {

	public static void main(String[] args) {

		Member m1 = new Member();
		System.out.println(m1);

		MemberService memberService = new MemberService();
		System.out.println(memberService);

		com.itwill.shop.admin.Member am1 = new com.itwill.shop.admin.Member();
		System.out.println(am1);

		Order order = new Order();
		System.out.println(order);

		ShopService shopService = new ShopService();
		System.out.println(shopService);

	}

}
