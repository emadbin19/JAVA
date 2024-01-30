import java.io.*; //For file I/O
import java.util.*;

public class Table2dMxSumRowCol 
{

	//(1) Add the instance field, nums, for the 2D array here
	private int [][] nums;

	// (Answer is in Given_Code.txt!!)
	
	//Constructor
	public Table2dMxSumRowCol(String filepathname) throws FileNotFoundException //learn exceptions later
	{
		//Part I. Create the 2D array
		// (2) nums = ____________ 
		nums = new int[10][10];
		// (Answer is in Given_Code.txt!!)
		
		//Part II. Perform file reading and insert values into the 2D array
		Scanner inFile;
		inFile = new Scanner(new File(filepathname)); //(3) construct the scanner object for file reading
		// (Answer is in Given_Code.txt!!)
		// 
		//
		// (4) read the file until the end and add values 
		// (Answer is in Given_Code.txt!!)
		while(inFile.hasNext())
		{
			int row, col, value;
			row = inFile.nextInt();
			col = inFile.nextInt();
			value = inFile.nextInt();
			nums[row][col] = value;
		}
		//
		//
		inFile.close();
	}
	
	//
	//Other methods 
	public void print()
	{
		for(int row = 0; row<10; row++)
		{
			for(int col = 0; col<10; col++)
			{
				System.out.print("\t"+nums[row][col]);
			}
			System.out.println();
		}
	}
	public int getRowSumMax()
	{
		int rowMax = 0;
		for(int y=0; y<10; y++)
		{
			int sum=0;
			for(int x=0; x<10; x++)
			{
				sum+=nums[y][x];
			}
			if(sum>rowMax)
			{
				rowMax=sum;
			}
		}
		return rowMax;
	}
	public int getColSumMax()
	{
		int colMax = 0;
        for (int x = 0; x < 10; x++) 
		{
            int sum = 0;
            for (int y = 0; y < 10; y++) 
			{
				sum += nums[y][x];
            }
            if (sum > colMax) 
			{
                colMax = sum;
            }
        }
        return colMax;

	}
	//  (See Given_Code.txt!!)
	//
	public void printAllRowsOfMax()
	{
		int maxSum = getRowSumMax();
		int count=0;
		int rownum;

		for(int r = 0; r<10; r++ )
		{
			int sum=0;
			for(int c = 0; c<10; c++)
			{
				sum+=nums[r][c];
			}
			if(sum==maxSum)
			{
				if(count==1)
				{
					System.out.print(",");
				}
				System.out.print(r);
				count=1;
			}
		}


	}
	public void printAllColsOfMax()
	{
		int maxSum = getColSumMax();
		int Count=0;
		for(int c = 0; c<10; c++ )
		{
			int sum=0;
			for(int r = 0; r<10; r++)
			{
				sum+=nums[r][c];
			}
			if(sum==maxSum)
			{
				if(Count==1)
				{
					System.out.print(",");
				}

				System.out.print(c);
				Count=1;

			}
		}

	}
	
}