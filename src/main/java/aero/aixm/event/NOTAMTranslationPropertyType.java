//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMPropertyType;


/**
 * <p>Java class for NOTAMTranslationPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOTAMTranslationPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}NOTAMTranslation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOTAMTranslationPropertyType", propOrder = {
    "notamTranslation"
})
public class NOTAMTranslationPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NOTAMTranslation", required = true)
    protected NOTAMTranslationType notamTranslation;

    /**
     * Gets the value of the notamTranslation property.
     * 
     * @return
     *     possible object is
     *     {@link NOTAMTranslationType }
     *     
     */
    public NOTAMTranslationType getNOTAMTranslation() {
        return notamTranslation;
    }

    /**
     * Sets the value of the notamTranslation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOTAMTranslationType }
     *     
     */
    public void setNOTAMTranslation(NOTAMTranslationType value) {
        this.notamTranslation = value;
    }

}
