package  makeupjavaporjectii;

public class Stack {

	
	Employee stack[];
	int position;// we are tracking where we left off.
	public Stack( ) {
		this.stack=new  Employee[100];
		this.position=0;
	}
	
	// With the help off position , we can simply add items into the stack given that position is known.
	public void push( Employee employee) {
		this.stack[this.position]=employee;
		this.position++;
		/* By the way this array is dynamic , even if we use the static array , every time the length 
		   of the array surpasses the exiting one we double the size of the array so that it may accommodate the coming items*/
		if(this.position==this.stack.length) {
			Employee temporary[]=new Employee [this.stack.length];
			for (int i=0;i<temporary.length;i++) {
				temporary[i]=this.stack[i];
			}
			this.stack=new Employee[this.stack.length*2];
			for (int i=0;i<temporary.length;i++) {
				this.stack[i]=temporary[i];
			}
		}
	}
	// the remover method from the stack
	public Employee pop() {
	   Employee popped=this.stack[this.position-1];
	   this.stack[this.position-1]=null;
	   position--;
		return popped;
	}
   
   /* 
     checking if the stack is empty.... 
    */
   public boolean isEmpty() {
     if(this.position==0) return true;
      else return false;
   }
   







}
