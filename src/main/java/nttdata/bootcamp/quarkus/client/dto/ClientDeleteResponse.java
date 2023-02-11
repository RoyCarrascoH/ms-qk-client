package nttdata.bootcamp.quarkus.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nttdata.bootcamp.quarkus.client.entity.Client;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDeleteResponse extends ResponseBase {

    private Long idClient;

}
