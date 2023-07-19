package main;

public class GovManagementSystem {

	public static void main(String[] args) {
		DepartmentOfHomeAffairs department1 = new DepartmentOfHomeAffairs("John Doe", "Jane Doe", 
				AuditStatus.QualifiedOpinion, "Smart Cards/Identity Books", "Tourism Book", true);
		
		department1.Print();
		department1.NumberOfImmmigrants();
		
//		if(department1 instanceof DepartmentOfHomeAffairs) {
//			DepartmentOfHomeAffairs dprtmnt = (DepartmentOfHomeAffairs)department1;
//			System.out.println("Number Of Immmigrants: " + dprtmnt.NumberOfImmmigrants());
//		}
	}
}
