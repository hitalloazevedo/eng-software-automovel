import java.util.ArrayList;
import java.util.Optional;
import com.mycompany.alocacao_veiculos.model.Automovel;
import com.mycompany.alocacao_veiculos.model.dao.AutomovelDao;

public class AutomovelController {

    AutomovelDao automovelDAO = new AutomovelDao();

    public Automovel createAutomovel(
        String placaAutomovel,
        String corAutomovel,
        int numeroPortasAutomovel,
        int tipoCombustivelAutomovel,
        long quilometragemAutomovel,
        long renavamAutomovel,
        String chassiAutomovel,
        double valorLocacaoAutomovel
    ) {
        try {
            Automovel automovel = new Automovel(
                placaAutomovel, corAutomovel, numeroPortasAutomovel,
                tipoCombustivelAutomovel, quilometragemAutomovel,
                renavamAutomovel, chassiAutomovel, valorLocacaoAutomovel
            );
            automovelDAO.save(automovel);
            return automovel;
        } catch (Exception e) {
            System.out.println("Erro ao criar automóvel: " + e.getMessage());
            return null;
        }
    }

    public boolean updateAutomovel(String placaAutomovel, long novaQuilometragem, double novoValorLocacao) {
        try {
            Optional<Automovel> optAuto = findAutomovelByPlaca(placaAutomovel);
            if (optAuto.isPresent()) {
                String[] params = {
                    String.valueOf(novaQuilometragem),
                    String.valueOf(novoValorLocacao)
                };
                automovelDAO.update(optAuto.get(), params);
                return true;
            } else {
                System.out.println("Automóvel com placa " + placaAutomovel + " não encontrado.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar automóvel: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteAutomovel(String placaAutomovel) {
        try {
            Optional<Automovel> optAuto = findAutomovelByPlaca(placaAutomovel);
            if (optAuto.isPresent()) {
                automovelDAO.delete(optAuto.get());
                return true;
            } else {
                System.out.println("Automóvel com placa " + placaAutomovel + " não encontrado para exclusão.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir automóvel: " + e.getMessage());
            return false;
        }
    }

    public Optional<Automovel> findAutomovelByPlaca(String placaAutomovel) {
        ArrayList<Automovel> autoList = new ArrayList<>(automovelDAO.getAll());

        for (Automovel auto : autoList) {
            if (auto.toString().contains(placaAutomovel)) {
                return Optional.of(auto);
            }
        }
        return Optional.empty();
    }

    public ArrayList<Automovel> listAllAutomoveis() {
        return new ArrayList<>(automovelDAO.getAll());
    }
}
