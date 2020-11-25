//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
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


/**
 * <p>Java class for VerticalStructurePartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalStructurePartType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}PropertiesWithSchedulePropertyGroup"/>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}VerticalStructurePartPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructurePartExtension"/>
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
@XmlType(name = "VerticalStructurePartType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "verticalExtent",
    "verticalExtentAccuracy",
    "type",
    "constructionStatus",
    "markingPattern",
    "markingFirstColour",
    "markingSecondColour",
    "mobile",
    "frangible",
    "visibleMaterial",
    "designator",
    "horizontalProjectionLocation",
    "horizontalProjectionLinearExtent",
    "horizontalProjectionSurfaceExtent",
    "lighting",
    "extension"
})
public class VerticalStructurePartType
    extends AbstractPropertiesWithScheduleType
{

    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "verticalExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtent;
    @XmlElementRef(name = "verticalExtentAccuracy", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalExtentAccuracy;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureType> type;
    @XmlElementRef(name = "constructionStatus", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeStatusConstructionType> constructionStatus;
    @XmlElementRef(name = "markingPattern", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMarkingType> markingPattern;
    @XmlElementRef(name = "markingFirstColour", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingFirstColour;
    @XmlElementRef(name = "markingSecondColour", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeColourType> markingSecondColour;
    @XmlElementRef(name = "mobile", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> mobile;
    @XmlElementRef(name = "frangible", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> frangible;
    @XmlElementRef(name = "visibleMaterial", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalStructureMaterialType> visibleMaterial;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextDesignatorType> designator;
    @XmlElementRef(name = "horizontalProjection_location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> horizontalProjectionLocation;
    @XmlElementRef(name = "horizontalProjection_linearExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedCurvePropertyType> horizontalProjectionLinearExtent;
    @XmlElementRef(name = "horizontalProjection_surfaceExtent", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedSurfacePropertyType> horizontalProjectionSurfaceExtent;
    @XmlElement(nillable = true)
    protected List<LightElementPropertyType> lighting;
    protected List<VerticalStructurePartType.Extension> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<TimesheetPropertyType>();
        }
        return this.timeInterval;
    }

    public boolean isSetTimeInterval() {
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
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

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<OrganisationAuthorityPropertyType>();
        }
        return this.specialDateAuthority;
    }

    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the verticalExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalExtent() {
        return verticalExtent;
    }

    /**
     * Sets the value of the verticalExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtent(JAXBElement<ValDistanceType> value) {
        this.verticalExtent = value;
    }

    public boolean isSetVerticalExtent() {
        return (this.verticalExtent!= null);
    }

    /**
     * Gets the value of the verticalExtentAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalExtentAccuracy() {
        return verticalExtentAccuracy;
    }

    /**
     * Sets the value of the verticalExtentAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalExtentAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalExtentAccuracy = value;
    }

    public boolean isSetVerticalExtentAccuracy() {
        return (this.verticalExtentAccuracy!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeVerticalStructureType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the constructionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    public JAXBElement<CodeStatusConstructionType> getConstructionStatus() {
        return constructionStatus;
    }

    /**
     * Sets the value of the constructionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeStatusConstructionType }{@code >}
     *     
     */
    public void setConstructionStatus(JAXBElement<CodeStatusConstructionType> value) {
        this.constructionStatus = value;
    }

    public boolean isSetConstructionStatus() {
        return (this.constructionStatus!= null);
    }

    /**
     * Gets the value of the markingPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureMarkingType> getMarkingPattern() {
        return markingPattern;
    }

    /**
     * Sets the value of the markingPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMarkingType }{@code >}
     *     
     */
    public void setMarkingPattern(JAXBElement<CodeVerticalStructureMarkingType> value) {
        this.markingPattern = value;
    }

    public boolean isSetMarkingPattern() {
        return (this.markingPattern!= null);
    }

    /**
     * Gets the value of the markingFirstColour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public JAXBElement<CodeColourType> getMarkingFirstColour() {
        return markingFirstColour;
    }

    /**
     * Sets the value of the markingFirstColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingFirstColour(JAXBElement<CodeColourType> value) {
        this.markingFirstColour = value;
    }

    public boolean isSetMarkingFirstColour() {
        return (this.markingFirstColour!= null);
    }

    /**
     * Gets the value of the markingSecondColour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public JAXBElement<CodeColourType> getMarkingSecondColour() {
        return markingSecondColour;
    }

    /**
     * Sets the value of the markingSecondColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeColourType }{@code >}
     *     
     */
    public void setMarkingSecondColour(JAXBElement<CodeColourType> value) {
        this.markingSecondColour = value;
    }

    public boolean isSetMarkingSecondColour() {
        return (this.markingSecondColour!= null);
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setMobile(JAXBElement<CodeYesNoType> value) {
        this.mobile = value;
    }

    public boolean isSetMobile() {
        return (this.mobile!= null);
    }

    /**
     * Gets the value of the frangible property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getFrangible() {
        return frangible;
    }

    /**
     * Sets the value of the frangible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setFrangible(JAXBElement<CodeYesNoType> value) {
        this.frangible = value;
    }

    public boolean isSetFrangible() {
        return (this.frangible!= null);
    }

    /**
     * Gets the value of the visibleMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalStructureMaterialType> getVisibleMaterial() {
        return visibleMaterial;
    }

    /**
     * Sets the value of the visibleMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalStructureMaterialType }{@code >}
     *     
     */
    public void setVisibleMaterial(JAXBElement<CodeVerticalStructureMaterialType> value) {
        this.visibleMaterial = value;
    }

    public boolean isSetVisibleMaterial() {
        return (this.visibleMaterial!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public JAXBElement<TextDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<TextDesignatorType> value) {
        this.designator = value;
    }

    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the horizontalProjectionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getHorizontalProjectionLocation() {
        return horizontalProjectionLocation;
    }

    /**
     * Sets the value of the horizontalProjectionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.horizontalProjectionLocation = value;
    }

    public boolean isSetHorizontalProjectionLocation() {
        return (this.horizontalProjectionLocation!= null);
    }

    /**
     * Gets the value of the horizontalProjectionLinearExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedCurvePropertyType> getHorizontalProjectionLinearExtent() {
        return horizontalProjectionLinearExtent;
    }

    /**
     * Sets the value of the horizontalProjectionLinearExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedCurvePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionLinearExtent(JAXBElement<ElevatedCurvePropertyType> value) {
        this.horizontalProjectionLinearExtent = value;
    }

    public boolean isSetHorizontalProjectionLinearExtent() {
        return (this.horizontalProjectionLinearExtent!= null);
    }

    /**
     * Gets the value of the horizontalProjectionSurfaceExtent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedSurfacePropertyType> getHorizontalProjectionSurfaceExtent() {
        return horizontalProjectionSurfaceExtent;
    }

    /**
     * Sets the value of the horizontalProjectionSurfaceExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedSurfacePropertyType }{@code >}
     *     
     */
    public void setHorizontalProjectionSurfaceExtent(JAXBElement<ElevatedSurfacePropertyType> value) {
        this.horizontalProjectionSurfaceExtent = value;
    }

    public boolean isSetHorizontalProjectionSurfaceExtent() {
        return (this.horizontalProjectionSurfaceExtent!= null);
    }

    /**
     * Gets the value of the lighting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lighting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLighting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LightElementPropertyType }
     * 
     * 
     */
    public List<LightElementPropertyType> getLighting() {
        if (lighting == null) {
            lighting = new ArrayList<LightElementPropertyType>();
        }
        return this.lighting;
    }

    public boolean isSetLighting() {
        return ((this.lighting!= null)&&(!this.lighting.isEmpty()));
    }

    public void unsetLighting() {
        this.lighting = null;
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
     * {@link VerticalStructurePartType.Extension }
     * 
     * 
     */
    public List<VerticalStructurePartType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<VerticalStructurePartType.Extension>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractPropertiesWithScheduleExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractVerticalStructurePartExtension"/>
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
        "abstractPropertiesWithScheduleExtension",
        "abstractVerticalStructurePartExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPropertiesWithScheduleExtension")
        protected AbstractExtensionType abstractPropertiesWithScheduleExtension;
        @XmlElement(name = "AbstractVerticalStructurePartExtension")
        protected AbstractExtensionType abstractVerticalStructurePartExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractPropertiesWithScheduleExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPropertiesWithScheduleExtension() {
            return abstractPropertiesWithScheduleExtension;
        }

        /**
         * Sets the value of the abstractPropertiesWithScheduleExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPropertiesWithScheduleExtension(AbstractExtensionType value) {
            this.abstractPropertiesWithScheduleExtension = value;
        }

        public boolean isSetAbstractPropertiesWithScheduleExtension() {
            return (this.abstractPropertiesWithScheduleExtension!= null);
        }

        /**
         * Gets the value of the abstractVerticalStructurePartExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractVerticalStructurePartExtension() {
            return abstractVerticalStructurePartExtension;
        }

        /**
         * Sets the value of the abstractVerticalStructurePartExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractVerticalStructurePartExtension(AbstractExtensionType value) {
            this.abstractVerticalStructurePartExtension = value;
        }

        public boolean isSetAbstractVerticalStructurePartExtension() {
            return (this.abstractVerticalStructurePartExtension!= null);
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
        public void setOwns(boolean value) {
            this.owns = value;
        }

        public boolean isSetOwns() {
            return (this.owns!= null);
        }

        public void unsetOwns() {
            this.owns = null;
        }

    }

}
