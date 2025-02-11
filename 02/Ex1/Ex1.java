public class Ex1 {
    public static void main(String[] args) {
	int miles = 26, yards = 385;
	double kilometers;

	kilometers = (miles + (yards / 1760.0)) * 1.609;

	System.out.println("Number of kilometers: " + kilometers);
    }
}