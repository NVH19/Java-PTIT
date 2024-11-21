
import java.io.File;
import java.io.FileNotFoundException;
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
class SanPham{
    private String ma, name;
    private int gia,baohanh;

    public SanPham(String ma, String name, int gia, int baohanh) {
        this.ma = ma;
        this.name = name;
        this.gia = gia;
        this.baohanh = baohanh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(int baohanh) {
        this.baohanh = baohanh;
    }
    public String out(){
        return ma + " " + name + " " + gia + " " + baohanh;
    }
}
public class TH_ds_sp2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> a = new ArrayList<>();
        while(t-- >0){
            String ma = sc.nextLine();
            String name = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int baohanh = Integer.parseInt(sc.nextLine());
            SanPham x = new SanPham(ma, name, gia, baohanh);
            a.add(x);
        }
        Collections.sort(a, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham a, SanPham b){
                if(a.getGia()==b.getGia()){
                    return a.getMa().compareTo(b.getMa());
                }
                return Integer.compare(b.getGia(), a.getGia());
            }
        });
        for(SanPham i: a){
            System.out.println(i.out());
        }
    }
}
