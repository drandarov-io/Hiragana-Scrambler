package com.drandarov.hiragana;

/**
 * Comment out the syllables you don't want included!
 *
 * @author dmitrij-drandarov
 * @since 08 May 17
 */
class HiraganaDataSet {

     /////////////////
    //    Romaji    //
    /////////////////

    static final String[][] romajiData = new String[][] {
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

    static final String[][] romajiExtraData = new String[][] {
            {"kya", "kyu",        "kyo"},
            {"gya", "gyu",        "gyo"},

            {"nya", "nyu",        "nyo"},

            {"hya", "hyu",        "hyo"},

            {"bya", "byu",        "byo"},
            {"pya", "pyu",        "pyo"},

            {"mya", "myu",        "myo"},

            {"rya", "ryu",        "ryo"},

            {"ja",  "ju",  "je",  "jo" },

            {"cha", "chu", "che", "cho"},

            {"sha", "shu", "she", "sho"},
    };


    //////////////
    // Hiragana //
    //////////////

    static final String[][] hiraganaData = new String[][] {
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

    static final String[][] hiraganaExtraData = new String[][] {
            {"きや", "きゆ",        "きよ"},
            {"ぎや", "ぎゆ",        "ぎよ"},

            {"にや", "にゆ",        "によ"},

            {"ひや", "ひゆ",        "ひよ"},

            {"びや", "びゆ",        "びよ"},
            {"ぴや", "ぴゆ",        "ぴよ"},

            {"みや", "みゆ",        "みよ"},

            {"りや", "りゆ",        "りよ"},

            {"じや", "じゆ", "じえ", "じよ" },

            {"ちや", "ちゆ", "ちえ", "ちよ"},

            {"しや", "しゆ", "しえ", "しよ"},
    };

}
