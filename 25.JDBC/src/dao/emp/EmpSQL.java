package dao.emp;

public class EmpSQL {
	public static final String SELECT_ALLEMP_WITHDEPT=
"select empno,ename,job,mgr,hiredate,sal,comm,e.deptno,dname,loc from emp e left outer join dept d on e.deptno = d.deptno";
	public static final String SELECT_EMPNO_WITHDEPT=
"select empno,ename,job,mgr,hiredate,sal,comm,e.deptno,dname,loc from emp e left outer join dept d on e.deptno = d.deptno where empno=?";
	public static final String EMP_INSERT="insert into emp values(emp_no_seq.nextval, ?, ?, ?, sysdate, ?, ?, ?)";
	public static final String EMP_UPDATE= "update emp set ename=?, job=? , mgr=?, sal=?, comm=? where empno=?";
	public static final String EMP_DELETE="delete from emp where empno=?";
	public static final String EMP_FIND_EMPNO= "select * from emp where empno=?";
	public static final String EMP_FIND_DEPTNO= "select * from emp where deptno=?";
}