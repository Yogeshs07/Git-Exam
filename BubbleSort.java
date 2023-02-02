import java.util.*;

class BubbleSort{
	
	static void display(int arr[]){
		for(int i =0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void bubbleSOrt(int arr[]){
		
		int n = arr.length;
		int temp;
		
		for(int i =0; i<n-1;i++){
			
			System.out.println("Pass: "+i);
			
			for(int j=0;j<n-1-i;j++){
				
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String [] args){
		
		int arr[] = {1,2,4,3};
		
		display(arr);
		bubbleSOrt(arr);
		display(arr);
	}
}