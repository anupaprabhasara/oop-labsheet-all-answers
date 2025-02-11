public class Student extends Person {
    public String studentid;

    public void showDetails() {
	System.out.println("Name: " + name);
	System.out.println("Student ID: " + studentid);
	System.out.println("Address: " + address);
    }
}