package doraemon;

public class Dekisugi {
    static int intelligence = 75;

    static private int result;
    static private int chance;

    public static int study() {
        if (intelligence < 100) {
            intelligence += 5;
        } else {
            intelligence = 100;
        }

        return intelligence;
    }

    public static int exam() {
        chance = (int) (Math.random() * 101);

        if (chance <= 70) {
            result = 100;
        } else {
            result = (int) (Math.random() * ((99 - intelligence) + 1) + intelligence);
        }

        return result;
    }

    static void showInt() {
        System.out.printf("\nKecerdasan Dekisugi saat ini = %d", intelligence);
    }

    static void showExam() {
        System.out.printf("\nHasil ujian Dekisugi = %d", result);
    }
}
