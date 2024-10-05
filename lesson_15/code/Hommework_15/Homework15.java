package Hommework_15;
//Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Выполнить практикум с этой строкой:
//
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.

public class Homework15 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famos programming language!!! ";

        // распечатать последний символ строки

        char lastChar = str.charAt(str.length()-1);
        System.out.println("The last character of the string:" + lastChar);

        //Найти позицию подстроки “Java” в строке.

        int JavaPos = str.indexOf( "Java ");
        System.out.println("Substring position 'Java':" + JavaPos);

       // Проверить, содержит ли заданная строка подстроку “Java”.

        boolean containsJava = str.contains("Java");
        System.out.println(" The string contains 'Java':" + containsJava);

       //Заменить все символы “o” на “a”.

        String replacedStr = str.replace('0', 'a');
        System.out.println(" The string after replacing 'o' with 'a':" + replacedStr);

        //Преобразуйте строку к верхнему регистру.

        String upCaseStr = str.toUpperCase();
        System.out.println(" Uppercase string:" + upCaseStr);

        //Преобразуйте строку к нижнему регистру.

        String lowCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowCaseStr);

        //Вырезать подстроку Java c помощью метода substring().

        String substringJava = str.substring( JavaPos,JavaPos + "Java".length() );
        System.out.println("The cut substrin 'Java': " + "Java".length()  );

        ////Проверить, заканчивается ли строка подстрокой “!!!”.
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("The line ends with '!!!':"+endsWithExclamation );

        //Проверить, начинается ли строка подстрокой “I'm proud”.

        boolean startsWithProud = str.startsWith("I'm proud");
        System.out.println(" The line begins with 'I'm proud':" + startsWithProud);


    }

}
