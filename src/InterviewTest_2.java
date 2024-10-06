import java.util.Scanner;

    public class InterviewTest_2
    {
public class ForTest
{
    public static String Compare(int a, int b) {
        String result = null;
        if (a > b) result = "more";
        if (a < b) result = "less";
        if (a == b) result = "equal";
        return result;

    }
public static int Minus(int a, int b)
    {
    int MinusResult = a-b;
    return MinusResult;
    }
}

        public static void main(String[] args)
        {
            int a;
            int b;
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
            System.out.println("a= " + a);
            System.out.println("Введите значение b");
            String str2 = sc.nextLine();
            try {
                b = Integer.parseInt(str2);
            }
            catch (NumberFormatException e) {
                b = 0;
                System.out.println("Ошибка ввода. Принято b=0");
            }

            String Out = ForTest.Compare(a, b);
            System.out.println(a +" "+ Out+" "+ b);
            System.out.println("Minus result is " + ForTest.Minus(a,b));

        }

    }




