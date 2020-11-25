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
import aero.aixm.CodeCardinalDirectionType;
import aero.aixm.ValDistanceType;


/**
 * <p>Java class for SurfaceContaminationLayerExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceContaminationLayerExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractExtensionType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us.gov.dot.faa.aim.fns}SurfaceContaminationLayerExtensionPropertyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceContaminationLayerExtensionType", propOrder = {
    "cardinalDirection",
    "contaminantLength"
})
public class SurfaceContaminationLayerExtensionType
    extends AbstractExtensionType
{

    @XmlElementRef(name = "cardinalDirection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElementRef(name = "contaminantLength", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> contaminantLength;

    /**
     * Gets the value of the cardinalDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeCardinalDirectionType> getCardinalDirection() {
        return cardinalDirection;
    }

    /**
     * Sets the value of the cardinalDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setCardinalDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.cardinalDirection = value;
    }

    public boolean isSetCardinalDirection() {
        return (this.cardinalDirection!= null);
    }

    /**
     * Gets the value of the contaminantLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getContaminantLength() {
        return contaminantLength;
    }

    /**
     * Sets the value of the contaminantLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setContaminantLength(JAXBElement<ValDistanceType> value) {
        this.contaminantLength = value;
    }

    public boolean isSetContaminantLength() {
        return (this.contaminantLength!= null);
    }

}
