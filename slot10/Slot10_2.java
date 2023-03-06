
import java.io.File;

public class Slot10_2
{
    
    public static void main(String[] args) 
	{
        String path = "path/to/directory";
        listDirectory(new File(path), 0);
    }
    
    public static void listDirectory(File directory, int level) 
	{
        File[] files = directory.listFiles();
        for (File file : files) {
            for (int i = 0; i < level; i++) {
                System.out.print("\t");
            }
            System.out.println(file.getName());
            if (file.isDirectory()) {
                listDirectory(file, level + 1);
            }
        }
    }
}
