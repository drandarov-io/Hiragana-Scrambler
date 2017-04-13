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
    private static final String[][] romajiData = new String[][] {
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

            {"n"},
    };

    private static final String[][] hiraganaData = new String[][] {
            {"あ", "い", "う", "え", "お"},

            {"か", "き", "く", "け", "こ"},
            {"が", "ぎ", "ぐ", "げ", "ご"},

            {"さ", "し", "す", "せ", "そ"},
            {"ざ", "じ", "ず", "ぜ", "ぞ"},

            {"た", "ち", "つ", "て", "と"},
            {"だ", "ぢ", "づ", "で", "ど"},

            {"な", "に", "ぬ", "ね", "の"},

            {"は", "ひ", "ふ", "へ", "ほ"},
            {"ば", "び", "ぶ", "べ", "ぼ"},
            {"ぱ", "ぴ", "ぷ", "ぺ", "ぽ"},

            {"ま", "み", "む", "め", "も"},

            {"や",       "ゆ",       "よ"},

            {"ら", "り", "る", "れ", "ろ"},

            {"わ",                   "を"},

            {"ん"},
    };

    public static void main(String[] args) {
        String[][] dataSet = hiraganaData;

        int minSyllables = 2;
        int maxSyllables = 5;

        int wordCount = 25;


        ThreadLocalRandom random = ThreadLocalRandom.current();
        int set;

        int syllables = random.nextInt(minSyllables, maxSyllables + 1);

        for (int i = 0; i < wordCount; i++) {
            for (int j = 0; j < syllables; j++) {
                System.out.print(dataSet
                        [set = random.nextInt(0, dataSet.length)]
                        [random.nextInt(0, dataSet[set].length)]);
            }
            System.out.println();
            //System.out.println(); //Uncomment if you want empty lines between words
        }
    }

}
