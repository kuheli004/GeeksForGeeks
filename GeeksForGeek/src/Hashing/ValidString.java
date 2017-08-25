package Hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ValidString {

    private boolean isValid(String str) {
        Map<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }

        Collection<Integer> frequencyValues = frequencies.values();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int frequency : frequencyValues) {
            if (frequency > max) {
                max = frequency;
            }
            if (frequency < min) {
                min = frequency;
            }
        }

        if (max == min) {
            return true;
        } else if (max - min > 1) {
            return false;
        }

        int max_frequency = 0;
        int min_frequency = 0;

        for (int frequency : frequencyValues) {
            if (frequency == max) {
                max_frequency++;
            }
            if (frequency == min) {
                min_frequency++;
            }
        }

        System.out.println(frequencies.keySet().size() - 1);
        System.out.println(min_frequency);
        System.out.println(max_frequency);
        if ((min==1 && min_frequency==1) || max_frequency==1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidString validString = new ValidString();
        System.out.printf("Output:%b", validString.isValid("aaabccc"));
    }
}
