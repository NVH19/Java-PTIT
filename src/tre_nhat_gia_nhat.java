
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
class people{
    private String name , ngaysinh;

    
    public people(String name, String ngaysinh) {
        this.name = name;
        this.ngaysinh = ngaysinh;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String reset(){
        String[] tmp = ngaysinh.split("/");
        String res = tmp[2]+tmp[1]+tmp[0];
        return res;
    }
    public String out(){
        return name + " " + ngaysinh;
    }
}
public class tre_nhat_gia_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<people> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        int tmp = t;
        while(t-- >0){
            String[] s = sc.nextLine().split("\\s+");
            String name = s[0];
            String ngaysinh = s[1];
            people x = new people(name, ngaysinh);
            a.add(x);
        }
        Collections.sort(a, new Comparator<people>(){
            @Override
            public int compare(people a, people b){
                return b.reset().compareTo(a.reset());
            }
        });
        System.out.println(a.get(0).getName());
        System.out.println(a.get(tmp-1).getName());
    }
}
