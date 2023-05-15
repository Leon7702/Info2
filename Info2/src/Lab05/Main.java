package Lab05;

public class Main {

	public static void main(String[] args) {

		String outputLine;  
		for (int row = 1; row <= 40; row++){      
		    outputLine = "";      
		    for (int column = 1; column <= 40; column++){
		        outputLine = outputLine + determineCharacter(column, row);
		    }      
		    System.out.println (outputLine);
		} 
	}

	public static char determineCharacter (int col, int row) {
		//if statements for '?'
		if (row == 1 || row == 2 || row == 39 || row == 40) return '?';
		if (col == 1 || col == 2 || col == 39 || col == 40) return '?';
		//if statements for '/'
		if (row >= 3 && row <= 17 && col >=3 && col <= 16) {
			if ((row % 2 != 0) && (col % 3 == 0)) return '/';
			if ((row % 2 == 0) && (col % 3 == 2)) return '/';

			if ((row % 2 == 0) && (col % 3 == 1)) return '=';
			if ((row % 2 == 0) && (col % 3 == 2)) return ' ';


		}

	
		return ' ';
		
	}

}
