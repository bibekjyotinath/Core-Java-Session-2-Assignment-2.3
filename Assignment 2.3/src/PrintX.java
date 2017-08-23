
public class PrintX {

	public static void main(String[] args) {   //main method of the program
		
		int i, j;  //initializing of variables
		
		System.out.println(" Print X pattern using *");  //statement to print on the screen
		
		for(i=0;i<=6;i++)     //outer loop 
		{
			for(j=0;j<=6;j++)   //inner loop 
			{
				if(i==j || i==0 && j==6 || i==1 && j==5 || i==2 && j==4 || i==4 && j==2 || i==5 && j==1 || i==6 && j==0) //Condition to check the and print * on the proper coordinates
				 {
		                System.out.print("*");    //print star '*' on the console
		         } 
				 else 
		         {
		                System.out.print("  ");    //print space in the console
		         }
			}
			System.out.println();     //goes to next line in the console
		}

	}

}
