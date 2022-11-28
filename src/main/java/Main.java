import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String stringAborigens = "sdfaljhds ksjdfhlksjd jsdhflasdj sdvjbalsc vb,nxzcmvb sdjfuw saytqwi uqwrywieu zxnbv, vajscb vbz,n nbxv ,z asbva, uiwerteuwfg avlsv aljgl VBXZL bv,ZD JDSGlw";

        // детерминированность
        Function<String, String[]> splitWords = string -> string.split("\\s");

        System.out.println("\nВаш новый словарь для общения с аборигенами:");

        // Монада
        Arrays.stream((splitWords.apply(stringAborigens)))
                .sorted()
                .map(w -> w + " - значение этого слова пока неизвестно!")
                .forEach(System.out::println);

    }

}
