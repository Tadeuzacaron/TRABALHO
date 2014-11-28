
package veiculos;


public class Moto extends Veiculo {
    private String tipo;
    public Moto(int p, int c){
    	super(p, c);
    }
    public String getTipo(){
        this.tipo = "Moto";
        return this.tipo;
    }
}
