
import java.io.*;

public class CopyAndWriteFile {
    public void copyFileAndWrite(String path, String newFile) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("File does not exist!");
            }
            File newFile1 = new File(newFile);
            if (newFile1.exists()) {
                System.out.println("File already exists!");
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            FileWriter writer = new FileWriter(newFile1, false);
            BufferedWriter bfwriter = new BufferedWriter(writer);

            while ((line = reader.readLine()) != null) {
                bfwriter.write(line + "\n");
            }
            bfwriter.flush();
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

