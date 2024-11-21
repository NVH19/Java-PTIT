
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
class NhanVien implements Comparable<NhanVien>{
    private String name , id , chucvu;
    private long luongcoban , songaycong;
    private static int cnt=1;
    public NhanVien(String name, String chucvu, long luongcoban, long songaycong) {
        this.name = name;
        this.id = "NV" + String.format("%02d", cnt++);
        this.chucvu = chucvu;
        this.luongcoban = luongcoban;
        this.songaycong = songaycong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public long phucap(){
        if(chucvu.equals("GD")) return 500;
        if(chucvu.equals("PGD")) return 400;
        if(chucvu.equals("TP")) return 300;
        if(chucvu.equals("KT")) return 250;
        return 100;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    public long luongchinh(){
        return luongcoban*songaycong;
    }
    public long thunhap(){
        return luongchinh()+phucap();
    }
    public long tamung(){
        if(thunhap()*2/3 < 25000) return (long)Math.round((thunhap())*2.0/3000)*1000;
        return 25000;
    }
    public long tong(){
        return luongchinh()+phucap()-tamung();
    }
    public String out(){
        return id + " " + name + " " + phucap() + " " + luongchinh() + " " + tamung() + " " + tong();
    }

}
public class sx_nhan_vien_theo_thu_nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a =  new ArrayList<>();
        for(int i=0; i<t; ++i){
            String name = sc.nextLine();
            String chucvu = sc.nextLine();
            long luongcoban = Long.parseLong(sc.nextLine());
            long songaycong = Long.parseLong(sc.nextLine());
            NhanVien x = new NhanVien(name, chucvu, luongcoban, songaycong);
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a , NhanVien b){
                if(a.thunhap()==b.thunhap()){
                    return a.getId().compareTo(b.getId());
                }
                return Long.compare(a.thunhap(), b.thunhap());
            }
        });
        for(NhanVien i : a){
            System.out.println(i.out());
        }
    }
}
