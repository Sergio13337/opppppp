public class Human {

    private int age;
    public String name;
    private String town;
    public String speciality;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public Human(int age, String name, String town, String speciality) {

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (speciality == null) {
            this.speciality = "Информация не указана";
        } else {
            this.speciality = speciality;
        }



    }




}
