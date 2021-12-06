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

    public ResultadoVoto retornarVoto() {
        int menorIdade = 16;
        int maiorIdade = 18;
        int melhorIdade = 70;

        if (idade <= menorIdade) { 
            return ResultadoVoto.NAO_VOTA;
        }
        if(idade>=maiorIdade){
            return ResultadoVoto.VOTO_OBRIGATORIO;
        }
        if (idade >= melhorIdade) {
            return ResultadoVoto.VOTO_NAO_OBRIGATORIO;
        }
        return null;
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
