
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
class Game{
    private String id,name,giovao,giora;

    public Game(String id, String name, String giovao, String giora) {
        this.id = id;
        this.name = name;
        this.giovao = giovao;
        this.giora = giora;
    }

    public String getGiovao() {
        return giovao;
    }

    public void setGiovao(String giovao) {
        this.giovao = giovao;
    }

    public String getGiora() {
        return giora;
    }

    public void setGiora(String giora) {
        this.giora = giora;
    }
    public String gio(){
        int a = Integer.parseInt(giora.substring(0, 2)); //giora
        int c = Integer.parseInt(giovao.substring(0,2)); //giovao
        int b = Integer.parseInt(giora.substring(3, 5)); //phutra
        int d = Integer.parseInt(giovao.substring(3,5)); //phutvao
        if(c>a){
            a += 24;
        }
        if(b<d){
            b += 60;
            a -= 1;
        }
        
        return (a-c) + " gio " + (b-d) + " phut";
    }
    public String out(){
        return id + " " + name + " "  + gio();
    }
}
public class tinh_gio {
    public static void main(String[] args) {
        ArrayList<Game> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i=0; i<t; i++){
            Game x = new Game(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<Game>(){
            @Override
            public int compare(Game a, Game b){
               String[] tmp1  = a.gio().split("\\s+");
               String[] tmp2 = b.gio().split("\\s+");
               String h1 = tmp1[0]+tmp1[2];
               String h2 = tmp2[0]+tmp2[2];
               return h2.compareTo(h1);
            }
        });
        for(Game i : a){
            System.out.println(i.out());
        }
    }
}
