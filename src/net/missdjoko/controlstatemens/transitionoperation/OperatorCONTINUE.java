package net.missdjoko.controlstatemens.transitionoperation;

/**
 * Created by Miss_ on 25.09.2015.
 */
public class OperatorCONTINUE {
    protected static void main(){
    //�������� continue �������� �������� ���������� ��������������� ���������
    //    ���������, ������������ ������. � ����� for ���������� ���������� �������
    //   ������������ ����� ����� for , � ����� ��������� ���������. �� ���� ����
    //    ����� ������ ����� ������������� ��� ������������
    // break- ������ ����� �� �������� ����� � �������� ���������� ���������� ���� ��� ���������,
    // continue- ��������� ����� �������� ����� �� ������ �����

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

