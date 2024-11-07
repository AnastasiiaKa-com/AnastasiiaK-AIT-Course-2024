package Classwork_19;

//равенство строк . как понять ?

public class Compare_string {

    public static void main(String[] args) {

        int x = 5;// стек
        int y = 5;// стек
        boolean checker = (x == y);
        System.out.println(checker); // true

        String str1 = "Europe";// str1 -стек => (link) Europe -heap
        String str2 = "Europe";// str2 - стек => (link) Europe -heap
        System.out.println("____________________________________________");

        checker = (str1 == str2);// compare string
        System.out.println(checker);
        System.out.println("____________________________________________");

        String str3 = new String("Europe");
        checker = (str1 == str3);
        System.out.println(checker);//false,because links NOT equals!

        System.out.println("_______________________________________________");
        checker = str1.equals(str3); // compare Strings with method equals
        System.out.println(checker);



    }
}
