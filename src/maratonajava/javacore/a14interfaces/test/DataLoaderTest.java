package maratonajava.javacore.a14interfaces.test;

import maratonajava.javacore.a14interfaces.dominio.DataLoader;
import maratonajava.javacore.a14interfaces.dominio.DatabaseLoader;
import maratonajava.javacore.a14interfaces.dominio.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
