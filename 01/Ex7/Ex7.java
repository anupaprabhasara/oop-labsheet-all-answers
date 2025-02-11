import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
	Scanner Obj = new Scanner(System.in);

	System.out.print("Enter number 1: ");
	int num1 = Obj.nextInt();

	System.out.print("Enter number 2: ");
	int num2 = Obj.nextInt();

	int sum = num1 + num2;
	
	double avg = sum / 2.0;

	System.out.println("Sum: " + sum);
	System.out.println("Avg: " + avg);
    }
}