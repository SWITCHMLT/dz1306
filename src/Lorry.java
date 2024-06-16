public class Lorry {
    private int gruzPod;
    public Lorry(int gruzPod) {
        this.gruzPod=gruzPod;
    }
    public String toString() {
        if (gruzPod > 0) {
            return "Грузопод'ємність: " + gruzPod;
        }
        else return " ";
    }

}
