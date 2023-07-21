import java.io.File;
import java.io.IOException;
public class fileoperation {
    public static void main(String[] args) {
        File n1 = new File("laxmi.txt");
        try {
            boolean create = n1.createNewFile();
            if (create) {
                System.out.println("file was craeted");
            }
            else
                {
                    System.out.println("file was not created");
                }
            }catch(IOException e)
            {
                e.printStackTrace();
            }

    }
}


