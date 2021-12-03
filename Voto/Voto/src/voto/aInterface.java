package voto;

import java.util.Scanner;

public class aInterface {

    int leiaIdade(int idadeVoto) {
        Scanner idade = new Scanner(System.in);
        
        System.out.println(" === Você vota ou não === ");
        System.out.println("Insira sua idade e saiba se você precisará votar em 2022 \n");
        
        System.out.println("Qual a idade você terá até dia 02/10/2022?");
        int idadeAtual = idade.nextInt();
        return idadeAtual;
    }
    
    int mostrarResultado(int idadeAtual){
        return idadeAtual ;
    }

    
    

}
