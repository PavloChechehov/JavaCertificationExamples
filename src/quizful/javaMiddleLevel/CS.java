package quizful.javaMiddleLevel;

public enum CS {
    BIG, SMALL, HUGE {
        public String getCode() {
            return "b";
        }

        public int getSize() {
            return 100;
        }
    };

    public String getCode() {
        return "a";
    }

    public static void main(String[] args) {
        System.out.println(BIG);
        System.out.println(HUGE.getCode());
//        System.out.println(HUGE.getSize());
    }
}
