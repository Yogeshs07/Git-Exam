import java.util.*;

class InsertionSort{
	
	static void display(int arr[]){
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void insertionSort(int arr[]){
		
		int n = arr.length;
		int key;
		int j;
		
		for(int i = 1; i<=n-1;i++){
			
			key = arr[i];
			j = i-1;
			
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
				display(arr);
			}
			arr[j+1] = key;
		}
	}
	
	public static void main(String [] args){
		
		int arr[] = {2,4,6,8,3};
		
		display(arr);
		insertionSort(arr);
		display(arr);
	}
}