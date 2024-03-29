package clase_system;

import java.util.Properties;

public class ObtenerPropiedad {
    public static void main(String[] args) {
        String user = System.getProperty("user.name");
        String home = System.getProperty("user.home");
        String dir = System.getProperty("user.dir");
        String java = System.getProperty("java.version");

        Properties p = System.getProperties();

        System.out.println("user = " + user);
        System.out.println("home = " + home);
        System.out.println("dir = " + dir);
        System.out.println("java = " + java);
        System.out.println("\"-------------------\" = " + "-------------------");
        p.list(System.out);
    }
}
