package C1;

import java.util.Random;
import java.util.Scanner;

public class Women extends Human {

    public Women(boolean gender, String name, String surname, float weight, float height) {
        super(gender, name, surname, weight, height);
    }

    public Women() {
        this.setGender(true);
        this.setName("");
        this.setSurname("");
        this.setWeight(1.0f);
        this.setHeight(1.0f);
    }

    public boolean talk(Human human) {
        if (human.isGender() == true) {
            return true;
        } else return true;
    }

    @Override
    public boolean sustainSociety(Human human) {
        Random random = new Random();
        if (human.isGender() == true) {
            if (random.nextInt(100) < 5) return true;
        } else if (human.isGender() == false) {
            if (random.nextInt(100) < 70) return true;
        }
        return false;
    }

    public static Object giveBirth( Human female,Human male) {
        Random random = new Random();
        Human human;
        boolean gender = random.nextBoolean();
        if (gender == true) {
            human = new Women();
        } else {
            human = new Man();
        }
        System.out.print("Стать вашего ребенка: " + human.isGender()+"." + " Введите имя ребенка: ");
        String next = new Scanner(System.in).next();
        human.setName(next);
        if (male.isGender()==true) {
            human.setSurname(female.getSurname());
        } else if(female.isGender()==true) {
            human.setSurname(male.getSurname());
        }
        if (human.isGender() == true) {
            human.setHeight(female.getHeight() + 0.1f + male.getHeight() - female.getHeight());
        } else if (human.isGender() == false) {
            human.setHeight(male.getHeight() + 0.1f + female.getHeight() - male.getHeight());
        }
        if (human.isGender() == true) {
            human.setWeight(female.getWeight() + 0.1f + male.getWeight() - female.getWeight());
        } else if (human.isGender() == false) {
            human.setWeight(male.getWeight() + 0.1f + female.getWeight() - male.getWeight());
        }
        return human +"\n"+ "Поздравляем с рождением ребенка!";
    }
}
