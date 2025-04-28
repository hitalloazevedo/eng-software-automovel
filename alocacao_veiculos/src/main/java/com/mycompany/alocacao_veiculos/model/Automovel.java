public class Automovel {
    private String placaAutomovel;
    private String corAutomovel;
    private int numeroPortasAutomovel;
    private int tipoCombustivelAutomovel;
    private long quilometragemAutomovel;
    private long renavamAutomovel;
    private String chassiAutomovel;
    private double valorLocacaoAutomovel;
    
    // atributos das Associacoes
    private Modelo modelo;

    public Automovel(String placaAutomovel, String corAutomovel, int numeroPortasAutomovel, int tipoCombustivelAutomovel, long quilometragemAutomovel, long renavamAutomovel, String chassiAutomovel, double valorLocacaoAutomovel) {
        this.placaAutomovel = placaAutomovel;
        this.corAutomovel = corAutomovel;
        this.numeroPortasAutomovel = numeroPortasAutomovel;
        this.tipoCombustivelAutomovel = tipoCombustivelAutomovel;
        this.quilometragemAutomovel = quilometragemAutomovel;
        this.renavamAutomovel = renavamAutomovel;
        this.chassiAutomovel = chassiAutomovel;
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
    }

    public void setquilometragemAutomovel(long quilometragemAutomovel) {
        this.quilometragemAutomovel = quilometragemAutomovel;
    }

    public void setvalorLocacaoAutomovel(double valorLocacaoAutomovel) {
        this.valorLocacaoAutomovel = valorLocacaoAutomovel;
    }

    public double getvalorLocacaoAutomovel() {
        return valorLocacaoAutomovel;
    }

    public String conAuto(){        
        return this.toString();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }        
    
    @Override
    public String toString() {
        return "Automovel{" + "placaAutomovel=" + placaAutomovel + ", corAutomovel=" + corAutomovel + ", numeroPortasAutomovel=" + numeroPortasAutomovel + ", tipoCombustivelAutomovel=" + tipoCombustivelAutomovel + ", quilometragemAutomovel=" + quilometragemAutomovel + ", renavamAutomovel=" + renavamAutomovel + ", chassiAutomovel=" + chassiAutomovel + ", valorLocacaoAutomovel=" + valorLocacaoAutomovel + '}';
    }    
}
