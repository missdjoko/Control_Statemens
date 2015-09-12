package net.missdjoko.controlstatemens.transitionoperation;

/**
 * Created by Miss_Djoko on 09.09.2015.
 */
public class OperatorBREAKForOutFromCycle {
    protected static void main(){ // protected доступен только внутри своего пакета

      /*  for (int i=1; i<100;i++){ // простой выход из цикла
            if (i==10) break;
            System.out.println(i);
        }*/

        // выход из вложенных циклов
        for (int i=1; i<4; i++){
            for ( int j=0; j<12; j++){

                if (j%3==0 ) System.out.println();
                else  System.out.print("    ");

                for (int k=0; k<10; k++){

                    if (k>5)break;
                    System.out.print(k+" ");
                }


            }

            System.out.println();

        }

    }
}
