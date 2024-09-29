//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class TextModifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Line input is required");
        String str = sc.nextLine();
     //   String str = "0-+       22+Te-st  parse   efd-1    +        we = pum0 -  pum       -7";

        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
/* Ver.0.2
System.out.println("Original string is");
        for (short i = 0; i < str.length(); i++) System.out.print(ch[i]);
        System.out.println();
        System.out.println("next step"); */
        int TextLength = (str.length());

        // PART 1
        for (int i = 0; i < (str.length() - 1); i++)
        {
            if ((ch[i] == ' ') && (ch[i+1] == ' '))

            {
             for (int ii = (i); ii < (str.length()-1); ii++)
              {
            ch[ii] = ch[ii + 1];

              }
             i--;
             TextLength--;
             ch[(str.length()-1)] = 'X';
            }
        }
        // output part 1
        /*System.out.println("Duplicated spaces have been removed");
        for (short i = 0; i < TextLength; i++) System.out.print(ch[i]);
        System.out.println();
        System.out.println("next step");
*/
        //PART 2
        for (int i = 1; i < (TextLength - 1); i++)
        {
            if ((ch[i] == '-') )

            {
                char buffer = ch[i-1];
                ch[i-1] = ch [i+1];
                ch [i+1] = buffer;
                // '-' remove
                for (int ii = (i); ii < (TextLength-1); ii++)
                {
                    ch[ii] = ch[ii + 1];

                }
                i--;
                TextLength--;
               ch[(str.length()-1)] = '@';
            }
        }

        // output part 2. In case first&last '-' this part have no changes
  /*      System.out.println("'Minus' modifier");
        for (short i = 0; i < TextLength; i++) System.out.print(ch[i]);
        System.out.println();
        System.out.println("next step");*/
// Part 3
        for (int i = 0; i < (TextLength); i++)
        {
            if ((ch[i] == '+') ) ch[i] = '!';

        }
        // output part 3.
        /*
        System.out.println("'Plus' modifier");
        for (short i = 0; i < TextLength; i++) System.out.print(ch[i]);
        System.out.println();
        System.out.println("next step");*/
//Part 4. Figures finding and sum
        int sum = 0;
        int num;

        for (int i = 0; i < (TextLength); i++)
        {
            if ((ch[i] == '1') || (ch[i] == '2') || (ch[i] == '3') || (ch[i] == '4') || (ch[i] == '5') || (ch[i] == '6') || (ch[i] == '7') || (ch[i] == '8') || (ch[i] == '9') || (ch[i] == '0') )

             {
                 num = ch[i] - '0';
                 sum = sum + num;
                 // System.out.println(num);
                 // System.out.println("Sum is " + sum);

                 // Figure remove
                for (int ii = (i); ii < (TextLength-1); ii++)
                {
                    ch[ii] = ch[ii + 1];

                }
                i--;
                 TextLength--;
               ch[(str.length()-1)] = '$';
            }
        }


        // output part 4
        System.out.println("The result is");
        for (short i = 0; i < TextLength; i++) System.out.print(ch[i]);
        System.out.print(' ');
        if (sum > 0 ) System.out.print(sum);
        System.out.println();
        // System.out.println("That's all");

    }
}





