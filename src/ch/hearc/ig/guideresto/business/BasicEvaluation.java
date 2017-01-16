package ch.hearc.ig.guideresto.business;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.persistence.annotations.ConversionValue;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.ObjectTypeConverter;

/**
 *
 * @author julien.plumez
 */
@Entity
@Table(name = "LIKES")
public class BasicEvaluation extends Evaluation {

    @ObjectTypeConverter(name = "boolConverter",
            dataType = java.lang.String.class,
            objectType = java.lang.Boolean.class,
            conversionValues = {
                    @ConversionValue(dataValue = "Y", objectValue = "true"),
                    @ConversionValue(dataValue="N", objectValue = "false")
            })
    @Convert("boolConverter")
    @Column(name = "APPRECIATION") // Convertion en type oracle ?
    private Boolean likeRestaurant;
    @Column(name = "ADRESSE_IP")
    private String ipAddress;

    public BasicEvaluation() {
        this(null, null, null, null);
    }

    public BasicEvaluation(Date visitDate, Restaurant restaurant, Boolean likeRestaurant, String ipAddress) {
        this(null, visitDate, restaurant, likeRestaurant, ipAddress);
    }

    public BasicEvaluation(Integer id, Date visitDate, Restaurant restaurant, Boolean likeRestaurant, String ipAddress) {
        super(id, visitDate, restaurant);
        this.likeRestaurant = likeRestaurant;
        this.ipAddress = ipAddress;
    }

    public Boolean getLikeRestaurant() {
        return likeRestaurant;
    }

    public void setLikeRestaurant(Boolean likeRestaurant) {
        this.likeRestaurant = likeRestaurant;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
