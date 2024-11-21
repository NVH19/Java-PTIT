
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class KH implements Comparable<KH>{
    private String name ,maphong,id;
    private Long songay;
    public static int cnt=1;
    public KH(String name, String maphong, Long songay) {
        this.name = name;
        this.id = "KH" + String.format("%02d", cnt++);
        this.maphong = maphong;
        this.songay = songay;
    }

    public Long getSongay() {
        return songay;
    }

    public void setSongay(Long songay) {
        this.songay = songay;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + maphong + " " + songay;
    }
    public int compareTo(KH x){
        return -songay.compareTo(x.getSongay());
    }
}
public class TH_ds_luu_tru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File x = new File("KHACH.in");
        Scanner sc = new Scanner(x);
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        List<KH> b = new ArrayList<>();
        while(t-- >0){
            String name = sc.nextLine();
            String maphong = sc.nextLine();
            Date ngayden = a.parse(sc.nextLine());
            Date ngaydi = a.parse(sc.nextLine());
            Long songay = (ngaydi.getTime()-ngayden.getTime()) / (1000L *60 *60*24);
            KH c = new KH(name, maphong,songay);
            b.add(c);
        }
        Collections.sort(b);
        for(KH i : b){
            System.out.println(i);
        }
    }
}
