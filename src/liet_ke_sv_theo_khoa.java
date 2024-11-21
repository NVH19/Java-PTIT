
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
class SinhVien{
    private String msv, name , lop , email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String out(){
        return msv + " " + name + " " + lop + " " +email;
    }
}
public class liet_ke_sv_theo_khoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
//        Collections.sort(a,new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien a , SinhVien b){
//                if(a.getLop().equals(b.getLop())) return a.getMsv().compareTo(b.getMsv());
//                return a.getLop().compareTo(b.getLop());
//            }
//        });
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
             String nam = sc.nextLine();
             String khoa = nam.substring(2);
             System.out.println("DANH SACH SINH VIEN KHOA " + nam + ":");
             for(SinhVien j:a){
                 if(j.getLop().substring(1,3).equals(khoa)){
                     System.out.println(j.out());
                 }
             }
        }
    }
}
