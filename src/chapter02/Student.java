package chapter02;

public class Student {

	private String major = "";
	private int stunum = 0;

	public Student(String major, int stunum) {
		super();
		this.major = major;
		this.stunum = stunum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStunum() {
		return stunum;
	}

	public void setStunum(int stunum) {
		this.stunum = stunum;
	}

	public static void main(String[] args) {

		Student student = new Student("",0);
		
		student.setMajor("건축과");
		student.setStunum(20230101);
		
		System.out.println("학과 : " + student.getMajor() + ", 학번 : " + student.getStunum());
		
	}

}
