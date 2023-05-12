import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/12/2023 7:15 AM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n,k,total = 1,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Ust alanicak sayi : ");
        n = input.nextInt();
        System.out.print("Us olacak sayi : ");
        k = input.nextInt();
        for (i=1;i<=k;i++){
            total *= n;
        }
        System.out.println(total);
    }
}
