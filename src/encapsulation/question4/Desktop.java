package encapsulation.question4;

public class Desktop {
    private String brand;
    private String processor;
    private int ramSize;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public String getProcessor(){
        return processor;
    }
    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
    public int getRamSize(){
        return ramSize;
    }
    public void upgradeRam(int ram) {
        if (ram > 0) {
            ramSize += ram;
        } else {
            System.out.println("Invalid upgrade amount");
        }
    }
}
