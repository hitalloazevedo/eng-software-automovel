import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocacaoDao implements Dao<Locacao> {
    private List<Locacao> locacoes = new ArrayList<>();

    @Override
    public Optional<Locacao> get(long id) {
        // Como Locacao não tem ID único, apenas um get simulando pelo índice
        if (id >= 0 && id < locacoes.size()) {
            return Optional.of(locacoes.get((int) id));
        }
        return Optional.empty();
    }

    @Override
    public List<Locacao> getAll() {
        return new ArrayList<>(locacoes);
    }

    @Override
    public void save(Locacao locacao) {
        locacoes.add(locacao);
    }

    @Override
    public void update(Locacao locacao, String[] params) {
        if (params.length >= 2) {
            locacao.setvalorLocacao(Double.parseDouble(params[0]));
            locacao.setlocacaoDevolvida(Boolean.parseBoolean(params[1]));
        }
    }

    @Override
    public void delete(Locacao locacao) {
        locacoes.remove(locacao);
    }
}
