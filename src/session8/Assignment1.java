package session8;

public class Assignment1 {
	 
	//Class Timer to print Time out Message every 3 seconds
	private static class Timer extends Thread{
		//Declare Time out Variable
		private final int TIME_OUT = 3000;
		public void run(){
			while(true){
			try{
				//To Print Time out Message every 3 seconds
				Thread.sleep(TIME_OUT);		
				System.out.println("**** 3 Seconds passed  - Time out***");
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			}
		}
	}

	public static void main(String[] args) {
		try {
            Thread u = new Timer();
            System.out.println("Program prints Time out message after every 3 seconds");
            u.start();
	}
		catch(Exception E){
			System.out.println(E);
		}
	}
}

