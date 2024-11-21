
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
    private String msv,name, lop;
    private int diem = 10;
    public SinhVien(String msv, String name, String lop) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
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

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
}
public class diem_danh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> a = new ArrayList<>();
        for(int i=0; i<t; i++){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        for(int i=0; i<t; i++){
            String[] tmp = sc.nextLine().split("\\s+");
            String msv = tmp[0];
            String cc = tmp[1];
            for(SinhVien j: a){
                if(j.getMsv().equals(msv)){
                    for(int k=0; k<cc.length(); k++){
                        if(cc.charAt(k)=='v') j.setDiem(j.getDiem()-2);
                        else if(cc.charAt(k)=='m') j.setDiem(j.getDiem()-1);
                    }
                    if(j.getDiem()<0) j.setDiem(0);
                }
            }
    
        }
        for(SinhVien i : a){
            System.out.print(i.getMsv() + " " + i.getName() + " " + i.getLop() + " " + i.getDiem());
            if(i.getDiem()==0){
                System.out.print(" KDDK");
            }
            System.out.println("");
        }
        
    }
}
