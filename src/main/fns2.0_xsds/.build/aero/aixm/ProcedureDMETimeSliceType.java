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
import aero.aixm.event.ProcedureDMEExtensionType;


/**
 * <p>Java class for ProcedureDMETimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcedureDMETimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}ProcedureDMEPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureDMEExtension"/>
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
@XmlType(name = "ProcedureDMETimeSliceType", propOrder = {
    "criticalDME",
    "satisfactory",
    "dme",
    "segmentLeg",
    "annotation",
    "extension"
})
public class ProcedureDMETimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "criticalDME", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> criticalDME;
    @XmlElementRef(name = "satisfactory", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> satisfactory;
    @XmlElementRef(name = "DME", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DMEPropertyType> dme;
    @XmlElementRef(name = "segmentLeg", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SegmentLegPropertyType> segmentLeg;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<ProcedureDMETimeSliceType.Extension> extension;

    /**
     * Gets the value of the criticalDME property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCriticalDME() {
        return criticalDME;
    }

    /**
     * Sets the value of the criticalDME property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCriticalDME(JAXBElement<CodeYesNoType> value) {
        this.criticalDME = value;
    }

    public boolean isSetCriticalDME() {
        return (this.criticalDME!= null);
    }

    /**
     * Gets the value of the satisfactory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getSatisfactory() {
        return satisfactory;
    }

    /**
     * Sets the value of the satisfactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setSatisfactory(JAXBElement<CodeYesNoType> value) {
        this.satisfactory = value;
    }

    public boolean isSetSatisfactory() {
        return (this.satisfactory!= null);
    }

    /**
     * Gets the value of the dme property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DMEPropertyType }{@code >}
     *     
     */
    public JAXBElement<DMEPropertyType> getDME() {
        return dme;
    }

    /**
     * Sets the value of the dme property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DMEPropertyType }{@code >}
     *     
     */
    public void setDME(JAXBElement<DMEPropertyType> value) {
        this.dme = value;
    }

    public boolean isSetDME() {
        return (this.dme!= null);
    }

    /**
     * Gets the value of the segmentLeg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SegmentLegPropertyType }{@code >}
     *     
     */
    public JAXBElement<SegmentLegPropertyType> getSegmentLeg() {
        return segmentLeg;
    }

    /**
     * Sets the value of the segmentLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SegmentLegPropertyType }{@code >}
     *     
     */
    public void setSegmentLeg(JAXBElement<SegmentLegPropertyType> value) {
        this.segmentLeg = value;
    }

    public boolean isSetSegmentLeg() {
        return (this.segmentLeg!= null);
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
     * {@link ProcedureDMETimeSliceType.Extension }
     * 
     * 
     */
    public List<ProcedureDMETimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ProcedureDMETimeSliceType.Extension>();
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractProcedureDMEExtension"/>
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
        "abstractProcedureDMEExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractProcedureDMEExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractProcedureDMEExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractProcedureDMEExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcedureDMEExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractProcedureDMEExtension() {
            return abstractProcedureDMEExtension;
        }

        /**
         * Sets the value of the abstractProcedureDMEExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link ProcedureDMEExtensionType }{@code >}
         *     
         */
        public void setAbstractProcedureDMEExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractProcedureDMEExtension = value;
        }

        public boolean isSetAbstractProcedureDMEExtension() {
            return (this.abstractProcedureDMEExtension!= null);
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
