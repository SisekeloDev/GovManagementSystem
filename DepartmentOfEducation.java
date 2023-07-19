package main;

public class DepartmentOfEducation extends Government implements PensionFundValue{
	private long grade12CerticatesDistributed;
	private int numberOfRegisteredTeachers;
	
	public DepartmentOfEducation(String ministerName, String deputyMinister, AuditStatus auditStatus, long grade12CerticatesDistributed,
			int numberOfRegisteredTeachers) {
		super(ministerName, deputyMinister, auditStatus);
		this.grade12CerticatesDistributed = grade12CerticatesDistributed;
		this.numberOfRegisteredTeachers = numberOfRegisteredTeachers;
	}

	public long getGrade12CerticatesDistributed() {
		return grade12CerticatesDistributed;
	}

	public void setGrade12CerticatesDistributed(long grade12CerticatesDistributed) {
		this.grade12CerticatesDistributed = grade12CerticatesDistributed;
	}

	public int getNumberOfRegisteredTeachers() {
		return numberOfRegisteredTeachers;
	}

	public void setNumberOfRegisteredTeachers(int numberOfRegisteredTeachers) {
		this.numberOfRegisteredTeachers = numberOfRegisteredTeachers;
	}
	
	@Override
	public void Print() {
		System.out.println("Department Audit Report: " + getAuditStatus());
		System.out.println("Grade12 Certicates Distributed :" + getGrade12CerticatesDistributed());
		System.out.println("Registered Teachers :" + getNumberOfRegisteredTeachers());
	}
	
	@Override
	public double PensionFundValue(){
		return 80_960_520_000.00;
	}
}
