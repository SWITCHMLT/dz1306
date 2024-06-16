public class SportCar{
    private int sportCar;
    public SportCar(int maxspeed) {
        this.sportCar=maxspeed;
    }
    public String toString() {
        if (sportCar > 0) {
            return "Максимальна швидкість: " + sportCar;
        }
       else return " ";
    }
}
