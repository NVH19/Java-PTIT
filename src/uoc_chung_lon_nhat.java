
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class uoc_chung_lon_nhat {
    public static int bcnn(int a, int b){
        int m = a, n = b;
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return m / a * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n + 1];
            for(int i = 0; i < n; i++)a[i] = sc.nextInt();
            b[0] = a[0];
            b[n] = a[n - 1];
            for(int i = 1; i < n; i++){
                b[i] = bcnn(a[i - 1], a[i]);
            }
            for(int i : b)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
