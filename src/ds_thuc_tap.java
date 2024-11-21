
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
    private String msv , name , lop , email , dn ;
    private int id;
    private static  int cnt=1;
    public SinhVien(String msv, String name, String lop, String email, String dn) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.id = cnt++;
        this.email = email;
        this.dn = dn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }
    public String out(){
        return id + " " + msv + " " + name + " " + lop + " " + email + " " + dn;
    }
}
public class ds_thuc_tap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int j=0; j<t;j++){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            SinhVien x = new SinhVien(msv, name, lop,email, dn);
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                return a.getName().compareTo(b.getName());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            String tmp = sc.nextLine();
            for(SinhVien k: a){
                if(k.getDn().equals(tmp)){
                    System.out.println(k.out());
                }
            }
        }
    }
}
