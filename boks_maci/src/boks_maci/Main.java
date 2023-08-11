package boks_maci;

public class Main {
	public static void main(String[] args) {
	      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0,(int)(Math.random()*100));
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0,(int)(Math.random()*100));
	      
	      if(marc.chance >alex.chance) {
	    	  Ring r = new Ring(marc,alex , 90 , 100);
		      r.run();
	      }
	      else {
	    	  Ring r = new Ring(alex,marc , 90 , 100);
		      r.run(); 
	      }
	      
	    }
}
