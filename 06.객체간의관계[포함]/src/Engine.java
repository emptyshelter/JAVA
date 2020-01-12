public class Engine {
    private String type;
    private int cc;
    public Engine() {
		
	}
    public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	public void print(){
		System.out.print(type+" "+cc);
    }
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}

}
