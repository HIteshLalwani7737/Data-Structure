package array;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        rotateArray(arr,2);
        printRotatedArray(arr);


    }

    public static void rotateArray(int[] arr,int rotation){

        rotation=rotation%arr.length;
        reverseArray(arr,0,rotation-1);
        reverseArray(arr,rotation,arr.length-1);
        reverseArray(arr,0,arr.length-1);

    }

    public static void reverseArray(int[] arr,int start,int end){
        while (end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;start++;
        }
    }

    public static void printRotatedArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }




}
