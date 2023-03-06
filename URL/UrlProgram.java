package URL;
import java.net.*;
public class UrlProgram {
    public static void main(String[] args) {
        try {
            URL u=new URL("https://www.amazon.in/Vivo-Pacific-Storage-Additional-Exchange/dp/B07WHRLCZ8?ref_=Oct_DLandingS_D_86781f18_62");
            System.out.println("Url is "+u.toString());
            System.out.println(u.getProtocol());
            System.out.println(u.getHost());
            System.out.println(u.getDefaultPort());
            System.out.println(u.getQuery());
            System.out.println(u.getPath());
            System.out.println(u.getFile());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
