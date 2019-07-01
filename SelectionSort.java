public class SelectionSort {

  public static void main(String argd[]) {
    int[] inputArr = { 10, -80, 5, 76, 92, 100, 52, 1, -10 };
    printArray(inputArr, true);
    for(int sortedBoundary = inputArr.length-1; sortedBoundary > 0; sortedBoundary--){
      int largestValIndex = 0;
      for(int i=1; i<=sortedBoundary; i++){
        if(inputArr[i] > inputArr[largestValIndex]){
          largestValIndex = i;
        }
      }
      swap(inputArr, largestValIndex, sortedBoundary);
    }
    printArray(inputArr, false);
  }

  public static void printArray(int[] arr, boolean isInput) {
    String title = isInput ? "Input Array : " : "Sorted Output : ";
    if (isInput) {
      System.out.println();
      System.out.println("Selection Sort :");
      System.out.println("-------------");
    }
    System.out.println(title);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    for (int i = 0; i < arr.length * 3; i++) {
      System.out.print("*");
    }
    System.out.println();
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