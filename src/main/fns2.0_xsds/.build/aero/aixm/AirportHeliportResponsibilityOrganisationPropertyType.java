//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportHeliportResponsibilityOrganisationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportHeliportResponsibilityOrganisationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AirportHeliportResponsibilityOrganisation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportHeliportResponsibilityOrganisationPropertyType", propOrder = {
    "airportHeliportResponsibilityOrganisation"
})
public class AirportHeliportResponsibilityOrganisationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirportHeliportResponsibilityOrganisation", required = true)
    protected AirportHeliportResponsibilityOrganisationType airportHeliportResponsibilityOrganisation;

    /**
     * Gets the value of the airportHeliportResponsibilityOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportResponsibilityOrganisationType }
     *     
     */
    public AirportHeliportResponsibilityOrganisationType getAirportHeliportResponsibilityOrganisation() {
        return airportHeliportResponsibilityOrganisation;
    }

    /**
     * Sets the value of the airportHeliportResponsibilityOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportResponsibilityOrganisationType }
     *     
     */
    public void setAirportHeliportResponsibilityOrganisation(AirportHeliportResponsibilityOrganisationType value) {
        this.airportHeliportResponsibilityOrganisation = value;
    }

    public boolean isSetAirportHeliportResponsibilityOrganisation() {
        return (this.airportHeliportResponsibilityOrganisation!= null);
    }

}
