package tp9;

import java.io.File;

public class Fichier extends FileComposite{
    public Fichier(File fic) {
        this.f = fic;
    }
    @Override
    public void afficher(String s) {
        System.out.println(s+"|> "+f.getName() +" ("+f.length()+" bytes )");
    }
}
