//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxiwayMarkingTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxiwayMarkingTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}TaxiwayMarkingTimeSlice"/>
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
@XmlType(name = "TaxiwayMarkingTimeSlicePropertyType", propOrder = {
    "taxiwayMarkingTimeSlice"
})
public class TaxiwayMarkingTimeSlicePropertyType {

    @XmlElement(name = "TaxiwayMarkingTimeSlice", required = true)
    protected TaxiwayMarkingTimeSliceType taxiwayMarkingTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the taxiwayMarkingTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link TaxiwayMarkingTimeSliceType }
     *     
     */
    public TaxiwayMarkingTimeSliceType getTaxiwayMarkingTimeSlice() {
        return taxiwayMarkingTimeSlice;
    }

    /**
     * Sets the value of the taxiwayMarkingTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxiwayMarkingTimeSliceType }
     *     
     */
    public void setTaxiwayMarkingTimeSlice(TaxiwayMarkingTimeSliceType value) {
        this.taxiwayMarkingTimeSlice = value;
    }

    public boolean isSetTaxiwayMarkingTimeSlice() {
        return (this.taxiwayMarkingTimeSlice!= null);
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
    public void setOwns(boolean value) {
        this.owns = value;
    }

    public boolean isSetOwns() {
        return (this.owns!= null);
    }

    public void unsetOwns() {
        this.owns = null;
    }

}
