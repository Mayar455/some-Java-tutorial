package  makeupjavaporjectii;

public class HourlyEmployee extends Employee{
	 private int workHours;
	 private int  wage ;
	 /* we are making constructor. Attention: this class is a child class so it inherits the parent class */
	public HourlyEmployee( String NameAndSurname,String TCIdNumber, int workHours, int  wage) {
		 super(NameAndSurname,TCIdNumber);
		 this.wage=wage;
		 this.workHours=workHours;
	}
	/* calculating the salary from producedPieces and moneyPerPiece  */
    public double salary() {
    	return  Double.valueOf(this.getWorkHours()*this.getWage());
    }
    
	public int getWorkHours() {
		return workHours;
	}
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	@Override
	public String toString() {
		return super.toString()+", Work hour: "+this.getWorkHours()+", Wage: $"+this.getWage()+", Salary: $"+this.salary();
	}
    
}
