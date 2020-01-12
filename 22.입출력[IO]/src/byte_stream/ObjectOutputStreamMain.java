package byte_stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputStreamMain {

	public static void main(String[] args)throws Exception {
		
		System.out.println("----Student Object write--> student.ser-----");
		ObjectOutputStream oos1=
				new ObjectOutputStream(
						new FileOutputStream("student.ser"));
		Student stu0=new Student(1, "KIM", 89, 93, 67);
		/*
		 * - 직렬화를 가능하게하려면  반드시 java.io.Serializable
		 *    인터페이스를 구현하여야한다.(flag interface)
		 * - 구현하지않으면 NotSerializableException이발생 
		 */
		oos1.writeObject(stu0);
		oos1.close();
		Student[] studentArray={
				new Student(1,"KIM",89,93,94),
				new Student(2,"HIM",88,77,98),
				new Student(3,"AIM",65,87,99),
		};
		System.out.println("----Student[] write--> student_array.ser-----");
		ObjectOutputStream oos2=
				new ObjectOutputStream(
						new FileOutputStream("student_array.ser"));
		oos2.writeObject(studentArray);
		oos2.close();
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(10,"SIM",80,93,94));
		studentList.add(new Student(11,"VIM",87,92,12));
		studentList.add(new Student(12,"NIM",89,95,94));
		System.out.println("----ArrayList<Student>  write--> student_arraylist.ser-----");
		ObjectOutputStream oos3=
				new ObjectOutputStream(
						new FileOutputStream("student_arraylist.ser"));
		oos3.writeObject(studentList);
		oos3.close();
	}

}
