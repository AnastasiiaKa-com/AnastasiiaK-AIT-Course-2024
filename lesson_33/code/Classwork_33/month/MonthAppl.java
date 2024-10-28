package Classwork_33.month;

public class MonthAppl {
    public static void main(String[] args) {

        Month m = Month.AUG;
        System.out.println("Start month:" + m);

         m = m.plusMonth(m,6);
        System.out.println("After " + 6 +"months: " + m);//FEBRUARY

    }
}
