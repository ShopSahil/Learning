package binarySearch.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import binarySearch.src.BinarySearch;

public class BinarySearchTest {
	public static void main(String[] args)
	{
		File f = null;
		Scanner scan = null;
		try{
		   f = new File("D:\\Learning\\Learning\\resources\\tinyW.txt");
		   scan = new Scanner(f);
		}
		catch(Exception e){
		   System.exit(0);
		}

		List<Integer> x = new ArrayList<Integer>();
	
		while(scan.hasNext()){
		   x.add(scan.nextInt());
		}
		int[] whiteList = new int[x.size()];
	    for (int i=0; i < whiteList.length; i++)
	    {
	    	whiteList[i] = x.get(i).intValue();
	    }
	       
	     Arrays.sort(whiteList);

	      f = null;
			scan = null;
			try{
			   f = new File("D:\\Learning\\Learning\\resources\\tinyT.txt");
			   scan = new Scanner(f);
			}
			catch(Exception e){
			   System.exit(0);
			}

			List<Integer> xT = new ArrayList<Integer>();
		
			while(scan.hasNext()){
				int key = scan.nextInt();
	            if (BinarySearch.rank(key, whiteList) == -1)
	                System.out.println(key);
	        }
	    }
}
