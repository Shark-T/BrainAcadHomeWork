package lab2_2;

public class Employee {
	void calcSalary(String name, double... salary){
		double sum = 0;
		for (double i : salary){
			sum = sum + i;
		}
		System.out.print("Employee " + name + "has a total salary of " );
		System.out.printf("%.2f",sum);
		System.out.println("");
	}


	//class Accountant{
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.calcSalary("Vasya", 100.50, 222.5, 321.5, 230.3);
		employee.calcSalary("Kolya", 150.50, 111.5, 121.5, 430.3);
		employee.calcSalary("Dima", 208.50, 522.5, 21.5, 290.3);
	}
}
