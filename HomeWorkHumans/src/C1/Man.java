package C1;

import java.util.Random;

public class Man extends Human {
    public Man(boolean gender, String name, String surname, float weight, float height) {
        super(gender, name, surname, weight, height);
    }

    public Man() {
        this.setGender(false);
        this.setName("");
        this.setSurname("");
        this.setWeight(1.0f);
        this.setHeight(1.0f);
    }

    public boolean talk(Human human) {
        if (human.isGender() == true) {
            return true;
        } else if (human.isGender() == false) {
            Random random = new Random();
            if (random.nextInt(100) < 50) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public boolean sustainSociety(Human human) {
        Random random = new Random();
        if (human.isGender() == true) {
            if (random.nextInt(100) < 70) return true;
        } else if (human.isGender() == false) {
            if (random.nextInt(100) < 5.6) return true;
        }
        return false;
    }
}
