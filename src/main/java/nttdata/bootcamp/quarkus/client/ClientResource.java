package nttdata.bootcamp.quarkus.client;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nttdata.bootcamp.quarkus.client.application.ClientService;
import nttdata.bootcamp.quarkus.client.model.Client;
import java.util.List;

@Path("/api/clients")
public class ClientResource {

    @Inject
    private ClientService service;

    @GET
    //@Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<List<Client>> getClients() {
        return service.listAll();
    }

}
