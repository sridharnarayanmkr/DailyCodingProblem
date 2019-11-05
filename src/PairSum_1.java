import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class PairSum_1 {
    /*
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    public static void main(String[] args){

        int[] arr = {10,15,3,7};
        int k=17;
        System.out.println(findPairElementSum(arr,k));

        //Another method using Vector or any Collection
        System.out.println(findPairElementSumVector(arr,k));

        //Another method O(n)
        System.out.println(isPairSumPresent(arr,k));
    }

    private static boolean findPairElementSumVector(int[] arr, int k) {
        Vector<Integer> vector = new Vector<>();
        for(int value : arr){
            vector.add(value);
        }
        for (int value : arr) {
            int diff = Math.abs(k - value);
            if (vector.contains(diff)) {
                System.out.println(value + " : " + diff);
                return true;
            }
        }
    return false;

    }

    private static boolean findPairElementSum(int[] arr, int sum) {
        //Sort the array
        Arrays.sort(arr);

        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" : "+arr[j]);
                return true;
            }else if(arr[i]+arr[j]>sum){
                j--;
            }else{
                i++;
            }
        }
        return false;

    }
    private static boolean isPairSumPresent(int[] arr, int sum){

        Set visited = new HashSet();

        for (int value : arr) {
            if (visited.contains(sum - value)) {
                return true;
            }
            visited.add(value);
        }
        return false;
    }
}
