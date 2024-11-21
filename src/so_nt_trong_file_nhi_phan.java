import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author H19
 */
public class so_nt_trong_file_nhi_phan {
    
    static int[] a = new int[10000];

    public static void sang_nt() {
        Arrays.fill(a, 1);
        a[0] = a[1] = 0;
        for (int i = 2; i <= 100; i++) 
            if (a[i] == 1) 
                for (int j = i * i; j < 10000; j += i) 
                    a[j] = 0;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sang_nt();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (List<Integer>) ois.readObject();
        int[] b = new int[10000];
        for (Integer i : l)
            b[i] += a[i];
        for (int i = 2; i < 10000; i++) 
            if (b[i] > 0) 
                System.out.println(i + " " + b[i]);
        ois.close();
    }
}
