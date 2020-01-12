package myway.member;

import java.util.ArrayList;

import myway.exception.IdDuplicateException;
import myway.exception.IdNotFoundException;
import myway.exception.InvalidPasswordException;
import myway.exception.NoRegisteredMemberException;

public class MemberManager {
    /* Variable */
    private MemberDAO dao;
    
    /* Constructor */
    public MemberManager() throws Exception {
        this.dao = new MemberDAO();
    }
    
    /* Method */
    // select
    public ArrayList<Member> selectAll() throws Exception {
        return dao.selectAll();
    }
    // insert
    public void insert(Member member) throws Exception {
        dao.insert(member);
    }
    // delete
    public void delete(Member member) throws Exception {
        dao.delete(member);
    }
    
    public void delete(int no) throws Exception {
        dao.delete(no);
    }
    // update
    public void update(Member member) throws Exception {
        dao.update(member);
    }
    
    // 멤버 로그인
    public Member login(String id, String pw) throws Exception {
        if (dao.selectAll().isEmpty()) {
            // no registered member exception
            throw new NoRegisteredMemberException();
        }

        Member member = dao.selectById(id);
        
        if (member == null) {
            // IdNotFoundException
            throw new IdNotFoundException();
        }
        
        if (member.getPw().equals(pw)) {
            return member;
        } else {
            // InvalidPasswordException
            throw new InvalidPasswordException();
        }
    }
    // 멤버 등록
    public void join(String name, String id, String pw) throws Exception {
        join(name, id, pw, false);
    }
    
    public void join(String name, String id, String pw, boolean isAdmin) throws Exception {
        ArrayList<Member> memberList = dao.selectAll();
        for (Member member : memberList) {
            if (member.getId().equals(id)) {
                // IdDuplicateException
                throw new IdDuplicateException();
            }
        }
        Member member = new Member(name, id, pw);
        // 등록된 멤버가 한명도 없으면 0번으로 지정
        // 그렇지 않으면 마지막 멤버의 번호 +1번으로 지정
        if (memberList.isEmpty()) {
            member.setNo(0);
            member.setAdmin(true);
        } else {
            int no = memberList.get(memberList.size() - 1).getNo();
            member.setNo(++no);
            member.setAdmin(isAdmin);
        }
        dao.insert(member);
    }
}
