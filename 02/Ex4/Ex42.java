import java.io.Console;

public class Ex42 {
    public static void main(String[] args) {

        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available.");
            return;
        }

        try {
	    String inputLen = console.readLine("Enter the length: ");
            double len = Double.parseDouble(inputLen);

	    String inputWid = console.readLine("Enter the width: ");
            double wid = Double.parseDouble(inputWid);

	    String inputHei = console.readLine("Enter the height: ");
            double hei = Double.parseDouble(inputHei);

	    double vol = len * wid * hei;

            System.out.println("Volume of the cube: " + vol);
        }
	catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double value.");
        }
    }
}