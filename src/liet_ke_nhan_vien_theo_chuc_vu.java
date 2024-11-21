
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
    public long tamung(){
        long tmp = phucap() + luongchinh();
        if(tmp*2/3 < 25000) return (long)Math.round(tmp*2.0/3000)*1000;
        return 25000;
    }
    public String out(){
        return id + " " + name + " " + phucap() + " " + luongchinh() + " " + tamung() + " " + (luongchinh()+phucap()-tamung());
    }
    
}
public class liet_ke_nhan_vien_theo_chuc_vu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> a =  new ArrayList<>();
        for(int i=0; i<t; ++i){
            String name = sc.nextLine();
            String chucvu = sc.nextLine();
            long luongcoban = sc.nextLong();
            long songaycong = sc.nextLong();
            NhanVien x = new NhanVien(name, chucvu, luongcoban, songaycong);
            a.add(x);
            sc.nextLine();
        }
        String tmp = sc.nextLine();
        for(NhanVien i : a){
            if(i.getChucvu().equals(tmp))
                System.out.println(i.out());
        }
    }
}
