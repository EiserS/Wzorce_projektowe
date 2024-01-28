public class Main {
    private static final int FILOZOFOWIE = 5;

    public static void main(String[] args) {
        Filozof[] filozofowie = new Filozof[FILOZOFOWIE];


        Object[] widelec = new Object[FILOZOFOWIE];
        for (int i = 0; i < FILOZOFOWIE; i++) {
            widelec[i] = new Object();
        }

        for (int i = 0; i < FILOZOFOWIE; i++) {
            final int index = i;
            Object lewyWidelec = widelec[index];
            Object prawyWidelec = widelec[(index + 1) % FILOZOFOWIE];

            if (i == FILOZOFOWIE - 1) {
                filozofowie[i] = new Filozof(prawyWidelec, lewyWidelec, (i + 1));
            } else {
                filozofowie[i] = new Filozof(lewyWidelec, prawyWidelec, (i + 1));
            }

            filozofowie[index].start();
        }

    }
}
