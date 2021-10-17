package  makeupjavaporjectii;

abstract class  Employee {
	
	private String NameAndSurname;
	private String TCIdNumber;
	
/*  This is a parent class from which child classes are made
 
   If we are being careful , this class does not allow a direct instantiation of an object 
    Hence, we implement all the abstract methods */
	public    Employee( String NameAndSurname,String TCIdNumber) {
             this.NameAndSurname=NameAndSurname;
             this.TCIdNumber=TCIdNumber;
     }
	/* "Would-be-Implemented" salary, any child class which inherits the parent is obliged to implement the salary method. */
	public abstract double  salary();
	public String getNameAndSurname() {
		return NameAndSurname;
	}
	public void setNameAndSurname(String nameAndSurname) {
		NameAndSurname = nameAndSurname;
	}
	public String getTCIdNumber() {
		return TCIdNumber;
	}
	public void setTCIdNumber(String tCIdNumber) {
		TCIdNumber = tCIdNumber;
	}
	@Override
	public String toString() {
		return "Employee's full name: " + this.getNameAndSurname() + ", TC Id number: " + this.getTCIdNumber();
	}
 
	
	
}
