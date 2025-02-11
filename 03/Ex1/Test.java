public class Test {
    public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();

	s1.name = "Saman";
	s1.ditno = "IT23846598";
	s1.address = "Malabe, Colombo";

	s2.name = "Nuwan";
	s2.ditno = "IT23569845";
	s2.address = "Nugegoda, Colombo";

	System.out.println("Student 1 Details");
        s1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details");
        s2.displayDetails();
    }
}