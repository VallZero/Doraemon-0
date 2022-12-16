package doraemon;

public class Shizuka {
    static int intelligence = 70;

    static int min = intelligence - intelligence * (5 / 100);
    static int max = 100;
    static int range = (max - min) + 1;
    static private int result;

    public static int study() {
        if (intelligence < 100) {
            intelligence += 5;
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
        System.out.printf("\nKecerdasan Shizuka saat ini = %d", intelligence);
    }

    static void showExam() {
        System.out.printf("\nHasil ujian Shizuka = %d", result);
    }
}
