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
import aero.aixm.event.AirTrafficControlServiceExtensionType;
import aero.aixm.event.TrafficSeparationServiceExtensionType;


/**
 * <p>Java class for AirTrafficControlServiceTimeSliceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirTrafficControlServiceTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMTimeSliceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1}AirTrafficControlServicePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirTrafficControlServiceExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTrafficSeparationServiceExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractServiceExtension"/>
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
@XmlType(name = "AirTrafficControlServiceTimeSliceType", propOrder = {
    "flightOperations",
    "rank",
    "compliantICAO",
    "aixmName",
    "location",
    "serviceProvider",
    "callSign",
    "radioCommunication",
    "groundCommunication",
    "availability",
    "annotation",
    "radarAssisted",
    "dataLinkEnabled",
    "dataLinkChannel",
    "type",
    "clientAirport",
    "clientAirspace",
    "clientRoute",
    "clientProcedure",
    "clientHolding",
    "clientAerialRefuelling",
    "aircraftLocator",
    "extension"
})
public class AirTrafficControlServiceTimeSliceType
    extends AbstractAIXMTimeSliceType
{

    @XmlElementRef(name = "flightOperations", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFlightDestinationType> flightOperations;
    @XmlElementRef(name = "rank", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeFacilityRankingType> rank;
    @XmlElementRef(name = "compliantICAO", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> compliantICAO;
    @XmlElementRef(name = "name", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TextNameType> aixmName;
    @XmlElementRef(name = "location", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ElevatedPointPropertyType> location;
    @XmlElementRef(name = "serviceProvider", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitPropertyType> serviceProvider;
    @XmlElement(name = "call-sign", nillable = true)
    protected List<CallsignDetailPropertyType> callSign;
    @XmlElement(nillable = true)
    protected List<RadioCommunicationChannelPropertyType> radioCommunication;
    @XmlElement(nillable = true)
    protected List<ContactInformationPropertyType> groundCommunication;
    @XmlElement(nillable = true)
    protected List<ServiceOperationalStatusPropertyType> availability;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElementRef(name = "radarAssisted", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> radarAssisted;
    @XmlElementRef(name = "dataLinkEnabled", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeYesNoType> dataLinkEnabled;
    @XmlElementRef(name = "dataLinkChannel", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeCommunicationChannelType> dataLinkChannel;
    @XmlElementRef(name = "type", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeServiceATCType> type;
    @XmlElement(nillable = true)
    protected List<AirportHeliportPropertyType> clientAirport;
    @XmlElement(nillable = true)
    protected List<AirspacePropertyType> clientAirspace;
    @XmlElement(nillable = true)
    protected List<RoutePortionPropertyType> clientRoute;
    @XmlElement(nillable = true)
    protected List<ProcedurePropertyType> clientProcedure;
    @XmlElement(nillable = true)
    protected List<HoldingPatternPropertyType> clientHolding;
    @XmlElement(nillable = true)
    protected List<AerialRefuellingPropertyType> clientAerialRefuelling;
    @XmlElementRef(name = "aircraftLocator", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DirectionFinderPropertyType> aircraftLocator;
    protected List<AirTrafficControlServiceTimeSliceType.Extension> extension;

    /**
     * Gets the value of the flightOperations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    public JAXBElement<CodeFlightDestinationType> getFlightOperations() {
        return flightOperations;
    }

    /**
     * Sets the value of the flightOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFlightDestinationType }{@code >}
     *     
     */
    public void setFlightOperations(JAXBElement<CodeFlightDestinationType> value) {
        this.flightOperations = value;
    }

    public boolean isSetFlightOperations() {
        return (this.flightOperations!= null);
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     *     
     */
    public JAXBElement<CodeFacilityRankingType> getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeFacilityRankingType }{@code >}
     *     
     */
    public void setRank(JAXBElement<CodeFacilityRankingType> value) {
        this.rank = value;
    }

    public boolean isSetRank() {
        return (this.rank!= null);
    }

    /**
     * Gets the value of the compliantICAO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getCompliantICAO() {
        return compliantICAO;
    }

    /**
     * Sets the value of the compliantICAO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setCompliantICAO(JAXBElement<CodeYesNoType> value) {
        this.compliantICAO = value;
    }

    public boolean isSetCompliantICAO() {
        return (this.compliantICAO!= null);
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public JAXBElement<ElevatedPointPropertyType> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<ElevatedPointPropertyType> value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public JAXBElement<UnitPropertyType> getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitPropertyType }{@code >}
     *     
     */
    public void setServiceProvider(JAXBElement<UnitPropertyType> value) {
        this.serviceProvider = value;
    }

    public boolean isSetServiceProvider() {
        return (this.serviceProvider!= null);
    }

    /**
     * Gets the value of the callSign property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callSign property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallSign().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallsignDetailPropertyType }
     * 
     * 
     */
    public List<CallsignDetailPropertyType> getCallSign() {
        if (callSign == null) {
            callSign = new ArrayList<CallsignDetailPropertyType>();
        }
        return this.callSign;
    }

    public boolean isSetCallSign() {
        return ((this.callSign!= null)&&(!this.callSign.isEmpty()));
    }

    public void unsetCallSign() {
        this.callSign = null;
    }

    /**
     * Gets the value of the radioCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RadioCommunicationChannelPropertyType }
     * 
     * 
     */
    public List<RadioCommunicationChannelPropertyType> getRadioCommunication() {
        if (radioCommunication == null) {
            radioCommunication = new ArrayList<RadioCommunicationChannelPropertyType>();
        }
        return this.radioCommunication;
    }

    public boolean isSetRadioCommunication() {
        return ((this.radioCommunication!= null)&&(!this.radioCommunication.isEmpty()));
    }

    public void unsetRadioCommunication() {
        this.radioCommunication = null;
    }

    /**
     * Gets the value of the groundCommunication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groundCommunication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroundCommunication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationPropertyType }
     * 
     * 
     */
    public List<ContactInformationPropertyType> getGroundCommunication() {
        if (groundCommunication == null) {
            groundCommunication = new ArrayList<ContactInformationPropertyType>();
        }
        return this.groundCommunication;
    }

    public boolean isSetGroundCommunication() {
        return ((this.groundCommunication!= null)&&(!this.groundCommunication.isEmpty()));
    }

    public void unsetGroundCommunication() {
        this.groundCommunication = null;
    }

    /**
     * Gets the value of the availability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOperationalStatusPropertyType }
     * 
     * 
     */
    public List<ServiceOperationalStatusPropertyType> getAvailability() {
        if (availability == null) {
            availability = new ArrayList<ServiceOperationalStatusPropertyType>();
        }
        return this.availability;
    }

    public boolean isSetAvailability() {
        return ((this.availability!= null)&&(!this.availability.isEmpty()));
    }

    public void unsetAvailability() {
        this.availability = null;
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
     * Gets the value of the radarAssisted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getRadarAssisted() {
        return radarAssisted;
    }

    /**
     * Sets the value of the radarAssisted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setRadarAssisted(JAXBElement<CodeYesNoType> value) {
        this.radarAssisted = value;
    }

    public boolean isSetRadarAssisted() {
        return (this.radarAssisted!= null);
    }

    /**
     * Gets the value of the dataLinkEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public JAXBElement<CodeYesNoType> getDataLinkEnabled() {
        return dataLinkEnabled;
    }

    /**
     * Sets the value of the dataLinkEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}
     *     
     */
    public void setDataLinkEnabled(JAXBElement<CodeYesNoType> value) {
        this.dataLinkEnabled = value;
    }

    public boolean isSetDataLinkEnabled() {
        return (this.dataLinkEnabled!= null);
    }

    /**
     * Gets the value of the dataLinkChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    public JAXBElement<CodeCommunicationChannelType> getDataLinkChannel() {
        return dataLinkChannel;
    }

    /**
     * Sets the value of the dataLinkChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeCommunicationChannelType }{@code >}
     *     
     */
    public void setDataLinkChannel(JAXBElement<CodeCommunicationChannelType> value) {
        this.dataLinkChannel = value;
    }

    public boolean isSetDataLinkChannel() {
        return (this.dataLinkChannel!= null);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeServiceATCType }{@code >}
     *     
     */
    public JAXBElement<CodeServiceATCType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeServiceATCType }{@code >}
     *     
     */
    public void setType(JAXBElement<CodeServiceATCType> value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type!= null);
    }

    /**
     * Gets the value of the clientAirport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAirport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAirport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportHeliportPropertyType }
     * 
     * 
     */
    public List<AirportHeliportPropertyType> getClientAirport() {
        if (clientAirport == null) {
            clientAirport = new ArrayList<AirportHeliportPropertyType>();
        }
        return this.clientAirport;
    }

    public boolean isSetClientAirport() {
        return ((this.clientAirport!= null)&&(!this.clientAirport.isEmpty()));
    }

    public void unsetClientAirport() {
        this.clientAirport = null;
    }

    /**
     * Gets the value of the clientAirspace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAirspace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAirspace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirspacePropertyType }
     * 
     * 
     */
    public List<AirspacePropertyType> getClientAirspace() {
        if (clientAirspace == null) {
            clientAirspace = new ArrayList<AirspacePropertyType>();
        }
        return this.clientAirspace;
    }

    public boolean isSetClientAirspace() {
        return ((this.clientAirspace!= null)&&(!this.clientAirspace.isEmpty()));
    }

    public void unsetClientAirspace() {
        this.clientAirspace = null;
    }

    /**
     * Gets the value of the clientRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePortionPropertyType }
     * 
     * 
     */
    public List<RoutePortionPropertyType> getClientRoute() {
        if (clientRoute == null) {
            clientRoute = new ArrayList<RoutePortionPropertyType>();
        }
        return this.clientRoute;
    }

    public boolean isSetClientRoute() {
        return ((this.clientRoute!= null)&&(!this.clientRoute.isEmpty()));
    }

    public void unsetClientRoute() {
        this.clientRoute = null;
    }

    /**
     * Gets the value of the clientProcedure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientProcedure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientProcedure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedurePropertyType }
     * 
     * 
     */
    public List<ProcedurePropertyType> getClientProcedure() {
        if (clientProcedure == null) {
            clientProcedure = new ArrayList<ProcedurePropertyType>();
        }
        return this.clientProcedure;
    }

    public boolean isSetClientProcedure() {
        return ((this.clientProcedure!= null)&&(!this.clientProcedure.isEmpty()));
    }

    public void unsetClientProcedure() {
        this.clientProcedure = null;
    }

    /**
     * Gets the value of the clientHolding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientHolding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientHolding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingPatternPropertyType }
     * 
     * 
     */
    public List<HoldingPatternPropertyType> getClientHolding() {
        if (clientHolding == null) {
            clientHolding = new ArrayList<HoldingPatternPropertyType>();
        }
        return this.clientHolding;
    }

    public boolean isSetClientHolding() {
        return ((this.clientHolding!= null)&&(!this.clientHolding.isEmpty()));
    }

    public void unsetClientHolding() {
        this.clientHolding = null;
    }

    /**
     * Gets the value of the clientAerialRefuelling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientAerialRefuelling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientAerialRefuelling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerialRefuellingPropertyType }
     * 
     * 
     */
    public List<AerialRefuellingPropertyType> getClientAerialRefuelling() {
        if (clientAerialRefuelling == null) {
            clientAerialRefuelling = new ArrayList<AerialRefuellingPropertyType>();
        }
        return this.clientAerialRefuelling;
    }

    public boolean isSetClientAerialRefuelling() {
        return ((this.clientAerialRefuelling!= null)&&(!this.clientAerialRefuelling.isEmpty()));
    }

    public void unsetClientAerialRefuelling() {
        this.clientAerialRefuelling = null;
    }

    /**
     * Gets the value of the aircraftLocator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DirectionFinderPropertyType }{@code >}
     *     
     */
    public JAXBElement<DirectionFinderPropertyType> getAircraftLocator() {
        return aircraftLocator;
    }

    /**
     * Sets the value of the aircraftLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DirectionFinderPropertyType }{@code >}
     *     
     */
    public void setAircraftLocator(JAXBElement<DirectionFinderPropertyType> value) {
        this.aircraftLocator = value;
    }

    public boolean isSetAircraftLocator() {
        return (this.aircraftLocator!= null);
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
     * {@link AirTrafficControlServiceTimeSliceType.Extension }
     * 
     * 
     */
    public List<AirTrafficControlServiceTimeSliceType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirTrafficControlServiceTimeSliceType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractAirTrafficControlServiceExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractTrafficSeparationServiceExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1}AbstractServiceExtension"/>
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
        "abstractAirTrafficControlServiceExtension",
        "abstractTrafficSeparationServiceExtension",
        "abstractServiceExtension"
    })
    public static class Extension {

        @XmlElementRef(name = "AbstractAirTrafficControlServiceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractAirTrafficControlServiceExtension;
        @XmlElementRef(name = "AbstractTrafficSeparationServiceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractTrafficSeparationServiceExtension;
        @XmlElementRef(name = "AbstractServiceExtension", namespace = "http://www.aixm.aero/schema/5.1", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends AbstractExtensionType> abstractServiceExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractAirTrafficControlServiceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractAirTrafficControlServiceExtension() {
            return abstractAirTrafficControlServiceExtension;
        }

        /**
         * Sets the value of the abstractAirTrafficControlServiceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AirTrafficControlServiceExtensionType }{@code >}
         *     
         */
        public void setAbstractAirTrafficControlServiceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractAirTrafficControlServiceExtension = value;
        }

        public boolean isSetAbstractAirTrafficControlServiceExtension() {
            return (this.abstractAirTrafficControlServiceExtension!= null);
        }

        /**
         * Gets the value of the abstractTrafficSeparationServiceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TrafficSeparationServiceExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractTrafficSeparationServiceExtension() {
            return abstractTrafficSeparationServiceExtension;
        }

        /**
         * Sets the value of the abstractTrafficSeparationServiceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link TrafficSeparationServiceExtensionType }{@code >}
         *     
         */
        public void setAbstractTrafficSeparationServiceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractTrafficSeparationServiceExtension = value;
        }

        public boolean isSetAbstractTrafficSeparationServiceExtension() {
            return (this.abstractTrafficSeparationServiceExtension!= null);
        }

        /**
         * Gets the value of the abstractServiceExtension property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public JAXBElement<? extends AbstractExtensionType> getAbstractServiceExtension() {
            return abstractServiceExtension;
        }

        /**
         * Sets the value of the abstractServiceExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link aero.aixm.event.ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link aero.aixm.extension.fns.ServiceExtensionType }{@code >}
         *     {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}
         *     
         */
        public void setAbstractServiceExtension(JAXBElement<? extends AbstractExtensionType> value) {
            this.abstractServiceExtension = value;
        }

        public boolean isSetAbstractServiceExtension() {
            return (this.abstractServiceExtension!= null);
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
