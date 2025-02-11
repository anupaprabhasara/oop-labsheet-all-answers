import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex41 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Enter the length: ");
	    double len = Double.parseDouble(reader.readLine());

	    System.out.print("Enter the width: ");
            double wid = Double.parseDouble(reader.readLine());

	    System.out.print("Enter the height: ");
            double hei = Double.parseDouble(reader.readLine());

	    double vol = len * wid * hei;

	    System.out.println("Volume of the cube: " + vol);

        }
	catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
	catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double value.");
        }
    }
}
