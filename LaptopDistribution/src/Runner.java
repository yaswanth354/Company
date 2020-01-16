import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		System.out.println("Enter the company Id");
		c.setCompanyId(sc.nextInt());
		System.out.println("Enter the company Name");
		c.setCompanyName(sc.next());
		System.out.println("Enter the number of employees");
		int n = sc.nextInt();
		Laptop l = new Laptop();

		Employee emp[] = new Employee[n];
		for (int i = 0; i < n; i++) {

			emp[i] = new Employee();
			System.out.println("Enter the employee Id");
			emp[i].setEmployeeId(sc.nextInt());
			System.out.println("Enter the employee name");
			emp[i].setEmployeeName(sc.next());
			// c.setEmp(emp);
			emp[i].setC(c);

			System.out.println("Enter the laptop id");
			l.setLaptopId(sc.nextInt());
			System.out.println("Enter the laptop name");
			l.setLaptopName(sc.next());
			emp[i].setL(l);
		}
		/*----------Search Operation-------------*/
		System.out.println("Enter the employee id to search");
		int eid = sc.nextInt();
		System.err.println("Employee Details are:  ");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmployeeId() == eid) {
				System.out.println(emp[i].getL().getLaptopId());
				System.out.println(emp[i].getL().getLaptopName());
				System.out.println(emp[i].getEmployeeName());
				System.out.println(emp[i].getC().getCompanyName());
				System.out.println(emp[i].getC().getCompanyId());
			}
		}

		/*---------****---------******Sorting-------********-------*/
		

	}
}
