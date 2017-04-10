package com.drandarov.hiragana;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dmitrij-drandarov
 * @since 10 Apr 17
 */
public class HiraganaScrambler {

    /**
     * Comment the syllables you don't want included.
     */
    private static final String[][] hiraData = new String[][]{
            {"a", "i", "u", "e", "o"},

            {"ka", "ki", "ku", "ke", "ko"},
            {"ga", "gi", "gu", "ge", "go"},

            {"sa", "shi", "su", "se", "so"},
            {"za", "ji", "zu", "ze", "zo"},

            {"ta", "chi", "tsu", "te", "to"},
            {"da", "ji", "zu", "de", "do"},

            {"na", "ni", "nu", "ne", "no"},

            {"ha", "hi", "fu", "he", "ho"},
            {"ba", "bi", "bu", "be", "bo"},
            {"pa", "pi", "pu", "pe", "po"},

            {"ma", "mi", "mu", "me", "mo"},

            {"ya",       "yu",       "yo"},

            {"ra", "ri", "ru", "re", "ro"},

            {"wa",                   "wo"},
    };

    public static void main(String[] args) {
        int minSyllables = 2;
        int maxSyllables = 5;

        int wordCount = 25;

        ThreadLocalRandom current = ThreadLocalRandom.current();
        int set;

        for (int i = 0; i < wordCount; i++) {
            for (int j = 0; j < current.nextInt(minSyllables, maxSyllables + 1); j++) {
                System.out.print(hiraData
                        [set = current.nextInt(0, hiraData.length)]
                        [current.nextInt(0, hiraData[set].length)]);
            }
            System.out.println();
            //System.out.println(); //Uncomment if you want empty lines between words
        }
    }

}
