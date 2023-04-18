package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GenererFichier {

	public static void main(String[] args) throws IOException {
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

		    Path out = Paths.get("/Users/pamela/Documents/villes25000.csv");
		    List<String> linesOut = new ArrayList<String>();
		    

		    String entete = "Nom;Code département;Nom de la région;Population totale";
		    linesOut.add(entete);
		    
		    for(Ville ville : listVille) {
		    	if(ville.getPopulation() > 25000) {
		    		String ligne = ville.getNom() + ";" + ville.getCode() + ";" + ville.getNomRegion() + ";" + ville.getPopulation() + "\n";
		    		linesOut.add(ligne);
		    	}
		    }
		    
		    Files.write(out, linesOut, StandardCharsets.UTF_8);		    
		}
	}


