package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

/**
 * Created by user on 7/8/2016.
 */@Table(name="locations")
public class Location {
    @Id(name = "location_id")
        private Long id;

    @Column(name = "street_address")
        private String streetAdress;

    @Column(name = "postal_code")
        private String postalCode;

    @Column(name = "city")
        private String city;

    @Column(name = "state_province")
        private String stateProvince;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Location)
            if(id == ((Location)obj).getId())
                return true;
        return false;
    }

    @Override
    public String toString() {
        return "id: " + id + "; "+ "streetAdress: " + streetAdress + "; "+ "postalCode: " + postalCode + "; " +  "city: " + city + "; "+ "stateProvince: " + stateProvince + "; ";
    }
}
