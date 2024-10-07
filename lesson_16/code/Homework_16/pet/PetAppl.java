package Homework_16.pet;
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.

public class PetAppl {

    public static void main(String[] args) {



        Pet anymal1 = new Pet( 1, " dog ",  10, " Archi ");
        Pet anymal2 = new Pet( 2, " cat ",   5, " Mause ");
        Pet anymal3 = new Pet( 3, " parrot ", 8, " Kescha ");
        Pet anymal4 = new Pet( 4, " fish ",   1, " Dori ");
        Pet anymal5 = new Pet( 5, " snake ",  3, " Marina ");

        System.out.println(anymal1);
        anymal1.sleep();
        anymal1.eat();
        anymal1.maceSounds();
        anymal1.walk();
        anymal1.play();

        System.out.println("__________________________________________________________");

        System.out.println(anymal2);
        anymal2.sleep();
        anymal2.eat();
        anymal2.maceSounds();
        anymal2.play();
        System.out.println("____________________________________________________________");

        System.out.println(anymal3);
        anymal3.sleep();
        anymal3.eat();
        anymal3.maceSounds();
        anymal3.play();
        System.out.println("___________________________________________________________");

        System.out.println(anymal4);
        anymal4.sleep();
        anymal4.eat();
        anymal4.maceSounds();
        anymal4.play();
        System.out.println("__________________________________________________________________");

        System.out.println(anymal5);
        anymal5.sleep();
        anymal5.eat();
        anymal5.maceSounds();
        anymal5.play();
        System.out.println("_____________________________________________________________________-");

    }

}
