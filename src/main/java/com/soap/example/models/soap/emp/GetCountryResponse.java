package com.soap.example.models.soap.emp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
   "country"
})
@XmlRootElement(name = "getCountryResponse")

public class GetCountryResponse {

	@XmlElement(required = true)
   public Country country;
	
	public Country getCountry() {
        return country;
     
    }
	
	public void setCountry(Country value) {
		this.country = value;
	}
}



