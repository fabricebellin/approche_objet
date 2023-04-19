package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		//Lire fichier avec instanciation
	    List<Ville> listVille= new ArrayList<>();
	    Path pathFile = Paths.get("/Users/pamela/Documents/recensement.csv");

	    List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
	    
	    lines.remove(0);
	    for(String ligne : lines) {
	        String[] tokens = ligne.split(";");
		    String espace = tokens[9].replaceAll(" ","");
	        Ville ville= new Ville(tokens[6], tokens[2], tokens[1], Integer.parseInt(espace));
	        listVille.add(ville);
	    }

	    System.out.println(listVille);
	    
	    //Generer fichier
	    
	    
	}


}
