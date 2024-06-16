public class MainMy {
    public void main( String[] args ) {
        int [] array = new int[]{122, 3, 344, 466, 521, 666, 73, 867, 56, 120, 151, 12, 153, 141, 215, 316};
        ArrayMy arrayMy = new ArrayMy(array);



        AutoInfo autoinfo = new AutoInfo("Mers", "Легковой", 1560);
        SportCar sportCar = new SportCar (100);
        Lorry gruzPod = new Lorry(200);
        Engine engine = new Engine(400, "Volkswagen");
        Person person = new Person ("Ваня",25);
        Driver driver = new Driver (6);
        Car car = new Car (autoinfo,sportCar,gruzPod,engine,person,driver);

        car.toStringTest();
    }
}