
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class ma_hoa_DRM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- > 0){
            String s = sc.nextLine();
            int n = s.length();
            int half = n / 2;
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < n / 2; i++){
                sum1 += s.charAt(i) - 'A';
                sum2 += s.charAt(i + half) - 'A';
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < n / 2; i++){
                int c1 = s.charAt(i) - 'A';
                int c2 = s.charAt(i + half) - 'A';
                int c = (c1 + sum1) % 26;
                c = (c + c2 + sum2) % 26;
                sb.append((char)(c + 'A'));
            }
            System.out.println(sb.toString());
        }
    }
}
