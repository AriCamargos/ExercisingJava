package voto;
/*
 -16 não voto
 16 - não é obrigatório
 18 - obrigatório
 70 - não é obrigatório

*/
public class IdadeVoto {
    private int idade;
    private int idadeAtual;

    public IdadeVoto() {
        this.idade = idade;
    }

    public int retornarVoto() {
        int menorIdade = 16;
        int maiorIdade = 18;
        int melhorIdade = 70;

        // ERRO AQUI 
        if (idade < menorIdade) { 
            return this.retornarVoto(); 
        }
        if(idade>=maiorIdade){
            return this.idadeAtual;
        }

        if (idade < menorIdade) {
            return this.getIdadeAtual();
        }
        if (idade >= menorIdade && idade < maiorIdade) {
        }
        if (idade >= maiorIdade && idade <= melhorIdade) {
        }
        if (idade >= melhorIdade) {
        } else {

        }
        return 0;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }

    public void setIdadeAtual(int idadeAtual) {
        this.idadeAtual = idadeAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
