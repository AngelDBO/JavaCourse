package clase_system;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> envs = System.getenv();
        System.out.println("envs = " + envs);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String parth = System.getenv("PATH");
        System.out.println("parth = " + parth);

        String OS = System.getenv("OS");
        System.out.println("OS = " + OS);
    }
}
