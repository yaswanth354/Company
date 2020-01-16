
public class Employee {

	private int employeeId;

	private String employeeName;

	private Laptop l;

	private Company c;

	public Employee(int employeeId, String employeeName, Laptop l, Company c) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.l = l;
		this.c = c;
	}

	public Company getC() {
		return c;
	}

	public void setC(Company c) {
		this.c = c;
	}

	public Employee(int employeeId, String employeeName, Laptop l) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.l = l;
	}

	public Laptop getL() {
		return l;
	}

	public void setL(Laptop l) {
		this.l = l;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", l=" + l + ", c=" + c + "]";
	}

	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
