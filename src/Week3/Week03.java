package Week3;
import helpers.*;

public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    private static Student Tyrese;
    private static Student aCourse;
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        createStudent();
        createcourse();
        enrolStudent();
    }     
    
    private static void createStudent()
    {
        String fullname = "anon";

        System.out.println();
        String id = InputReader.getString("Please enter your id > ");

        boolean isValid = false;
        while(!isValid)
        {
            fullname = InputReader.getString("Please enter your name > ");
            String answer = InputReader.getString(fullname + " is this name correct? > ");

            if(answer.contains("yes"));
            
        }

        Student Tyrese = new Student(id, fullname);
        Tyrese.getClass();

    }
}
