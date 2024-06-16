public class Car{
    private Driver driver;
    private Engine engine;
    private AutoInfo autoInfo;
    private SportCar sportCar;
    private Lorry gruzPod;
    private Person person;
    public Car ( AutoInfo autoInfo,SportCar sportCar,Lorry gruzPod,Engine engine,Person person,Driver driver ){
        this.autoInfo = autoInfo;
        this.person = person;
        this.sportCar = sportCar;
        this.gruzPod = gruzPod;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поїхали");
    }
    public void stop() {
        System.out.println("Зупиняємось");
    }
    public void toStringTest() {
        String vant = "Не вантажівка";
        if(sportCar!=null){vant = gruzPod.toString();}
        System.out.println(autoInfo +"\n"+ sportCar +"\n" + vant +"\n" + engine+"\n"+person+ driver);
    }

}
