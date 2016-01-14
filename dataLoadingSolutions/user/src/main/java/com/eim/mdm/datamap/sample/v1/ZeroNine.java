
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
 * <p>Java class for ZeroNine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroNine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroNineOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha1000"/>
 *         &lt;element name="zeroNineTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroNine", propOrder = {
    "zeroNineOne",
    "zeroNineTwo"
})
public class ZeroNine
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroNineOne;
    @XmlElement(required = true)
    protected String zeroNineTwo;

    /**
     * Gets the value of the zeroNineOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroNineOne() {
        return zeroNineOne;
    }

    /**
     * Sets the value of the zeroNineOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroNineOne(String value) {
        this.zeroNineOne = value;
    }

    /**
     * Gets the value of the zeroNineTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroNineTwo() {
        return zeroNineTwo;
    }

    /**
     * Sets the value of the zeroNineTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroNineTwo(String value) {
        this.zeroNineTwo = value;
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
            String theZeroNineOne;
            theZeroNineOne = this.getZeroNineOne();
            strategy.appendField(locator, this, "zeroNineOne", buffer, theZeroNineOne);
        }
        {
            String theZeroNineTwo;
            theZeroNineTwo = this.getZeroNineTwo();
            strategy.appendField(locator, this, "zeroNineTwo", buffer, theZeroNineTwo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroNine)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroNine that = ((ZeroNine) object);
        {
            String lhsZeroNineOne;
            lhsZeroNineOne = this.getZeroNineOne();
            String rhsZeroNineOne;
            rhsZeroNineOne = that.getZeroNineOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineOne", lhsZeroNineOne), LocatorUtils.property(thatLocator, "zeroNineOne", rhsZeroNineOne), lhsZeroNineOne, rhsZeroNineOne)) {
                return false;
            }
        }
        {
            String lhsZeroNineTwo;
            lhsZeroNineTwo = this.getZeroNineTwo();
            String rhsZeroNineTwo;
            rhsZeroNineTwo = that.getZeroNineTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineTwo", lhsZeroNineTwo), LocatorUtils.property(thatLocator, "zeroNineTwo", rhsZeroNineTwo), lhsZeroNineTwo, rhsZeroNineTwo)) {
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
            String theZeroNineOne;
            theZeroNineOne = this.getZeroNineOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineOne", theZeroNineOne), currentHashCode, theZeroNineOne);
        }
        {
            String theZeroNineTwo;
            theZeroNineTwo = this.getZeroNineTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineTwo", theZeroNineTwo), currentHashCode, theZeroNineTwo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
