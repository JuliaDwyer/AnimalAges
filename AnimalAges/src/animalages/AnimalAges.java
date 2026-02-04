package animalages;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalAges
	{

		static ArrayList<String> animals = new ArrayList<String>();
		
		public static void main() throws IOException{
			Scanner myFile = new Scanner(new File("animal.txt"));
			
			while(myFile.hasNextLine()) {
				
				String word = myFile.nextLine();
				
				animals.add(word.split(","));
				
				String species = animals[0];
				
				Collections.sort( );
				
			}
			
		}
		
		
		
	}
