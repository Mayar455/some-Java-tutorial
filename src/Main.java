
// This is the main class where all the class instances and even parent class instances will be Invoked.
 
//We extract the functionalities only to the corresponding class instances or their methods(functions).
package  makeupjavaporjectii;
import java.io.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		
		
		System.out.println("\t#.I");
		System.out.println("\n");
		System.out.println(" We read text file from bilgiler and push items into stack.Besides we print out \n items at the instant we add them to the stack."); 
		System.out.println("\n\t The print out ");
		System.out.println("\t...............\n");
		Stack stack =new Stack();
		/*
		 
		 In here we are reading the text file from bilgiler, not only that , we also add items to the stack data structure 
		 Because we will be printing out the data.
		 */
		try {
		    File file = new File("bilgiler.txt"); 
		    Scanner reader = new Scanner(file); 
		 
		    while (reader.hasNextLine()) {
		      String data = reader.nextLine();
		      String items[]=data.split(" ");
		      /* The code is crystal clear, we are identifying "piece wise" workers from "hour wise" workers*/
		      if(items[0].compareToIgnoreCase("piece")==0) {
		    	  
		    	  String NameAndSurname=items[1]+" "+items[2],
		    			  TCIdNumber=items[3];
		    	  int producedPieces =Integer.parseInt(items[4]),
		    		 moneyPerPiece=Integer.parseInt(items[5]); 
		    	  PieceWorker pieceWorker=new PieceWorker(NameAndSurname,TCIdNumber,producedPieces,moneyPerPiece);
		    	  System.out.println(pieceWorker.toString());
		    	  stack.push(pieceWorker);
		    			    
		      }else {
		    	  String NameAndSurname=items[1]+" "+items[2],
		    			  TCIdNumber=items[3];
		    	 int workHours=Integer.parseInt(items[4]),
		    		  wage=Integer.parseInt(items[5]) ;
		    	 HourlyEmployee hourlyEmployee=new HourlyEmployee(NameAndSurname,TCIdNumber,workHours,wage);
		    	 System.out.println(hourlyEmployee.toString());
		    	  stack.push(hourlyEmployee);
		    	    
		    	  
		      }
		    }
		    /* If the txt file is not found, we are spitting a "NotfoundError" to the monitor 
		       If that happens , check out your file or file extension is correct*/
		    reader.close();
		  } catch (FileNotFoundException e) {
		    System.out.println(" The  file can't be resolved, check if the path is correct, and make sure that it is a text file ");
		  }
		System.out.println("\n");
		System.out.println("\t#.II");
		System.out.println("\n");
		System.out.println("In this case we print out  directly from the stack.Because it is stack, stack always read from the top of the array"); 
		System.out.println("\n\t The print out ");
		System.out.println("\t...............\n");
		
		while(!stack.isEmpty()) {
			System.out.println( stack.pop());
		}

	}

}
