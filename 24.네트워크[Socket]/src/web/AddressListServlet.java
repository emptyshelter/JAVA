package web;

import java.io.PrintWriter;
import java.util.ArrayList;

public class AddressListServlet {
	public void service(PrintWriter out) throws Exception {
		out.println("<html>");
		out.println("<body>");
		AddressDao3 addressDao3 = new AddressDao3();
		ArrayList<Address> addressList = addressDao3.selectAll();
		for (Address address : addressList) {
			out.println(address.getNo()+","+address.getId()+","+address.getName()+","+address.getPhone()+"<br/>");
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
