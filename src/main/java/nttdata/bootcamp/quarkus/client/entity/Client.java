package nttdata.bootcamp.quarkus.client.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
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
@Cacheable
public class Client extends PanacheEntity {

    @Id
    @GeneratedValue
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