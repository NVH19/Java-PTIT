
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
public class TH_tach_doi_va_tinh_tong {
    public static void main(String[] args) throws FileNotFoundException {
        File a = new File("DATA.in");
        Scanner sc = new Scanner(a);
        String s = sc.next();
        if(s.length()==1){
            System.out.println(s);
        }
        else{
            while(s.length()>1){
                BigInteger b = new BigInteger(s.substring(0,s.length()/2));
                BigInteger c = new BigInteger(s.substring(s.length()/2));
                BigInteger d = b.add(c);
                s = d.toString();
                System.out.println(s);
            }
        }
    }
}
