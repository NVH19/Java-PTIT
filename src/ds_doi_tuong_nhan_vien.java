
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
class NhanVien{
    private String id,name,gioitinh, diachi, mathue,ngaysinh , ngaykihopdong;
    private static int cnt=1;
    public NhanVien(String name, String gioitinh, String ngaysinh, String diachi, String mathue, String ngaykihopdong){
        this.name = name;
        this.id = String.format("%05d", cnt++);
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mathue = mathue;
        this.ngaykihopdong = ngaykihopdong;
    }
    public String reset(String tmp){
        if(tmp.charAt(2) != '/') tmp = "0" + tmp;
        if(tmp.charAt(5) != '/') tmp =tmp.substring(0,3) + "0" + tmp.substring(3);
        return tmp;
    }
    public String out(){
        return id + " " + name + " " + gioitinh + " " + reset(ngaysinh) + " " + diachi + " " + mathue + " " + reset(ngaykihopdong);
    }
}
public class ds_doi_tuong_nhan_vien {
    public static void main(String[] args){
        ArrayList<NhanVien> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        for(NhanVien i : a){
            System.out.println(i.out());
        }
    }
}
