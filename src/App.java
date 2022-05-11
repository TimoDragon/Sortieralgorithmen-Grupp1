import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Person[] lager = new Person[5];
        lager[0] = new Person("Hans","Peter",20);
        lager[1] = new Person("Anna" , "Mueller" , 22);
        lager[2] = new Person("Zauberer" , "Magier" , 44);
        lager[3] = new Person("Ahris" , "Becker" , 32);
        lager[4] = new Person("Felix","Flieger",16);

        System.out.println("Wie willst du Sortieren?");
        System.out.println("[1] Vorname");
        System.out.println("[2] Nachname");
        System.out.println("[3] Alter");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch(input) {
            case "1":{
                Person[] test = bubblesortVorname(lager);
                for (Person p : test) {
                    System.out.println(p);
                }

                break;
            }
            case "2": {
                Person[] test = bubblesortNachname(lager);
                for (Person p : test) {
                    System.out.println(p);
                }
                
                break;
            }
            case "3": {
                Person[] test = bubblesortAlter(lager);
                for (Person p : test) {
                    System.out.println(p);
                }

                break;
            }
            default: {
                System.out.println("Falsche Eingabe!");
                break;
            }
        }
    }

    public static Person[] bubblesortAlter(Person[] array) {
        Person temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j].getAlter() > array[j + 1].getAlter()) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    // man könnte das mit dem String sortieren noch etwas besser machen da das kleine "a" nach dem großen "Z" kommt aber EGAL

    public static Person[] bubblesortVorname(Person[] array) {
        Person temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int num = array[j].getVorname().compareTo(array[j + 1].getVorname());
                temp = array[j];
                if (num > 0) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else if (num < 0) {
                    int num2 = -1;

                    if (j == 0) {
                        num2 = 0;
                    }

                    array[j] = array[j + num2];
                    array[j + num2] = temp;
                }
            }
        }

        return array;
    }

    public static Person[] bubblesortNachname(Person[] array) {
        Person temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int num = array[j].getNachname().compareTo(array[j + 1].getNachname());
                temp = array[j];
                if (num > 0) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                else if (num < 0) {
                    int num2 = -1;

                    if (j == 0) {
                        num2 = 0;
                    }

                    array[j] = array[j + num2];
                    array[j + num2] = temp;
                }
            }
        }

        return array;
    }
}
