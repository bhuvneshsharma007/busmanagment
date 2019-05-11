package Bean;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Bus implements Serializable{
    @Id
    @GeneratedValue
    private long b_id;
    @Column(unique=true)
    private String BusNo;
    private String BusRoute;
    private String BusTime;
    private String DriverName;
    private String DriverContact;
    
    public Bus(){
        
    }

    public Bus(String BusNo, String BusRoute, String BusTime, String DriverName, String DriverContact) {
        
        this.BusNo = BusNo;
        this.BusRoute = BusRoute;
        this.BusTime = BusTime;
        this.DriverName = DriverName;
        this.DriverContact = DriverContact;
    }
    
    public long getB_id() {
        return b_id;
    }

    public void setB_id(long b_id) {
        this.b_id = b_id;
    }

    public String getBusNo() {
        return BusNo;
    }

    public void setBusNo(String BusNo) {
        this.BusNo = BusNo;
    }

    public String getBusRoute() {
        return BusRoute;
    }

    public void setBusRoute(String BusRoute) {
        this.BusRoute = BusRoute;
    }

    public String getBusTime() {
        return BusTime;
    }

    public void setBusTime(String BusTime) {
        this.BusTime = BusTime;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String DriverName) {
        this.DriverName = DriverName;
    }

    public String getDriverContact() {
        return DriverContact;
    }

    public void setDriverContact(String DriverContact) {
        this.DriverContact = DriverContact;
    }
 }