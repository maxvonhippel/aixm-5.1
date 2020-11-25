//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.04 at 11:05:52 AM EST 
//


package net.opengis.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:IdentifiedObjectType provides identification properties of a CRS-related object. In gml:DefinitionType, the gml:identifier element shall be the primary name by which this object is identified, encoding the "name" attribute in the UML model.
 * Zero or more of the gml:name elements can be an unordered set of "identifiers", encoding the "identifier" attribute in the UML model. Each of these gml:name elements can reference elsewhere the object's defining information or be an identifier by which this object can be referenced.
 * Zero or more other gml:name elements can be an unordered set of "alias" alternative names by which this CRS related object is identified, encoding the "alias" attributes in the UML model. An object may have several aliases, typically used in different contexts. The context for an alias is indicated by the value of its (optional) codeSpace attribute.
 * Any needed version information shall be included in the codeSpace attribute of a gml:identifier and gml:name elements. In this use, the gml:remarks element in the gml:DefinitionType shall contain comments on or information about this object, including data source information.
 * 
 * <p>Java class for IdentifiedObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedObjectType")
@XmlSeeAlso({
    OperationMethodType.class,
    PrimeMeridianType.class,
    CoordinateSystemAxisType.class,
    AbstractGeneralOperationParameterType.class,
    EllipsoidType.class,
    AbstractCRSType.class,
    AbstractCoordinateOperationType.class,
    AbstractCoordinateSystemType.class,
    AbstractDatumType.class
})
public abstract class IdentifiedObjectType
    extends DefinitionType
{


}
