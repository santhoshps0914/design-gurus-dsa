package dsaeasy01;

public class GoodPairs {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
                //{1,2,3,1,1,3};

        System.out.println("Good pairs is: "+feasibleSolutionGoodPairs(arr));

    }

    public static  int numGoodPairs(int[] arr) {
        int pairCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j] && i<j){
                    pairCount++;
                }
            }

        }
        
        
        return pairCount;
    }

    public static int feasibleSolutionGoodPairs(int[] arr){

        /*create a count of each element and store it in array*/
        int[] count = new int[200]; /*random size*/

        for(int num: arr){
            count[num]++;
        }

        int totalCount = 0 ;

        /*calculate combination of the count ncr = n!/((n-r)!* r!) since its pair is 2 it will be 	n * (n - 1) / 2 */
        for(int n : count){
            totalCount+=(n*(n-1))/2;
        }

        return totalCount;
    }

}
