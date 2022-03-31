package Assignment_level_1;

import java.util.Scanner;

public class AL1_BinarySearch {
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static  void main(String[] args) {
        AL1_BinarySearch ob = new AL1_BinarySearch();
        int n,search;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        System.out.print("Enter the element you want to search: ");
        search = sc.nextInt();
        int result = ob.binarySearch(arr, search);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
