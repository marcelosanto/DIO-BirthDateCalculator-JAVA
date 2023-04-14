package com.developermarcelo;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int age = scanner.nextInt();

        BirthDateFacade birthDateFacade = BirthDateFacade.getInstance();
        String birthDateInformation = birthDateFacade.getBirthDateInformation(age);
        System.out.println(birthDateInformation);

        scanner.close();
    }
}