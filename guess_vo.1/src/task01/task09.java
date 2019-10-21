package task01;

public class task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] ={1,2,3,4,5,6};
		int arr2[] ={7,8,9,10,11,12};
		
		copyToArray(arr1, 3, arr2, 2, 3);
		
	   System.out.println();
		for(int i:arr2){
			System.out.print(i+",");
		}
	}
   public static void copyToArray(int[] arr1 ,int start,int[] arr2 ,int newstart,int length) {
	
	  for(int i=0;i<length;i++){
		  arr2[newstart] =arr1[start];
		  newstart++;
		  start++;
	  }
	   
   }
}
