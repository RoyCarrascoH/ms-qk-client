package nttdata.bootcamp.quarkus.client;

import jakarta.ws.rs.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import nttdata.bootcamp.quarkus.client.application.ClientService;
import nttdata.bootcamp.quarkus.client.entity.Client;
import org.jboss.logging.Logger;
import java.util.List;

@Path("/api/clients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientResource {

    private static final Logger LOGGER = Logger.getLogger(ClientResource.class.getName());

    @Inject
    private ClientService service;

    @GET
    public List<Client> getClients() {
        return service.listAll();
    }

    @GET
    @Path("{idClient}")
    public Client viewClientDetails(@PathParam("idClient") Long idClient){
        Client entity = service.findById(idClient);
        if (entity == null) {
            throw new WebApplicationException("Client with id of " + idClient + " does not exist.", 404);
        }
        return entity;
    }

}
