package helperUtils;

public final class Utility {

  // suppressing default constructor to prohibit instantiation of this class
  private Utility() {
    throw new AssertionError();
  }

  public static void printArray(int[] arr, boolean isInput, String algoName) {
    String title = isInput ? "Input Array : " : "Sorted Output : ";
    if (isInput) {
      System.out.println();
      System.out.println(algoName + " :");
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