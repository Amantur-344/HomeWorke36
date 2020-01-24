package Lesson35;
import java.util.LinkedList;
public class Main {
    public static void main(String [] args) {


        int rndIndex = 0;
        int diogonal1 = 0;
        LinkedList<Texnik> computers = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            rndIndex = (int) (10000 + Math.random() * 40000);
            diogonal1 = (int) (17 + Math.random() * 13);


            for (int j = 0; j <= 25; j++) {
                computers.add(new Computer(rndIndex, "DELL", diogonal1));
                computers.add(new Noutbook(rndIndex, "Asus"));
                computers.add(new Computer(rndIndex, "Asus", diogonal1));
                computers.add(new Noutbook(rndIndex, "DELL"));
            }
        }
        double summ = 0;
        double summComputer = 0;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i) instanceof Noutbook)
      //          summ += computers.get(i).getPrice();
            if (computers.get(i) instanceof Computer)
       //         summComputer += computers.get(i).getPrice();
        }
        System.out.println("Сумма ноутбуков " + summ);
        System.out.println("Сумма клмпьютеров " + summComputer);

        //Я хотел сперва пощитать а потом удалить на цифру меньше в итооге чтоб остался только один.

        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getModel().equals("DELL")) {
                computers.remove("DELL");
            } else {
                computers.add(new Computer(1, "DELL"));
                computers.add(new Computer(2, "Asus"));
            }
            if (computers.get(i).getModel().equals("Asus")) {
                computers.remove("Asus");
            } else {
                computers.add(new Computer(1, "Asus"));
                computers.add(new Noutbook(2, "DELL"));
            }
        }
        for (int i = 0; i < computers.size(); i++) {
        //    computers.sort(computers.get(i).getPrice());
       //     System.out.println(computers.get(i).getPrice());
        }
//тут ошибка не знаю как это все зделать сделал все что смог
    }
        }


