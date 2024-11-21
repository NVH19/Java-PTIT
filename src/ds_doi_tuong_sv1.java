
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class SinhVien{
    private String name,lop,ngaysinh,id;
    private double gba;
    private static int cnt=1;
    public SinhVien(String name, String lop, String ngaysinh, double gba) {
        this.name = name;
        this.id  = "B20DCCN" + String.format("%03d", cnt++);
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gba = gba;
    }
    public String reset(){
        if(ngaysinh.charAt(2)!='/'){
            ngaysinh = "0" + ngaysinh;
        }
        if(ngaysinh.charAt(5)!='/'){
            ngaysinh = ngaysinh.substring(0,3) + "0" + ngaysinh.substring(3);
        }
        return ngaysinh;
    }
    public String check(){
        String tmp = String.format("%.2f", gba);
        return tmp;
    }
    public String out(){
        return id + " " + name + " " + lop + " " + reset() + " " + check() ;
    }
}   
public class ds_doi_tuong_sv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            sc.nextLine();
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(a.out());
        }
    }
}
