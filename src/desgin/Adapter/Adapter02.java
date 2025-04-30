package desgin.Adapter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Adapter02 {
    public static void main(String[] args) {
        FilelO f = new FileProperties();
        try {
            f.readFromFile("/Users/macbookpro/java_study/src/desgin/Adapter/test.txt");
            f.setValue("width","1024");
            f.setValue("height","512");
            f.setValue("depth","32");
            f.getValue("depth");
            f.writeToFile("newfile.txt");
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
class FileProperties  implements FilelO{
    Properties props = new Properties();
    @Override
    public void readFromFile(String filename) throws IOException {
        props.load(new FileReader(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        props.store(new FileWriter(filename), "Hello World");
    }

    @Override
    public void setValue(String key, String value){
        props.setProperty(key,value);
    }

    @Override
    public String getValue(String key){
        return props.getProperty(key,"");
    }
}