package Claswork_21.string_numbers_idd.StringNumbersTDD;

public class StringWithNumbers {

    //fields
   private String string;



    //method
    public StringWithNumbers(String string){
        this.string = string;

    }
    public String getString(){
        return string;
    }
    public void setString(String string){
        this.string=string;
    }

    @Override
    public String toString() {
        return "StringWithNumbers{" +
                "string='" + string + '\'' +
                '}';
    }
    // 123 456 987 333

    private static int sumOfNumbersInString(String string){
        //обьявляем переменную
        int sum = 0;
        //обьявляем массив
        //сплит это метод который разделяет строку
       String[]  numbers = string.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers [i]);

        }
        return sum;
    }

}
