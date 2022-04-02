package io.gulfbit.petclinc.web.data.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {


    @Column(name = "city")
    private String city;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    @Builder
    public Owner(String firstName, String lastName, String city, String telephone, String address, Set<Pet> pets) {
        super(firstName, lastName);
        this.city = city;
        this.telephone = telephone;
        this.address = address;
        this.pets = pets;
    }

}
