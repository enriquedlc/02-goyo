import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

            ProcessBuilder pb = new ProcessBuilder();
            pb.command("cmd.exe", "/c"); //, "code", ".");

            pb.directory(new File("C:\\Users\\Enrique\\Documents")); // el comando ejecutado pb.command, se ejecuta en la ruta especificada

        System.out.println(pb.environment());

        Map<String, String> env = pb.environment();
        env.put("DELEGADO", "ENRIQUE");

        System.out.println(env);

            Process process = null;

            try {
                process = pb.start();

                int exitCode = process.waitFor(); // devuelve si la solicitud de ejecucion ha tenido exito o no = 0 => bien != 0 => mano
                System.out.println("Esto hizo kbum con codigo " + exitCode);
            } catch (IOException | InterruptedException e) {
                System.out.println("Mal");
                e.printStackTrace();
        }

    }
}
