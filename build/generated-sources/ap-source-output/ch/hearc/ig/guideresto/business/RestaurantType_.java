package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Restaurant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-16T14:27:38")
@StaticMetamodel(RestaurantType.class)
public class RestaurantType_ { 

    public static volatile SingularAttribute<RestaurantType, String> description;
    public static volatile SetAttribute<RestaurantType, Restaurant> restaurants;
    public static volatile SingularAttribute<RestaurantType, Integer> id;
    public static volatile SingularAttribute<RestaurantType, String> label;

}