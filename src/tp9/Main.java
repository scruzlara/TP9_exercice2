package tp9;

import java.io.*;
  
public class Main 
{ 
    public static void main(String[] args) throws IOException 
    { 
      File dir  = new File(args[0]);
      File[] liste = dir.listFiles();
      for(File item : liste){
        if(item.isFile())
        { 
          System.out.format("Nom du fichier : %s%n", item.getName());
        } 
        else if(item.isDirectory())
        {
          System.out.format("Nom du répertoire : %s%n", item.getName());
        } 
      }
    } 
}
