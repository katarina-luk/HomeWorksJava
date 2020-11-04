package C1;

import java.util.Random;

public abstract class Human {
    private boolean gender;
    private String name;
    private String surname;
    private float weight;
    private float height;

    public Human(boolean gender, String name, String surname, float weight, float height) {
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public Human() {
        gender = false;
        name = "";
        surname = "";
        weight = 0.0f;
        height = 0.0f;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
            if (weight >= 0.0f) {
                this.weight = weight;
            } else System.out.println("Error! Weight can`t be negative number");
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        } else System.out.println("Error! Height can`t be negative number");
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public abstract boolean talk(Human human);

    public abstract boolean sustainSociety(Human human);

    public static boolean spendTimeTogether(Human female, Human male) {
        if (female.getHeight() <= male.getHeight()) {
            float result = 100 - ((female.getHeight() * 100) / male.getHeight());
            if (result > 10) {
                Random random = new Random();
                if ((random.nextInt(100) <= 85) && (female.isGender() != male.isGender())) return true;
            } else if (result < 10) {
                Random random = new Random();
                if ((random.nextInt(100) <= 95) && (female.isGender() != male.isGender())) return true;
            }
        } else if (female.getHeight() >= male.getHeight()) {
            float result = 100 - ((male.getHeight() * 100) / female.getHeight());
            if (result > 10) {
                Random random = new Random();
                if ((random.nextInt(150) <= 85) && (female.isGender() != male.isGender())) return true;
            } else if (result < 10) {
                Random random = new Random();
                if ((random.nextInt(150) <= 95) && (female.isGender() != male.isGender())) return true;
            }
        }
        return false;
    }

    public static Object haveRelationship(Human female, Human male) {
        if (((female.talk(male) == true) && (female.sustainSociety(male) == true) && (Human.spendTimeTogether(female, male) == true) && (female.isGender() != male.isGender()))) {
            return Women.giveBirth(female, male);
        } else if (((female.talk(male) == true) && (female.sustainSociety(male) == true) && (Human.spendTimeTogether(female, male) == true) && (female.isGender() != male.isGender()))) {
            return null + " - Сорян, ничего не получилось с " + male.getName();
        }
        return null + " - Сорян, ничего не получилось с " + male.getName();
    }

    public static Human[] getHumans(int gender, int amountOfPartner) {
        Human human[] = new Human[amountOfPartner + 1];
        if (gender == 1) {
            human[0] = new Women();
            for (int i = 1; i < human.length; i++) {
                human[i] = new Man();
            }
        } else if (gender == 2) {
            human[0] = new Man();
            for (int i = 1; i < human.length; i++) {
                human[i] = new Women();
            }
        }
        return human;
    }

}
