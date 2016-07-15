//Assignment 1
public class PatternPyramid {
	/**
	 * Data input by command line
	 * @param input a number string
	 */
	public static void main(String[] input)
	{
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
		
		PatternPyramid ppObject= new PatternPyramid();
		String[] data= ppObject.Pyramid(inputData);
		
		for (String string : data) {
			System.out.println(string);
		}
	}
	
	
	/**
	 * Return Pyramid pattern as Array of String
	 * @param n int Number of rows 
	 * @return String[]  pattern of Pyramid as Array of String
	 */
	public String[] Pyramid(int n) {
		String[] out = new String[2*n-1];
		
		for(int i=1;i<=2*n-1;i++)
		{
			out[i-1]=space(i, n)+numbers(i, n);
		}
		
		return out;		
	}

	
	/**
	 * Returns String of Space
	 * @param int row Row Number 
	 * @param n int Number of rows
	 * @return Returns String of Space for nth row
	 */
	public String space(int row, int n) {
		String out = "";
		//rows for bottom part of the pyramid are similar to upper part
		if(n<row)
		{
			row=2*n-row;
		}
		
		for(int i=row;i<n;i++)
		{
			out=out+" ";
		}
		return out;
	}	
	

	/**
	 * Returns String of numbers
	 * @param row int Row Number 
	 * @param n int Number of rows
	 * @return
	 */
	public String numbers(int row, int n) {  
		String out="";
		//rows for bottom part of the pyramid are similar to upper part
		if(n<row)
		{
			row=2*n-row;
		}	
			//for incremental part of the string
			for(int i=1;i<=row;i++)
			{
				out=out+String.valueOf(i);	
			}
			//for decremental part of the string
			for(int i=row-1;i>0;i--)
			{
				out=out+String.valueOf(i);
			}	
		return out;
	}
	

}
