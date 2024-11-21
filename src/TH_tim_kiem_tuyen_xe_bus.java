
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
class Tuyen{
    private String id , name , ngay;
    private int sohieutuyen;
    private int soluotdi;
    private double doanhthu;
    private String kieungay;
    private  static int cnt=1;
    public Tuyen(String name, String ngay, int sohieutuyen, int soluotdi, String kieungay) {
        this.name = name;
        this.ngay = ngay;
        
        this.sohieutuyen = sohieutuyen;
        this.soluotdi = soluotdi;
        this.kieungay = kieungay;
        this.id = "HN" + sohieutuyen + String.format("%02d", cnt++);
    }
    public int thang(){
        return Integer.parseInt(ngay.substring(3,5));
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

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getSohieutuyen() {
        return sohieutuyen;
    }

    public void setSohieutuyen(int sohieutuyen) {
        this.sohieutuyen = sohieutuyen;
    }

    public int getSoluotdi() {
        return soluotdi;
    }

    public void setSoluotdi(int soluotdi) {
        this.soluotdi = soluotdi;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }

    public String getKieungay() {
        return kieungay;
    }

    public void setKieungay(String kieungay) {
        this.kieungay = kieungay;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        Tuyen.cnt = cnt;
    }
    public double tien(){
        doanhthu = 0;
        if(soluotdi<5) doanhthu = soluotdi*800;
        else if(soluotdi<=10) doanhthu =  soluotdi*780;
        else doanhthu =  soluotdi*750;
        if(kieungay.equals("le")) doanhthu = 1.2*doanhthu;
        else if(kieungay.equals("nghi")) doanhthu = 1.1 * doanhthu;
        return doanhthu;
    }
    public String out(){
        return id + " " + name + " " + ngay + " " + sohieutuyen + " " + soluotdi + " " + kieungay + " " + Math.round(tien());
    }
}
public class TH_tim_kiem_tuyen_xe_bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tuyen> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
           
            Tuyen x = new Tuyen(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            a.add(x);
        }
        int mon = sc.nextInt();
        int ok=0;
        ArrayList<Tuyen> b = new ArrayList<>();
        for(Tuyen i : a){
            if(i.thang()==mon){
                b.add(i);
                ok=1;
            }
        }
        if(ok==0) System.out.println("khong co");
        else{
            Collections.sort(b, new Comparator<Tuyen>(){
            @Override
            public int compare(Tuyen a , Tuyen b){
                String s1 = a.getNgay().substring(6) + a.getNgay().substring(3,4) + a.getNgay().substring(0,2);
                String s2 = b.getNgay().substring(6) + b.getNgay().substring(3,4) + b.getNgay().substring(0,2);
                return s2.compareTo(s1);
            }
            });
            for(Tuyen i : b){
                System.out.println(i.out());
                break;
            }
        }
    }
}
