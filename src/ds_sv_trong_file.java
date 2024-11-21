
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
class SinhVien{
    private String msv , name , lop , mail;

    public SinhVien(String msv, String name, String lop, String mail) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }
    public String chuanhoa(){
        String[] s = name.toLowerCase().split("\\s+");
        String res = "";
        for(String i:s){
            res += i.substring(0,1).toUpperCase() + i.substring(1);
            res += " ";
        }
        return res;
    }
    public String getMsv() {
        return msv;
    }
    @Override
    public String toString(){
        return msv + " " + chuanhoa() + "" + lop + " " + mail;
    }
}
public class ds_sv_trong_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-- >0){
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String mail = sc.nextLine();
            SinhVien x = new SinhVien(msv, name, lop, mail);
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien a, SinhVien b){
                return a.getMsv().compareTo(b.getMsv());
            }
        });
        for(SinhVien i : a){
            System.out.println(i);
        }
    }
}
