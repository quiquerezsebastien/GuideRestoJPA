package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Grade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-16T14:27:38")
@StaticMetamodel(CompleteEvaluation.class)
public class CompleteEvaluation_ extends Evaluation_ {

    public static volatile SingularAttribute<CompleteEvaluation, String> comment;
    public static volatile SetAttribute<CompleteEvaluation, Grade> grades;
    public static volatile SingularAttribute<CompleteEvaluation, String> username;

}