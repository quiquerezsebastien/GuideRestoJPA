package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Restaurant;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-16T14:27:38")
@StaticMetamodel(Evaluation.class)
public abstract class Evaluation_ { 

    public static volatile SingularAttribute<Evaluation, Restaurant> restaurant;
    public static volatile SingularAttribute<Evaluation, Date> visitDate;
    public static volatile SingularAttribute<Evaluation, Integer> id;

}