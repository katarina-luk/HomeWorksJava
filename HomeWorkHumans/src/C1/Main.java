package C1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("                    Добро пожаловать в систему вычисления совместимости!");
        System.out.println("Выберете Вашу стать:\n" +
                "1 - женщина;\n" +
                "2 - мужчина;");
        Scanner in = new Scanner(System.in);
        int gender = in.nextInt();
        System.out.println("Введите колличество Ваших партнеров:");
        int amountOfPartner = in.nextInt();
        Human[] human = Human.getHumans(gender, amountOfPartner);

        System.out.println("Сначала введите ваши перcональные данные, а потом данные ваших партнеров: ");
        for (int i = 0; i < human.length; i++) {
            System.out.print("Имя: ");
            human[i].setName(in.next());
            System.out.print("Фамилия: ");
            human[i].setSurname(in.next());
            System.out.print("Вес: ");
            human[i].setWeight(in.nextFloat());
            System.out.print("Pост: ");
            human[i].setHeight(in.nextFloat());
            System.out.println();
        }
        System.out.println("Получится ли у Вас завести разговор с вашими пассиями?\n" +
                "В случае положительного ответа Вы получите true!");
        System.out.println();
        for (int i = 1; i < human.length; i++) {
            System.out.print("Возможность болтать c " + human[i].getName());
            System.out.println(" : " + human[0].talk(human[i]));
        }
        System.out.println();
        System.out.println("Узнайте возможности Ваших пассий выдерживать общество\n" +
                "В случае положительного ответа Вы получите true!");
        System.out.println();
        for (int i = 1; i < human.length; i++) {
            System.out.print("Возможность выдерживать общество " + human[i].getName());
            System.out.println(" : " + human[0].sustainSociety(human[i]));
        }
        System.out.println();

        System.out.println("Можете ли вы быть вместе в зависимости от вашего роста...\n" +
                "B случае положительного ответа Вы получите true!");

        System.out.println("Ваш рост: " + human[0].getHeight());
        for (int i = 1; i < human.length; i++) {
            System.out.println("Рост вашей пассии " + human[i].getName() + " - " + human[i].getHeight() + " : " + Human.spendTimeTogether(human[0], human[i]));
        }
        System.out.println();

        System.out.println("Теперь, время узнать имя вашей идеальной второй половинки! И узнать, получиться ли у вас иметь детей!");
        for (int i = 1; i < human.length; i++) {
            System.out.println(Human.haveRelationship(human[0], human[i]));
        }
    }

}
