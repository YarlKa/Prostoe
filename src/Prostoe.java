public class Prostoe {
    public static void main(String[] args) {
        int a, b;
        boolean x;

        for (a = 2; a < 100; a++) {
            x = true;
            for (b = 2; b <= a / b; b++) // проверка деления необходима для экономии ресурсов, меньше вычислений.
                 // делится ли число без остатка, если да, то оно не простое
                if ((a / b) != 1 && (a % b) == 0) x = false;

             if (x) System.out.println(a);

        }
    }
}
