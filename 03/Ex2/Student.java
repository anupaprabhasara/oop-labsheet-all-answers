public class Student {
    private String name;
    private String ditno;
    private String address;

    public Student(String name, String ditno, String address) {
	this.name = name;
	this.ditno = ditno;
	this.address = address;
    }

    public void displayDetails() {
	System.out.println("Name: " + name);
	System.out.println("IT Number: " + ditno);
	System.out.println("Name: " + address);
    }
}