package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var sortingByBreedCats = Cat.makeCats(10);
        var sortingByNameAgeCats = Cat.makeCats(10);
        var sortingByColorCats = Cat.makeCats(10);
        var SortingByNameCats = Cat.makeCats(10);
        sortingByBreedCats.sort((cat1,cat2) -> cat1.getBreed().compareTo(cat2.getBreed()));
        Collections.sort(sortingByNameAgeCats, Comparator
                .comparing(Cat::getName)
                .thenComparing(Cat::getAge));
        sortingByColorCats.removeIf((cat) -> cat.getColor() == Cat.Color.GINGER);
        SortingByNameCats.removeIf((cat -> cat.getName().length() == 5));
        System.out.println("sorting By Breed Cats:");
        Printer.print(sortingByBreedCats);
        System.out.println("sorting By Name and Age Cats:");
        Printer.print(sortingByNameAgeCats);
        System.out.println("sorting By Color Cats:");
        Printer.print(sortingByColorCats);
        System.out.println("sorting By Name Cats:");
        Printer.print(SortingByNameCats);
    }

}
