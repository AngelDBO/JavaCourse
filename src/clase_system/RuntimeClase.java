package clase_system;

import java.io.IOException;

public class RuntimeClase {
    public static void main(String[] args) {
        Runtime t = Runtime.getRuntime();
        Process process;
        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = t.exec("notepad");
            } else {
                process = t.exec("gedit");
            }
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
    }
}
