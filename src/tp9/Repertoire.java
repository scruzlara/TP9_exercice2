package tp9;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Repertoire extends FileComposite {
    protected List<FileComposite> fcomps = new ArrayList<FileComposite>();


    public Repertoire(File dir){
        this.f =dir;

        File[] liste = dir.listFiles();
        for(File item : liste){
            if(item.isFile()) {
                fcomps.add(new Fichier(item) );
            }
            else if(item.isDirectory()) {
                fcomps.add(new Repertoire(item) );

            }
        }

    }

    @Override
    public void afficher( String s) {
        System.out.println(s+"|-"+f.getName());
        File[] liste = f.listFiles();
        for(FileComposite fic : fcomps){
            fic.afficher(s+"|  ");
        }
    }
}
