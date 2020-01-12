/*
������(thread)(�����帧): 
   - ���α׷��ڵ带 �����Ű�� �� 
   - ���ξ�����,AWT ������,��������� ������
   - ���� �����--> �ΰ������� ���ÿ� �ؾ��Ҷ�..
 
- �����尴ü ����� ���(����)
     
	type A:
	1. Thread Ŭ������ ��ӹ޴´�.
	2. Thread class�� run method�� overriding �Ѵ�.
		�������:public void run()
	3. Thread ��ü�� �����Ѵ�.
	4. Thread ��ü�����ؼ� Thread�� ���۽�Ų��.
	
    type B:
	1. Runnable interface�� implements �Ѵ�.
	2. Runnable interface�� implements �Ѱ�ü��
	   Thread Ŭ������ �����ڿ� �־ Thread ��ü�� �����Ѵ�
    3. Thread �� ���۽�Ų��.

   ����>>
    1. Thread Ŭ������ ��ӹ޾Ƽ� �����..
      ex> public class ThreadEx extends Thread{
          		// run �޽�带 ������ �ؾ��Ѵ�.
          		 public void run(){
          		 	//����ڰ����� ������ �� �������ڵ�
          		 }
          } 
    2. Runnable interface�� implements �ؼ������
      ex>  public class ThreadImpl implements Runnable{
           		public void run(){
          		 }
           } 
*/
public class MainThreadMain {

	public static void main(String[] args) {
		/*
		 * ���� �ڵ带 �������� �������� ������ ��ü
		 */
		Thread currentThread = Thread.currentThread();
		String currentThreadName = currentThread.getName();
		System.out.println("currentThreadName:"+currentThreadName);
		System.out.println("1.main ������");
		MainThreadCalled mtc = new MainThreadCalled();
		mtc.mainThreadCalledMethod();
		System.out.println("2.main ������");
	
	}

}
