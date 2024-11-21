
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
class KhachHang{
    private String sd,id;
    private long chisomoi, chisocu;
    public static int cnt=1;

    public KhachHang(String sd, long chisocu, long chisomoi) {
        this.sd = sd;
        this.id = "KH" + String.format("%02d", cnt++);
        this.chisomoi = chisomoi;
        this.chisocu = chisocu;
    }
    public int heso(){
        if(sd.equals("KD")) return 3;
        if(sd.equals("NN")) return 5;
        if(sd.equals("TT")) return 4;
        return 2;
    }
    public long thanhtien(){
        return (chisomoi - chisocu) * heso() * 550;
    }
    public long phutroi(){
        long tmp = chisomoi-chisocu;
        if(tmp<50) return 0;
        if(tmp<=100) return (long) Math.ceil(thanhtien()*0.35);
        return thanhtien();
    }
    public long tongtien(){
        return phutroi()+thanhtien();
    }
    public String out(){
        return id + " " + heso() + " " + thanhtien() + " " + phutroi() + " " + tongtien();
    }
}
public class tinh_tien_dien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while(t-- >0){
            KhachHang x = new KhachHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            a.add(x);
        }
        for(KhachHang i : a){
            System.out.println(i.out());
        }
    }
}
