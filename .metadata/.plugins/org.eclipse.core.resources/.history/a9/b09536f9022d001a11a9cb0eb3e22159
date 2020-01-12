package myway.member;

import java.io.Serializable;

public class Member implements Serializable {
    /* Variable */
    private static final long serialVersionUID = -6134344699002389252L;
    
    private int no;
    private String name;
    private String id;
    private String pw;
    private boolean isAdmin;
    
    /* Constructor */
    public Member() {}
    
    public Member(String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }
    
    /* Method */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(no);
        sb.append("  ");
        sb.append(name);
        sb.append("  ");
        sb.append(id);
        sb.append("  ");
        sb.append(pw);
        sb.append("  ");
        sb.append(isAdmin);
        return sb.toString();
    }

    // Getter, Setter
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
