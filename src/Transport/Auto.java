package Transport;

public class Auto {
    private final String brand;
    private final String model;
    private String color;
    private double engineVolume;
    private final int productYear;
    private final String country;

    private String kP;
    private final String tK;
     private  int number;
   private final int seat;
    private boolean rezina;
    public Auto(String brand, String model, String color, double engineVolume, int productYear, String country,String kP,String tK,int number,int seat,boolean rezina) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume;}

        if (color == null) {
            this.color = "белый цвет";
        } else {
            this.color = color;
        }
        if (productYear == 0) {
            this.productYear = 2000;
        } else {
            this.productYear = productYear;
        }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductYear() {
        return productYear;
    }

    public String getCountry() {
        return country;
    }

    public String gettK() {
        return tK;
    }

    public int getSeat() {
        return seat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getkP() {
        return kP;
    }

    public void setkP(String kP) {
        this.kP = kP;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isRezina() {
        return rezina;
    }

    public void setRezina(boolean rezina) {
        this.rezina = rezina;
    }







    }
}
