/*
 * type A:
	1. Thread Ŭ������ ��ӹ޴´�.
	2. Thread class�� run method�� overriding �Ѵ�.
	   �������:public void run()
 */
public class CreateCustomThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("��."+Thread.currentThread().getName()+" ������");
			System.out.println("��."+Thread.currentThread().getName()+" ������ return;");
		}
	}

}
