public class PartTimeStudent extends Student {
    public int workingHours;

    public void showDetails() {
	System.out.println("Name: " + name);
	System.out.println("Student ID: " + studentid);
	System.out.println("Working Hours: " + workingHours);
	System.out.println("Address: " + address);
    }
}