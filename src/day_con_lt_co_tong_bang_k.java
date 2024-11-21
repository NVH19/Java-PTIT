
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class day_con_lt_co_tong_bang_k {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            boolean check = false;
            long sum = a[0];
            int l = 0,r = 1;
            while(r <= a.length){
                while (sum > k && l < r-1){
                   sum -= a[l];
                   l++;
               }
               if(sum == k){
                   check = true;
                   break;
               }
               if (r < a.length){
                   sum += a[r]; 
               }
               r++;
            }
            System.out.println(check == true ? "YES" : "NO");
            
        }
    }
}
