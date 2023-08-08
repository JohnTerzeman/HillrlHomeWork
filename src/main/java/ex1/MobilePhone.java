package ex1;

public class MobilePhone implements Cloneable{
    private String model;
    private String brand;
    public MobilePhone(){

    }
    public MobilePhone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        MobilePhone clonedPhone = (MobilePhone) super.clone();
        return super.clone();
    }
}
