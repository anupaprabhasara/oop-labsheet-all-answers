public class Test {
    public static void main(String[] args) {
	Student s1 = new Student("Saman", "IT23658478", "Malabe, Colombo");
	Student s2 = new Student("Nuwan", "IT23448765", "Nugegoda, Colombo");

	System.out.println("Student 1 Details");
        s1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details");
        s2.displayDetails();
    }
}