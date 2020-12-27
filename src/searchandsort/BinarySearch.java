package searchandsort;


////////time complexity o{logn)///////

public class BinarySearch {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,98};
        System.out.print(findNumber(arr,98));

    }
    public static int findNumber(int[] arr,int num){

        int start=0;int end=arr.length-1;
        while (end>=start){
            int mid=(start+end)/2;
            if(arr[mid]==num){return mid;}
            else if(arr[mid]>num){end=mid-1;}
            else{start=mid+1;}
        }
        return -1;
    }


}
