
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

@XmlRootElement(name = "addPolitician", namespace = "http://service.webservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPolitician", namespace = "http://service.webservice.com/", propOrder = {"arg0", "arg1", "arg2", "arg3"})

public class AddPolitician {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;
    @XmlElement(name = "arg1")
    private int arg1;
    @XmlElement(name = "arg2")
    private int arg2;
    @XmlElement(name = "arg3")
    private java.lang.String arg3;

    public java.lang.String getArg0() {
        return this.arg0;
    }   

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

    public int getArg1() {
        return this.arg1;
    }

    public void setArg1(int newArg1)  {
        this.arg1 = newArg1;
    }

    public int getArg2() {
        return this.arg2;
    }

    public void setArg2(int newArg2)  {
        this.arg2 = newArg2;
    }

    public java.lang.String getArg3() {
        return this.arg3;
    }

    public void setArg3(java.lang.String newArg3)  {
        this.arg3 = newArg3;
    }

}

