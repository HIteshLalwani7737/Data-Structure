package searchandsort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args){

        int[] arr={5,6,8,9,1,11,19};
        heapSort(arr,arr.length);
        printArray(arr);

    }

    public static void heapSort(int[] arr,int arrLength){

       for(int i= arrLength / 2 - 1;i>=0;i--){
           heapify(arr,arrLength,i);
       }


       for(int i=arrLength-1;i>0;i--){
           int temp=arr[0];
           arr[0]=arr[i];
           arr[i]=temp;
           heapify(arr,i,0);
       }


    }

    public static void heapify(int[] arr,int arrLength,int heapifyIndex){
    int leftIndex=2*heapifyIndex+1;
    int rightIndex=2*heapifyIndex+2;
    int largest=heapifyIndex;

    if(leftIndex<arrLength && arr[leftIndex]>arr[largest]){
        largest=leftIndex;
    }
    if(rightIndex<arrLength && arr[rightIndex]>arr[largest]){
        largest=rightIndex;
    }
    if(largest!=heapifyIndex){
        int temp=arr[heapifyIndex];
        arr[heapifyIndex]=arr[largest];
        arr[largest]=temp;
        heapify(arr,arrLength,largest);
    }

    }


    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::println);
    }




}
