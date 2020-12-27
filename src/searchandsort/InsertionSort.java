package searchandsort;

import java.util.Arrays;

//
//Step1: This is just like playing cards.
//Step2: convert to sorted and unsorted array
//Step3: compare each card to all respective cards in left side.
//Step4: if greter than this card than keep moving till find start
////////time complexity o{nlogn)///////


public class InsertionSort {

   public static void main(String[] args){
       int[] arr={5,6,8,9,1,11,19};
       doInsertionSort(arr,arr.length);
       printArray(arr);

   }

   public static void doInsertionSort(int[] arr,int n)
   {
   for(int i=1;i<n;i++)
   {
    int val=arr[i];
    int j=i-1;
    while (j>=0 && arr[j]>val)
    {
        arr[j+1]=arr[j];
        j=j-1;
    }
    arr[j+1]=val;

   }


   }


    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }



}
