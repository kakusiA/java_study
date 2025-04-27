package desgin.Adapter;

import java.io.IOException;
import java.util.Properties;

public class Adapter02 {
    public static void main(String[] args) {
        FilelO f = new FileProperties();
        try {
            f.readFromFile('');
            f.setValue();
            f.setValue();
            f.setValue();
            f.writeToFile('newfile.txt');
            System.out.println("create");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
interface FilelO {
    public void readFromFile(String filename) throws IOException;

    public void writeToFile(String filename) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
class FileProperties extends Properties implements FilelO{
    public void readFromFile(String filename) throws IOException {
        load(getClass().getResourceAsStream(filename));
    }
    public void writeToFile(String filename) throws IOException {
        writeToFile(filename);
    }
    public void setValue(String key, String value){
        store(key,value);
    }
    public String getValue(String key){
        return "";
    }
}