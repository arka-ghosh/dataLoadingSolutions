
package com.eim.mdm.datamap.sample.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for ZeroTwo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwoOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2"/>
 *         &lt;element name="zeroTwoTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha80"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwo", propOrder = {
    "zeroTwoOne",
    "zeroTwoTwo"
})
public class ZeroTwo
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroTwoOne;
    @XmlElement(required = true)
    protected String zeroTwoTwo;

    /**
     * Gets the value of the zeroTwoOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwoOne() {
        return zeroTwoOne;
    }

    /**
     * Sets the value of the zeroTwoOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwoOne(String value) {
        this.zeroTwoOne = value;
    }

    /**
     * Gets the value of the zeroTwoTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwoTwo() {
        return zeroTwoTwo;
    }

    /**
     * Sets the value of the zeroTwoTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwoTwo(String value) {
        this.zeroTwoTwo = value;
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
            String theZeroTwoOne;
            theZeroTwoOne = this.getZeroTwoOne();
            strategy.appendField(locator, this, "zeroTwoOne", buffer, theZeroTwoOne);
        }
        {
            String theZeroTwoTwo;
            theZeroTwoTwo = this.getZeroTwoTwo();
            strategy.appendField(locator, this, "zeroTwoTwo", buffer, theZeroTwoTwo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwo that = ((ZeroTwo) object);
        {
            String lhsZeroTwoOne;
            lhsZeroTwoOne = this.getZeroTwoOne();
            String rhsZeroTwoOne;
            rhsZeroTwoOne = that.getZeroTwoOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwoOne", lhsZeroTwoOne), LocatorUtils.property(thatLocator, "zeroTwoOne", rhsZeroTwoOne), lhsZeroTwoOne, rhsZeroTwoOne)) {
                return false;
            }
        }
        {
            String lhsZeroTwoTwo;
            lhsZeroTwoTwo = this.getZeroTwoTwo();
            String rhsZeroTwoTwo;
            rhsZeroTwoTwo = that.getZeroTwoTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwoTwo", lhsZeroTwoTwo), LocatorUtils.property(thatLocator, "zeroTwoTwo", rhsZeroTwoTwo), lhsZeroTwoTwo, rhsZeroTwoTwo)) {
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
            String theZeroTwoOne;
            theZeroTwoOne = this.getZeroTwoOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwoOne", theZeroTwoOne), currentHashCode, theZeroTwoOne);
        }
        {
            String theZeroTwoTwo;
            theZeroTwoTwo = this.getZeroTwoTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwoTwo", theZeroTwoTwo), currentHashCode, theZeroTwoTwo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
