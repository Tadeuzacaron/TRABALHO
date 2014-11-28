
package veiculos;


public class Carro extends Veiculo {
    private String tipo;
    public Carro(int p, int c){
        super(p,c);
    }
    public String getTipo(){
        this.tipo = "Carro";
        return this.tipo;
    }
}
