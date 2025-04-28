import com.mycompany.alocacao_veiculos.model.Automovel;

public class AutomovelDAO implements Dao<Automovel> {
    
    private List<Automovel> Automovels = new ArrayList<>();

    public AutomovelDao() {
        Automovels.add(new Automovel("John", "john@domain.com"));
        Automovels.add(new Automovel("Susan", "susan@domain.com"));
    }
    
    @Override
    public Optional<Automovel> get(long id) {
        return Optional.ofNullable(Automovels.get((int) id));
    }
    
    @Override
    public List<Automovel> getAll() {
        return Automovels;
    }
    
    @Override
    public void save(Automovel automovel) {
        Automovels.add(automovel);
    }
    
    @Override
    public void update(Automovel automovel, String[] params) {
        automovel.setModelo(Objects.requireNonNull(
          params[0], "Name cannot be null"));
        automovel.setQuilometragem(Objects.requireNonNull(
          params[1], "Email cannot be null"));
        automovel.setValor_locacao(Objects.requireNonNull(
            params[2], "Email cannot be null"));
          
        Automovels.add(automovel);
    }
    
    @Override
    public void delete(Automovel automovel) {
        Automovels.remove(automovel);
    }
}
