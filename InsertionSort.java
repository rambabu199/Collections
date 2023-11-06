import java.util.*;

class Sorting {
  void read(int arr[], int n) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
  }

  void display(int arr[], int n) {
    for (int i = 0; i < n; i++)
      System.out.print(" " + arr[i]);
  }

  void insertion(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      for(int j=i;j>0;j--)
      //for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--)
        {
          if(arr[j - 1] > arr[j]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;}
      
      }
    }
  }
}

class InsertionSort {
  public static void main(String args[]) {
    Sorting s = new Sorting();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    s.read(arr, n);
    System.out.println(" array elements before sorting");
    s.display(arr, n);
    s.insertion(arr, n);
    System.out.println("\n array elements after performing sorting");
    s.display(arr, n);
  }
}
