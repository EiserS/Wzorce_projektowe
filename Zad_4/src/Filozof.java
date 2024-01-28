//Damian Pawlik 1094984
//Do zapamiętania, Możemy oznaczyć blok kodu, aby uniknąć jednoczesnego dostępu do niego przez wiele wątków. Składnia wygląda tak:
/*
synchronized (rzecz do zsynchronizowania) {
                Kod do zabezpieczenia
        }
*/
//Możemy także oznaczyć całą metodę jako synchronized, co oznacza, że tylko jeden wątek może jednocześnie wykonywać tę metodę na danym obiekcie.
/*
public synchronized void metodaSynchronizowana() {
        // Kod do zabezpieczenia
        }
*/
// nie pozwoli wykonać kodu dopóki nie uzyska dostępu
public class Filozof extends Thread{
    private final Object lewy;
    private final Object prawy;

    @Override
    public void run() {
        try {
            for(;;){
                akcja(" mysle wiec jestem");
                synchronized (lewy){
                    akcja(" podnosze lewy widelec");{}
                    synchronized (prawy){
                        akcja(" podnosze prawy widelec i jem");
                    }
                    akcja(" odladam widelce i zaczynam myslec");
                }
            }
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public Filozof(Object lewy, Object prawy, int numer) {
        this.lewy = lewy;
        this.prawy = prawy;
        this.setName("Filozof numer " + numer);
    }

    private void akcja(String info) throws InterruptedException{
        System.out.println((Thread.currentThread().getName() + info));
        Thread.sleep((int) (Math.random() * 1000));
    }
}

//TODO problem zakleszczenia, można rozwiązać poprzez wzięcie jednego widelca przez innego filozofa, do sprawdzenia.
