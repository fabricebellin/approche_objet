package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path pathFile = Paths.get("/Users/pamela/Documents/recensement.csv");
		boolean test = Files.isReadable(pathFile);
		System.out.println(test);
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		System.out.println(lines);
		
		

		
		Path pathDestination = Paths.get("/Users/pamela/Documents/recensement2.csv");
		Files.copy(pathFile, pathDestination);
	
		List<String> lines2 = new ArrayList<>();
		

		
		for(int i=0; i<100 ; i++) {
			lines2.add(lines.get(i));

		}
		Files.write(pathDestination,  lines2);
		
		List<String> readLines = Files.readAllLines(pathDestination, StandardCharsets.UTF_8);
		System.out.println(readLines);
		
	}

}
