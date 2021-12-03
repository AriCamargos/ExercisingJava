package agendapessoal;

import java.util.ArrayList;

/*

Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.
void armazenaPessoa(){
        agenda.add("Ariana");
        
    }
    
    void removePessoa(){
    }
    
    void buscaPessoa(){
        
    }
    
    void imprimiAgenda(){
        
    }
    
    void imprimiPessoa(){
        
    }
*/
public class Agenda {
    public String nome;
    public int idade;
    public float altura;
    ArrayList<String> agenda = new ArrayList<>();
    
    public Agenda(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    int getIdade(){
        return idade;
    }
    
    void setIdade(int idade){
        this.idade=idade;
    }
    
    float getAltura(){
        return altura;
    }
    
    void seAltura(float altura){
        this.altura = altura;
    }
    
    
    
    
    
}
