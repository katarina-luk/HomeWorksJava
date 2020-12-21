package C3;

import java.io.*;

public class Mail {
    public static void main(String[] args) throws IOException, ClassNotFoundException {//, ClassNotFoundException {

        TerritoriesInfo territoriesInfo = new TerritoriesInfo("У Испании 6 провинций, у России 10 провинций, у Франции 8 провинций");
        ResourcesInfo resourcesInfo = new ResourcesInfo("У Испании 100 золота, у России 80 золота, у Франции 90 золота");
        DiplomacyInfo diplomacyInfo =  new DiplomacyInfo("Франция воюет с Россией, Испания заняла позицию нейтралитета");

        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);
        FileOutputStream outputStream = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(savedGame);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        savedGame = (SavedGame) objectInputStream.readObject();
        System.out.print(savedGame);

    }
}
