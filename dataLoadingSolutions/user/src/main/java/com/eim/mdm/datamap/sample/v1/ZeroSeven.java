
package com.eim.mdm.datamap.sample.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for ZeroSeven complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroSeven">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroSevenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroSeven", propOrder = {
    "zeroSevenOne"
})
public class ZeroSeven
    implements Equals, HashCode, ToString
{

    protected String zeroSevenOne;

    /**
     * Gets the value of the zeroSevenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroSevenOne() {
        return zeroSevenOne;
    }

    /**
     * Sets the value of the zeroSevenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroSevenOne(String value) {
        this.zeroSevenOne = value;
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
            String theZeroSevenOne;
            theZeroSevenOne = this.getZeroSevenOne();
            strategy.appendField(locator, this, "zeroSevenOne", buffer, theZeroSevenOne);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroSeven)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroSeven that = ((ZeroSeven) object);
        {
            String lhsZeroSevenOne;
            lhsZeroSevenOne = this.getZeroSevenOne();
            String rhsZeroSevenOne;
            rhsZeroSevenOne = that.getZeroSevenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSevenOne", lhsZeroSevenOne), LocatorUtils.property(thatLocator, "zeroSevenOne", rhsZeroSevenOne), lhsZeroSevenOne, rhsZeroSevenOne)) {
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
            String theZeroSevenOne;
            theZeroSevenOne = this.getZeroSevenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSevenOne", theZeroSevenOne), currentHashCode, theZeroSevenOne);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
