//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadioFrequencyAreaTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioFrequencyAreaTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}RadioFrequencyAreaTimeSlice"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioFrequencyAreaTimeSlicePropertyType", propOrder = {
    "radioFrequencyAreaTimeSlice"
})
public class RadioFrequencyAreaTimeSlicePropertyType {

    @XmlElement(name = "RadioFrequencyAreaTimeSlice", required = true)
    protected RadioFrequencyAreaTimeSliceType radioFrequencyAreaTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the radioFrequencyAreaTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link RadioFrequencyAreaTimeSliceType }
     *     
     */
    public RadioFrequencyAreaTimeSliceType getRadioFrequencyAreaTimeSlice() {
        return radioFrequencyAreaTimeSlice;
    }

    /**
     * Sets the value of the radioFrequencyAreaTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioFrequencyAreaTimeSliceType }
     *     
     */
    public void setRadioFrequencyAreaTimeSlice(RadioFrequencyAreaTimeSliceType value) {
        this.radioFrequencyAreaTimeSlice = value;
    }

    /**
     * Gets the value of the owns property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * Sets the value of the owns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwns(Boolean value) {
        this.owns = value;
    }

}
