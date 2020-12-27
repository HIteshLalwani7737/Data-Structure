package array;

//
//
//Step 1: move all non positive numbers to start of array
//Step2 : create new array for all positive number
//Step3 : mark all respective indexes to -ve if present in array
//Step4: now check if the number at index is >0 that means that number is not present then return
//Step5 : return size+1




public class FindFirstMissingPositive {

    public static void main(String[] args){
        int arr[] ={2, 3, 7, 6, 8, 1, -10, 15};
        int missing = firstMissingPositiveNumber(arr);
        System.out.println("The smallest positive missing number is " + missing);

    }
    public static int firstMissingPositiveNumber(int[] arr){
       int shift= segregateNumx(arr);
       int[] arr2=new int[arr.length-shift];
       int j=0;
       for(int i=shift;i<arr.length;i++){
           arr2[j]=arr[i];
           j++;
       }
       return findMissingNum(arr2,j);
    }

    public static int segregateNumx(int[] arr){
        int i=0;
        for(int j=0;j<arr.length;j++) {
            if (arr[j] < 0) {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        return i;
    }

    public static int findMissingNum(int[] arr,int len){
        for(int i=0;i<len;i++){
            int n=Math.abs(arr[i]);
            if(n-1<len && arr[n-1]>0){
                arr[n-1]=-arr[n-1];
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]>0){
                return i+1;
            }
        }
        return len+1;
    }


}
