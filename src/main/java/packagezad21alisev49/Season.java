package packagezad21alisev49;

public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);
    public int temperature;
    Season(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}