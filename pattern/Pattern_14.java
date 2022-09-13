import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++)
        {
            int v = i * n;
            System.out.println(n + "\t" + i + "\t" +v);
        }
    }
}
