//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.extension.fns.SurfaceContaminationExtensionType;


/**
 * <p>Java class for TaxiwayContaminationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxiwayContaminationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}SurfaceContaminationPropertyGroup"/>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}TaxiwayContaminationPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTaxiwayContaminationExtension"/>
 *                 &lt;/choice>
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
@XmlType(name = "TaxiwayContaminationType", propOrder = {
    "observationTime",
    "depth",
    "frictionCoefficient",
    "frictionEstimation",
    "frictionDevice",
    "obscuredLights",
    "furtherClearanceTime",
    "furtherTotalClearance",
    "nextObservationTime",
    "proportion",
    "criticalRidge",
    "layer",
    "annotation",
    "clearedWidth",
    "extension"
})
public class TaxiwayContaminationType
    extends AbstractSurfaceContaminationType
{

    @XmlElementRef(name = "observationTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> observationTime;
    @XmlElementRef(name = "depth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDepthType> depth;
    @XmlElementRef(name = "frictionCoefficient", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFrictionType> frictionCoefficient;
    @XmlElementRef(name = "frictionEstimation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionEstimateType> frictionEstimation;
    @XmlElementRef(name = "frictionDevice", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFrictionDeviceType> frictionDevice;
    @XmlElementRef(name = "obscuredLights", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> obscuredLights;
    @XmlElementRef(name = "furtherClearanceTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeType> furtherClearanceTime;
    @XmlElementRef(name = "furtherTotalClearance", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> furtherTotalClearance;
    @XmlElementRef(name = "nextObservationTime", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DateTimeType> nextObservationTime;
    @XmlElementRef(name = "proportion", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValPercentType> proportion;
    @XmlElement(nillable = true)
    protected List<RidgePropertyType> criticalRidge;
    @XmlElement(nillable = true)
    protected List<SurfaceContaminationLayerPropertyType> layer;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "clearedWidth", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> clearedWidth;
    protected List<TaxiwayContaminationType.Extension> extension;

    /**
     * Gets the value of the observationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getObservationTime() {
        return observationTime;
    }

    /**
     * Sets the value of the observationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setObservationTime(JAXBElement<DateTimeType> value) {
        this.observationTime = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public JAXBElement<ValDepthType> getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDepthType }{@code >}
     *     
     */
    public void setDepth(JAXBElement<ValDepthType> value) {
        this.depth = value;
    }

    /**
     * Gets the value of the frictionCoefficient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    public JAXBElement<ValFrictionType> getFrictionCoefficient() {
        return frictionCoefficient;
    }

    /**
     * Sets the value of the frictionCoefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFrictionType }{@code >}
     *     
     */
    public void setFrictionCoefficient(JAXBElement<ValFrictionType> value) {
        this.frictionCoefficient = value;
    }

    /**
     * Gets the value of the frictionEstimation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    public JAXBElement<CodeFrictionEstimateType> getFrictionEstimation() {
        return frictionEstimation;
    }

    /**
     * Sets the value of the frictionEstimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionEstimateType }{@code >}
     *     
     */
    public void setFrictionEstimation(JAXBElement<CodeFrictionEstimateType> value) {
        this.frictionEstimation = value;
    }

    /**
     * Gets the value of the frictionDevice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    public JAXBElement<CodeFrictionDeviceType> getFrictionDevice() {
        return frictionDevice;
    }

    /**
     * Sets the value of the frictionDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFrictionDeviceType }{@code >}
     *     
     */
    public void setFrictionDevice(JAXBElement<CodeFrictionDeviceType> value) {
        this.frictionDevice = value;
    }

    /**
     * Gets the value of the obscuredLights property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getObscuredLights() {
        return obscuredLights;
    }

    /**
     * Sets the value of the obscuredLights property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setObscuredLights(JAXBElement<CodeYesNoType> value) {
        this.obscuredLights = value;
    }

    /**
     * Gets the value of the furtherClearanceTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public JAXBElement<TimeType> getFurtherClearanceTime() {
        return furtherClearanceTime;
    }

    /**
     * Sets the value of the furtherClearanceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeType }{@code >}
     *     
     */
    public void setFurtherClearanceTime(JAXBElement<TimeType> value) {
        this.furtherClearanceTime = value;
    }

    /**
     * Gets the value of the furtherTotalClearance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFurtherTotalClearance() {
        return furtherTotalClearance;
    }

    /**
     * Sets the value of the furtherTotalClearance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFurtherTotalClearance(JAXBElement<CodeYesNoType> value) {
        this.furtherTotalClearance = value;
    }

    /**
     * Gets the value of the nextObservationTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public JAXBElement<DateTimeType> getNextObservationTime() {
        return nextObservationTime;
    }

    /**
     * Sets the value of the nextObservationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DateTimeType }{@code >}
     *     
     */
    public void setNextObservationTime(JAXBElement<DateTimeType> value) {
        this.nextObservationTime = value;
    }

    /**
     * Gets the value of the proportion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    public JAXBElement<ValPercentType> getProportion() {
        return proportion;
    }

    /**
     * Sets the value of the proportion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValPercentType }{@code >}
     *     
     */
    public void setProportion(JAXBElement<ValPercentType> value) {
        this.proportion = value;
    }

    /**
     * Gets the value of the criticalRidge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criticalRidge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriticalRidge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RidgePropertyType }
     * 
     * 
     */
    public List<RidgePropertyType> getCriticalRidge() {
        if (criticalRidge == null) {
            criticalRidge = new ArrayList<RidgePropertyType>();
        }
        return this.criticalRidge;
    }

    /**
     * Gets the value of the layer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the layer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurfaceContaminationLayerPropertyType }
     * 
     * 
     */
    public List<SurfaceContaminationLayerPropertyType> getLayer() {
        if (layer == null) {
            layer = new ArrayList<SurfaceContaminationLayerPropertyType>();
        }
        return this.layer;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the clearedWidth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getClearedWidth() {
        return clearedWidth;
    }

    /**
     * Sets the value of the clearedWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setClearedWidth(JAXBElement<ValDistanceType> value) {
        this.clearedWidth = value;
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
     * {@link TaxiwayContaminationType.Extension }
     * 
     * 
     */
    public List<TaxiwayContaminationType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<TaxiwayContaminationType.Extension>();
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
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractSurfaceContaminationExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTaxiwayContaminationExtension"/>
     *       &lt;/choice>
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
        "abstractSurfaceContaminationExtension",
        "abstractTaxiwayContaminationExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractSurfaceContaminationExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractSurfaceContaminationExtension;
        @XmlElement(name = "AbstractTaxiwayContaminationExtension")
        protected AbstractExtensionType abstractTaxiwayContaminationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractSurfaceContaminationExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link SurfaceContaminationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractSurfaceContaminationExtension() {
            return abstractSurfaceContaminationExtension;
        }

        /**
         * Sets the value of the abstractSurfaceContaminationExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link SurfaceContaminationExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractSurfaceContaminationExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractSurfaceContaminationExtension = value;
        }

        /**
         * Gets the value of the abstractTaxiwayContaminationExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractTaxiwayContaminationExtension() {
            return abstractTaxiwayContaminationExtension;
        }

        /**
         * Sets the value of the abstractTaxiwayContaminationExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractTaxiwayContaminationExtension(AbstractExtensionType value) {
            this.abstractTaxiwayContaminationExtension = value;
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
