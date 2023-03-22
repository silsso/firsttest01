package chapter03;

public class Temporary_01 extends Employee_01 {
	
	private int workHours = 0;
    private int Hourmoney = 10000;
    
	public Temporary_01(String name, int age, String address, String department) {
		super(name, age, address, department);
	}
	
	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
		setSalary(workHours * Hourmoney);
	}

	@Override
	public void printInfo() {
        System.out.println("비정규직");
        super.printInfo();
        System.out.println("일한 시간: " + workHours + "시간");
        System.out.println("급여: " + getSalary() + "원");
    }
	
	

	

}
