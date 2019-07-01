public class BubbleSort {

  public static void main(String args[]) {
    int[] inputArr = {10,-80,5,76,92,100,52,1,-10};
    for(int sortedBoundary = inputArr.length -1 ; sortedBoundary > 0; sortedBoundary-- ){
      for(int i=0; i<sortedBoundary; i++){
        if(inputArr[i] > inputArr[i+1]){
          swap(inputArr,i,i+1);
        }
      }
    }
    printOutput(inputArr);
  }

  public static void printOutput(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void swap(int[] arr, int i, int j) {
    if (i == j) {
      return;
    }
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}