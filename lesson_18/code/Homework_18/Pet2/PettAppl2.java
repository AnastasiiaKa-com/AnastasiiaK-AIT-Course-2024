package Homework_18.Pet2;

public class PettAppl2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(1,"Terrier",3,"Archi",25, 4);
Cat cat1 = new Cat(1,"Siamese",5,"Leo", 20,3);
        System.out.println(dog1.getName() + " makes a sound :" + dog1.voice());
        System.out.println(cat1.getName()+ " makes a sound :" + cat1.voice());

        System.out.println( " Pets spend the day together ");
        for ( int hour = 1; hour <= 24;hour++){
            System.out.println( " Hour " + hour + ":");
            System.out.println(dog1.getName() + " Playing with a cat," + " Eat, " + " Walk.");
            System.out.println(cat1.getName() + " Playing with a dog," + " Eat, " + " Sleep.");

            System.out.println();
        }
        System.out.println(" End of the day ");
    }

}
