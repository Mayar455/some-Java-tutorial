package  makeupjavaporjectii;

public class PieceWorker extends Employee{
	
	 private  int producedPieces;
	 private  int   moneyPerPiece;
/* we are making constructor. Attention: this class is a child class so it inherits the parent class */
	public PieceWorker( String NameAndSurname,String TCIdNumber, int producedPieces,int moneyPerPiece) {
		 super(   NameAndSurname,  TCIdNumber);
		 this.moneyPerPiece=moneyPerPiece;
		 this.producedPieces=producedPieces;
	}
	/* calculating the salary from producedPieces and moneyPerPiece  */
	public   double  salary() {
		return  Double.valueOf(this.getProducedPieces()*this.getMoneyPerPiece());
	}
	 
	public int getProducedPieces() {
		return producedPieces;
	}
	public void setProducedPieces(int producedPieces) {
		this.producedPieces = producedPieces;
	}
	public int getMoneyPerPiece() {
		return moneyPerPiece;
	}
	public void setMoneyPerPiece(int moneyPerPiece) {
		this.moneyPerPiece = moneyPerPiece;
	}
	@Override
	public String toString() {
		return super.toString()+", Produced pieces: "+this.getProducedPieces()+", Money per piece: $"+this.getMoneyPerPiece()+", Salary:$"+this.salary();
	}
	
 

}
