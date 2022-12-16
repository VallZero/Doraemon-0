package doraemon;

public class Nobita {
    static int intelligence = 10;
    static private int result;

    public static int study() {
        if (intelligence < 100) {
            intelligence += 1;
        } else {
            intelligence = 100;
        }

        return intelligence;
    }

    public static int exam() {
        result = (int) (Math.random() * intelligence) + 1;
        return result;
    }

    static void showInt() {
        System.out.printf("\nKecerdasan Nobita saat ini = %d", intelligence);
    }

    static void showExam() {
        System.out.printf("\nHasil ujian Nobita = %d", result);
    }
}
