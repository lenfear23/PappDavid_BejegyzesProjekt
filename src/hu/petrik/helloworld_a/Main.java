package hu.petrik.helloworld_a;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        var sorok = Files.readAllLines(Paths.get("bejegyzesek.csv"));
        var bejegyzesek = new LinkedList<Bejegyzes>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérek egy darab számot:");
        int darabSzam = sc.nextInt();

        for (var line: sorok){
            var bejegyzes = new Bejegyzes(line);
            bejegyzesek.add(bejegyzes);
        }


        int likeBejegyz = bejegyzesek.size()*20;

        for (int i =0; i<bejegyzesek.size();i++){
            Random rnd = new Random(likeBejegyz);

        }

        System.out.println("Kérek egy szöveget:");
        String szoveg = sc.nextLine();


        System.out.println(bejegyzesek);

    }
}
