package chapter03;

public class Regular_01 extends Employee_01{
	
	private int salary;

    public Regular_01(String name, int age, String address, String department) {
        super(name, age, address, department);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    @Override
    public void printInfo() {
    	System.out.println("정규직");
    	super.printInfo();
        System.out.println("급여: " + salary);
        System.out.println("--------------");
        
    }
	
	
}
