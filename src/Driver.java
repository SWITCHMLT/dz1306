public class Driver {
    private int prof;
    private int age;
    private String name;
    public Driver(int prof ) {
       this.prof = prof;
    }
    public String toString() {
        if (prof > 0) {
             return " / Стаж роботи "+prof + " років";
         }
        else return " / Стаж роботи "+"Немає данних";
    }}
