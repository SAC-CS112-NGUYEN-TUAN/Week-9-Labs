package prjarrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

 class RandomNum{
	 int randomNo;
	public int high;
	Scanner input = new Scanner(System.in);
	public int highlow(){
			 System.out.println("Enter max random number 0-max:");	
		 high = input.nextInt();
		 return high;
	}
	
	
	public void generate(){
		
		 randomNo = 0 + (int) (Math.random()*high);
	 }
	 public int getNum(){
			return randomNo;
	 
	 }

}