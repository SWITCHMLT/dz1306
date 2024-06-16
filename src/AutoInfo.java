public class AutoInfo
{
    String marka;
    String classAuto;
    int weight;

    public AutoInfo( String marka, String classAuto, int weight) {
        this.marka = marka;
        this.classAuto = classAuto;
        this.weight = weight;
    }

    public AutoInfo() {
    }

    public String toString() {
if (marka != null && classAuto != null && weight > 0){
        return "Марка авто: " + marka + " / Клас авто: " + classAuto + " / Вага авто: " + weight;
    }
    else return "Немає данних";
    }
}
