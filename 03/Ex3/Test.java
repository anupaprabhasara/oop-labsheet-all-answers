public class Test {
    public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();

	s1.setName("Saman");
	s1.setDitno("IT23658478");
	s1.setAddress("Malabe, Colombo");

	s2.setName("Nuwan");
	s2.setDitno("IT23448765");
	s2.setAddress("Nugegoda, Colombo");
	
	System.out.println("Student 1 Details");
        System.out.println("Name: " + s1.getName());
	System.out.println("IT Number: " + s1.getDitno());
	System.out.println("Address: " + s1.getAddress());
        System.out.println();

        System.out.println("Student 2 Details");
        System.out.println("Name: " + s2.getName());
	System.out.println("IT Number: " + s2.getDitno());
	System.out.println("Address: " + s2.getAddress());
    }
}