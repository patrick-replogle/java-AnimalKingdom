package animal;

import java.util.List;
import java.util.ArrayList;


public class Main
{
    private static List<Animal> filterAnimals(List<Animal> animals, CheckAnimal tester)
    {
        List<Animal> tempList = new ArrayList<>();

        for (Animal a: animals)
        {
            if (tester.test(a))
            {
                tempList.add(a);
            }
        }

        return tempList;
    }

    public static void main(String[] args)
    {
        System.out.println("It's Alive!");
        // mammals
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal racoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);
        // birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);
        // fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        // add to list
        List<Animal> animalList = new ArrayList<>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(racoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
 
        System.out.println("\n*** List all the animals in descending order by year named ***");
        animalList.sort((o1, o2) -> o2.getYear() - o1.getYear());
        animalList.forEach((a) -> System.out.println(a));

        System.out.println("\n\n*** List all the animals alphabetically ***");
        animalList.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));;
        animalList.forEach((a) -> System.out.println(a));

        System.out.println("\n\n*** List all the animals order by how they move ***");
        animalList.sort((o1, o2) -> o1.move().compareToIgnoreCase(o2.move()));
        animalList.forEach((a) -> System.out.println(a));

        System.out.println("\n\n*** List only those animals the breath with lungs ***");
        List<Animal> breathingAnimals = filterAnimals(animalList, a -> a.breath() == "Lungs");
        breathingAnimals.forEach((a -> System.out.println(a)));

        System.out.println("\n\n*** List only those animals that breath with lungs and were named in 1758 ***");
        breathingAnimals = filterAnimals(animalList, a -> (a.breath() == "Lungs") && (a.year == 1758));
        breathingAnimals.forEach((a -> System.out.println(a)));

        System.out.println("\n\n*** List only those animals that lay eggs and breath with lungs ***");
        List<Animal> eggAnimals = filterAnimals(animalList, a -> (a.reproduce() == "Eggs") && (a.breath() == "Lungs"));
        eggAnimals.forEach((a -> System.out.println(a)));

        System.out.println("\n\n*** List alphabetically only those animals that were named in 1758 ***");
        List<Animal> yearAnimals = filterAnimals(animalList, a -> a.year == 1758);
        yearAnimals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        yearAnimals.forEach((a -> System.out.println(a)));
    }
}