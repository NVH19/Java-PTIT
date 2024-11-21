
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class so_la_ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test-- != 0){
            String s = sc.next();
            ArrayList<Integer> a = new ArrayList<>();
            for(char x : s.toCharArray()){
                switch (x){
                    case 'I':
                        a.add(1);
                        break;
                    case 'V':
                        a.add(5);
                        break;
                    case 'X':
                        a.add(10);
                        break;
                    case 'L':
                        a.add(50);
                        break;
                    case 'C':
                        a.add(100);
                        break;
                    case 'D':
                        a.add(500);
                        break;
                    case 'M':
                        a.add(1000);
                        break;
                }
            }
            int ans = a.get(a.size() - 1);
            for(int i = 0; i < a.size() - 1; i++){
                if(a.get(i) < a.get(i + 1))ans -= a.get(i);
                else ans += a.get(i);
            }
            System.out.println(ans);
        }
    }
}
