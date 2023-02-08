package nttdata.bootcamp.quarkus.client.application;

import io.smallrye.mutiny.Uni;
import nttdata.bootcamp.quarkus.client.entity.Client;
import java.util.List;

public interface ClientService
{
    public List<Client> listAll();

}
