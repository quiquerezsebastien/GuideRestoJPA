package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Evaluation;
import ch.hearc.ig.guideresto.business.Localisation;
import ch.hearc.ig.guideresto.business.RestaurantType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-16T14:27:38")
@StaticMetamodel(Restaurant.class)
public class Restaurant_ { 

    public static volatile SingularAttribute<Restaurant, String> website;
    public static volatile SetAttribute<Restaurant, Evaluation> evaluations;
    public static volatile SingularAttribute<Restaurant, Localisation> address;
    public static volatile SingularAttribute<Restaurant, String> name;
    public static volatile SingularAttribute<Restaurant, String> description;
    public static volatile SingularAttribute<Restaurant, Integer> id;
    public static volatile SingularAttribute<Restaurant, RestaurantType> type;

}