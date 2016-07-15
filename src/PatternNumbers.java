//Assignment 2
public class PatternNumbers {
	
	/**
	 * Data input by command line
	 * @param input a number string
	 */
	public static void main(String[] input) {
		
		int inputData=0;
		if(input.length==1)
		{
			try {
				inputData=Integer.parseInt(input[0]);
				
			} catch (Exception e) {
				System.out.println("Not a Valid Number");
			}
			
		}
		else
		{
			System.out.println("Invalid Input");
			return;
		}
		
		PatternNumbers pnObject = new PatternNumbers();
		//Required 5 rows of Pattern
		String[] data=pnObject.Printer(inputData);
		
		for (String string : data) {
			System.out.println(string);
		}
	}
	

	/**
	 * Return pattern as Array of String
	 * @param n int number of rows
	 * @return String[] pattern as Array of String
	 */
	public String[] Printer(int n) {	
			String[] out = new String[n];
			
			for(int i=1;i<=n;i++)
			{
				out[i-1]=space(i, n)+numbers(i, n);
			}
			return out;		
	}


	/**
	 * Return String of Space
	 * @param n int Total no of rows
	 * @param row int Row Number
	 * @return String of Space
	 */
	public String space(int row, int n) {
		String out = "";
		for(int i=1;i<row;i++)
		{
			out=out+" ";
		}
		return out;
	}
	
	
	/**
	 * Return String of numbers
	 * @param n int Total no of rows
	 * @param row int Row Number
	 * @return String of numbers
	 */
	public String numbers(int row, int n)
	{  
		String out="";
			for(int i=1;i<=n-row+1;i++)
			{
				out=out+String.valueOf(i);	
			}	
		return out;
	}

}
