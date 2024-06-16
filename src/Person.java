public class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        if (name != null && age > 0) {
            return "Водій : "+" Ім'я " + name +" / "+ age +" років ";
        }
        else  return "Водій : "+"Немає данних";
    }}
