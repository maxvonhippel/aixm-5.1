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
 * <p>Java class for OrganisationAuthorityAssociationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationAuthorityAssociationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}OrganisationAuthorityAssociation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationAuthorityAssociationPropertyType", propOrder = {
    "organisationAuthorityAssociation"
})
public class OrganisationAuthorityAssociationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "OrganisationAuthorityAssociation", required = true)
    protected OrganisationAuthorityAssociationType organisationAuthorityAssociation;

    /**
     * Gets the value of the organisationAuthorityAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    public OrganisationAuthorityAssociationType getOrganisationAuthorityAssociation() {
        return organisationAuthorityAssociation;
    }

    /**
     * Sets the value of the organisationAuthorityAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationAuthorityAssociationType }
     *     
     */
    public void setOrganisationAuthorityAssociation(OrganisationAuthorityAssociationType value) {
        this.organisationAuthorityAssociation = value;
    }

}
