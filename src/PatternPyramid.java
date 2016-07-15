//Assignment 1
public class PatternPyramid {
	
	public static void main(String[] arg)
	{
		PatternPyramid ppObject= new PatternPyramid();
		String[] data= ppObject.Pyramid(5);
		
		for (String string : data) {
			System.out.println(string);
		}
	}
	
	
	/*
	Return Desire pattern as Array of String
	input -> n = No of rows */ 
	public String[] Pyramid(int n) {
		
		String[] out = new String[2*n-1];
		for(int i=1;i<=2*n-1;i++)
		{
			out[i-1]=space(i, n)+numbers(i, n);
		}
		
		return out;
		
	}
	
	
	/*
    Returns String of Space
    input -> n = Total no of rows ; row = Row Number*/
	public String space(int row, int n) {
		//out represents output string
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
	
	/*
    Returns String of numbers
    input -> n = Total no of rows ; row = Row Number*/
	public String numbers(int row, int n)
	{  
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
