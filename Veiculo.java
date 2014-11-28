
package veiculos;

public class Veiculo {
    protected int placa;
    protected int carteiraMotorista;
    
    public Veiculo(int p, int c){
        setPlaca(p);
        setCarteiraMotorista(c);
    }
    public void setPlaca(int p){
        this.placa=p;
    }
    public int getPlaca(){
        return this.placa;
    }
    public void setCarteiraMotorista(int c){
        this.carteiraMotorista = c;
    }
    public int getCarteiraMotorista(){
        return this.carteiraMotorista;
    }
}
