package assignment;

import java.util.Scanner;

public class LongestSubSeq {
	
	static int incsubsequence(int my_arr[],int len) {
	    int seq[] = new int[len];
	    int i , j ,max = 0;
	    for(i=0;i<len;i++)
	    seq[i] = 1;
	    for(i=1;i<len;i++)
	    for(j=0;j<i;j++)
	    if(my_arr[i] > my_arr[j] && seq[i] < seq[j] + 1)
	    seq[i] = seq[j] +1;
	    for(i=0;i<len;i++)
	    if(max<seq[i])
	    max = seq[i];
	    return max;
	    }
	public static void main(String[] args)
	     {
	      try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array: ");
			  int size = sc.nextInt();
			  int arr[] = new int[size];
			  for(int i = 0;i<arr.length;i++) {
			  System.out.println("Enter the array index value of :"+i+" ");
			  arr[i] = sc.nextInt();
			  }
			  int arr_len = arr.length;
			  System.out.println("the length of the longest increasing is :" + incsubsequence(arr, arr_len));
		}
	     }

}
