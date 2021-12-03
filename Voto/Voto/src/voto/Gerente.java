package voto;

public class Gerente {

    private final aInterface umaI;
    private final IdadeVoto id;

    public Gerente() {
        this.umaI = new aInterface();
        this.id = new IdadeVoto();
    }

    public void faca() {
        int idadeVoto = this.id.getIdade();
        int retornoIdadeVoto = this.umaI.leiaIdade(idadeVoto);
        int retorno = this.umaI.mostrarResultado(idadeVoto);
        
    }
}
