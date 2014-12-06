package fr.mmarie.cucumber;

import lombok.Getter;

/**
 * Created by Maximilien on 05/12/2014.
 */
public class BowlingGame {
    @Getter
    private int skittles = 10;

    public void skittlesFall(int number) {
        if(number > skittles) {
            throw new IllegalArgumentException("Number of fallen skittles can not be superior of the number of remaining skittles");
        }
        skittles = skittles-number;
    }


}
