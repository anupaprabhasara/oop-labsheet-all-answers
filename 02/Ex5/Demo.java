import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        
        System.out.print("Enter a number: ");
        int num = Obj.nextInt();
        
        boolean result = evenOddNumber.findEvenOrOdd(num);
        
        if(result) {
            System.out.println(num + " is an Even number.");
        }
	else {
            System.out.println(num + " is an Odd number.");
        }
        
        Obj.close();
    }
}