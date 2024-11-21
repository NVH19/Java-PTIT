
import java.util.*;

public class day_con_co_tong_le {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            ArrayList<Integer> M=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=scan.nextInt();
                M.add(x);
            }
            Collections.sort(M);
            Collections.reverse(M);
            int[] A=new int[n];
            Arrays.fill(A,0);
            while (true){
                int a=0;
                for(int i=n-1;i>=0;i--){
                    if(A[i]==0){
                        A[i]=1;
                        a++;
                        for(int j=i+1;j<n;j++)A[j]=0;
                        break;
                    }
                }
                if(a==0)break;
                int sum=0;
                for(int i=0;i<n;i++)sum+=A[i]*M.get(i);
                if(sum%2==1) {
                    for (int i = 0; i < n; i++)
                        if (A[i] == 1) System.out.print(M.get(i) + " ");
                    System.out.println();
                }
            }
        }
    }

}