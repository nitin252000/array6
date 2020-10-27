import java.util.Scanner;
public class neew {
        static void bonappet(int n,int k,int b,int []ar)
        {
            int counter=0;
            for(int i=0;i<ar.length;i++) {
                if (i != k) {
                    counter += ar[i];
                }
            }
                if((b<=(counter/2)))
                {
                    System.out.println("bon appetete");
                }
                else
                {
                    System.out.println((b-(counter/2)));
                }
        }
            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int k=sc.nextInt();
                int [] ar=new int[n];
                for(int j=0;j<ar.length;j++)
                {
                    ar[j]=sc.nextInt();
            }
                int b=sc.nextInt();
                bonappet(n,k,b,ar);
    }
}
