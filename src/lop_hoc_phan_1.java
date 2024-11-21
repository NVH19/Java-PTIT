
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
    private String id, name, namegv, nhom;

    public SinhVien(String id, String name, String nhom, String namegv) {
        this.id = id;
        this.name = name;
        this.namegv = namegv;
        this.nhom = nhom;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String out(){
        return nhom + " " + namegv;
    }
}
public class lop_hoc_phan_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        while(t-- >0){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            String tmp = sc.nextLine();
            for(SinhVien j : a){
                if(j.getId().equals(tmp)){
                    tmp = j.getName();
                    break;
                }
            }
            ArrayList<SinhVien> b = new ArrayList<>();
            System.out.println("Danh sach nhom lop mon " + tmp + ":");
            for(SinhVien j : a){
                if(j.getName().equals(tmp)){
                    b.add(j);
                }
            }
            Collections.sort(b, new Comparator<SinhVien>(){
                @Override
                public int compare(SinhVien x, SinhVien y){
                    return x.getNhom().compareTo(y.getNhom());
                }
            });
            for(SinhVien j : b){
                System.out.println(j.out());
            }
        }
    }
}
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1