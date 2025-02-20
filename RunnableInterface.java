package SimpleJavaproblems;

class ThreadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("run method called");
	}
	
}


public class RunnableInterface {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		Runnable run = () ->{
			System.out.println("run method called using lambda");
		};
		Thread threadLambda = new Thread(run);
		threadLambda.start();
	}
}
