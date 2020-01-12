
public class LocalVariableInitialization {
	private int no;
	private String name;
	public LocalVariableInitialization() {
		// TODO Auto-generated constructor stub
	}
	//alt+shift+s --> o
	public LocalVariableInitialization(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(no+"\t"+name);
	}
	//alt+shift+s --> r 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
