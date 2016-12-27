//BinarySearch.java
//CS 111 sample program
//Recursive Binary Search

import java.util.Scanner;

public class BinarySearch{
  
    public static int BiSearch (final int [] arr, int lo, int hi, int value){
	/** recursive binary search
	 * pre: arr contains a sorted integer array
	 *      lo, hi, value are valid ints
	 *      value is an element in the array
	 * post: BiSearch = i such that arr[i] = value
	 * respones: BiSearch = -1
	 * @param arr an ordered integer array
	 * @param lo starting index for the search
	 * @param hi ending index of the search
	 * @param value the value to be found
	 * @returns index of value in arr */
    
	int mid, index;
    
	System.out.println("entering BiSearch: lo = " + lo + ", hi = " + hi);
    
	if (hi < lo) index = -1;
	else {
	    mid = (hi+lo)/2;
	    if (value == arr[mid])
		index = mid;
	    else if (value > arr[mid])
		index = BiSearch(arr,mid+1,hi,value);
	    else index= BiSearch(arr,lo,mid-1,value);
	}
	return index;
    }
  
    public static void main(String[] args){
	int [] a={0,1,4,6,7};
	int find, location;
	Scanner numIn = new Scanner(System.in);
    
	System.out.print("enter the value you wish to find: ");
	find = numIn.nextInt();
	location = BiSearch(a,0,4,find);
	if (location == -1)
	    System.out.println(find + " is not in the array!");
	else
	    System.out.println(find + " is the " + (location +1) + "th element");
    }
}
