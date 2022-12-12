package HomeWork_1;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbersArray {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        List<Integer> randomNums = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNums.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }

        for (int i = randomNums.size() - 1; i > 0; i--) {
            if (randomNums.get(i) % 2 == 1) randomNums.remove(i);
        }

        for (int i = randomNums.size() - 1; i > 0; i--) {
            System.out.println(randomNums.get(i));
        }

        System.out.println(randomNums);
    }
}
