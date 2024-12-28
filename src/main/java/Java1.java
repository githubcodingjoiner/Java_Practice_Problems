import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
class Java1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the number of elements:");

    int n = myObj.nextInt();

    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int m = myObj.nextInt();
      arr.add(m);
    }
    Collections.sort(arr);
    System.out.println("Sorted Array is :" + arr);

  }
}