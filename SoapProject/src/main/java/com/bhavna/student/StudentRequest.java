//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.02.24 at 08:03:12 PM IST 
//


package com.bhavna.student;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rollNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="teluguMarks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hindiMarks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="englishMarks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mathsMarks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maximumTotalMarks" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rollNo",
    "studentName",
    "teluguMarks",
    "hindiMarks",
    "englishMarks",
    "mathsMarks",
    "maximumTotalMarks"
})
@XmlRootElement(name = "StudentRequest")
public class StudentRequest {

    protected int rollNo;
    @XmlElement(required = true)
    protected String studentName;
    protected double teluguMarks;
    protected double hindiMarks;
    protected double englishMarks;
    protected double mathsMarks;
    protected double maximumTotalMarks;

    /**
     * Gets the value of the rollNo property.
     * 
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * Sets the value of the rollNo property.
     * 
     */
    public void setRollNo(int value) {
        this.rollNo = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the teluguMarks property.
     * 
     */
    public double getTeluguMarks() {
        return teluguMarks;
    }

    /**
     * Sets the value of the teluguMarks property.
     * 
     */
    public void setTeluguMarks(double value) {
        this.teluguMarks = value;
    }

    /**
     * Gets the value of the hindiMarks property.
     * 
     */
    public double getHindiMarks() {
        return hindiMarks;
    }

    /**
     * Sets the value of the hindiMarks property.
     * 
     */
    public void setHindiMarks(double value) {
        this.hindiMarks = value;
    }

    /**
     * Gets the value of the englishMarks property.
     * 
     */
    public double getEnglishMarks() {
        return englishMarks;
    }

    /**
     * Sets the value of the englishMarks property.
     * 
     */
    public void setEnglishMarks(double value) {
        this.englishMarks = value;
    }

    /**
     * Gets the value of the mathsMarks property.
     * 
     */
    public double getMathsMarks() {
        return mathsMarks;
    }

    /**
     * Sets the value of the mathsMarks property.
     * 
     */
    public void setMathsMarks(double value) {
        this.mathsMarks = value;
    }

    /**
     * Gets the value of the maximumTotalMarks property.
     * 
     */
    public double getMaximumTotalMarks() {
        return maximumTotalMarks;
    }

    /**
     * Sets the value of the maximumTotalMarks property.
     * 
     */
    public void setMaximumTotalMarks(double value) {
        this.maximumTotalMarks = value;
    }

}
