public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(23, "Максим", "Минск", "бренд-менеджер");

        Human anna = new Human(22, "Аня", "Москва", "методист образовательных программ");

        Human katya = new Human(21, "Катя", "Калининград", "продакт-менеджер");

        Human artem = new Human(20, "Артём", "Москва", "директор по развитию бизнеса");

        Human vladimir = new Human(19, "Владимир", "Казань", "нигде не работает");


        System.out.println("Привет! Меня зовут " + maxim.name + " Я из города " + maxim.getTown() + ". Мой возраст " + maxim.getAge() + ". Я работаю на должности: " + maxim.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + " Я из города " + anna.getTown() + ". Мой возраст " + anna.getAge() + ". Я работаю на должности: " + anna.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + " Я из города " + katya.getTown() + ". Мой возраст " + katya.getAge() + ". Я работаю на должности: " + katya.speciality + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + " Я из города " + artem.getTown() + ". Мой возраст " + artem.getAge() + ". Я работаю на должности: " + artem.speciality + ". Будем знакомы!");


    flower roza = new flower(null, "Голландия", 35.59, 3);
    flower xrizantema = new flower(null, null, 15.00, 5);
    flower pion = new flower(null, "Англия", 69.90, 1);
    flower gipsofila = new flower(null, "Турция", 19.50, 10);

    printInfo(roza);
    printInfo(xrizantema);
    printInfo(pion);
    printInfo(gipsofila);

    StoimostBuket(roza,roza,roza,xrizantema,xrizantema,xrizantema,xrizantema,xrizantema,gipsofila);
}

    private static void printInfo(flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() + ", " + flower.getCountry() + ", " + flower.getCost() + ", " + flower.lifeSpan
        );
    }

    private static void StoimostBuket(flower... flowers) {
        double totalStoimost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalStoimost += flower.getCost();
            printInfo(flower);
        }
        totalStoimost = totalStoimost * 1.1;
        System.out.println("Стоимость букета: " + totalStoimost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
}