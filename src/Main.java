import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        a) Используйте цикл
//        b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//        c)  Затем программа должна отобразить этот список
//        d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//        e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//        f)  После объединения отобразить в консоли список С
//        g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.

        while(true){
            ArrayList<String> listA = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                listA.add(scanner.next());
            }

            System.out.println(listA);
            ArrayList<String> listB = new ArrayList<String>();
            for (int i = 0; i < 5; i++) {
                listB.add(scanner.next());
            }
            System.out.println(listB);
            ArrayList<String> listC = new ArrayList<String>();
            for (int f = 0; f < listB.size(); f++) {
                listC.add( listA.get(f) );
                listC.add( listB.get(f) );
            }
            System.out.println(listC);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < listC.size(); j++) {
                    try {
                        if (listC.get(j).length() > listC.get(j + 1).length()) {
                            String nextValue = listC.get(j + 1);
                            String previusValue = listC.get(j);
                            listC.set(j, nextValue);
                            listC.set(j+1, previusValue);
                        }
                    } catch (IndexOutOfBoundsException e) {}
                }
            }
            System.out.println(listC);
        }
    }
}