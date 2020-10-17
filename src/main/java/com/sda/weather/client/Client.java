package com.sda.weather.client;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w programie meteorologicznym");
        while (true){
            System.out.println("Co chcesz zrobić");
            System.out.println("1. wprowadź swoje dane");
            System.out.println("2. wyświetl dane meteorologiczne w swoim regionie");
            System.out.println("0. zamknij aplikację");
            int response = scanner.nextInt();

        }




    }
}
