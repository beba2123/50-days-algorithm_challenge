public class Linear {
    public static void main(String[] args) {
        int nums[] = {1,3,5,7,9};
        int target = 5;

        int result1 = linearSearch(nums, target);
        int result2 = BinearSearch(nums, target);

        if (result1 == -1){
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element is present in the array at index " + result1);
        }
        
        if (result2 == -1){
            System.out.println("Element is not present in the array");
        }
        else{
            System.out.println("Element is present in the array at the index of " + result2);
        }

    }
    
    public static int linearSearch(int[] nums, int target){
        //  this is for checking the element in the array using 
        //    the linear search method and return the value if we got it 
        for (int i=0; i<nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
      return -1;  
    }
    public static int BinearSearch(int[] nums, int target){
       // binear search method for finding value in the array
       int left = 0;
       int right = nums.length - 1;
       
       while (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid]== target){
                return mid;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            } 
       }
       return -1;
    }
}
