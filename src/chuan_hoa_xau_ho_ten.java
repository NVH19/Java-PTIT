
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class chuan_hoa_xau_ho_ten {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("DATA.in");
        Scanner sc = new Scanner(x);
        while(true){
            String tmp = sc.nextLine();
            if(tmp.equals("END")){
                break;
            }
            String[] s = tmp.toLowerCase().trim().split("\\s+");
            String res = "";
            for(String i:s){
                res += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
                res += " ";
            }
            System.out.println(res);
        }
    }
}
