package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("RNC Private Limited");
	}
private void companyId() {
	System.out.println("12345");
}
private void companyAddress() { 
	System.out.println("Jurong East, Singapore");
}
private void employee() {
	System.out.println("Employee strength is 2000");

}
public static void main(String[] args) {
	CompanyInfo RNC = new CompanyInfo ();
	RNC.companyName();
	RNC.companyId();
	RNC.companyAddress();
}
}
