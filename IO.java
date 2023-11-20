import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IO {
    private static volatile IO instance = null;
    private final static Scanner scanner = new Scanner(System.in);

    private IO() {
    }

    public static IO getInstance() {
        IO result = instance;
        if (instance == null) {
            synchronized (IO.class) {
                result = instance;
                if (instance == null) {
                    instance = result = new IO();
                }
            }
        }
        return instance;
    }
    
    public Scanner getScanner() {
        return scanner;
    }

    public Scanner getScanner(File file) {
        try {
            return new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return null;
        }
    }

    public void clearScreen() {
        System.out.print("\033\143");
    }
}