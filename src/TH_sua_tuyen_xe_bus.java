
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

    public String getKieungay() {
        return kieungay;
    }

    public void setKieungay(String kieungay) {
        this.kieungay = kieungay;
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
public class TH_sua_tuyen_xe_bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tuyen> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
           
            Tuyen x = new Tuyen(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
            a.add(x);
        }
        String ma = sc.nextLine();
        for(Tuyen i : a){
            if(i.getId().toLowerCase().equals(ma.toLowerCase())){
                Tuyen b = i;
                i.setName(sc.nextLine());
                i.setSoluotdi(Integer.parseInt(sc.nextLine()));
                i.setKieungay(sc.nextLine());
                System.out.println(b.out());
                System.out.println(i.out());
                break;
            }
            else {
                System.out.println("khong tim thay");
                break;
            }
        }
    }
}
