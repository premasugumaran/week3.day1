package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("student id is"+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("student id and name is"+id+name);
	}
	
	public void getStudentInfo(String email,int phno) {
	System.out.println("student email and phone number is"+email+phno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students stu=new Students();

stu.getStudentInfo(51434439);
stu.getStudentInfo(51404439,"prema");
stu.getStudentInfo("pre",5689);
	}

}
