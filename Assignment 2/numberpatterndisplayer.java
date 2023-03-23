/**
 * 
 */
/**
 * @author noordin
 *
 */
public class numberpatterndisplayer {
	public static void main(String[] args) {
        // Define a variable to keep track of the number of rows to output
        int rows = 5;

        // Loop through each row to output
        for (int row = 1; row <= rows; row++) {
            // Loop through each column in the current row
            for (int col = 1; col <= row; col++) {
                // Output the current column number
                System.out.print(col);
            }
           
            // It switches to the next line after displaying columns in the current row
            System.out.println();
        }
    }
}