
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
class KH{
    private String name, id, gt, ngaysinh, diachi;
    public static int cnt=1;

    public KH(String name, String gt, String ngaysinh, String diachi) {
        this.name = name;
        this.id = "KH" + String.format("%03d", cnt++);
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public String ten(){
        String[] tmp = name.toLowerCase().split("\\s+");
        String res="";
        for(String i: tmp){
            res += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
            res += " ";
        }
        return res;
    }
    public String ngay(){
        if(ngaysinh.charAt(2)!='/'){
            ngaysinh = "0" + ngaysinh;
        }
        if(ngaysinh.charAt(5)!='/'){
            ngaysinh = ngaysinh.substring(0,4) + "/" + ngaysinh.substring(4);
        }
        return ngaysinh;
    }
    public String out(){
        return id + " " + ten() + " " + gt + " " + diachi + " " + ngay();
    }
}   
public class TH_ds_kh_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t  = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            
        }
    }
    
    
}
