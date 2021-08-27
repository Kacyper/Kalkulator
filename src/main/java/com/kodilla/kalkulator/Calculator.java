package com.kodilla.kalkulator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
class Calculator {

    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();
    int secondNumber = scanner.nextInt();

    public void dodawanie() {
        System.out.println("Suma liczb to: " + (firstNumber + secondNumber));
    }

    public void odejmowanie() {
        System.out.println("Różnica liczb to: " + (firstNumber - secondNumber));
    }

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);
        System.out.println("Podaj dwie liczby, a ja je za Ciebie policzę.");
        Calculator calculator = new Calculator();
        calculator.dodawanie();
        calculator.odejmowanie();
    }
}
