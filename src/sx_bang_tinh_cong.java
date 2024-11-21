
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
class NhanVien{
    private String name, chucvu,id ;
    private long luongngay , songaycong ;
    private static int cnt=1;

    public NhanVien(String name, long luongngay, long songaycong, String chucvu) {
        this.name = name;
        this.id = "NV" + String.format("%02d", cnt++);
        this.chucvu = chucvu;
        this.luongngay = luongngay;
        this.songaycong = songaycong;
    }
    public long phucap(){
        if(chucvu.equals("GD")) return 250000;
        if(chucvu.equals("PGD")) return 200000;
        if(chucvu.equals("TP")) return 180000;
        return 150000;
    }
    public long luongthang(){
        return luongngay*songaycong;
    }
    public long thuong(){
        if(songaycong>=25) return luongthang()/5;
        if(songaycong>=22) return luongthang()/10;
        return 0;
    }
    public long tong(){
        return luongthang()+thuong()+phucap();
    }
    public String out(){
        return id + " " + name + " " + luongthang() + " " + thuong() + " " + phucap() + " " + tong();
    }
}
public class sx_bang_tinh_cong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> a  =new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            String name = sc.nextLine();
            long luongngay = Long.parseLong(sc.nextLine());
            long songaycong = Long.parseLong(sc.nextLine());
            String chucvu = sc.nextLine();
            NhanVien x = new NhanVien(name, luongngay, songaycong, chucvu);
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a , NhanVien b){
                return Long.compare(b.tong(), a.tong());
            }
        });
        for(NhanVien i : a){
            System.out.println(i.out());
          
        }

    }
}
