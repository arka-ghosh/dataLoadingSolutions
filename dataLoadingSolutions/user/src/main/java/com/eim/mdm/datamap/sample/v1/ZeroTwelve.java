
package com.eim.mdm.datamap.sample.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ZeroTwelve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwelve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwelveOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha10"/>
 *         &lt;element name="zeroTwelveTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha80"/>
 *         &lt;element name="zeroTwelveThree" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwelve", propOrder = {
    "zeroTwelveOne",
    "zeroTwelveTwo",
    "zeroTwelveThree"
})
public class ZeroTwelve
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroTwelveOne;
    @XmlElement(required = true)
    protected String zeroTwelveTwo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zeroTwelveThree;

    /**
     * Gets the value of the zeroTwelveOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwelveOne() {
        return zeroTwelveOne;
    }

    /**
     * Sets the value of the zeroTwelveOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwelveOne(String value) {
        this.zeroTwelveOne = value;
    }

    /**
     * Gets the value of the zeroTwelveTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwelveTwo() {
        return zeroTwelveTwo;
    }

    /**
     * Sets the value of the zeroTwelveTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwelveTwo(String value) {
        this.zeroTwelveTwo = value;
    }

    /**
     * Gets the value of the zeroTwelveThree property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroTwelveThree() {
        return zeroTwelveThree;
    }

    /**
     * Sets the value of the zeroTwelveThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroTwelveThree(XMLGregorianCalendar value) {
        this.zeroTwelveThree = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theZeroTwelveOne;
            theZeroTwelveOne = this.getZeroTwelveOne();
            strategy.appendField(locator, this, "zeroTwelveOne", buffer, theZeroTwelveOne);
        }
        {
            String theZeroTwelveTwo;
            theZeroTwelveTwo = this.getZeroTwelveTwo();
            strategy.appendField(locator, this, "zeroTwelveTwo", buffer, theZeroTwelveTwo);
        }
        {
            XMLGregorianCalendar theZeroTwelveThree;
            theZeroTwelveThree = this.getZeroTwelveThree();
            strategy.appendField(locator, this, "zeroTwelveThree", buffer, theZeroTwelveThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwelve)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwelve that = ((ZeroTwelve) object);
        {
            String lhsZeroTwelveOne;
            lhsZeroTwelveOne = this.getZeroTwelveOne();
            String rhsZeroTwelveOne;
            rhsZeroTwelveOne = that.getZeroTwelveOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwelveOne", lhsZeroTwelveOne), LocatorUtils.property(thatLocator, "zeroTwelveOne", rhsZeroTwelveOne), lhsZeroTwelveOne, rhsZeroTwelveOne)) {
                return false;
            }
        }
        {
            String lhsZeroTwelveTwo;
            lhsZeroTwelveTwo = this.getZeroTwelveTwo();
            String rhsZeroTwelveTwo;
            rhsZeroTwelveTwo = that.getZeroTwelveTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwelveTwo", lhsZeroTwelveTwo), LocatorUtils.property(thatLocator, "zeroTwelveTwo", rhsZeroTwelveTwo), lhsZeroTwelveTwo, rhsZeroTwelveTwo)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroTwelveThree;
            lhsZeroTwelveThree = this.getZeroTwelveThree();
            XMLGregorianCalendar rhsZeroTwelveThree;
            rhsZeroTwelveThree = that.getZeroTwelveThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwelveThree", lhsZeroTwelveThree), LocatorUtils.property(thatLocator, "zeroTwelveThree", rhsZeroTwelveThree), lhsZeroTwelveThree, rhsZeroTwelveThree)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theZeroTwelveOne;
            theZeroTwelveOne = this.getZeroTwelveOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwelveOne", theZeroTwelveOne), currentHashCode, theZeroTwelveOne);
        }
        {
            String theZeroTwelveTwo;
            theZeroTwelveTwo = this.getZeroTwelveTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwelveTwo", theZeroTwelveTwo), currentHashCode, theZeroTwelveTwo);
        }
        {
            XMLGregorianCalendar theZeroTwelveThree;
            theZeroTwelveThree = this.getZeroTwelveThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwelveThree", theZeroTwelveThree), currentHashCode, theZeroTwelveThree);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
