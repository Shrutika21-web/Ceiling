import java.util.Scanner;
public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target ;
       
        System.out.println("Enter target no : ");
        target = sc.nextInt();
        int solution = binary(arr, target);
        System.err.println(arr[solution]);
        
    }
    //return the geter than or equal number than the target number
    static int binary(int[] arr,int target){
      
        int first = 0;
        int last = arr.length - 1;

        while(first <= last){
          
           int mid = first + (last - first)/2;
               if(target > arr[mid])
                    return -1;
            if(arr[mid] > target)
                 last = mid -1;
            else if(arr[mid] < target)
                first = mid+1;
            else
             return mid;
               
        }
        return first;
    }
}
