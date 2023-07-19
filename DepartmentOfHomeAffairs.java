package main;

public class DepartmentOfHomeAffairs extends Government implements PensionFundValue{
	private String IdentityDocument;
	private String passportDocument;
	private boolean citizen;
	private double pensionFund = 55_150_320_040.00;
	
	public DepartmentOfHomeAffairs(String ministerName, String deputyMinister, AuditStatus auditStatus, String identityDocument,
			String passportDocument, boolean citizen) {
		super(ministerName, deputyMinister, auditStatus);
		this.IdentityDocument = identityDocument;
		this.passportDocument = passportDocument;
		this.citizen = citizen;
	}

	public String getIdentityDocument() {
		return IdentityDocument;
	}

	public void setIdentityDocument(String identityDocument) {
		IdentityDocument = identityDocument;
	}

	public String getPassportDocument() {
		return passportDocument;
	}

	public void setPassportDocument(String passportDocument) {
		this.passportDocument = passportDocument;
	}

	public boolean isCitizen() {
		return citizen;
	}

	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}
	
	
	public double getPensionFund() {
		return pensionFund;
	}

	public void setPensionFund(double pensionFund) {
		this.pensionFund = pensionFund;
	}

	@Override
	public void Print() {
		System.out.println("Department Audit Report: " + getAuditStatus());
		System.out.println("ID: " + getIdentityDocument());
		System.out.println("Passport: " + getPassportDocument());
		System.out.println("Citizenship: " + isCitizen());
	}
	
	@Override
	public double PensionFundValue(){
		return getPensionFund();
	}
	
	public int NumberOfImmmigrants() {
		return 10526750;
	}
	
	public int WorkPermitsDistributed() {
		return 4346881;
	}
}
