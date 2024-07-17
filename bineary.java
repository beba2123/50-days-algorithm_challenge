

public class bineary {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;

        int result2 = BinearSearch(nums, target, 0, nums.length - 1);

        if (result2 == -1){
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element is present in the array at index " + result2);
        }
    
    }
    
    public static int BinearySearch(int[] nums, int target){
        // binear search method for finding value in the array
        int left = 0;
        int right = nums.length - 1;
        int steps =0;
        while (left <= right){
             steps++;
             int mid = (left + right) / 2;
             if(nums[mid]== target){
                 
                 return mid;
             }else if (nums[mid] < target){
                 left = mid + 1;
             }else{
                 right = mid -1;
             } 
        }
        System.err.println("Total steps: " + steps);
        return -1;
    }

    public static int BinearSearch(int[] nums, int target, int left, int right){
        //this is the recursive method for the binear search
        

        if(left <= right){
            
            int mid= (left + right) / 2;
            if(nums[mid]== target){
                return mid;
            }else if(nums[mid] <  target){
                return BinearSearch(nums, target, mid + 1, right);
            }else{
                return BinearSearch(nums, target, left, mid - 1);
            }
        }

        return -1;
    }

}
