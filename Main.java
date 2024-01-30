import java.io.FileNotFoundException; //We will learn exceptions later
import java.util.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException //We will learn exceptions later
	{
		System.out.print("Please input the file pathname: ");

		Scanner scannerObj = new Scanner(System.in);
		String filePathName = scannerObj.nextLine();
		
		//Your tasks: 
		//  Create a new Table2dMxSumRowCol object and assign it to a variable of Table2dMxSumRowCol 
        Table2dMxSumRowCol table = new Table2dMxSumRowCol(filePathName);
		//      Call its constructor with the filePathName as argument 
		//  Then apply the .print(), .getRowSumMax() and 
        
		//      .getColSumMax() methods to finish the work.
		//
        table.print();
		
		System.out.print("Maximum row sum: " + table.getRowSumMax()+" ");
		System.out.print("(row ");
		table.printAllRowsOfMax();
		System.out.print(")");
		System.out.println();

		
		System.out.print("Maximum col sum: " + table.getColSumMax()+" ");
		System.out.print("(col ");
		table.printAllColsOfMax();
		System.out.print(")");


		scannerObj.close();
	}
	
}