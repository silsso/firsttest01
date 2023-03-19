package chapter02;

public class x_y_01 {

	public static void main(String[] args) {

		double x = 0; // Math.pow 정의 숙지!!!
		double y = 0;
        for (x = 5.0; x <= 10.0; x += 0.5) {
        	
            y = 4 * Math.pow(x, 3) + 5 * Math.pow(x, 2) + x + 2;
            
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}

