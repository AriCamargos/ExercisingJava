package voto;

import java.util.Scanner;

public class aInterface {

    void apresenta() {
        System.out.println(" === Cálculo de Idade Votação 2022 === ");
        System.out.println("Insira sua idade e saiba se você precisará votar ou não em 2022 👍 \n");
    }

    void calculaIdade(ResultadoVoto i) {
        Scanner calcularIdade = new Scanner(System.in);

        System.out.println("Qual a idade você terá até dia 02/10/2022? 🤔 ");
        this.menu();
        
        String idadeAtual = calcularIdade.nextLine();
        switch (idadeAtual) {
            case "a" -> System.out.println("Você ainda não precisará votar\n");
            case "b" -> System.out.println("Você pode escolher votar ou não\n");
            case "c" -> System.out.println("Você precisará votar obrigatóriamente \n");
            case "d" -> System.out.println("Você não precisará mais votar\n");
           
        }

    }
    void menu(){
        System.out.println("== MENU == ");
        System.out.println("a - menos de 16 anos ");
        System.out.println("b - até 16 anos ");
        System.out.println("c - entre 18 a 69 anos ");
        System.out.println("d - mais de 70 anos ");
    }
    
}
