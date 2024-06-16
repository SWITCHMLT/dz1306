public class Engine {
    private int power;
    private String author;
    public Engine(int power, String author) {
        this.power = power;
        this.author = author;
    }
    public String toString()  {
        if (power > 0 && author != null) {
            return "Двигун : "+"Потужність " + power + " / Виробник "+ author;
        }
        return "Двигун : "+"Немає данних";
    }
}
