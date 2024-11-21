
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class MatHang{
    private String name;
    private int soluong;
    private long gia;

    public MatHang(String name, int soluong, long gia) {
        this.name = name;
        this.soluong = soluong;
        this.gia = gia;
    }
    
    public String id(){
        String[] tmp = name.split("\\s+");
        String res = "";
        for(String i : tmp){
            res += String.valueOf(i.charAt(0)).toUpperCase();
        }
        return res;
    }
    public double phantram(){
        if(soluong >10) return 0.05;
        if(soluong )
    }
}
public class bang_ke_nhap_kho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
