package voto;

public class Gerente {

    private final aInterface umaI;
    private final IdadeVoto id;

    public Gerente() {
        this.umaI = new aInterface();
        this.id = new IdadeVoto();
    }

    public void faca() {
        while(true){
            
        this.umaI.apresenta();
        ResultadoVoto i = this.id.retornarVoto();
        this.umaI.calculaIdade(i);
        }
    }
}
