
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
 * <p>Java class for ZeroTwenty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwenty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwenty", propOrder = {
    "zeroTwentyOne"
})
public class ZeroTwenty
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroTwentyOne;

    /**
     * Gets the value of the zeroTwentyOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyOne() {
        return zeroTwentyOne;
    }

    /**
     * Sets the value of the zeroTwentyOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyOne(String value) {
        this.zeroTwentyOne = value;
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
            String theZeroTwentyOne;
            theZeroTwentyOne = this.getZeroTwentyOne();
            strategy.appendField(locator, this, "zeroTwentyOne", buffer, theZeroTwentyOne);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwenty)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwenty that = ((ZeroTwenty) object);
        {
            String lhsZeroTwentyOne;
            lhsZeroTwentyOne = this.getZeroTwentyOne();
            String rhsZeroTwentyOne;
            rhsZeroTwentyOne = that.getZeroTwentyOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOne", lhsZeroTwentyOne), LocatorUtils.property(thatLocator, "zeroTwentyOne", rhsZeroTwentyOne), lhsZeroTwentyOne, rhsZeroTwentyOne)) {
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
            String theZeroTwentyOne;
            theZeroTwentyOne = this.getZeroTwentyOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOne", theZeroTwentyOne), currentHashCode, theZeroTwentyOne);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
