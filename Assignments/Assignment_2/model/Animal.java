package Assignment_2.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String species;
    private int age;
    private static int animalCount;
    private static List<Animal> animalList = new ArrayList<>();

    public static void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String continueFlag = "yes";

        try {
            do {
                Animal animal = new Animal();
                System.out.print("\nEnter the animal's name : ");
                animal.name = br.readLine();
                System.out.print("Enter the animal's age : ");
                animal.age = Integer.parseInt(br.readLine());
                System.out.print("Enter the animal's species : ");
                animal.species = br.readLine();

                animalList.add(animal);
                animalCount++;

                System.out.print("Do you want to enter another animal? (yes/no) : ");
                continueFlag = br.readLine();
            } while (continueFlag.equals("yes"));
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("Please add the correct age! Please try again.");
            inputData();
        }
    }

    public static void displayAnimals() {

        System.out.println("Total number of animals : " + animalCount);
        int i = 1;
        for (Animal animal : animalList) {
            System.out.println("Animal  : " + i);
            System.out.println("Name    : " + animal.name);
            System.out.println("Age     : " + animal.age);
            System.out.println("Species : " + animal.species + "\n");
            i++;
        }
    }
}
