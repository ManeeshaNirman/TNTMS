/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Maneesha Nirman
 */
@Entity
@Table(name = "data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Data.findAll", query = "SELECT d FROM Data d")
    , @NamedQuery(name = "Data.findByTrackId", query = "SELECT d FROM Data d WHERE d.trackId = :trackId")
    , @NamedQuery(name = "Data.findByTrainName", query = "SELECT d FROM Data d WHERE d.trainName = :trainName")
    , @NamedQuery(name = "Data.findByLocation", query = "SELECT d FROM Data d WHERE d.location = :location")
    , @NamedQuery(name = "Data.findBySpeed", query = "SELECT d FROM Data d WHERE d.speed = :speed")
    , @NamedQuery(name = "Data.findByTemperature", query = "SELECT d FROM Data d WHERE d.temperature = :temperature")
    , @NamedQuery(name = "Data.findByHuminity", query = "SELECT d FROM Data d WHERE d.huminity = :huminity")
    , @NamedQuery(name = "Data.findByDate", query = "SELECT d FROM Data d WHERE d.date = :date")
    , @NamedQuery(name = "Data.findByTime", query = "SELECT d FROM Data d WHERE d.time = :time")})
public class Data implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trackId")
    private Integer trackId;
    @Size(max = 100)
    @Column(name = "trainName")
    private String trainName;
    @Size(max = 45)
    @Column(name = "location")
    private String location;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "speed")
    private Double speed;
    @Column(name = "temperature")
    private Double temperature;
    @Size(max = 45)
    @Column(name = "huminity")
    private String huminity;
    @Size(max = 45)
    @Column(name = "date")
    private String date;
    @Size(max = 45)
    @Column(name = "time")
    private String time;

    public Data() {
    }

    public Data(Integer trackId) {
        this.trackId = trackId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getHuminity() {
        return huminity;
    }

    public void setHuminity(String huminity) {
        this.huminity = huminity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackId != null ? trackId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Data)) {
            return false;
        }
        Data other = (Data) object;
        if ((this.trackId == null && other.trackId != null) || (this.trackId != null && !this.trackId.equals(other.trackId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Data[ trackId=" + trackId + " ]";
    }
    
}
