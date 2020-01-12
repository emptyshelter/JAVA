package testmain;

import myway.member.Member;
import myway.member.MemberManager;

public class MemberTestMain {
    public static void main(String[] args) throws Exception {
        MemberManager mgr = new MemberManager();
        
        Member member = new Member("name1", "id1", "pw1");
        
//        for (int i = 0; i < 30; i++) {
//            mgr.join("name" + i, "id" + i, "pw" + i);
//        }
        
        mgr.join("name", "id", "pw");
        
        
        
        for (Member m : mgr.selectAll()) {
            System.out.println(m);
        }
    }
}
