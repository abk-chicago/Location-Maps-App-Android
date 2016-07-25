package org.codeforcoffee.locationsmapsapp;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by codeforcoffee on 7/24/16.
 */
public class LocationModel {

    LocationModel(JSONObject Json) throws JSONException, MalformedURLException {

        for(int i = 0; i< Json.names().length(); i++){
            String key = Json.names().getString(i);
            String val =  Json.get(Json.names().getString(i)).toString();

            switch (key) {
                case "city":
                    this.City = val;
                    break;
                case "name":
                    this.Name = val;
                    break;
                case "website_url":
                    this.Url = val;
                    break;
                case "id":
                    this.Id = new Integer(val);
                    break;
                case "address":
                    this.Address = val;
                    break;
                case "state":
                    this.State = val;
                    break;
                case "zipcode":
                    this.ZipCode = val;
                    break;
                case "latitude":
                    if (val != null && val != "null" && val.length() > 0) {
                        this.Latitude = new Double(val);
                    }
                    break;
                case "longitude":
                    if (val != null && val != "null"  && val.length() > 0) {
                        this.Longitude = new Double(val);
                    }
                    break;
                case "photo":
                    this.Photo = val;
                    break;
                case "email":
                    this.Email = val;
                    break;
            }
        }
    }

    // public information
    public Integer Id;
    public String City;
    public String Name;
    public String Url;
    public String Address;
    public String State;
    public String ZipCode;
    public Double Latitude;
    public Double Longitude;
    public String Photo;
    public String Email;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
