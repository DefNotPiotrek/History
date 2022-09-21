package pl.chwilaprogramowaniadladebila;

import java.io.IOException;
import java.util.Scanner;

public class Interface {
    Scanner scanner = new Scanner(System.in);

    DrawQuestions draw = new DrawQuestions();

    public void menu() throws IOException {
        System.out.println("Witaj! Zaczynajmy zabawę!\n*Kliknij Enter*");
        scanner.nextLine();
            draw.draw();
    }
}
