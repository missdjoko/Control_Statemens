package net.missdjoko.controlstatemens.operarorscycles;

/**
 * Created by Miss_Djoko on 25.08.2015.
 */
public class OperatorFOR {
/* внутри можно объявлять переменную-счетчик, и не одну
* for (;a<b;)  такое впоне допустимо, но и a и b должны быть инициализированы*/
    public static void main(){



        for (int a = 4, b = 5;(a+b)<15; a++, b++)
            System.out.println(" Summa = " + ( a + b));

    }
}
