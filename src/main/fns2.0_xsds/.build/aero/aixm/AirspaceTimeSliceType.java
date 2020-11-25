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
import aero.aixm.event.AirspaceExtensionType;


/**
 * <p>Java class for AirspaceTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirspaceTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirspacePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceExtension"/>
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
@XmlType(name = "AirspaceTimeSliceType", propOrder = {
    "type",
    "designator",
    "localType",
    "aixmName",
    "designatorICAO",
    "controlType",
    "upperLowerSeparation",
    "clazz",
    "protectedRoute",
    "geometryComponent",
    "activation",
    "annotation",
    "extension"
})
public class AirspaceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceType> type;
    @XmlElementRef(name = "designator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeAirspaceDesignatorType> designator;
    @XmlElementRef(name = "localType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> localType;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "designatorICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> designatorICAO;
    @XmlElementRef(name = "controlType", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeMilitaryOperationsType> controlType;
    @XmlElementRef(name = "upperLowerSeparation", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValFLType> upperLowerSeparation;
    @XmlElement(name = "class", nillable = true)
    protected List<AirspaceLayerClassPropertyType> clazz;
    @XmlElementRef(name = "protectedRoute", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutePropertyType> protectedRoute;
    @XmlElement(nillable = true)
    protected List<AirspaceGeometryComponentPropertyType> geometryComponent;
    @XmlElement(nillable = true)
    protected List<AirspaceActivationPropertyType> activation;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<AirspaceTimeSliceType.Extension> extension;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspaceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeAirspaceType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    public JAXBElement<CodeAirspaceDesignatorType> getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}
     *     
     */
    public void setDesignator(JAXBElement<CodeAirspaceDesignatorType> value) {
        this.designator = value;
    }

    public boolean isSetDesignator() {
        return (this.designator!= null);
    }

    /**
     * Gets the value of the localType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getLocalType() {
        return localType;
    }

    /**
     * Sets the value of the localType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setLocalType(JAXBElement<TextNameType> value) {
        this.localType = value;
    }

    public boolean isSetLocalType() {
        return (this.localType!= null);
    }

    /**
     * Gets the value of the aixmName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public JAXBElement<TextNameType> getAIXMName() {
        return aixmName;
    }

    /**
     * Sets the value of the aixmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TextNameType }{@code >}
     *     
     */
    public void setAIXMName(JAXBElement<TextNameType> value) {
        this.aixmName = value;
    }

    public boolean isSetAIXMName() {
        return (this.aixmName!= null);
    }

    /**
     * Gets the value of the designatorICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDesignatorICAO() {
        return designatorICAO;
    }

    /**
     * Sets the value of the designatorICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDesignatorICAO(JAXBElement<CodeYesNoType> value) {
        this.designatorICAO = value;
    }

    public boolean isSetDesignatorICAO() {
        return (this.designatorICAO!= null);
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public JAXBElement<CodeMilitaryOperationsType> getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeMilitaryOperationsType }{@code >}
     *     
     */
    public void setControlType(JAXBElement<CodeMilitaryOperationsType> value) {
        this.controlType = value;
    }

    public boolean isSetControlType() {
        return (this.controlType!= null);
    }

    /**
     * Gets the value of the upperLowerSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public JAXBElement<ValFLType> getUpperLowerSeparation() {
        return upperLowerSeparation;
    }

    /**
     * Sets the value of the upperLowerSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValFLType }{@code >}
     *     
     */
    public void setUpperLowerSeparation(JAXBElement<ValFLType> value) {
        this.upperLowerSeparation = value;
    }

    public boolean isSetUpperLowerSeparation() {
        return (this.upperLowerSeparation!= null);
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceLayerClassPropertyType }
     * 
     * 
     */
    public List<AirspaceLayerClassPropertyType> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<AirspaceLayerClassPropertyType>();
        }
        return this.clazz;
    }

    public boolean isSetClazz() {
        return ((this.clazz!= null)&&(!this.clazz.isEmpty()));
    }

    public void unsetClazz() {
        this.clazz = null;
    }

    /**
     * Gets the value of the protectedRoute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public JAXBElement<RoutePropertyType> getProtectedRoute() {
        return protectedRoute;
    }

    /**
     * Sets the value of the protectedRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutePropertyType }{@code >}
     *     
     */
    public void setProtectedRoute(JAXBElement<RoutePropertyType> value) {
        this.protectedRoute = value;
    }

    public boolean isSetProtectedRoute() {
        return (this.protectedRoute!= null);
    }

    /**
     * Gets the value of the geometryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceGeometryComponentPropertyType }
     * 
     * 
     */
    public List<AirspaceGeometryComponentPropertyType> getGeometryComponent() {
        if (geometryComponent == null) {
            geometryComponent = new ArrayList<AirspaceGeometryComponentPropertyType>();
        }
        return this.geometryComponent;
    }

    public boolean isSetGeometryComponent() {
        return ((this.geometryComponent!= null)&&(!this.geometryComponent.isEmpty()));
    }

    public void unsetGeometryComponent() {
        this.geometryComponent = null;
    }

    /**
     * Gets the value of the activation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspaceActivationPropertyType }
     * 
     * 
     */
    public List<AirspaceActivationPropertyType> getActivation() {
        if (activation == null) {
            activation = new ArrayList<AirspaceActivationPropertyType>();
        }
        return this.activation;
    }

    public boolean isSetActivation() {
        return ((this.activation!= null)&&(!this.activation.isEmpty()));
    }

    public void unsetActivation() {
        this.activation = null;
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
     * {@link AirspaceTimeSliceType.Extension }
     * 
     * 
     */
    public List<AirspaceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirspaceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirspaceExtension"/>
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
        "abstractAirspaceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAirspaceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirspaceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractAirspaceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirspaceExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirspaceExtension() {
            return abstractAirspaceExtension;
        }

        /**
         * Sets the value of the abstractAirspaceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirspaceExtensionType }{@code >}
         *     
         */
        public void setAbstractAirspaceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirspaceExtension = value;
        }

        public boolean isSetAbstractAirspaceExtension() {
            return (this.abstractAirspaceExtension!= null);
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
