import java.io.*;
import java.util.Scanner;

public class Controller {
    static final String PATH = "C:\\Users\\R\\Reminder\\src\\main\\resources\\Bd.txt";

    public static void main(String[] args) {

      write();
      read();

    }
    static void read()  {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
    static void write() {
        String date;
        String name;

        System.out.println("Введите дату в формате ДД.ММ.ГГГГ");
        Scanner console = new Scanner(System.in);
        date = console.nextLine();
        System.out.println("Введите имя");
        Scanner console1 = new Scanner(System.in);
        name = console1.nextLine();
        File file = new File(PATH);
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        pw.println(date +" "+ name);
        pw.close();


    }

}
