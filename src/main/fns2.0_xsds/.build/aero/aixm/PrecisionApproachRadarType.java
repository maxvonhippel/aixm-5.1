//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 07:41:16 AM EST 
//


package aero.aixm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecisionApproachRadarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecisionApproachRadarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractRadarEquipmentType">
 *       &lt;sequence>
 *         &lt;element name="timeSlice" type="{http://www.aixm.aero/schema/5.1}PrecisionApproachRadarTimeSlicePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecisionApproachRadarType", propOrder = {
    "timeSlice"
})
public class PrecisionApproachRadarType
    extends AbstractRadarEquipmentType
{

    @XmlElement(required = true)
    protected List<PrecisionApproachRadarTimeSlicePropertyType> timeSlice;

    /**
     * Gets the value of the timeSlice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeSlice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeSlice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecisionApproachRadarTimeSlicePropertyType }
     * 
     * 
     */
    public List<PrecisionApproachRadarTimeSlicePropertyType> getTimeSlice() {
        if (timeSlice == null) {
            timeSlice = new ArrayList<PrecisionApproachRadarTimeSlicePropertyType>();
        }
        return this.timeSlice;
    }

    public boolean isSetTimeSlice() {
        return ((this.timeSlice!= null)&&(!this.timeSlice.isEmpty()));
    }

    public void unsetTimeSlice() {
        this.timeSlice = null;
    }

}
