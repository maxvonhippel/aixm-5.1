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
 * <p>Java class for AuthorityForNavaidEquipmentPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorityForNavaidEquipmentPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AuthorityForNavaidEquipment"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityForNavaidEquipmentPropertyType", propOrder = {
    "authorityForNavaidEquipment"
})
public class AuthorityForNavaidEquipmentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AuthorityForNavaidEquipment", required = true)
    protected AuthorityForNavaidEquipmentType authorityForNavaidEquipment;

    /**
     * Gets the value of the authorityForNavaidEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    public AuthorityForNavaidEquipmentType getAuthorityForNavaidEquipment() {
        return authorityForNavaidEquipment;
    }

    /**
     * Sets the value of the authorityForNavaidEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityForNavaidEquipmentType }
     *     
     */
    public void setAuthorityForNavaidEquipment(AuthorityForNavaidEquipmentType value) {
        this.authorityForNavaidEquipment = value;
    }

}
