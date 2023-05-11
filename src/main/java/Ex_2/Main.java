//Необхідно здійснити десеріалізацію з файлу попереднього проекту (Animal) та вивести на екран вміст.

package Ex_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/ex_2/textFile.txt");
        Animal a = new Animal(13, "Capibara");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(a);
            Animal animal = (Animal) ois.readObject();
            System.out.println(animal);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
