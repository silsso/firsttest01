package chapter03;

public class EmployeeWage_01 {

	public static void main(String[] args) {
		
		Regular_01 r = new Regular_01("이순신", 35, "서울", "인사");
        Temporary_01 t = new Temporary_01("장보고", 25, "인천", "경리부");

        r.setSalary(5000000);
        r.printInfo();

        t.setWorkHours(120);
        t.printInfo();
	}

}
