
// Multidimensional Array
// int[][] array = new int[ 3 ][ 4 ]
// int[][] b = { { 1, 2 }, { 3, 4, 5 } };

public class MulArray {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		
		System.out.println( "Values in array1 by row are" );
		outputArray( array1 ); // displays array1 by row
		System.out.println( "\nValues in array2 by row are" );
		outputArray( array2 ); // displays array2 by row
		
	} 
		
		// output rows and columns of a two-dimensional array
		public static void outputArray(int [][] array) 
		{
			for ( int row = 0; row < array.length; row++ )
				{
			// loop through columns of current row
					for ( int column = 0; column < array[ row ].length; column++ )
					{
					System.out.print( array[ row ][ column ] + "\t" );
					
					}
					System.out.println(); // start new line of output
				}
			
		}
		
}


