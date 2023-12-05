public class Transport {
    private static Transport INSTANCE;

    private Transport() {

    }

    public static Transport getInstance() {
        if (INSTANCE == null) {
            //Zrozumieć działanie
            //synchornized z klasy Transport.class może korzystać tylko jeden wątek w danym momencie
                synchronized (Transport.class) {
                    if (INSTANCE == null) {
                        INSTANCE = new Transport();
                    }
                }


        }
        return INSTANCE;
    }
}
