package net.missdjoko.controlstatemens.transitionoperation;

/**
 * Created by Miss_ on 17.09.2015.
 */
public class OperatorBREAKAsGoTo {
    protected static void main(){
        // break метка; При выполнении  этой формы оператора bre a k управление передается блоку кода, помеченному
        //меткой. Такой блок кода должен содержать оператор break
        // метка:{};


        for (int i=1; i<4; i++){
          two:
          {
              for (int j = 0; j < 12; j++) {

                  if (j % 3 == 0) System.out.println(" Second ");
                  else System.out.print("    ");

                  for (int k = 0; k < 10; k++) {

                      if (k > 5) break two;
                      System.out.print(" first ");
                  }


              }


          }
            System.out.println(" third ");
        }

    }
}
