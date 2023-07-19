package main;

public abstract class Government {
	private String ministerName;
	private String deputyMinister;
	private AuditStatus auditStatus;
	
	public Government(String ministerName, String deputyMinister, AuditStatus auditStatus) {
		this.ministerName = ministerName;
		this.deputyMinister = deputyMinister;
		this.auditStatus = auditStatus;
	}
	
	public String getMinisterName() {
		return ministerName;
	}
	public void setMinisterName(String ministerName) {
		this.ministerName = ministerName;
	}
	public String getDeputyMinister() {
		return deputyMinister;
	}
	public void setDeputyMinister(String deputyMinister) {
		this.deputyMinister = deputyMinister;
	}
	
	public AuditStatus getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(AuditStatus auditStatus) {
		this.auditStatus = auditStatus;
	}

	public abstract void Print();
	
}
