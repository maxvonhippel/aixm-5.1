//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractAIXMObjectType;
import aero.aixm.AbstractExtensionType;
import aero.aixm.CodeUpperAlphaType;
import aero.aixm.DateTimeType;
import aero.aixm.DateYearType;
import aero.aixm.NoNumberType;
import aero.aixm.UnitPropertyType;


/**
 * <p>Java class for NOTAMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NOTAMType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}NOTAMPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMExtension"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NOTAMType", propOrder = {
    "series",
    "number",
    "year",
    "type",
    "issued",
    "referredSeries",
    "referredNumber",
    "referredYear",
    "affectedFIR",
    "selectionCode",
    "traffic",
    "purpose",
    "scope",
    "minimumFL",
    "maximumFL",
    "coordinates",
    "radius",
    "location",
    "effectiveStart",
    "effectiveEnd",
    "schedule",
    "text",
    "lowerLimit",
    "upperLimit",
    "publisherNOF",
    "translation",
    "extension"
})
public class NOTAMType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "series", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> series;
    @XmlElementRef(name = "number", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> number;
    @XmlElementRef(name = "year", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> year;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeNOTAMType> type;
    @XmlElementRef(name = "issued", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> issued;
    @XmlElementRef(name = "referredSeries", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeUpperAlphaType> referredSeries;
    @XmlElementRef(name = "referredNumber", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<NoNumberType> referredNumber;
    @XmlElementRef(name = "referredYear", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<DateYearType> referredYear;
    @XmlElementRef(name = "affectedFIR", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> affectedFIR;
    @XmlElementRef(name = "selectionCode", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> selectionCode;
    @XmlElementRef(name = "traffic", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> traffic;
    @XmlElementRef(name = "purpose", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> purpose;
    @XmlElementRef(name = "scope", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> scope;
    @XmlElementRef(name = "minimumFL", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> minimumFL;
    @XmlElementRef(name = "maximumFL", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> maximumFL;
    @XmlElementRef(name = "coordinates", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> coordinates;
    @XmlElementRef(name = "radius", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> radius;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> location;
    @XmlElementRef(name = "effectiveStart", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> effectiveStart;
    @XmlElementRef(name = "effectiveEnd", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> effectiveEnd;
    @XmlElementRef(name = "schedule", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> schedule;
    @XmlElementRef(name = "text", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> text;
    @XmlElementRef(name = "lowerLimit", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> lowerLimit;
    @XmlElementRef(name = "upperLimit", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNOTAMType> upperLimit;
    @XmlElementRef(name = "publisherNOF", namespace = "http://www.aixm.aero/schema/5.1/event", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> publisherNOF;
    @XmlElement(nillable = true)
    protected List<NOTAMTranslationPropertyType> translation;
    protected List<NOTAMType.Extension> extension;

    /**
     * Gets the value of the series property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getSeries() {
        return series;
    }

    /**
     * Sets the value of the series property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setSeries(JAXBElement<CodeUpperAlphaType> value) {
        this.series = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setNumber(JAXBElement<NoNumberType> value) {
        this.number = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setYear(JAXBElement<DateYearType> value) {
        this.year = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMType }{@code >}
     *     
     */
    public JAXBElement<CodeNOTAMType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeNOTAMType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeNOTAMType> value) {
        this.type = value;
    }

    /**
     * Gets the value of the issued property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getIssued() {
        return issued;
    }

    /**
     * Sets the value of the issued property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setIssued(JAXBElement<DateTimeType> value) {
        this.issued = value;
    }

    /**
     * Gets the value of the referredSeries property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public JAXBElement<CodeUpperAlphaType> getReferredSeries() {
        return referredSeries;
    }

    /**
     * Sets the value of the referredSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeUpperAlphaType }{@code >}
     *     
     */
    public void setReferredSeries(JAXBElement<CodeUpperAlphaType> value) {
        this.referredSeries = value;
    }

    /**
     * Gets the value of the referredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public JAXBElement<NoNumberType> getReferredNumber() {
        return referredNumber;
    }

    /**
     * Sets the value of the referredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoNumberType }{@code >}
     *     
     */
    public void setReferredNumber(JAXBElement<NoNumberType> value) {
        this.referredNumber = value;
    }

    /**
     * Gets the value of the referredYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public JAXBElement<DateYearType> getReferredYear() {
        return referredYear;
    }

    /**
     * Sets the value of the referredYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateYearType }{@code >}
     *     
     */
    public void setReferredYear(JAXBElement<DateYearType> value) {
        this.referredYear = value;
    }

    /**
     * Gets the value of the affectedFIR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getAffectedFIR() {
        return affectedFIR;
    }

    /**
     * Sets the value of the affectedFIR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setAffectedFIR(JAXBElement<TextNOTAMType> value) {
        this.affectedFIR = value;
    }

    /**
     * Gets the value of the selectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getSelectionCode() {
        return selectionCode;
    }

    /**
     * Sets the value of the selectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setSelectionCode(JAXBElement<TextNOTAMType> value) {
        this.selectionCode = value;
    }

    /**
     * Gets the value of the traffic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getTraffic() {
        return traffic;
    }

    /**
     * Sets the value of the traffic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setTraffic(JAXBElement<TextNOTAMType> value) {
        this.traffic = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setPurpose(JAXBElement<TextNOTAMType> value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setScope(JAXBElement<TextNOTAMType> value) {
        this.scope = value;
    }

    /**
     * Gets the value of the minimumFL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getMinimumFL() {
        return minimumFL;
    }

    /**
     * Sets the value of the minimumFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setMinimumFL(JAXBElement<TextNOTAMType> value) {
        this.minimumFL = value;
    }

    /**
     * Gets the value of the maximumFL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getMaximumFL() {
        return maximumFL;
    }

    /**
     * Sets the value of the maximumFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setMaximumFL(JAXBElement<TextNOTAMType> value) {
        this.maximumFL = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setCoordinates(JAXBElement<TextNOTAMType> value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setRadius(JAXBElement<TextNOTAMType> value) {
        this.radius = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<TextNOTAMType> value) {
        this.location = value;
    }

    /**
     * Gets the value of the effectiveStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getEffectiveStart() {
        return effectiveStart;
    }

    /**
     * Sets the value of the effectiveStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setEffectiveStart(JAXBElement<TextNOTAMType> value) {
        this.effectiveStart = value;
    }

    /**
     * Gets the value of the effectiveEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getEffectiveEnd() {
        return effectiveEnd;
    }

    /**
     * Sets the value of the effectiveEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setEffectiveEnd(JAXBElement<TextNOTAMType> value) {
        this.effectiveEnd = value;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setSchedule(JAXBElement<TextNOTAMType> value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setText(JAXBElement<TextNOTAMType> value) {
        this.text = value;
    }

    /**
     * Gets the value of the lowerLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getLowerLimit() {
        return lowerLimit;
    }

    /**
     * Sets the value of the lowerLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setLowerLimit(JAXBElement<TextNOTAMType> value) {
        this.lowerLimit = value;
    }

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public JAXBElement<TextNOTAMType> getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNOTAMType }{@code >}
     *     
     */
    public void setUpperLimit(JAXBElement<TextNOTAMType> value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the publisherNOF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnitPropertyType> getPublisherNOF() {
        return publisherNOF;
    }

    /**
     * Sets the value of the publisherNOF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setPublisherNOF(JAXBElement<UnitPropertyType> value) {
        this.publisherNOF = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOTAMTranslationPropertyType }
     * 
     * 
     */
    public List<NOTAMTranslationPropertyType> getTranslation() {
        if (translation == null) {
            translation = new ArrayList<NOTAMTranslationPropertyType>();
        }
        return this.translation;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NOTAMType.Extension }
     * 
     * 
     */
    public List<NOTAMType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<NOTAMType.Extension>();
        }
        return this.extension;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1/event}AbstractNOTAMExtension"/>
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
    @XmlType(name = "", propOrder = {
        "abstractNOTAMExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractNOTAMExtension", required = true)
        protected AbstractExtensionType abstractNOTAMExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractNOTAMExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractNOTAMExtension() {
            return abstractNOTAMExtension;
        }

        /**
         * Sets the value of the abstractNOTAMExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractNOTAMExtension(AbstractExtensionType value) {
            this.abstractNOTAMExtension = value;
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

}
