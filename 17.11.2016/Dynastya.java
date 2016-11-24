import java.util.Scanner;

public class Dynastya {

    public static int dinastyaEnter;
    public static int sum = 0;
    public static int change = 10;
    public static int tmp = 1;

    public static void main(String[] args) {
        int startDinastya = 2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dinastya: ");
        dinastyaEnter = sc.nextInt();
        System.out.println(countOfChildren(startDinastya));
    }

    private static int countOfChildren(int dinastya) {
        if (dinastyaEnter >= dinastya) {
            if (dinastya % 2 == 0) {
                change++;
                tmp *= change;
                sum += tmp;
                return countOfChildren(++dinastya);
            } else {
                change -= 2;
                tmp *= change;
                sum += tmp;
                return countOfChildren(++dinastya);
            }
        } else {
            return sum;
        }
    }
}