// ID : 02724205101138
public class Smartphone {
 
    private String brand;
    private String model;
    private int storageCapacity; 

  
    public String getBrand() {
        return brand;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public int getStorageCapacity() {
        return storageCapacity;
    }

  
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

  
    public void increaseStorage(int extraStorage) {
        if (extraStorage > 0) {
            storageCapacity += extraStorage;
            System.out.println("Storage increased by " + extraStorage + " GB.");
        } else {
            System.out.println("Invalid storage value! It must be greater than 0.");
        }
    }

  
    public static void main(String[] args) {

        Smartphone phone1 = new Smartphone();

   
        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S23");
        phone1.setStorageCapacity(128);

 
        System.out.println("Brand: " + phone1.getBrand());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Initial Storage: " + phone1.getStorageCapacity() + " GB");

      
        phone1.increaseStorage(64);

       
        System.out.println("Updated Storage: " + phone1.getStorageCapacity() + " GB");
    }
}
