//Assignment 2
public class PatternNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatternNumbers pnObject = new PatternNumbers();
		//Required 5 rows of Pattern
		String[] data=pnObject.Printer(5);
		
		for (String string : data) {
			System.out.println(string);
		}
		

	}
	
	/*
	Return Desire pattern as Array of String
	input -> n = No of rows */ 
public String[] Printer(int n) {
		
		String[] out = new String[n];
		for(int i=1;i<=n;i++)
		{
			out[i-1]=space(i, n)+numbers(i, n);
		}
		return out;
	}

/*
    Returns String of Space
    input -> n = Total no of rows ; row = Row Number*/
	public String space(int row, int n) {
		String out = "";
		for(int i=1;i<row;i++)
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
			for(int i=1;i<=n-row+1;i++)
			{
				out=out+String.valueOf(i);	
			}	
		return out;
	}
	

}
