package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "текст1" + "текст2" + "текст3";//переменная а это просто прибавленные тексты
        System.out.println(a);//вывожу переменную a

        int NUM = 10;//создаю переменную в int

        String word = "";//создаю переменную в string
        System.out.println(a+NUM+word);//вывожу все переменные

        if(NUM<0){//просто условия если NUM меньше нуля
            System.out.println("Вы сохранили отрицательное число");

        }else if(NUM>0){//условие если NUM больше нуля я бы зделал >=
            System.out.println("Вы сохранили положительное число");

        }else if(NUM==0){//если равно нулю
            System.out.println("Вы сохранили нуль");
        }

        Scanner scan = new Scanner(System.in);//Используется импортированный java.util.Scanner
        System.out.println("Введите свое имя:");//Спрашивает имя

        String vedeniytext = scan.next();//Ввод текста scan.next()
        System.out.println("Привет " + vedeniytext + "!");//привет с добавлением введеной переменной
    }
}
