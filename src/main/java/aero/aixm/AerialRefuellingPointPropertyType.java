//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AerialRefuellingPointPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AerialRefuellingPointPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AerialRefuellingPoint"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerialRefuellingPointPropertyType", propOrder = {
    "aerialRefuellingPoint"
})
public class AerialRefuellingPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AerialRefuellingPoint", required = true)
    protected AerialRefuellingPointType aerialRefuellingPoint;

    /**
     * Gets the value of the aerialRefuellingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    public AerialRefuellingPointType getAerialRefuellingPoint() {
        return aerialRefuellingPoint;
    }

    /**
     * Sets the value of the aerialRefuellingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerialRefuellingPointType }
     *     
     */
    public void setAerialRefuellingPoint(AerialRefuellingPointType value) {
        this.aerialRefuellingPoint = value;
    }

}
