package nttdata.bootcamp.quarkus.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;
    private String idClient;
    private String personType;
    private String documentType;
    private String documentNumber;
    private String names;
    private String surnames;
    private String sex;
    private String email;
    private String cellPhone;
}