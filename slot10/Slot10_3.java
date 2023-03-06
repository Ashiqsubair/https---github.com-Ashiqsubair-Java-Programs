import java.io.File;

public class Slot10_3 {
    
    public static void main(String[] args) {
        String path = "path/to/directory";
        String fileName = "file-name-to-search-for";
        searchFile(new File(path), fileName);
    }
    
    public static void searchFile(File directory, String fileName) {
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                searchFile(file, fileName);
            } else {
                if (fileName.equals(file.getName())) {
                    System.out.println("Found file: " + file.getAbsolutePath());
                }
            }
        }
    }
}
