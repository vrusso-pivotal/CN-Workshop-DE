package io.pivotal.cloudnativespring.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="city")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String county;

    @Column(nullable = false)
    private String stateCode;

    @Column(nullable = false)
    private String postalCode;

    @Column
    private String latitude;

    @Column
    private String longitude;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPostalCode() { return postalCode; }

    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getStateCode() { return stateCode; }

    public void setStateCode(String stateCode) { this.stateCode = stateCode; }

    public String getCounty() { return county; }

    public void setCounty(String county) { this.county = county; }

    public String getLatitude() { return latitude; }

    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }

    public void setLongitude(String longitude) { this.longitude = longitude; }
}