package ClassIn04032023;

import java.util.ArrayList;

public class SummerOlympicGames2 {
    public static void main(String[] args) {
        ArrayList<Integer> olympicYears = new ArrayList<>();
        for (int i = 1893; i <= 2023; i++) {
            i = i + 3;
            olympicYears.add(i);
        }
        System.out.println(olympicYears);

    }
}
