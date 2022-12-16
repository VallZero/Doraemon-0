package doraemon;

public class Feature {
    public void loopFeature() {
        int op1, op2;

        do {
            Menu opening1 = new Menu();
            Menu opening2 = new Menu();
            boolean condition = true;

            opening1.loopMenu1();
            System.out.print("Input : ");
            op1 = Main.in.nextInt();
            switch (op1) {
                case 1: {
                    while (condition == true) {
                        opening2.loopMenu2();
                        System.out.print("\nInput : ");
                        op2 = Main.in.nextInt();
                        if (op2 == 1) {
                            Nobita.study();
                            Nobita.showInt();
                            continue;
                        } else if (op2 == 2) {
                            Nobita.exam();
                            Nobita.showExam();
                            continue;
                        } else if (op2 == 3) {
                            break;
                        } else if (op2 == 4) {
                            return;
                        } else {
                            System.out.println("\n" +
                                    "ERROR\n" +
                                    "Kesalahan dalam Menginput");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    while (condition == true) {
                        opening2.loopMenu2();
                        System.out.print("\nInput : ");
                        op2 = Main.in.nextInt();
                        if (op2 == 1) {
                            Suneo.study();
                            Suneo.showInt();
                            continue;
                        } else if (op2 == 2) {
                            Suneo.exam();
                            Suneo.showExam();
                            continue;
                        } else if (op2 == 3) {
                            break;
                        } else if (op2 == 4) {
                            return;
                        } else {
                            System.out.println("\n" +
                                    "ERROR\n" +
                                    "Kesalahan dalam Menginput");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    while (condition == true) {
                        opening2.loopMenu2();
                        System.out.print("\nInput : ");
                        op2 = Main.in.nextInt();
                        if (op2 == 1) {
                            Shizuka.study();
                            Shizuka.showInt();
                            continue;
                        } else if (op2 == 2) {
                            Shizuka.exam();
                            Shizuka.showExam();
                            continue;
                        } else if (op2 == 3) {
                            break;
                        } else if (op2 == 4) {
                            return;
                        } else {
                            System.out.println("\n" +
                                    "ERROR\n" +
                                    "Kesalahan dalam Menginput");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    while (condition == true) {
                        opening2.loopMenu2();
                        System.out.print("\nInput : ");
                        op2 = Main.in.nextInt();
                        if (op2 == 1) {
                            Dekisugi.study();
                            Dekisugi.showInt();
                            continue;
                        } else if (op2 == 2) {
                            Dekisugi.exam();
                            Dekisugi.showExam();
                            continue;
                        } else if (op2 == 3) {
                            break;
                        } else if (op2 == 4) {
                            return;
                        } else {
                            System.out.println("\n" +
                                    "ERROR\n" +
                                    "Kesalahan dalam Menginput");
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("\n" +
                            "ERROR\n" +
                            "Kesalahan dalam Menginput");
                    return;
                }
            }
        } while (op1 == 1 || op1 == 2 || op1 == 3 || op1 == 4);
    }
}
