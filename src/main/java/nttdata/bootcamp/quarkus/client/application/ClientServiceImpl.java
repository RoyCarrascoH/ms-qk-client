package nttdata.bootcamp.quarkus.client.application;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import nttdata.bootcamp.quarkus.client.model.Client;
import java.util.List;

@ApplicationScoped
public class ClientServiceImpl implements ClientService{
    @Override
    public Uni<List<Client>> listAll() {
        return null;
    }
}
