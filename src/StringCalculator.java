import java.util.Scanner;
public class StringCalculator
{
        public static String sum (String str1, String str2) //Сложение
        {
            String res = str1 + str2;
            return res;
        }

        public static String minus (String str1, String str2) //Вычитание
        {
            String res = str1.replace(str2, "");
            return res;
        }

        public static String multiply (String str1,int a) //Умножение
        {
            String res = "";
            for (int i = 0; i < a; i++) {
                res = res + str1;
            }
            return res;
        }

        public static String div (String str1,int a) //Деление
        {
            int cut = str1.length() / a;
            String res = str1.substring(0, cut);
            return res;
        }

    public static String strFormat(String strIn) //Выделение части строки в кавычках, начиная с 0 символа
    {
        String str = "";
        if (strIn.charAt(0)!='"' ) //Проверка первых кавычек
        {
            System.out.println("Wrong input, first symbol must be \" ");
            System.exit(0);
        }

        for (int i = 2; i < (strIn.length()) ; i++)
        {
            if (strIn.charAt(i) == '"')
            {
                str = strIn.substring(1, i);
                System.out.println("Substring is \"" + str + "\"");
                return (str);
            }
        }

        if (str == "")
        {
            System.out.println("Wrong input. First sentence not found");
            System.exit(0);
        }

        if (str.length()>10) // Проверка длины
        {
            System.out.println("Wrong input, first sentence is over 10 symbols");
            System.exit(0);
        }
        return(str);
    }
public static int intFormat (String strIn)
{
    int a = 1;
    try {
        a = Integer.parseInt(strIn);
    }
    catch (NumberFormatException e)
    {
        System.out.println("Second substring is not figure");
        System.exit(0);
    }
    return (a);
}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Line input is required");
        String input = sc.nextLine();

       // String input = "\"0qwerzx12340\" / 2";
       // System.out.println("Input line is");
        //System.out.println(input);


        String strInUpd = input;
        String result = " something going wrong ";
        int multiplicator = 1;
        String str1 = strFormat(strInUpd);

        strInUpd = strInUpd.substring((str1.length()+2), strInUpd.length());
        System.out.println("Line in without first sentence is " + strInUpd);

//выделение оператора
        String op = strInUpd.substring(0, 3);
        System.out.println("the oprator is \"" + op + "\"");
            if (op != " + " ^ op != " - " ^ op != " * " ^ op != " / ") {
                System.out.println(" Wrong operator");
                System.exit(0);
            }
        strInUpd = strInUpd.substring(3, strInUpd.length());
        System.out.println("Line in without first sentence and operator is " + strInUpd);
//Сложение
            if (op.equals(" + "))
            {
                String str2 = strFormat(strInUpd);
                strInUpd = strInUpd.substring(str2.length()+2, strInUpd.length());
                if (strInUpd != "")
                {
                    System.out.println("Second line input is wrong");
                    System.exit(0);
                }
                result = sum(str1, str2);
            }
        if (op.equals(" - "))
        {
            String str2 = strFormat(strInUpd);
            strInUpd = strInUpd.substring(str2.length()+2, strInUpd.length());
            if (strInUpd != "")
            {
                System.out.println("Second sentence input is wrong");
                System.exit(0);
            }
            result = minus(str1, str2);
        }
        if (op.equals(" * "))
        {
            multiplicator  = intFormat(strInUpd);
            result = multiply(str1,multiplicator);
        }
        if (op.equals(" / "))
        {
            multiplicator  = intFormat(strInUpd);
            result = div(str1,multiplicator);
        }


                /*
        result = Calc.sum(test1,test2);
        System.out.println(result);
        result = Calc.minus(test1,test2);
        System.out.println(result);
        result = Calc.multiply(test1,a);
        System.out.println(result);
        result = Calc.div(test1,a);
        System.out.println(result);
        */
        if (result.length()>40) result = (result.substring(0,39) + "...");
        System.out.println(" The result is below");
        System.out.println(result);
    }
}




