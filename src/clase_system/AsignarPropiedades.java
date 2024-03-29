package clase_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedades {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/clase_system/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.nombr3e", "Angel");
            System.setProperties(p);

            System.getProperties().list(System.out);
        } catch (Exception f) {
            System.out.println("f = " + f);
        }
    }
}
