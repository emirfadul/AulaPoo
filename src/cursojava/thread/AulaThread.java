package cursojava.thread;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		
		for (int pos = 0; pos < 10; pos++) {
			
			Thread.sleep(2000);
			System.out.println("Executando uma rotina!");
		}
	}

}
