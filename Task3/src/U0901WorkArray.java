public class U0901WorkArray <T extends Number>{
    T[] arrNums;
    public U0901WorkArray(T[] numP){
        arrNums=numP;
    }
    public double Sum(){
        double doubleWork = 0.0;
        for (T num : arrNums) {
            doubleWork += num.doubleValue();
        }
        return doubleWork;
    }
}
