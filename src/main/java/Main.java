import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/mvtValeevmail.ru/IdeaProjects/Homework2/src/main/java/input");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            int length;
            length = Integer.parseInt(line);
            Object[] classes;
            classes = new Object[length];
            for (int i = 0; i < length; i++) {
                line = reader.readLine();
                String[] words = line.split(", ");
                String nameClass = words[0];
                switch (nameClass) {
                    case "Desktop":
                        classes[i] = new Desktop(words[1], words[2], words[3], words[4]);
                        break;
                    case "Monoblock":
                        classes[i] = new Monoblock(words[1], words[2], words[3], words[4]);
                        break;
                    case "Netbook":
                        classes[i] = new Netbook(words[1], words[2], words[3], words[4], words[5]);
                        break;
                    case "Nettop":
                        classes[i] = new Nettop(words[1], words[2], words[3]);
                        break;
                    case "Notebook":
                        classes[i] = new Notebook(words[1], words[2], words[3], words[4], words[5]);
                        break;
                    case "Server":
                        classes[i] = new Server(words[1], words[2], words[3]);
                        break;
                }
                ;
            }
            for (Object aClass : classes) {
                System.out.println(((ComputerImpl) aClass).turnOn());
                System.out.println(((ComputerImpl) aClass).connect());
                System.out.println(((ComputerImpl) aClass).turnOff());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
