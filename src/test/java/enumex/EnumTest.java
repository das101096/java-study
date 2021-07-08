package enumex;

public class EnumTest{
    enum Number {
        one(1){
            @Override
            public void getI() {
                System.out.println("one : "+ Number.one.i);
            }
        },
        two(1){
            @Override
            public void getI() {
                System.out.println("two : "+ Number.two.i);
            }
        },
        three(3){
            @Override
            public void getI() {
                System.out.println("three : "+ Number.three.i);
            }
        },
        four(4){
            @Override
            public void getI() {
                System.out.println("four : "+ Number.four.i);
            }
        };

        private int i;

        Number(int i) {
            this.i = i;
        }

        public void getI() {
        }

    }

    public static void main(String[] args) {
        Number[] values = Number.values();
        for (Number value : values) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println(Number.valueOf(Number.class, "one"));
    }
}
