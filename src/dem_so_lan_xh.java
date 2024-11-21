
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class dem_so_lan_xh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++){
            int n = sc.nextInt();
            int[] a = new int[n+2];
            int[] c = new int[100006];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                c[a[i]]=0;
            }
            for(int i=0; i<n; i++){
                c[a[i]]+=1;
            }
            System.out.println("Test " + (j+1) + ":");
            for(int i=0;i<n; i++){
                if(c[a[i]]>0){
                    System.out.println(a[i] + " xuat hien " + c[a[i]] + " lan");
                    c[a[i]]=0;
                }
            }
        }
    }
}
