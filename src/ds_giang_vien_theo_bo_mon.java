
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
class GiangVien{
    private String id,name,nganh;
    private static int cnt=1;
    public GiangVien(String name, String nganh) {
        this.name = name;
        this.id = "GV" + String.format("%02d",cnt++);
        this.nganh = nganh;
    }
    public String ten(){
        String[] a = name.split("\\s+");
        return a[a.length-1].toUpperCase();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String kh(){
        String[] tmp = nganh.split("\\s+");
        String res="";
        for(String i : tmp){
            res += String.valueOf(i.charAt(0)).toUpperCase();
        }
        return res;
    }
    public String out(){
        return id + " " + name + " " + kh();
    }
}
public class ds_giang_vien_theo_bo_mon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            GiangVien x = new GiangVien(sc.nextLine(), sc.nextLine());
            a.add(x);
        }
//        Collections.sort(a, new Comparator<GiangVien>(){
//            @Override
//            public int compare(GiangVien a, GiangVien b){
//                if(a.ten().equals(b.ten())) return a.getId().compareTo(b.getId());
//                return a.ten().compareTo(b.ten());
//            }
//        });
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            String[] bomon = sc.nextLine().split("\\s+");
            String res="";
            for(String j:bomon){
                res += String.valueOf(j.charAt(0)).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+ res + ":");
            for(GiangVien j :a){
                if(j.kh().equals(res)){
                    System.out.println(j.out());
                }
            }
            
        }
//        for(GiangVien i : a){
//            System.out.println(i.out());
//        }
    }
}
