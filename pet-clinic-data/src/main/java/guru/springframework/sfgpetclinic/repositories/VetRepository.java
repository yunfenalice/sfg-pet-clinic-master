package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by jt on 8/5/18.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {


}
