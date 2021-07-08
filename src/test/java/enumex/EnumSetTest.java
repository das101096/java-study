package enumex;

import java.util.EnumSet;

enum Alphabet {A, B, C, D, E}
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet<Alphabet> set1, set2, set3, set4;

        set1 = EnumSet.allOf(Alphabet.class);
        set2 = EnumSet.of(Alphabet.A, Alphabet.B, Alphabet.C, Alphabet.D, Alphabet.E);
        set3 = EnumSet.complementOf(set1);
        set4 = EnumSet.range(Alphabet.B,Alphabet.D);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(set4);
    }
}
