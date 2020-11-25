//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm.extension.fns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractExtensionType;


/**
 * <p>Java class for RidgeExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RidgeExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractExtensionType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us.gov.dot.faa.aim.fns}RidgeExtensionPropertyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RidgeExtensionType", propOrder = {
    "ridgeType"
})
public class RidgeExtensionType
    extends AbstractExtensionType
{

    @XmlElementRef(name = "ridgeType", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRidgeType> ridgeType;

    /**
     * Gets the value of the ridgeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRidgeType }{@code >}
     *     
     */
    public JAXBElement<CodeRidgeType> getRidgeType() {
        return ridgeType;
    }

    /**
     * Sets the value of the ridgeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRidgeType }{@code >}
     *     
     */
    public void setRidgeType(JAXBElement<CodeRidgeType> value) {
        this.ridgeType = value;
    }

    public boolean isSetRidgeType() {
        return (this.ridgeType!= null);
    }

}
