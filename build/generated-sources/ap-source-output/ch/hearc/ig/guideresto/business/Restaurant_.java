package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Localisation;
import ch.hearc.ig.guideresto.business.RestaurantType;
import java.util.Set;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-21T12:23:29")
@StaticMetamodel(Restaurant.class)
public class Restaurant_ { 

    public static volatile SingularAttribute<Restaurant, String> website;
    public static volatile SingularAttribute<Restaurant, Set> evaluations;
    public static volatile SingularAttribute<Restaurant, Localisation> address;
    public static volatile SingularAttribute<Restaurant, String> name;
    public static volatile SingularAttribute<Restaurant, String> description;
    public static volatile SingularAttribute<Restaurant, Integer> id;
    public static volatile SingularAttribute<Restaurant, RestaurantType> type;

}