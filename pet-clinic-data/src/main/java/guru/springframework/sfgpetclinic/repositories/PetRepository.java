package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

/**
 * Created by jt on 8/5/18.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
