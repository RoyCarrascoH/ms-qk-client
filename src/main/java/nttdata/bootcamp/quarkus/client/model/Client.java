package nttdata.bootcamp.quarkus.client.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private Integer idClient;
    private String personType;
    private String documentType;
    private String documentNumber;
    private String names;
    private String surnames;
    private String sex;
    private String mail;
    private String cellPhone;

}
