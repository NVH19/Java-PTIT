
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H19
 */
class WordSet{
    private Set<String> s;

    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        s = new TreeSet<>();
        while (sc.hasNext()) {
            s.add(sc.next().toLowerCase());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (String i : s) {
            res += i + "\n";
        }
        return res;
    }
}
public class liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
