import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
	Scanner Obj = new Scanner(System.in);
	
	System.out.print("Enter the length: ");
	double len = Obj.nextDouble();

	System.out.print("Enter the width: ");
	double wid = Obj.nextDouble();

	System.out.print("Enter the height: ");
	double hei = Obj.nextDouble();

	double volume = len * wid * hei;

	System.out.print("Volume of the cube: " + volume);
    }
}