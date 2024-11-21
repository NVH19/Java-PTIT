
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        this.id = "B20DCCN" + String.format("%03d", cnt++);
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gba = gba;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }
    public String chuanhoa(){
        name = name.trim();
        String[] tmp = name.split("\\s+");
        String res = "";
        for(String i:tmp){
            res = res + String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
            res += " ";
        }
        return res;
    }
    public String reset(){
        if(ngaysinh.charAt(2) != '/') ngaysinh = "0" + ngaysinh;
        if(ngaysinh.charAt(5) != '/') ngaysinh = ngaysinh.substring(0,3) + "0" + ngaysinh.substring(3);
        return ngaysinh;
    }
    public String diem(){
        return String.format("%.2f", gba);
    }
    public String out(){
        return  id + " " + chuanhoa() + lop + " " + reset() + " " + diem();
    }
}
public class ds_doi_tuong_sv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<t; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine().toLowerCase(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a,SinhVien b){
                return Double.compare(b.getGba(), a.getGba());
            }
        });
        for(SinhVien i : a){
            System.out.println(i.out());
        }
    }
}