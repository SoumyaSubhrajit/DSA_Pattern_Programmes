import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
