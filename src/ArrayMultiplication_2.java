public class ArrayMultiplication_2 {
    /*
    Given an array of integers, return a new array such that each element at index i of
    the new array is the product of all the numbers in the original array except the one at i.

    For example, if our input was [1, 2, 3, 4, 5], the expected output would be
    [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
     */
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        createNewArray(arr);
    }

    private static void createNewArray(int[] arr) {
        int[] result = new int[arr.length];
        int total=1;
        for(int val:arr){
            total*=val;
        }
        for(int i=0;i<arr.length;i++){
            result[i]=(total)/arr[i];
        }
        for(int val:result)
            System.out.print(val+" ");
    }
}
