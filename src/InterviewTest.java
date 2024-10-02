

import java.util.Scanner;
public class InterviewTest
{

    public static void Compare(int a, int b)
    {
        String result;
        if(a>b) System.out.println("Figure "+a +" more than "+b);
        if(a<b) System.out.println("Figure "+a +" less than "+b);
        if(a==b) System.out.println("Figures is equal ");


    }

    public static void main(String[] args)
        {
            int a = 1;
            int b = 2;

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значение а");
            String str = sc.nextLine();
            try {
                a = Integer.parseInt(str);
            }
            catch (NumberFormatException e) {
                a = 0;
                System.out.println("Ошибка ввода. Принято а=0");
            }
            System.out.println("Введите значение b");
            String str2 = sc.nextLine();
            try {
                b = Integer.parseInt(str2);
            }
            catch (NumberFormatException e) {
                b = 0;
                System.out.println("Ошибка ввода. Принято b=0");
            }

            Compare(a, b);
            // System.out.println(a + Q + b);


        }

}
