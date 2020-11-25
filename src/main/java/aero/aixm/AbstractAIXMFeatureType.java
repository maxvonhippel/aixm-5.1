//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.event.EventType;
import aero.aixm.extension.fns.AirportSignType;
import aero.aixm.extension.fns.WindDirectionIndicatorType;


/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 * 
 * <p>Java class for AbstractAIXMFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMFeatureBaseType">
 *       &lt;sequence>
 *         &lt;element name="featureMetadata" type="{http://www.aixm.aero/schema/5.1}FeatureMetadataPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", propOrder = {
    "featureMetadata"
})
@XmlSeeAlso({
    AuthorityForAirspaceType.class,
    ApronElementType.class,
    TaxiwayType.class,
    NavigationAreaRestrictionType.class,
    AltimeterSourceType.class,
    AeronauticalGroundLightType.class,
    StandardLevelSectorType.class,
    TaxiHoldingPositionType.class,
    DeicingAreaType.class,
    RunwayVisualRangeType.class,
    RadioFrequencyAreaType.class,
    AirportHotSpotType.class,
    SpecialDateType.class,
    VerticalStructureType.class,
    AirportHeliportType.class,
    CirclingAreaType.class,
    RunwayBlastPadType.class,
    RulesProceduresType.class,
    AircraftStandType.class,
    AirspaceBorderCrossingType.class,
    ApronType.class,
    StandardLevelColumnType.class,
    SignificantPointInAirspaceType.class,
    ChangeOverPointType.class,
    RadioCommunicationChannelType.class,
    SurveyControlPointType.class,
    AirportHeliportCollocationType.class,
    ObstacleAreaType.class,
    StandardLevelTableType.class,
    UnitType.class,
    NonMovementAreaType.class,
    DesignatedPointType.class,
    AirspaceType.class,
    HoldingAssessmentType.class,
    PassengerLoadingBridgeType.class,
    SpecialNavigationStationType.class,
    GuidanceLineType.class,
    UnplannedHoldingType.class,
    RunwayType.class,
    RouteDMEType.class,
    FlightRestrictionType.class,
    AbstractNavigationSystemCheckpointType.class,
    TerminalArrivalAreaType.class,
    SeaplaneLandingAreaType.class,
    NavigationAreaType.class,
    AbstractNavaidEquipmentType.class,
    SafeAltitudeAreaType.class,
    RouteType.class,
    ArrestingGearType.class,
    OrganisationAuthorityType.class,
    WorkAreaType.class,
    ProcedureDMEType.class,
    RunwayCentrelinePointType.class,
    RunwayDirectionType.class,
    TaxiwayElementType.class,
    MarkingBuoyType.class,
    FloatingDockSiteType.class,
    SeaplaneRampSiteType.class,
    GeoBorderType.class,
    AngleIndicationType.class,
    RoadType.class,
    AbstractServiceType.class,
    SpecialNavigationSystemType.class,
    AbstractProcedureType.class,
    TouchDownLiftOffType.class,
    AbstractRadarEquipmentType.class,
    DistanceIndicationType.class,
    AbstractAirportHeliportProtectionAreaType.class,
    PilotControlledLightingType.class,
    AbstractMarkingType.class,
    RouteSegmentType.class,
    RadarSystemType.class,
    AbstractGroundLightSystemType.class,
    RunwayElementType.class,
    AerialRefuellingType.class,
    HoldingPatternType.class,
    AbstractSegmentLegType.class,
    NavaidType.class,
    EventType.class,
    AirportSignType.class,
    WindDirectionIndicatorType.class
})
public abstract class AbstractAIXMFeatureType
    extends AbstractAIXMFeatureBaseType
{

    protected FeatureMetadataPropertyType featureMetadata;

    /**
     * Gets the value of the featureMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * Sets the value of the featureMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

}
