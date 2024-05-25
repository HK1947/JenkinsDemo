package demo;

public class GradleDemo {


    public static void main(String[] args) {

        System.out.println("Today is demo class");
        System.out.println("Today is demo class but we are executing the commands");
        String textInBold = "Java_Prof_Level";
        System.out.print("\033[0;1m" + textInBold);
        System.out.printf("%100s\n", "January");
    }
    
}
