//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package aero.aixm.event;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.aixm.AbstractExtensionType;


/**
 * <p>Java class for VisualGlideSlopeIndicatorExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisualGlideSlopeIndicatorExtensionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1}AbstractExtensionType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1/event}VisualGlideSlopeIndicatorExtensionPropertyGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisualGlideSlopeIndicatorExtensionType", propOrder = {
    "theEvent"
})
public class VisualGlideSlopeIndicatorExtensionType
    extends AbstractExtensionType
{

    @XmlElement(nillable = true)
    protected List<EventPropertyType> theEvent;

    /**
     * Gets the value of the theEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventPropertyType }
     * 
     * 
     */
    public List<EventPropertyType> getTheEvent() {
        if (theEvent == null) {
            theEvent = new ArrayList<EventPropertyType>();
        }
        return this.theEvent;
    }

}
