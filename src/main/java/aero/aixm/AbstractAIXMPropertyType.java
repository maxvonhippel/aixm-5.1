//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.AISPublicationPropertyType;
import aero.aixm.event.NOTAMPropertyType;
import aero.aixm.event.NOTAMTranslationPropertyType;
import aero.aixm.extension.fns.FNSNOTAMPropertyType;
import aero.aixm.extension.fns.NOTAMRequestPropertyType;
import aero.aixm.extension.fns.NOTAMResponsePropertyType;
import aero.aixm.extension.fns.ServiceUsagePropertyType;


/**
 * It provides a basis for deriving AIXM feature/object properties. It defines the nilReason attribute and currently, it is only used for properties that are derived from association with an AIM object.
 * 
 * <p>Java class for AbstractAIXMPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMPropertyType")
@XmlSeeAlso({
    AngleUsePropertyType.class,
    MinimaPropertyType.class,
    ObstaclePlacementPropertyType.class,
    AirspaceVolumeDependencyPropertyType.class,
    FASDataBlockPropertyType.class,
    AerialRefuellingAnchorPropertyType.class,
    ApronContaminationPropertyType.class,
    UsageConditionPropertyType.class,
    SpecialNavigationStationStatusPropertyType.class,
    AltimeterSourceStatusPropertyType.class,
    AuthorityForSpecialNavigationStationPropertyType.class,
    WorkareaActivityPropertyType.class,
    FlightRestrictionRoutePropertyType.class,
    FlightCharacteristicPropertyType.class,
    AirspaceLayerPropertyType.class,
    CircleSectorPropertyType.class,
    ApronAreaAvailabilityPropertyType.class,
    ProcedureTransitionPropertyType.class,
    ContactInformationPropertyType.class,
    AuthorityForSpecialNavigationSystemPropertyType.class,
    FlightConditionElementPropertyType.class,
    ReflectorPropertyType.class,
    ApproachTimingTablePropertyType.class,
    CityPropertyType.class,
    NavaidOperationalStatusPropertyType.class,
    CurvePropertyType.class,
    StandardLevelPropertyType.class,
    FlightRoutingElementPropertyType.class,
    RoutePortionPropertyType.class,
    ManoeuvringAreaAvailabilityPropertyType.class,
    TimesheetPropertyType.class,
    OilPropertyType.class,
    ObstructionPropertyType.class,
    NitrogenPropertyType.class,
    SegmentPointPropertyType.class,
    DirectFlightPropertyType.class,
    RouteAvailabilityPropertyType.class,
    SurfaceCharacteristicsPropertyType.class,
    NavigationAreaSectorPropertyType.class,
    TelephoneContactPropertyType.class,
    LightElementStatusPropertyType.class,
    NotePropertyType.class,
    NavaidEquipmentMonitoringPropertyType.class,
    FlightConditionCombinationPropertyType.class,
    ElevatedSurfacePropertyType.class,
    ObstacleAssessmentAreaPropertyType.class,
    MissedApproachGroupPropertyType.class,
    SurfaceContaminationLayerPropertyType.class,
    RunwayDeclaredDistanceValuePropertyType.class,
    AirspaceActivationPropertyType.class,
    DepartureArrivalConditionPropertyType.class,
    GroundLightingAvailabilityPropertyType.class,
    AerialRefuellingTrackPropertyType.class,
    ServiceOperationalStatusPropertyType.class,
    FlightRestrictionLevelPropertyType.class,
    NavaidEquipmentDistancePropertyType.class,
    RunwayContaminationPropertyType.class,
    EnRouteSegmentPointPropertyType.class,
    AirportHeliportAvailabilityPropertyType.class,
    AirspaceLayerClassPropertyType.class,
    ProcedureTransitionLegPropertyType.class,
    AuthorityForNavaidEquipmentPropertyType.class,
    PointReferencePropertyType.class,
    ElevatedCurvePropertyType.class,
    AirportHeliportResponsibilityOrganisationPropertyType.class,
    TaxiwayContaminationPropertyType.class,
    RunwaySectionContaminationPropertyType.class,
    DirectFlightSegmentPropertyType.class,
    AirspaceVolumePropertyType.class,
    OxygenPropertyType.class,
    AircraftCharacteristicPropertyType.class,
    NavaidComponentPropertyType.class,
    TerminalArrivalAreaSectorPropertyType.class,
    VerticalStructurePartPropertyType.class,
    LightActivationPropertyType.class,
    HoldingUsePropertyType.class,
    AirportHeliportUsagePropertyType.class,
    SafeAltitudeAreaSectorPropertyType.class,
    RadarComponentPropertyType.class,
    LandingTakeoffAreaCollectionPropertyType.class,
    VerticalStructureLightingStatusPropertyType.class,
    HoldingPatternDurationPropertyType.class,
    CallsignDetailPropertyType.class,
    AuthorityForAerialRefuellingPropertyType.class,
    ApproachAltitudeTablePropertyType.class,
    AirportHeliportContaminationPropertyType.class,
    PointPropertyType.class,
    SurveillanceGroundStationPropertyType.class,
    HoldingPatternDistancePropertyType.class,
    ManoeuvringAreaUsagePropertyType.class,
    RadioCommunicationOperationalStatusPropertyType.class,
    AirspaceGeometryComponentPropertyType.class,
    LightElementPropertyType.class,
    OrganisationAuthorityAssociationPropertyType.class,
    RidgePropertyType.class,
    EquipmentUnavailableAdjustmentColumnPropertyType.class,
    MarkingElementPropertyType.class,
    DirectFlightClassPropertyType.class,
    SurfacePropertyType.class,
    MeteorologyPropertyType.class,
    ConditionCombinationPropertyType.class,
    TerminalSegmentPointPropertyType.class,
    FuelPropertyType.class,
    FlightConditionCircumstancePropertyType.class,
    ProcedureAvailabilityPropertyType.class,
    UnitDependencyPropertyType.class,
    RunwayDeclaredDistancePropertyType.class,
    PropertiesWithSchedulePropertyType.class,
    CirclingRestrictionPropertyType.class,
    AltitudeAdjustmentPropertyType.class,
    UnitAvailabilityPropertyType.class,
    SurfaceContaminationPropertyType.class,
    TouchDownLiftOffContaminationPropertyType.class,
    AerialRefuellingPointPropertyType.class,
    LinguisticNotePropertyType.class,
    ElevatedPointPropertyType.class,
    OnlineContactPropertyType.class,
    PostalAddressPropertyType.class,
    EquipmentUnavailableAdjustmentPropertyType.class,
    FinalProfilePropertyType.class,
    ApronAreaUsagePropertyType.class,
    ApproachConditionPropertyType.class,
    SectorDesignPropertyType.class,
    AircraftStandContaminationPropertyType.class,
    ApproachDistanceTablePropertyType.class,
    AISPublicationPropertyType.class,
    NOTAMPropertyType.class,
    NOTAMTranslationPropertyType.class,
    NOTAMResponsePropertyType.class,
    ServiceUsagePropertyType.class,
    NOTAMRequestPropertyType.class,
    FNSNOTAMPropertyType.class
})
public abstract class AbstractAIXMPropertyType {

    @XmlAttribute(name = "nilReason")
    protected String nilReason;

    /**
     * Gets the value of the nilReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNilReason() {
        return nilReason;
    }

    /**
     * Sets the value of the nilReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNilReason(String value) {
        this.nilReason = value;
    }

}
