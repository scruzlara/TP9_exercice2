package tp9;

import java.io.File;
import java.io.IOException;

public class MainComposite {

    public static void main(String[] args) throws IOException {
        File dir = new File(args[0]);
        FileComposite fc = new Repertoire(dir);
        fc.afficher(" ");
    }

}
