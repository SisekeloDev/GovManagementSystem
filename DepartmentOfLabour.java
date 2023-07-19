package main;

public class DepartmentOfLabour extends Government implements PensionFundValue{
	private int UIFClaims;
	private int MaternityClaims;
	
	public DepartmentOfLabour(String ministerName, String deputyMinister, AuditStatus auditStatus, int uIFClaims, int maternityClaims) {
		super(ministerName, deputyMinister, auditStatus);
		UIFClaims = uIFClaims;
		MaternityClaims = maternityClaims;
	}

	public int getUIFClaims() {
		return UIFClaims;
	}

	public void setUIFClaims(int uIFClaims) {
		UIFClaims = uIFClaims;
	}

	public int getMaternityClaims() {
		return MaternityClaims;
	}

	public void setMaternityClaims(int maternityClaims) {
		MaternityClaims = maternityClaims;
	}
	
	@Override
	public void Print() {
		System.out.println("Department Audit Report: " + getAuditStatus());
		System.out.println("UIF Claims :" + getUIFClaims());
		System.out.println("Maternity Claims :" + getMaternityClaims());
	}
	
	@Override
	public double PensionFundValue(){
		return 20_560_520_000.00;
	}	
}
