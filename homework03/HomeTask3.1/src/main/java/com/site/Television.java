package main.java.com.site;

public class Television {
    private String brand;
    private String model;
    private int serial;
    private int year;

    public Television (String brand, String model, int serial, int year) {
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        this.year = year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSerial() {
        return serial;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "Наименование бренда:"+this.brand +
                "\nНаименование модели:"+this.model +
                "\nСерийный номер:"+this.serial+
                "\nГод выпуска:"+this.year;
    }
}
