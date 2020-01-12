package com.itwill.member;

import java.io.Serializable;

/*
 * DTO(Data Transfer Object)��ü
 *   - ��� 1���� ����Ÿ�� �������ִ� ��ü
 *   - ����1�� ���ڵ�,DB ���̺� �Ѱ� row
 */
public class Member implements Serializable {
	/*
	 * ����ʵ�
	 */

	private String id;//ȸ�����̵�
	/*
	 * - �ߺ������ʾƾ��ϴ��ʵ�
	 */
	private String password;
	private String name;
	private String address;
	private int age;
	private boolean married;
	/*
	 * ������
	 */
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String id, String password, String name, String address, int age, boolean married) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.age = age;
		this.married = married;
	}


	/*
	 * setter,getter
	 */
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", address=" + address + ", age="
				+ age + ", married=" + married + "]\n";
	}

	
	
	
	
}
