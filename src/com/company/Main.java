package com.company;
//import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int[][] array = new int[3][3];
        boolean win =false;
        boolean input =true;


        //Заполняем массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 2;
            }
        }
        //print_matrix(array);
        System.out.println("\nИгрок №1 играет Ноликами");
        System.out.println("\nИгрок №2 играет Крестиками");
        System.out.println(win);
        System.out.println(input);

while (win=false) {
    do {


        System.out.println("\nИгрок №1, введите координаты");
        System.out.print("Введите координату X : ");
        int i = scanner.nextInt();
        System.out.print("Введите координату Y : ");
        int j = scanner.nextInt();
    }
    while (input ==false);
}


    }
    private static void print_matrix(int[][] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]==2) System.out.print("  ");
                else if (array[i][j]==1) System.out.print(" X");
                else  System.out.print(" 0");
            }
        }

    }
}
