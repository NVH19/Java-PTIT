
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class LoaiPhong implements Comparable<LoaiPhong>{
    private String id , name;
    private int dongia;
    private float phi;

    public LoaiPhong(String s) {
        String[] a = s.split("\\s+");
        this.id = a[0];
        this.name = a[1];
        this.dongia = Integer.parseInt(a[2]);
        this.phi = Float.parseFloat(a[3]);
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + dongia + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.getName());
    }
}
public class loai_phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
