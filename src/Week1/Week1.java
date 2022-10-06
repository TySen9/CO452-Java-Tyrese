package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);

        int id = InputReader.getInt("Enter your id > ");
        System.out.println("Your ID is " + id);

        int height = InputReader.getInt("Enter the height of your rectangle > ");
        int length = InputReader.getInt("Enter the length of your rectangle > ");
        int perimeter = length*2 + height*2;
        int area = length * height;
        System.out.println("Your rectangle perimeter is " + perimeter);
        System.out.println("The area is " + area);

        
    } 
}
