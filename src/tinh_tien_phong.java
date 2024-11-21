
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class KhachHang{
    private String name, id, zoomid;
    private static int cnt=1;
    private int tong_time;
    private int dongia;
    public KhachHang(String name, String zoomid, Date nhan, Date tra, int dongia) {
        this.name = chuanhoa(name);
        this.id = "KH" + String.format("%02d", cnt++);
        this.zoomid = zoomid;
        this.tong_time = tinh(nhan,tra); 
        this.dongia = dongia;
    }
    
    private String chuanhoa(String s){
        String[] tmp = s.toLowerCase().split("\\s+");
        String res = "";
        for(String i:tmp){
            res += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1);
            res += " ";
        }
        return res;
    }
    private int tinh(Date nhan, Date tra){
        long a = nhan.getTime();
        long b = tra.getTime();
        return (int) ((b-a)/(1000 * 60 * 60 * 24))+1;
    }
    public int tang(){
        String tmp = String.valueOf(zoomid.charAt(0));
        if(tmp.equals("1")) return 25;
        if(tmp.equals("2")) return 34;
        if(tmp.equals("3")) return 50;
        return 80;
    }
    public int tong(){
        return tong_time*tang() + dongia;
    }
    public String toString(){
        return id + " " + name + " " + zoomid + " " + tong_time + " " + tong();
    }
}
public class tinh_tien_phong {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-- >0){
            String name = sc.nextLine();
            String zoom_id = sc.nextLine();
            Date nhan = sdf.parse(sc.nextLine());
            Date tra = sdf.parse(sc.nextLine());
            int dongia = Integer.parseInt(sc.nextLine());
            KhachHang x = new KhachHang(name, zoom_id, nhan, tra, dongia);
            a.add(x);
        }
        Collections.sort(a, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang a, KhachHang b){
                return Integer.compare(b.tong(), a.tong());
            }
        });
        for(KhachHang i : a){
            System.out.println(i);
        }
    }
}
