package com.itwill.member;

import java.util.ArrayList;

/*
ȸ������������ �����Ұ�ü(Service,Manager)
	- ȸ���������� ���ఴü
	- ȸ���������� ����� Data Access�����õ��۾���
	  MemberDao�� ȣ���� CRUD�� �����Ѵ�. 
*/
public class MemberService {
	
	//private static MemberService _instance; 
	private MemberDao memberDao;
	public MemberService() throws Exception{
		memberDao=new MemberDao();
	}
	/*
	public static MemberService getInstance() throws Exception {
		if(_instance==null) {
			_instance=new MemberService();
		}
		return _instance;
	}
	*.
	/*
	 * ȸ������
	 */
	public boolean memberRegister(Member addMember) throws Exception{
		boolean isSuccess=false;
		if (!memberDao.isDuplicateId(addMember.getId())) {
			memberDao.create(addMember);
			isSuccess= true	;
		}
		return isSuccess;
	}
	/*
	 *ȸ���α���
	 */
	public int login(String id,String password) throws Exception{
		/*
		 * 1.ȸ�����翩��
		 */
		int result=-9999;
		/*
		 * 0:����
		 * 1:���̵��������
		 * 2:�о��������ġ
		 */
		Member member = memberDao.readOne(id);
		if (member==null) {
			result = 1;
		}else if (!member.getPassword().equals(password)) {
			result = 2;
		}else {
			result = 0;
		}
				
		return result;
	}
	
	/*
	 * ȸ���α׾ƿ�
	 */
	
	/*
	 * ȸ���󼼺���(ȸ��1�� no �� ã��)
	 */
	
	/*
	 * ȸ���󼼺���(ȸ��1��  id �� ã��)
	 */
	public Member findById(String id) throws Exception{
		Member member=memberDao.readOne(id);
		return member;
	}
	/*
	 * ȸ������Ʈ(ȸ�������� ��üã��)
	 * ȸ������Ʈ(ȸ�������� �̸�����ã��)
	 * ȸ������Ʈ(ȸ�������� �ּҷ�ã��)
	 * ȸ������Ʈ(ȸ�������� ���̷�ã��)
	 */
	public ArrayList<Member> findMemberByAll() throws Exception{
		ArrayList<Member> findMemberList=new ArrayList<Member>();
		findMemberList= memberDao.readAll();
		return findMemberList;
	}
	/*
	 * ȸ�� �̸�
	 */
	public ArrayList<Member> findMemberByName(String name) throws Exception{
		ArrayList<Member> findMemberList= memberDao.findName(name);
		return findMemberList;
	}
	/*
	 * ȸ�� �ּ�
	 */
	public ArrayList<Member> findMemberByAdress(String address) throws Exception{
		ArrayList<Member> findMemberList= memberDao.findAddress(address);
		return findMemberList;
	}	
	/*
	 * ȸ�� ����
	 */
	public ArrayList<Member> findMemberByAge(int age) throws Exception{
		ArrayList<Member> findMemberList= memberDao.findAge(age);
		return findMemberList;
	}	
	/*
	 * ȸ������
	 */
	public void updateMember(Member updateMember) throws Exception{
		memberDao.update(updateMember);
	}
	/*
	 * ȸ��Ż��
	 */
	public void deleteMember(int no)throws Exception {
		
	}
	public void deleteMember(String id) throws Exception{
		memberDao.delete(id);
	}
}