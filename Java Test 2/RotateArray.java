//Rotate array by 'k' positions to the left
//Output : 3 4 5 6 1 2

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int k = 2;
        for(int i=0; i<arr.length-1; i++){
			
			if(arr[i]>=k){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
    }
}

