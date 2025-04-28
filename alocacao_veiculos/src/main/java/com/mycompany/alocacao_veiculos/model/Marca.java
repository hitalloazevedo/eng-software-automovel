package com.mycompany.alocacao_veiculos.model;
<<<<<<< HEAD

public class Marca {
    private String descricao;
=======
>>>>>>> b0cda9d7821387826d92e95653d2845027dda02d

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
