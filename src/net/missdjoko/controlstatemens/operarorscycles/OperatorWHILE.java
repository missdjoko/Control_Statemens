package net.missdjoko.controlstatemens.operarorscycles;


/**
 * Created by Miss_Djoko on 21.08.2015.
 */
public class OperatorWHILE {
    public static void main() throws java.io.IOException{

        int i = 0;
        int j = 100;
        char g;

        while(++i < --j);// исполняется пока условие истинно
        // можно в условии выполнять небольшие операции, тогда тело цикла может быть путым

        System.out.println(i);
        g = (char) System.in.read(); // читает посимвольно (1 шт)

        System.out.println(g);





    }



}
