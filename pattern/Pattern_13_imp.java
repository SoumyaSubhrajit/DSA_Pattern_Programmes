import java.util.Scanner;

public class Pattern_13_imp {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i< n;i++)
        {
            int icj = 1;
            for(int j = 0;j<=i;j++)
            {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j+1);
                icj=icjp1;
            }
            System.out.println();
        }
    }
}
