package co.in.nextgencoder.class8;

public class Problem2 {

	public static void main(String[] args) {
		
		/*
		 * Consider a tree that grows 1 meter in summer 
		 * and 2 times its height in winter then what will 
		 * be its height after 3 summers and 3 winters. 
		 * ( current season is summer )
		 *
		 */
		
		
		// tree 
		// summer h + 1 grow
		// winter h * 2 grow
		// rainy  h * 3 grow
	
		// 0
		// summer = 0+1 = 1
		// winter = 1*2 = 2
		// rainy  = 2*3 = 6
		// summer = 6+1 = 7
		// winter = 7*2 = 14
		// rainy  = 14*3 = 42
		
		int h = 0;
		int numSum = 3;
		int numWin = 3;
		int numRainy = 3;
		int totalSeasons = numSum + numWin + numRainy;
		
		for( int i=0; i<totalSeasons; i++) {
			
			// summer	0
			// winter	1
			// rainy	2
			
			// 0 1 2 3 4 5 6
			// 0 1 2 0 1 2 0
			
			if( i%3 == 0) {
				// summer
				h = h+1;
			} 
			
			if( i%3 == 1){
				// winter
				h = h*2;
			}	
			
			if( i%3 == 2) {
				// rainy
				h = h*3;
			}
		}
		
		System.out.println("Height : "+h);
		// Height : 14
		// Height : 42
	}

}
