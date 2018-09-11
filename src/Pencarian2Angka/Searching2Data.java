package Pencarian2Angka;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

class Searching2Data {

    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }

    int binarySearch2(int arr[], int l, int r, int y) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == y) {
                return mid;
            }

            if (arr[mid] > y) {
                return binarySearch(arr, l, mid - 1, y);
            }

            return binarySearch(arr, mid + 1, r, y);
        }

        return -1;
    }

    public static void main(String args[]) {

        System.out.println("Hammam Al-Hakim/XRPL6/27");
        System.out.println("=====================================================");

        Searching2Data ob = new Searching2Data();
        int jlh_data = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah data"));
        System.out.print("Jumlah Data : " + jlh_data);
        System.out.println("\n========================================================");

        int[] arr = new int[jlh_data];
        int n = arr.length;

        System.out.println("\nPENGISIAN DATA (SECARA RANDOM)");

        for (int a = 0; a < jlh_data; a++) {
            arr[a] = new Random().nextInt(201);
        }

        System.out.println(Arrays.toString(arr));
        int x = Integer.parseInt(JOptionPane.showInputDialog("Search 1 : "));
        System.out.println("Search 1 :  " + x);
        int y = Integer.parseInt(JOptionPane.showInputDialog("Search 2 : "));
        System.out.println("Search 2 :  " + y);

        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element " + x + " not present");
        } else {
            System.out.println("Element " + x + " found at index " + result);
        }
        
        int result2 = ob.binarySearch2(arr, 0, n - 1, y);
        if (result2 == -1) {
            System.out.println("Element " + y + " not present");
        } else {
            System.out.println("Element " + y + " found at index " + result2);
        }
    }
}
/* This code is contributed by Rajat Mishra */
