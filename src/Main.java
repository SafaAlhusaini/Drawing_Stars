// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int rows=5;

        for (int i= 0; i<= rows; i++)
        {

            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int s=0;s<=i;s++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}