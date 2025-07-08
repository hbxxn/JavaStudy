package employee.model.vo;

import java.sql.Date;

public class Employee {
	private int empNo;
	private String pwd;
	private String empName;
	private String job;
	private Integer mgrNo;
	private String mgr;
	private Date hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	private String dept;
	private String isAdmin;
	private String status;
	
	public Employee() {}

	public Employee(int empNo, String pwd, String empName, String job, Integer mgrNo, String mgr, Date hireDate,
			int sal, int comm, int deptNo, String dept, String isAdmin, String status) {
		super();
		this.empNo = empNo;
		this.pwd = pwd;
		this.empName = empName;
		this.job = job;
		this.mgrNo = mgrNo;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
		this.dept = dept;
		this.isAdmin = isAdmin;
		this.status = status;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setMgrNo(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", pwd=" + pwd + ", empName=" + empName + ", job=" + job + ", mgrNo="
				+ mgrNo + ", mgr=" + mgr + ", hireDate=" + hireDate + ", sal=" + sal + ", comm=" + comm + ", deptNo="
				+ deptNo + ", dept=" + dept + ", isAdmin=" + isAdmin + ", status=" + status + "]";
	};
}
