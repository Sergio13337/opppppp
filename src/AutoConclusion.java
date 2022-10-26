import Transport.Auto;

public class AutoConclusion {
    public static void main(String[] args) {

        Auto granta = new Auto("Lada",null,"жёлтый цвет",1.7,2015,"Россия");

        System.out.println("Марка автомобиля: " + granta.brand + ", модель: " + granta.model + ", год сборки: " + granta.productYear + ", страна сборки: " + granta.country + ", цвет: " + granta.color + ", объём двигателя: " + granta.engineVolume + "л");

        Auto audi = new Auto("Audi","A8","черный цвет",3.0,2020,"Германия");

        System.out.println("Марка автомобиля: " + audi.brand + ", модель: " + audi.model + ", год сборки: " + audi.productYear + ", страна сборки: " + audi.country + ", цвет: " + audi.color + ", объём двигателя: " + audi.engineVolume + "л");

        Auto BMW = new Auto("BMW","Z8","черный цвет",3.0,0,"Германия");

        System.out.println("Марка автомобиля: " + BMW.brand + ", модель: " + BMW.model + ", год сборки: " + BMW.productYear + ", страна сборки: " + BMW.country + ", цвет: " + BMW.color + ", объём двигателя: " + BMW.engineVolume + "л");

        Auto Kia = new Auto("Kia","Sportage","красный цвет",2.4,2018,"Южная Корея");

        System.out.println("Марка автомобиля: " + Kia.brand + ", модель: " + Kia.model + ", год сборки: " + Kia.productYear + ", страна сборки: " + Kia.country + ", цвет: " + Kia.color + ", объём двигателя: " + Kia.engineVolume + "л");

        Auto hyundai = new Auto("Hyundai","Avante","оранжевый цвет",1.6,2016,"Южная Корея");

        System.out.println("Марка автомобиля: " + hyundai.brand + ", модель: " + hyundai.model + ", год сборки: " + hyundai.productYear + ", страна сборки: " + hyundai.country + ", цвет: " + hyundai.color + ", объём двигателя: " + hyundai.engineVolume + "л");

    }
}
