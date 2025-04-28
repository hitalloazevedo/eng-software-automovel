public class Marca {
    private String descricaoMarca;

    public Marca(String descricaoMarca) {
        this.descricaoMarca = descricaoMarca;
    }
    
    public String consultarMarca(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Marca{" + "descricaoMarca=" + descricaoMarca + '}';
    }    
}
