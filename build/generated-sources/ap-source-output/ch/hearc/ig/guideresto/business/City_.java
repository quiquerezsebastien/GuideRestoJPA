package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Restaurant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-16T14:27:38")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, String> zipCode;
    public static volatile SingularAttribute<City, String> cityName;
    public static volatile SetAttribute<City, Restaurant> restaurants;
    public static volatile SingularAttribute<City, Integer> id;

}