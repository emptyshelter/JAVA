import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.order.Order;

/*
 * import com.itwill.shop.member.*;
 * 	- com.itwill.shop.member ��Ű�����ִ� ��� Ŭ������ import�Ѵ�.
 * 	- com.itwill.shop.member ��Ű���� 
 * 	  ���� ��Ű���� �ִ� Ŭ������ import���� �ʴ´�.
 */
/*
����Ŭ�����̸��̵����� Ŭ������ import��������ɼ�����
import com.itwill.shop.admin.Member;
*/
/*
 * import ����Ű 
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
