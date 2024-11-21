
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class mang_doi_xung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int l=0,r=n-1;
            int ok=1;
            while(l<r){
                if(a[l]!=a[r]){
                    ok=0;
                    break;
                }
                l++;r--;
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
