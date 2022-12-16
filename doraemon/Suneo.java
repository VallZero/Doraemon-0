package doraemon;

public class Suneo {
    static int intelligence = 40;
    static int max = intelligence + 10;
    static int min = 5;
    static int range = (max - min) + 1;
    static private int result;

    public static int study() {
        if (intelligence < 100) {
            intelligence += 3;
        } else {
            intelligence = 100;
        }

        return intelligence;
    }

    public static int exam() {
        result = (int) (Math.random() * range + min);
        return result;
    }

    static void showInt() {
        System.out.printf("\nKecerdasan Suneo saat ini = %d", intelligence);
    }

    static void showExam() {
        System.out.printf("\nHasil ujian Suneo = %d", result);
    }
}
