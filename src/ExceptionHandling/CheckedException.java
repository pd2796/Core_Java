package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    void readfile() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("");

    }
    public static void main(String[] args) {
        CheckedException c = new CheckedException();
        try {
            c.readfile();
        } catch (FileNotFoundException e) {
            System.out.println("not found");        }
    }
}
