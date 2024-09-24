package week6.day1;

public class Student {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id : " + id + "\n" + "Student name : " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email : " + email + "\n" + "PhoneNumber : " + phoneNumber);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudentInfo(2013087);
		obj.getStudentInfo(2013087, "Sabarinathan");
		obj.getStudentInfo("sabari@gmail.com", 9859304863l);
	}

}
