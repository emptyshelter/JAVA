package com.itwill06.service.academy;

import java.util.ArrayList;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {
	
	private AcademyMember[] members={
			new AcademyStudent(1, "KIM", "자바"),
			new AcademyStudent(2, "LEE", "리눅스"),
			new AcademyStudent(3, "PARK", "자바"),
			new AcademyStudent(4, "LEE", "IOT"),
			new AcademyGangsa(5, "CHOI", "프로그래밍"),
			new AcademyGangsa(6, "KIM", "DB"),
			new AcademyGangsa(7, "DIM", "OS"),
			new AcademyStaff(8, "AIM", "영업"),
			new AcademyStaff(9, "QIM", "생산")
	};
	
	
	public AcademyMember[] getMembers() {
		return members;
	}
	
	public void print() {
		for (int i = 0; i < members.length; i++) {
			AcademyMember academyMember = members[i];
			academyMember.print();
		}
	}
	/*
	public AcademyStudent findAcademyStudentByNo(int no) {
		return null;
	}
	public AcademyGangsa findAcademyGangsaByNo(int no) {
		return null;
	}
	public AcademyStaff findAcademyStaffByNo(int no) {
		return null;
	}
	*/
	public AcademyMember findAcademyMemberByNo(int no) {
		AcademyMember findMember=null;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getNo()== no) {
				findMember=members[i];
			}
		}
		return findMember;
	}
	public AcademyMember[] findAcademyMemberByName(String name) {
		AcademyMember[] findMember=null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				count++;
			}
		}
		findMember= new AcademyMember[count];
		for (int i = 0; i < members.length; i++) {
			if (members[i].getName().equals(name)) {
				findMember[count++]=members[i];
			}
		}
		return findMember;
	}
	/*
	 * 강사 or 학생 or Staff들 반환( instanceof연산자)
	 */
	public AcademyMember[] findAcademyMembersByType(int type) {
		AcademyMember[] findMembers=null;
		int count=0;
		for(int i=0; i<members.length; i++) {
			if(type==AcademyMember.STUDENT_TYPE) {
				if(members[i] instanceof AcademyStudent) {
					count++;
				}
			}else if(type==AcademyMember.GANGSA_TYPE) {
				if(members[i] instanceof AcademyGangsa) {
					count++;
				}
			}else if(type==AcademyMember.STAFF_TYPE) {
				if(members[i] instanceof AcademyStaff) {
					count++;
				}
			}
		}
		findMembers = new AcademyMember[count];
		count=0;
		for (int i = 0; i < members.length; i++) {
			if(type==AcademyMember.STUDENT_TYPE) {
				if(members[i] instanceof AcademyStudent) {
					findMembers[count++]=members[i];
				}
			}else if(type==AcademyMember.GANGSA_TYPE) {
				if(members[i] instanceof AcademyGangsa) {
					findMembers[count++]=members[i];
				}
			}else if(type==AcademyMember.STAFF_TYPE) {
				if(members[i] instanceof AcademyStaff) {
					findMembers[count++]=members[i];
				}
			}
		}
		return findMembers;
	}	
	/*
	public AcademyStudent[] findAcademyStudentsByBan(String ban) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyGangsa[] findAcademyGangsasBySubject(String subject) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	public AcademyStaff[] findAcademyStaffsByDepart(String depart) {
		AcademyMember[] findMembers=null;
		return findMembers;
	}
	*/
	/*
	 * 자바반     학생들 찾아서 반환해줘 
	 * 리눅스과목 강사들 찾아서 반환해줘 
	 * 영업부서   스텝들 찾아서 반환해줘 
	 */
	public AcademyMember[] findByAcademyMembers(int type,String searchStr) {
		AcademyMember[] findMembers = null;
		int count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && type == AcademyMember.STUDENT_TYPE) {
				if (members[i] instanceof AcademyStudent) {
					AcademyStudent tempStudent = (AcademyStudent) members[i];
					if (tempStudent.getBan().equals(searchStr)) {
						count++;
					}
				}
			} else if (members[i] != null && type == AcademyMember.GANGSA_TYPE) {
				if (members[i] instanceof AcademyGangsa) {
					AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
					if (tempGangsa.getSubject().equals(searchStr)) {
						count++;
					}
				}
			} else if (members[i] != null && type == AcademyMember.STAFF_TYPE) {
					if (members[i] instanceof AcademyStaff) {
						AcademyStaff tempStaff = (AcademyStaff) members[i];
						if (tempStaff.getDepart().equals(searchStr)) {
							count++;
						}
					}
				}
		}
		findMembers= new AcademyMember[count];
		count=0;
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && type == AcademyMember.STUDENT_TYPE) {
				if (members[i] instanceof AcademyStudent) {
					AcademyStudent tempStudent = (AcademyStudent) members[i];
					if (tempStudent.getBan().equals(searchStr)) {
						findMembers[count++] = members[i];
					}
				}
			} else if (members[i] != null && type == AcademyMember.GANGSA_TYPE) {
				if (members[i] instanceof AcademyGangsa) {
					AcademyGangsa tempGangsa = (AcademyGangsa) members[i];
					if (tempGangsa.getSubject().equals(searchStr)) {
						findMembers[count++] = members[i];
					}
				}
			} else if (members[i] != null && type == AcademyMember.STAFF_TYPE) {
					if (members[i] instanceof AcademyStaff) {
						AcademyStaff tempStaff = (AcademyStaff) members[i];
						if (tempStaff.getDepart().equals(searchStr)) {
							findMembers[count++] = members[i];
						}
					}
				}
			}
			return findMembers;
		}
	
	public AcademyMember[] findByAcademyMembers2(AcademyMember searchMember) {
		AcademyMember[] findMembers = null;
		int count=0;
		if (searchMember instanceof AcademyStudent) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent&&
					((AcademyStudent) searchMember).getBan().equals(((AcademyStudent)members[i]).getBan())) {
					count++;
				}
			}
		}else if (searchMember instanceof AcademyGangsa) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa&&
					((AcademyGangsa) searchMember).getSubject().equals(((AcademyGangsa)members[i]).getSubject())){
						count++;
				}
			}
		} else if(searchMember instanceof AcademyStaff) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff &&
					((AcademyStaff) searchMember).getDepart().equals((((AcademyStaff)members[i]).getDepart()))) {
					count++;
				}
			}
		}
		findMembers = new AcademyMember[count];
		count=0;
		if (searchMember instanceof AcademyStudent) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStudent&&
					((AcademyStudent) searchMember).getBan().equals(((AcademyStudent)members[i]).getBan())) {
					findMembers[count++]=members[i];
				}
			}
		}else if (searchMember instanceof AcademyGangsa) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyGangsa&&
					((AcademyGangsa) searchMember).getSubject().equals(((AcademyGangsa)members[i]).getSubject())){
					findMembers[count++]=members[i];
				}
			}
		} else if(searchMember instanceof AcademyStaff) {
			for (int i = 0; i < members.length; i++) {
				if (members[i] instanceof AcademyStaff &&
					((AcademyStaff) searchMember).getDepart().equals((((AcademyStaff)members[i]).getDepart()))) {
					findMembers[count++]=members[i];
				}
			}
		}
		return findMembers;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
