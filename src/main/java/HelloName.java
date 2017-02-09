import java.util.*;

public class HelloName {

    //private final String name;

    public String getGreetings(String name){

        return "Hello " + name ;
    }

    public String askUserForAName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name?");
        return in.nextLine();

    }
public static void main (String[] args){

    HelloName a = new HelloName();
    System.out.println(a.getGreetings(a.askUserForAName()));
    //System.out.println(a.getGreetings());
}
}