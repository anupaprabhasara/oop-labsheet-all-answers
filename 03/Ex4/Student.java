public class Student {
    private String name;
    private String ditno;
    private String address;

    public void setName(String name) {
	this.name = name;
    }

    public void setDitno(String ditno) {
	this.ditno = ditno;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getDetails() {
	return "I am a Student.\nMy name is " + name + ".\nI am from " + address + ".\nMy dit no is " + ditno;
    }
}