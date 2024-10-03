package Classwork_8;

//Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplikationTable {

    public static void main(String[] args) {

        //цикл в цикле

        int i= 1;
        int j = 1;

        while ( i < 11){
            while (j < 11){

                System.out.print(i + "x" + j + " = "+ (i*j)+" | ");
                j ++ ;

            }// end of while j

            j = 1;
            i++;

            System.out.println(); // next line

        }//end of while i
    }
}
