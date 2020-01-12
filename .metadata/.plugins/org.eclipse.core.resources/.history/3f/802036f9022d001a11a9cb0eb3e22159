package myway.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import myway.SubwayMain;

public class MemberDAO {
    /* Variable */
    File file;
    File dir;
    
    /* Constructor */
    public MemberDAO() throws Exception {
        dir = new File(SubwayMain.class.getResource("/").getPath() + "data");
        file = new File(dir, "member.ser");
        if (!file.exists()) {
            file.createNewFile();
            fileWrite(new ArrayList<>());
        }
    }
    
    /* Method */
    // read
    private ArrayList<Member> fileRead() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        @SuppressWarnings("unchecked")
        ArrayList<Member> memberList = (ArrayList<Member>) ois.readObject();
        ois.close();
        return memberList;
    }
    // write
    private void fileWrite(ArrayList<Member> memberList) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(memberList);
        oos.close();
    }
    
    // select
    public ArrayList<Member> selectAll() throws Exception {
        return fileRead();
    }
    //
    public Member selectById(String id) throws Exception {
        for (Member member : selectAll()) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
    //
    public Member selectByNo(int no) throws Exception {
        for (Member member : selectAll()) {
            if (member.getNo() == no) {
                return member;
            }
        }
        return null;
    }
    
    public void insert(Member member) throws Exception {
        ArrayList<Member> memberList = selectAll();
        memberList.add(member);
        for (Member m : memberList) {
            System.out.println(m);
        }
        fileWrite(memberList);
    }
    
    public void delete(Member member) throws Exception {
        ArrayList<Member> memberList = selectAll();
        memberList.remove(member);
        fileWrite(memberList);
    }
    
    public void delete(int no) throws Exception {
        ArrayList<Member> memberList = selectAll();
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getNo() == no) {
                memberList.remove(i);
                break;
            }
        }
        fileWrite(memberList);
    }
    
    public void update(Member member) throws Exception {
        ArrayList<Member> memberList = selectAll();
        for (int i = 0; i < memberList.size(); i++) {
            if (member.getNo() == memberList.get(i).getNo()) {
                memberList.set(i, member);
                break;
            }
        }
    }
}
