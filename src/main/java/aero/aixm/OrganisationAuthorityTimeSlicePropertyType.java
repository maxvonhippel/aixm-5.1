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
 * <p>Java class for OrganisationAuthorityTimeSlicePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationAuthorityTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}OrganisationAuthorityTimeSlice"/>
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
@XmlType(name = "OrganisationAuthorityTimeSlicePropertyType", propOrder = {
    "organisationAuthorityTimeSlice"
})
public class OrganisationAuthorityTimeSlicePropertyType {

    @XmlElement(name = "OrganisationAuthorityTimeSlice", required = true)
    protected OrganisationAuthorityTimeSliceType organisationAuthorityTimeSlice;
    @XmlAttribute(name = "owns")
    protected Boolean owns;

    /**
     * Gets the value of the organisationAuthorityTimeSlice property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationAuthorityTimeSliceType }
     *     
     */
    public OrganisationAuthorityTimeSliceType getOrganisationAuthorityTimeSlice() {
        return organisationAuthorityTimeSlice;
    }

    /**
     * Sets the value of the organisationAuthorityTimeSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationAuthorityTimeSliceType }
     *     
     */
    public void setOrganisationAuthorityTimeSlice(OrganisationAuthorityTimeSliceType value) {
        this.organisationAuthorityTimeSlice = value;
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
