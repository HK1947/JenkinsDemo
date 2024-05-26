package demo;

public class GradleDemo {


    public static void main(String[] args) {

        System.out.println("Today is demo class");
        System.out.println("Today is demo class but we are executing the commands");
        String textInBold = "Java_Prof_Level";
        System.out.print("This is for checking polling of job");
        System.out.printf("Job is been completed");
        System.out.print(" ");

        String str= "Harsha", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Harsha"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
    
}
