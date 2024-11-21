
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
    private String name,id;
    private int luong,ngaycong;
    private String chucvu;
    private static int cnt=1;
    public NhanVien(String name, int luong, int ngaycong, String chucvu) {
        this.id = "NV" + String.format("%02d", cnt++);
        this.name = name;
        this.luong = luong;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
    }
    public int luongthang(){
        return luong*ngaycong;
    }
    public int luongthuong(){
        if(ngaycong>=25) return (int)luongthang() / 5;
        else if(ngaycong>=22 && ngaycong<25) return  (int)luongthang() /10;
        return 0;
    }
    public int luongphucap(){
        if(chucvu.equals("GD")) return 250000;
        else if(chucvu.equals("PGD")) return 200000;
        else if(chucvu.equals("TP")) return 180000;
        return 150000;
    }
    public int luongtong(){
        return luongthang()+luongthuong()+luongphucap();
    }
    @Override
    public String toString(){
        return id + " " + name + " " + luongthang() + " " + luongthuong() + " " + luongphucap() + " " + luongtong();
    }
}
public class bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int ngaycong = Integer.parseInt(sc.nextLine());
        String chucvu = sc.nextLine();
        NhanVien a = new NhanVien(name,luong,ngaycong,chucvu);
        System.out.println(a);
    }
}
