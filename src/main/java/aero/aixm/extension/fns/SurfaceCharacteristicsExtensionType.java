//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm.extension.fns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractExtensionType;
import aero.aixm.CodeApronSectionType;
import aero.aixm.CodeCardinalDirectionType;
import aero.aixm.CodeRunwaySectionType;
import aero.aixm.CodeTaxiwaySectionType;
import aero.aixm.CodeYesNoType;
import aero.aixm.ValDistanceType;


/**
 * <p>Java class for SurfaceCharacteristicsExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceCharacteristicsExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractExtensionType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:us.gov.dot.faa.aim.fns}SurfaceCharacteristicsExtensionPropertyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceCharacteristicsExtensionType", propOrder = {
    "numerousDefects",
    "crackWidth",
    "crackDirection",
    "crackLength",
    "softEdges",
    "crackType",
    "affectedDistance",
    "cardinalDirection",
    "frostHeave",
    "soft",
    "irregularSurface",
    "runwayWarningSection",
    "apronWarningSection",
    "taxiwayWarningSection"
})
public class SurfaceCharacteristicsExtensionType
    extends AbstractExtensionType
{

    @XmlElementRef(name = "numerousDefects", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> numerousDefects;
    @XmlElementRef(name = "crackWidth", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> crackWidth;
    @XmlElementRef(name = "crackDirection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> crackDirection;
    @XmlElementRef(name = "crackLength", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> crackLength;
    @XmlElementRef(name = "softEdges", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> softEdges;
    @XmlElementRef(name = "crackType", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCrackType> crackType;
    @XmlElementRef(name = "affectedDistance", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> affectedDistance;
    @XmlElementRef(name = "cardinalDirection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCardinalDirectionType> cardinalDirection;
    @XmlElementRef(name = "frostHeave", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrostHeaveType> frostHeave;
    @XmlElementRef(name = "soft", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> soft;
    @XmlElementRef(name = "irregularSurface", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> irregularSurface;
    @XmlElementRef(name = "runwayWarningSection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeRunwaySectionType> runwayWarningSection;
    @XmlElementRef(name = "apronWarningSection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeApronSectionType> apronWarningSection;
    @XmlElementRef(name = "taxiwayWarningSection", namespace = "urn:us.gov.dot.faa.aim.fns", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeTaxiwaySectionType> taxiwayWarningSection;

    /**
     * Gets the value of the numerousDefects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getNumerousDefects() {
        return numerousDefects;
    }

    /**
     * Sets the value of the numerousDefects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setNumerousDefects(JAXBElement<CodeYesNoType> value) {
        this.numerousDefects = value;
    }

    /**
     * Gets the value of the crackWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getCrackWidth() {
        return crackWidth;
    }

    /**
     * Sets the value of the crackWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCrackWidth(JAXBElement<ValDistanceType> value) {
        this.crackWidth = value;
    }

    /**
     * Gets the value of the crackDirection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public JAXBElement<CodeCardinalDirectionType> getCrackDirection() {
        return crackDirection;
    }

    /**
     * Sets the value of the crackDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCardinalDirectionType }{@code >}
     *     
     */
    public void setCrackDirection(JAXBElement<CodeCardinalDirectionType> value) {
        this.crackDirection = value;
    }

    /**
     * Gets the value of the crackLength property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getCrackLength() {
        return crackLength;
    }

    /**
     * Sets the value of the crackLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setCrackLength(JAXBElement<ValDistanceType> value) {
        this.crackLength = value;
    }

    /**
     * Gets the value of the softEdges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSoftEdges() {
        return softEdges;
    }

    /**
     * Sets the value of the softEdges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSoftEdges(JAXBElement<CodeYesNoType> value) {
        this.softEdges = value;
    }

    /**
     * Gets the value of the crackType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCrackType }{@code >}
     *     
     */
    public JAXBElement<CodeCrackType> getCrackType() {
        return crackType;
    }

    /**
     * Sets the value of the crackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCrackType }{@code >}
     *     
     */
    public void setCrackType(JAXBElement<CodeCrackType> value) {
        this.crackType = value;
    }

    /**
     * Gets the value of the affectedDistance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getAffectedDistance() {
        return affectedDistance;
    }

    /**
     * Sets the value of the affectedDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setAffectedDistance(JAXBElement<ValDistanceType> value) {
        this.affectedDistance = value;
    }

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

    /**
     * Gets the value of the frostHeave property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrostHeaveType }{@code >}
     *     
     */
    public JAXBElement<CodeFrostHeaveType> getFrostHeave() {
        return frostHeave;
    }

    /**
     * Sets the value of the frostHeave property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrostHeaveType }{@code >}
     *     
     */
    public void setFrostHeave(JAXBElement<CodeFrostHeaveType> value) {
        this.frostHeave = value;
    }

    /**
     * Gets the value of the soft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSoft() {
        return soft;
    }

    /**
     * Sets the value of the soft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSoft(JAXBElement<CodeYesNoType> value) {
        this.soft = value;
    }

    /**
     * Gets the value of the irregularSurface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getIrregularSurface() {
        return irregularSurface;
    }

    /**
     * Sets the value of the irregularSurface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setIrregularSurface(JAXBElement<CodeYesNoType> value) {
        this.irregularSurface = value;
    }

    /**
     * Gets the value of the runwayWarningSection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwaySectionType }{@code >}
     *     
     */
    public JAXBElement<CodeRunwaySectionType> getRunwayWarningSection() {
        return runwayWarningSection;
    }

    /**
     * Sets the value of the runwayWarningSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeRunwaySectionType }{@code >}
     *     
     */
    public void setRunwayWarningSection(JAXBElement<CodeRunwaySectionType> value) {
        this.runwayWarningSection = value;
    }

    /**
     * Gets the value of the apronWarningSection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeApronSectionType }{@code >}
     *     
     */
    public JAXBElement<CodeApronSectionType> getApronWarningSection() {
        return apronWarningSection;
    }

    /**
     * Sets the value of the apronWarningSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeApronSectionType }{@code >}
     *     
     */
    public void setApronWarningSection(JAXBElement<CodeApronSectionType> value) {
        this.apronWarningSection = value;
    }

    /**
     * Gets the value of the taxiwayWarningSection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeTaxiwaySectionType }{@code >}
     *     
     */
    public JAXBElement<CodeTaxiwaySectionType> getTaxiwayWarningSection() {
        return taxiwayWarningSection;
    }

    /**
     * Sets the value of the taxiwayWarningSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeTaxiwaySectionType }{@code >}
     *     
     */
    public void setTaxiwayWarningSection(JAXBElement<CodeTaxiwaySectionType> value) {
        this.taxiwayWarningSection = value;
    }

}
