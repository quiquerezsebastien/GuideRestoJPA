package ch.hearc.ig.guideresto.business;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author julien.plumez
 */
@Embeddable
public class Localisation {
    
    @Column(name = "adresse")
    private String street;
    @ManyToOne
    @JoinColumn(name = "fk_vill")
    private City city;

    public Localisation() {
        this(null, null);
    }
    
    public Localisation(String street, City city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}