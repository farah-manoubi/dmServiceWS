
package com.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Fri Apr 16 17:22:06 CEST 2021
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getPoliticianByCountry", namespace = "http://service.webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPoliticianByCountry", namespace = "http://service.webservice.com/")

public class GetPoliticianByCountry {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}
