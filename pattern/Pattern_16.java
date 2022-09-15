import java.text.Format;
import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 5;
        int st = 1;
        for(int i = 1; i<=n;i++)
        {
            for(int j = 1;j<=st;j++)
            {
                System.out.print("*\t");
            }
            for(int j= 1; j<=sp; j++)
            {
                System.out.print("\t");
            }
            for(int j = 1; j<=st;j++)
            {
                System.out.print("*\t");
            }
            sp -=1;
            if(st<=n-1) {
                st++;
            }
            System.out.println();
        }

    }
}
