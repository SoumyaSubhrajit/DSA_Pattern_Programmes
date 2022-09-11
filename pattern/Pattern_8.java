import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp =0;
        int st = 1;
        for (int i =1 ; i<= n;i++)
        {
            for(int j = 1; j<=sp; j++)
            {
                System.out.print("\t");
            }
            if( i<=n){
                System.out.print("*\t");
            }

            sp++;
            System.out.println();
        }

    }
}
