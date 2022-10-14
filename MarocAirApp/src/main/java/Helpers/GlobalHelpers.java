package Helpers;

public class GlobalHelpers {

    public static void Print(String Message){
        System.out.println(Message);
    }

    public static void Print(String Message,ConsoleForeground ForeColor,ConsoleBackground BackgroundColor){
        System.out.print(ForeColor.getValue());
        System.out.print(BackgroundColor.getValue());
        System.out.println(Message);
        System.out.print(ConsoleForeground.RESET.getValue());
        System.out.print(ConsoleBackground.RESET.getValue());
    }

    public static void Print(String Message,ConsoleForeground ForeColor){
        System.out.print(ForeColor.getValue());
        System.out.println(Message);
        System.out.print(ConsoleForeground.RESET.getValue());
    }

    public static void Print(String Message,ConsoleBackground BackgroundColor){
        System.out.print(BackgroundColor.getValue());
        System.out.println(Message);
        System.out.print(ConsoleForeground.RESET.getValue());
    }

}
