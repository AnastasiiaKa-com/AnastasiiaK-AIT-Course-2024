package Classwork_33.seasons;
//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.VALUES() извлекает данные в массив
//.toString
//.ordinal()
//.valueOf()

public class SeasonAppl {
    public static void main(String[] args) {

        Season[] seasons = Season.values();
        System.out.println("________________values of Enum_______________");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }
        System.out.println("________________________________________________________-");
        //for each
        for (Season season : seasons) {
            System.out.println(season.getName());
            System.out.println(season.getDuration());

            System.out.println("________________toString____________________");
            String str = Season.AUTUMN.toString();
            System.out.println(str);

            System.out.println("________________ordinal()____________________");

            int num  =  Season.AUTUMN.ordinal();
            System.out.println(num);// 3 or 4?
            num  =  Season.WINTER.ordinal();
            System.out.println(num);// 0 or 1?

            System.out.println("________________valueOf()____________________");
            Season s = Season.valueOf("Summer");
            System.out.println(s);
        }

    }
}
