package reverseArray;

import java.util.Scanner;

public class ArrayReverse {
	
	public static void reverse(int arr[], int start, int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void printArray(int arr[]){
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] =new int[size];
		System.out.println("enter each element of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("provided array");
		printArray(arr);
		int n = arr.length;
		reverse(arr,0,n-1);
		System.out.println("reversed array");
		printArray(arr);
		sc.close();
	}
}
