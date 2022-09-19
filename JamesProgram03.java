import javax.swing.JOptionPane;
public class Program3 
{
     public static void main(String[] args)
     {
    	 displayMenu();
     }
     
     public static void displayMenu ()
     {
    	 //Define variables
    	 String input;
    	 int optionSelected =0;
    	 int n = 0;
    	 int result = 0;
    	 double Result = 0;
      while( optionSelected != 4)	 
      {
    	  // Create option menu
    	 input = JOptionPane.showInputDialog
    			 ("              CSC 229 - Project 03              "+"\n"+
    	          "             Math Series Calculation            "+"\n"+
    			  " _______________________________________________"+"\n"+
    	          "            1.   1 + 2 + 3 +...... + N       "+"\n"+
    			  "            2.   1 + 4 + 9+........+N3          "+"\n"+
    	          "            3.   1/1!+1/2!+ .......+N/N! "+"\n"+
    			  "            4.   EXIT                           "+"\n"+
    	          " _______________________________________________"
    			 
    			 );
    	 optionSelected = Integer.parseInt(input);
    	 switch(optionSelected)
    	 {
    	 case 1: 
	    	 {
	    		 //First case option activates when user clicks 1
	    		input = JOptionPane.showInputDialog ("Please Enter a Positive Integer Number");
	    		 n = Integer.parseInt(input);
	    		 result = sumseries1 (n);
	    		 displayResult(optionSelected, n,result);
	    		 break;
	    	 }
    	 case 2:
    	 	{	
    	 		//Second case option activates when user clicks 2
    	 		 input = JOptionPane.showInputDialog ("Please Enter a Positive Integer Number");
	    		 n = Integer.parseInt(input);
	    		 result = sumseries2 (n);
	    		 displayResult(optionSelected, n,result);
	    		 break;
    	 		
    	 	}
    	 case 3:
 	 	{
 	 			//Third case option activates when user clicks 3
 	 		 	input = JOptionPane.showInputDialog ("Please Enter a Positive Integer Number");
	    		 n = Integer.parseInt(input);
	    		 Result = sumseries3 (n);
	    		 displayResult(optionSelected, n,Result);
	    		 break;
 	 		
 	 	}
    	 case 4:
	    	 {
	    		 //Fourth option is to exit program
	    		 JOptionPane.showMessageDialog(null, "              Good Bye        ");
	    		 System.exit(0);
	    	 }
	     default:
		     {
		    	 //Tells user to enter a number between 1 and 4 only
		    	 JOptionPane.showMessageDialog(null, "  Wrong Number - Please type a number between 1 and 4        ");
		    	 break;
		     }
    	 }  // switch
    }
    	 
   }
  

public static int sumseries1 (int n)//For loop for first case
   {
	   int s = 0;
	   for (int i =1; i<=n; i=i+1)
	   {
		   s = s + i;
	   }
	   System.out.println(" N = "+n + " S= "+s);
	   return s;
   }
	   
    public static int sumseries2 (int n)//For loop for second case
	   {
		  int s = 0;
		  for (int i = 1; i <=n; i=i+1)
		   {
			  	
			   s += (i * i);
		   }
		   System.out.println(" N = "+n + " S= "+s);
		   return  (s);
   }
   
    
    public static int factorial (int n)//For loop for factorial
	   {
		 int fact = 1;
		  for (int i=2; i<=n; i++) 
			 fact *= i;
			return fact;
		   }
	
	public static double sumseries3 (int n)//For loop for third case
	   {
		  double s = 0 ;
		  for (int i=1; i<=n; i++) {
			 
		
			s += 1.0/factorial(i);
		   }
		   System.out.println(" N = "+n + " S= "+s);
		   return s;
   }
   



public static void displayResult(int optionSelected, int n,double result) //Prints results for each case thats chosen
   {
	   switch (optionSelected)
	   {
	   case 1:
		   {
			   JOptionPane.showMessageDialog(null,
					  "                CSC 229 - Project 03 (Math Series)              "+"\n" +
			          " ___________________________________________________"+"\n"+
				      "                  1 + 2 + 3 + ...... + "+n + " = "+ result              +"\n"+
			          "____________________________________________________"
					   );
			   break;
		   }
	   case 2:
	   {
		   JOptionPane.showMessageDialog(null,
				  "                CSC 229 - Project 03 (Math Series)              "+"\n" +
		          " ___________________________________________________"+"\n"+
			      "                  1 + 4 + 9 + ...... + "+n + " = "+ result              +"\n"+
		          "____________________________________________________"
				   );
		   break;
	   }
	   case 3:
	   {
		   JOptionPane.showMessageDialog(null,
				  "                CSC 229 - Project 03 (Math Series)              "+"\n" +
		          " ___________________________________________________"+"\n"+
			      "                  1/1! + 2/2!+ ...... + 1/"+n + " != "+ result              +"\n"+
		          "____________________________________________________"
				   );
		   break;
	   }
	   }//switch
   }
}