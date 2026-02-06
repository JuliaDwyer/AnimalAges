package animalages;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class AnimalAges
	{
		//master branch
		static ArrayList<String> animals = new ArrayList<String>();
		
		public static void main(String[] args) throws Exception {
			Scanner myFile = new Scanner(new File("animal.txt"));
			
			while(myFile.hasNextLine()) {
				
				String word = myFile.nextLine();
				
				animals.add(word);
				
				//String species = animals[0];
				
				Collections.sort(animals);
				
				
			}
			
			
			//print list
			int sumAges = 0;
			for(int i = 0; i < animals.size();  i++) {
				String animal = animals.get(i);
				int age = Integer.parseInt(animal.split(",")[1]);
				sumAges = sumAges+age;
				
				System.out.println(animals.get(i));
			}
			double averageAge = (double)sumAges/animals.size();
			System.out.println("Average Age: " + averageAge);
		}
		
		
		
	}
