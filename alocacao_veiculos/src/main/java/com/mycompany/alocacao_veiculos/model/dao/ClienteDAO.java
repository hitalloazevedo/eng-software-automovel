import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteDao implements Dao<Cliente> {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public Optional<Cliente> get(long id) {
        return clientes.stream()
            .filter(cliente -> cliente.toString().contains(String.valueOf(id)))
            .findFirst();
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void update(Cliente cliente, String[] params) {
        // Como não existem setters nos seus modelos, o update precisaria ser ajustado.
        // Exemplo de alteração manual:
        System.out.println("Atualização de Cliente ainda não implementada devido à falta de setters.");
    }

    @Override
    public void delete(Cliente cliente) {
        clientes.remove(cliente);
    }
}
