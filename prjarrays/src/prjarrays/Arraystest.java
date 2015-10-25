package prjarrays;
import java.awt.Dimension;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JPanel;

public class Arraystest {

	public static void main(String[] args) {
		double oddpercent = 0;
		double evenpercent = 0;
		double[] oddguess = new double [10];
		double[] evenguess = new double [10];
		double[] cpuodd = new double [10];
		double[] cpueven = new double [10];
		double[] roundwin = new double [10];
		String[] winlose = new String[10];
		
		
		double wingame = 0;
		double winpercent = 0;
		int i= 0;
		double sumodd = 0;
		double sumeven = 0;
		int randomnums;
		String playerguess;
		
		int e ;
		
		for (e = 0; e < winlose.length; e++){
		winlose[e] = "Game is not play yet";}; // shorten codes by arrays , yay !
		
		for (i = 0; i < evenguess.length; i++){
		
			
		//generate random number odd or even
		randomnums = 1 + (int) (Math.random()*2);
		System.out.println(randomnums); //debug
		
		//dice is odd/even
				String result;
			    if ( randomnums % 2 == 0 )
			         result = "even";
			      else
			         result = "odd";
			    System.out.println(result);
			    
			    if (result.equals("even")){ cpueven[i] =1;}
			    else {cpuodd[i] =1 ;}			    
			    int round = i+1;
			    String guessRcase = JOptionPane.showInputDialog("Round "+round+" Computer came up with a random number, is it odd or even ?:");
			    String guess = guessRcase.toLowerCase();
			    System.out.println("Guess :"+guess);//debug
			
			    if(guess.equals("even")) {			    	
			    		winlose[i] = "win";
			    		evenguess[i] = 1;
			    		sumeven = sumeven + evenguess[i];
			    		evenpercent = sumeven*100/round;
			    		oddpercent = 100 - evenpercent;
			    		
			    		System.out.println("sumeven "+sumeven);
			    	}
			    else {
			    		winlose[i] = "lose";
			    		oddguess[i] = 1;
			    		sumodd = sumodd + oddguess[i];
			    		oddpercent = sumodd*100/round;
			    		evenpercent = 100 - oddpercent;
		    		
		    		System.out.println("sumodd "+oddguess[i]);			    	   
			    	}	
			    
			    //winning percent
			    if (guess.equals(result)){
			    roundwin[1] =1;
			    wingame++;}
				winpercent =  wingame*100/round;
				System.out.println(winpercent); //debug
				
				//winning or not
				if (guess.equals(result)){
					JOptionPane.showMessageDialog(null,"Game round: "+round+" Computer came up with: "+ result +" number \n" +"Player is right");
				}
				else{
				JOptionPane.showMessageDialog(null,"Game round: "+round+" Computer came up with: "+ result +" number \n" +"Player is wrong");
				}
			    
			    
				String Historydisplay1 = JOptionPane.showInputDialog("Do you want to see history ? Y/N :");
				String Historydisplay = Historydisplay1.toLowerCase();
				
				if(Historydisplay.equals("y")){
					JPanel panel = new JPanel();
				    panel.setMinimumSize(new Dimension(200,300));
					
				
					JOptionPane.showMessageDialog(null, "Game round:" + 1 + "   CPU pick : even : "+ cpueven[0] +"  odd : " +cpuodd[0] + " Player " + winlose[0]+ 
														"\nGame round:" + 2 + "   CPU pick : even : "+ cpueven[1] +"  odd : " +cpuodd[1] + " Player " + winlose[1]+ 
														"\nGame round:" + 3 + "   CPU pick : even : "+ cpueven[2] +"  odd : " +cpuodd[2] + " Player " + winlose[2] +
														"\nGame round:" + 4 + "   CPU pick : even : "+ cpueven[3] +"  odd : " +cpuodd[3] + " Player " + winlose[3] +
														"\nGame round:" + 5 + "   CPU pick : even : "+ cpueven[4] +"  odd : " +cpuodd[4] + " Player " + winlose[4] +
														"\nGame round:" + 6 + "   CPU pick : even : "+ cpueven[5] +"  odd : " +cpuodd[5] + " Player " + winlose[5] +
														"\nGame round:" + 7 + "   CPU pick : even : "+ cpueven[6] +"  odd : " +cpuodd[6] + " Player " + winlose[6] +
														"\nGame round:" + 8 + "   CPU pick : even : "+ cpueven[7] +"  odd : " +cpuodd[7] + " Player " + winlose[7] +
														"\nGame round:" + 9 + "   CPU pick : even : "+ cpueven[8] +"  odd : " +cpuodd[8] + " Player " + winlose[8] +
														"\nGame round:" + 10 + " CPU pick : even : "+ cpueven[9] +"  odd : " +cpuodd[9] + " Player " + winlose[9] ); // i hate repeat codes , is there other way to do this ? 
													
				}
				
			        System.out.println("round " +i + ": Odd "+ oddguess[i] +" Even " + evenguess[i] +"percent: "+ evenpercent +"  "+ oddpercent);
			    
			    }
		
		
		}
	}



