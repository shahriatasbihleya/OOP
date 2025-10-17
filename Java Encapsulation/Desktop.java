// ID : 02724205101138
public class Desktop {
  
    private String brand;
    private String processor;
    private int ramSize; 

 
    public String getBrand() {
        return brand;
    }

  
    public void setBrand(String brand) {
        this.brand = brand;
    }

   
    public String getProcessor() {
        return processor;
    }


    public void setProcessor(String processor) {
        this.processor = processor;
    }

  
    public int getRamSize() {
        return ramSize;
    }


    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }


    public void upgradeRam(int extraRam) {
        if (extraRam > 0) {
            ramSize += extraRam;
            System.out.println("RAM upgraded by " + extraRam + " GB.");
        } else {
            System.out.println("Invalid RAM value! It must be greater than 0.");
        }
    }


    public static void main(String[] args) {
       
        Desktop desktop1 = new Desktop();

       
        desktop1.setBrand("Dell");
        desktop1.setProcessor("Intel i7");
        desktop1.setRamSize(16);

     
        System.out.println("Brand: " + desktop1.getBrand());
        System.out.println("Processor: " + desktop1.getProcessor());
        System.out.println("Initial RAM: " + desktop1.getRamSize() + " GB");

     
        desktop1.upgradeRam(16);


        System.out.println("Updated RAM: " + desktop1.getRamSize() + " GB");
    }
}
