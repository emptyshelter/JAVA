package byte_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectInputStreamMain {

	public static void main(String[] args) throws Exception{
		ObjectInputStream ois1=
				new ObjectInputStream(
						new FileInputStream("student.ser"));
		Student readStudent = (Student)ois1.readObject();
		readStudent.print();
		System.out.println("------student.ser ---> Student-----");
		
		ObjectInputStream ois2=
				new ObjectInputStream(
						new FileInputStream("student_array.ser"));
		Student[] readStudentArray=(Student[])ois2.readObject();
		for (Student student : readStudentArray) {
			student.print();
		}
		System.out.println("------student_array.ser ---> Student[]-----");
		
		ObjectInputStream ois3=
				new ObjectInputStream(
						new FileInputStream("student_arraylist.ser"));
		ArrayList<Student> readStudentArrayList = 
				(ArrayList<Student>)ois3.readObject();
		for (Student student : readStudentArrayList) {
			student.print();
		}
		
	}

}
