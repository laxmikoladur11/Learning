import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        try
        {
                FileWriter file = new FileWriter("ij21.txt");
                file.write("hdjdhf");
                file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

