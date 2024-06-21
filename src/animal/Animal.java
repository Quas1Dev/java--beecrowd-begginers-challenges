package animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        // Data strucure
        Collection <AnimalPerCategory> animals = new ArrayList<>();
        
        AnimalPerCategory aguia;
        aguia = new AnimalPerCategory("aguia", "vertebrado","ave", "carnivoro");
        animals.add(aguia);
        
        AnimalPerCategory pomba;
        pomba = new AnimalPerCategory("pomba", "vertebrado","ave", "onivoro");
        animals.add(pomba);
        
        AnimalPerCategory homem;
        homem = new AnimalPerCategory("homem", "vertebrado","mamifero", "onivoro");
        animals.add(homem);
        
        AnimalPerCategory vaca;
        vaca = new AnimalPerCategory("vaca", "vertebrado","mamifero", "herbivoro");
        animals.add(vaca);
        
        AnimalPerCategory pulga;
        pulga = new AnimalPerCategory("pulga", "invertebrado","inseto", "hematofago");
        animals.add(pulga);
        
        AnimalPerCategory lagarta ;
        lagarta = new AnimalPerCategory("lagarta", "invertebrado","inseto", "herbivoro");
        animals.add(lagarta);
        
        AnimalPerCategory sanguessuga;
        sanguessuga = new AnimalPerCategory("sanguessuga", "invertebrado","anelideo", "hematofago");
        animals.add(sanguessuga);
        
        AnimalPerCategory minhoca;
        minhoca = new AnimalPerCategory("minhoca", "invertebrado","anelideo", "onivoro");
        animals.add(minhoca);
        
        // User selection.
        Scanner k = new Scanner(System.in);
        String g1 = k.nextLine();
        String g2 = k.nextLine();
        String g3 = k.nextLine();
        
        
        // Navigating data structure
        String chosenAnimal = "";
        
        for (AnimalPerCategory animal : animals){
            if (animal.find(g1,g2,g3)) {
                chosenAnimal = animal.animalName;
            }
        }
        
        System.out.println(chosenAnimal);
    }
}

class AnimalPerCategory {

    Collection<String> parentCategories = new ArrayList();
    String animalName;

    public AnimalPerCategory(String animalName, String... categories) {
        this.animalName = animalName;
        for (String category : categories) {
            this.parentCategories.add(category);
        }

    }
    public boolean find(String ...categories){
        if (parentCategories.contains(categories[0])&&
            parentCategories.contains(categories[1])&& 
            parentCategories.contains(categories[2])) {
            return true;
        }
        return false;
    }
}
