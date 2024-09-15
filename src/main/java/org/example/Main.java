package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final int max_n = 5;
        int correct = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int n = 1; n <= max_n; n++) {
            int numRandom = random.nextInt(10);
            int numRandom1 = random.nextInt(10);
            int correctAnswer = numRandom * numRandom1;


            System.out.println(numRandom + " * " + numRandom1 + " = ?");


            System.out.print("Введите ответ: ");
            int userAnswer = scanner.nextInt();


            if (userAnswer == correctAnswer) {
                correct++;
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно! Правильный ответ: " + correctAnswer);
            }
        }

            if (correct==5){
                System.out.print("Молодец");
            }
            if (correct==3 || correct==4){
                System.out.print("Надо бы еще поучить");
            }
            if (correct<=2){
                System.out.print("Срочно нужно учить таблицу умножения");

        }
    }
}