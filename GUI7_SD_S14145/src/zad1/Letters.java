package zad1;

public class Letters implements Runnable {

	private String letters;
	private char tab[];
	private Thread  thr_list [] = new Thread [tab.length];
	
	public Letters (String letters){
		this.letters = letters; 
		for (int i = 0; i < letters.length(); i++){
  		  tab[i] = letters.charAt(i);
  		  thr_list[i] = new Thread().setName("Thread " + tab[i]);
  	}
		
	}

	      @Override
	      public void run() {
	   
	    	  
	      }

		public Thread[] getThreads() {
			
			return thr_list;
		}

}
