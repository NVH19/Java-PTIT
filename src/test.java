
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class test {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Queue<String> q = new LinkedList<>();
        q.add("9");
        while(true){
            String tmp = q.poll();
            if(Integer.parseInt(tmp)%n==0){
                System.out.println(tmp);
                break;
            }
            q.add(tmp + "0");
            q.add(tmp + "9");
        }
        
    }
}
