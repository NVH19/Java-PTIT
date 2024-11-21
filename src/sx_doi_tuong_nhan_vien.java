
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
class NhanVien{
    private String name,id ,gioitinh, ngaysinh , diachi , masothua , ngaykihopdong;
    private static int cnt=1;
    public NhanVien(String name, String gioitinh, String ngaysinh, String diachi, String masothua, String ngaykihopdong) {
        this.name = name;
        this.id = String.format("%05d", cnt++);
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothua = masothua;
        this.ngaykihopdong = ngaykihopdong;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String out(){
        return id + " " + name + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + masothua + " " + ngaykihopdong;
    }
}   
public class sx_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        ArrayList<NhanVien> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien a, NhanVien b){
                String ns1 = a.getNgaysinh().substring(6) + a.getNgaysinh().substring(3,5) + a.getNgaysinh().substring(0,2);
                String ns2 = b.getNgaysinh().substring(6) + b.getNgaysinh().substring(3,5) + b.getNgaysinh().substring(0,2);
                return ns1.compareTo(ns2);
            }
        });
        for(NhanVien i: a){
            System.out.println(i.out());
        }
    }
}
