import java.util.Arrays;

public class Company {

	private int companyId;

	private String companyName;

	private Employee emp[];

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee[] getEmp() {
		return emp;
	}

	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", emp=" + Arrays.toString(emp)
				+ "]";
	}

	public Company(int companyId, String companyName, Employee[] emp) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.emp = emp;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

}
