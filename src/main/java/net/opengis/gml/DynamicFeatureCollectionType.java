//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicFeatureCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dynamicMembers"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "dynamicMembers"
})
public class DynamicFeatureCollectionType
    extends DynamicFeatureType
{

    @XmlElement(required = true)
    protected DynamicFeatureMemberType dynamicMembers;

    /**
     * Gets the value of the dynamicMembers property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public DynamicFeatureMemberType getDynamicMembers() {
        return dynamicMembers;
    }

    /**
     * Sets the value of the dynamicMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public void setDynamicMembers(DynamicFeatureMemberType value) {
        this.dynamicMembers = value;
    }

}
