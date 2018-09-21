package command;

public class ThreadControl extends Thread {

	@Override
	public void run() {

		try {

			Thread.sleep(tempo);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("Thread " + number);
	}

	private int number, tempo;

	public ThreadControl(int thread_number, int tempo) {
		this.number = thread_number;
		this.tempo = tempo;
		start();
	}
}
