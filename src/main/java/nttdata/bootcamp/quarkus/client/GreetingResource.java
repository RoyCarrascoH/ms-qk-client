package nttdata.bootcamp.quarkus.client;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nttdata.bootcamp.quarkus.client.application.ClientService;
import nttdata.bootcamp.quarkus.client.entity.Client;
import java.util.List;

@Path("/api/clients")
public class GreetingResource {

    @Inject
    private ClientService service;

    @GET
    //@Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Client> getClients() {
        return service.listAll();
    }

}
