
import java.util.Scanner;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class ThiSinh{
    private String name,id,lop,ngaysinh;
    private double gba;
    private static int cnt=1;
    public ThiSinh(String name, String lop, String ngaysinh, double gba) {
        this.name = name;
        this.id = "B20DCCN" + String.format("%03d", cnt++);
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gba = gba;
    }
    public String reset1(){
        name = name.trim();
        String[] tmp = name.split("\\s+");
        String res = "";
        for(String i : tmp){
            res = res + String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
            res += " ";
        }
        return res;
    }
    public String reset2(){
        if(ngaysinh.charAt(2) != '/') ngaysinh = "0" + ngaysinh;
        if(ngaysinh.charAt(5) != '/') ngaysinh = ngaysinh.substring(0,3) + "0" + ngaysinh.substring(3);
        return ngaysinh;
    }
    public String reset3(){
        return String.format("%.2f", gba);
    }
    public String out(){
        return id + " " + reset1() + lop + " " + reset2() + " " + reset3();
    }
}
public class ds_doi_tuong_sv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            ThiSinh a = new ThiSinh(sc.nextLine().toLowerCase(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(a.out());
        }
    }
}
