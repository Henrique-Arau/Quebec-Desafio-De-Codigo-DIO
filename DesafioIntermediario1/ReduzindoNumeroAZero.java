// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
 
public class ReduzindoNumeroAZero{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0)
        {
            if ((num & 1) == 1)
            {
                step++;
            }
            num /= 2;
            step++;
        }

          System.out.println(step - 1);
    }
}