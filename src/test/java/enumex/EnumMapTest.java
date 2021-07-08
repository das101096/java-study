package enumex;

import java.lang.annotation.Retention;
import java.util.EnumMap;

enum Alphabet2 {A, B, C, D, E}
public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap<Alphabet2,String> enumMap = new EnumMap<Alphabet2, String>(Alphabet2.class);

        enumMap.put(Alphabet2.A,"AAA");
        enumMap.put(Alphabet2.A,"AAA1");
        enumMap.put(Alphabet2.B,"BBB");
        enumMap.put(Alphabet2.C,"CCC");
        enumMap.put(Alphabet2.D,"DDD");

        System.out.println(enumMap.size()); // 사이즈 출력
        System.out.println();

        System.out.println(enumMap); // enumMap 출력
        System.out.println();

        System.out.println(enumMap.get(Alphabet2.C)); // 키값으로 값 출력
        System.out.println();

        System.out.println(enumMap.containsKey(Alphabet2.A)); // 키값을 포함하는지 확인
        System.out.println();

        System.out.println(enumMap.containsValue("AAA1")); // 값을 포함하는지 확인
        System.out.println();

        EnumMap<Alphabet2,String> enumMapTest = new EnumMap<Alphabet2, String>(Alphabet2.class);
        enumMapTest.putAll(enumMap); // 정의된 enummap을 받음
        System.out.println(enumMapTest);
        System.out.println();

        enumMapTest.replace(Alphabet2.A,"AAA1","AAA2"); // 특정 키 값이 주어진 값과 같으면 다른값으로 변경
        System.out.println(enumMapTest.get(Alphabet2.A));

    }

}
