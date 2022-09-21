package pl.chwilaprogramowaniadladebila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class DrawQuestions {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    Dates dates = new Dates();

    int dateSize = dates.date.size();

    public void draw() throws IOException {
        ArrayList<String> dateName = dates.dateName;

        for (int i = 0; i < dateSize;){
            int date = random.nextInt(dateName.size());
            System.out.println(dates.dateName.get(date));
            String answer = reader.readLine();
            if (answer.equals(dates.date.get(date))){
                System.out.println("Dobrze!");
                System.out.println();
                dates.date.remove(date);
                dates.dateName.remove(date);
                i++;
            }
            else {
                System.out.println("Błędna odpowiedź, poprawna odpowiedź to: " + dates.date.get(date));
                System.out.println();
            }
        }
    }

}
