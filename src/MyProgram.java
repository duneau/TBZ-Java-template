// Imports Input functions
import static ch.tbz.lib.Input.*;

public class MyProgram {

    public static void main(String[] args) {

        System.out.println("---- TBZ ----");
        // Input
        String myname = inputString("What's your name: ");

        System.out.println("Welcome " + myname);
    }
}
