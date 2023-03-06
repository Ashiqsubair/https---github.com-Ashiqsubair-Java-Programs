package URL;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.*;
public class URLDownload {
    public static void main(String[] args) {try {
        URL u=new URL("https://www.africau.edu/images/default/sample.pdf");
        InputStream is=u.openStream();
        FileOutputStream os=new FileOutputStream("D:\\MCA_FILES\\Java Programs\\java lab cycle\\URL\\TestDownload.pdf");
        byte[] b=new byte[1235];
        int length;
        while((length=is.read(b))!=-1){
            os.write(b, 0, length);
        }
        is.close();
        os.close();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
        
    }
}
