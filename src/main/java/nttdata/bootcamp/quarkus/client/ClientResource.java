package nttdata.bootcamp.quarkus.client;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nttdata.bootcamp.quarkus.client.application.ClientService;
import nttdata.bootcamp.quarkus.client.entity.Client;
import nttdata.bootcamp.quarkus.client.util.Utilitarios;
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
    public Client viewClientDetails(@PathParam("idClient") Long idClient) {
        Client entity = service.findById(idClient);
        if (entity == null) {
            throw new WebApplicationException("Client with id of " + idClient + " does not exist.", 404);
        }
        return entity;
    }

    @POST
    @Transactional
    public Response create(Client client) {
        if (client.getIdClient() != null) {
            throw new WebApplicationException("Id was invalidly set on request.", 422);
        }
        service.save(client);
        return Response.ok(client).status(201).build();
    }

    @PUT
    @Path("{idClient}")
    @Transactional
    public Client updateClient(@PathParam("idClient") Long idClient, Client client) {
        if (client.getPersonType() == null) {
            throw new WebApplicationException("Client person type was not set on request.", 422);
        }
        Client entity = service.findById(idClient);
        if (entity == null) {
            throw new WebApplicationException("Client with id of " + idClient + " does not exist.", 404);
        }

        entity = Utilitarios.saveClient(entity, client);
        service.update(idClient,entity);
        return entity;
    }

    @DELETE
    @Path("{idClient}")
    @Transactional
    public Response delete(@PathParam("idClient") Long idClient) {
        Client entity = service.findById(idClient);
        if (entity == null) {
            throw new WebApplicationException("Client with id of " + idClient + " does not exist.", 404);
        }
        service.delete(entity.getIdClient());
        return Response.status(200).build();
    }

}