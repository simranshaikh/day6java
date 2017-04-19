
public class MyThread extends Thread {

	
	public MyThread() {
		setName("t1");
		start();
		
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello Shefu !!!! ");
		
	}

	public static void main(String[] args) {
		new MyThread();
		
		System.out.println();
	}
}
