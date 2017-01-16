package ch.hearc.ig.guideresto.business;

import ch.hearc.ig.guideresto.business.Grade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-21T12:23:29")
@StaticMetamodel(CompleteEvaluation.class)
public class CompleteEvaluation_ { 

    public static volatile SingularAttribute<CompleteEvaluation, String> comment;
    public static volatile SetAttribute<CompleteEvaluation, Grade> grades;
    public static volatile SingularAttribute<CompleteEvaluation, String> username;

}