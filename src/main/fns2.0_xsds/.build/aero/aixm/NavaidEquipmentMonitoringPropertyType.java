//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NavaidEquipmentMonitoringPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavaidEquipmentMonitoringPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1}NavaidEquipmentMonitoring"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavaidEquipmentMonitoringPropertyType", propOrder = {
    "navaidEquipmentMonitoring"
})
public class NavaidEquipmentMonitoringPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "NavaidEquipmentMonitoring", required = true)
    protected NavaidEquipmentMonitoringType navaidEquipmentMonitoring;

    /**
     * Gets the value of the navaidEquipmentMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    public NavaidEquipmentMonitoringType getNavaidEquipmentMonitoring() {
        return navaidEquipmentMonitoring;
    }

    /**
     * Sets the value of the navaidEquipmentMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidEquipmentMonitoringType }
     *     
     */
    public void setNavaidEquipmentMonitoring(NavaidEquipmentMonitoringType value) {
        this.navaidEquipmentMonitoring = value;
    }

    public boolean isSetNavaidEquipmentMonitoring() {
        return (this.navaidEquipmentMonitoring!= null);
    }

}
