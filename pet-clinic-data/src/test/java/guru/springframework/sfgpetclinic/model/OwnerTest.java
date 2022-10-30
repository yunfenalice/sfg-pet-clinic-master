package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
Owner owner;
Set<Pet> pets;
    @BeforeEach
    void setUp() {
        owner=new Owner();
        pets=new HashSet<>();
    }

    @Test
    void getPet() {
     owner.setPets(pets);

    }



    @Test
    void getAddress() {
    }

    @Test
    void getCity() {
    }

    @Test
    void getTelephone() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void setCity() {
    }

    @Test
    void setTelephone() {
    }

    @Test
    void setPets() {
    }

    @Test
    void builder() {
    }
}