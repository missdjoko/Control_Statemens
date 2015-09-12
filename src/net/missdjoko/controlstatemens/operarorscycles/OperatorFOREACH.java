package net.missdjoko.controlstatemens.operarorscycles;

/**
 * Created by Miss_Djoko on 25.08.2015.
 */
public class OperatorFOREACH {
    /* FOR (итерационная_переменная : коллекция ) блок_операторов */
    public static  void main(){
      /*  int nums[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for ( int x : nums ) System.out.println(x);


        int args [] [] ={ {1,1,1,1,1,1,1,1,1,1},{2,2,2,2,2,2,2,2,2,2}};


        for (int j : args[1]) System.out.println(j + nums[j]);*/

        int summ [][]= new int [3][5];


        for (int i = 0; i < summ.length; ++i){
            for (int j = 0; j < summ[i].length; ++j){
                summ[i][j] = 3;
                System.out.print("__" + summ[i][j] + "__");
            }

            System.out.println();

        }
        /*summ = new int [3][3+1]; просто создает новый пустой массив с заданными значениями (старые значения затираются)
        for (int [] x :summ){
            for (int y:x) {System.out.print("__" + y);}
            System.out.println();

        }*/









    }
}
