package net.missdjoko.controlstatemens.transitionoperation;

/**
 * Created by Miss_ on 25.09.2015.
 */
public class OperatorCONTINUE {
    protected static void main(){
    //оператор continue вызывает передачу управления непосредственно условному
    //    выражению, управляющему циклом. В цикле for управление передается вначале
    //   итерационной части цикла for , а затем условному выражению. Во всех трех
    //    видах циклов любой промежуточный код пропускается
    // break- делает выход из текущего цикла и передает управление следующему коду или оператору,
    // continue- запускает новую итерацию этого же самого цикла

         for ( int i = 0 ; i <10; i ++ ) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue ;
                }
                System.out.print(" " + (i * j));


                }
                System.out.println();
            }
        }
    }

