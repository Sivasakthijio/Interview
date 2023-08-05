package arrayTopic;

public class LeftSideODDRightSideEVEN {

	public static void main(String[] args) {
			
		 int[] numbers = {1, 2, 3, 4,11,13, 5, 6, 7, 8, 9, 10};
        int[] sortedArray = sortOddEven(numbers);
        
        System.out.println("Numbers in odd-even order:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] sortOddEven(int[] arr) {
    	
        int[] sortedArray = new int[arr.length];
        int oddIndex = 0;
        int evenIndex = arr.length - 1;
        
        for (int num : arr) {
            if (num % 2 != 0) {
                sortedArray[oddIndex] = num;
                oddIndex++;
            } else {
                sortedArray[evenIndex] = num;
                evenIndex--;
            }
        }
       // System.out.println(sortedArray);
        
    return sortedArray;

		 

	}

}
