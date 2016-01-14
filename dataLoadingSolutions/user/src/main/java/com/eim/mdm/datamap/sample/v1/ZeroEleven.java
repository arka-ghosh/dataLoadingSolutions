
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
 * <p>Java class for ZeroEleven complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroEleven">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroElevenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *         &lt;element name="zeroElevenTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroNine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroEleven", propOrder = {
    "zeroElevenOne",
    "zeroElevenTwo"
})
public class ZeroEleven
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroElevenOne;
    @XmlElement(required = true)
    protected ZeroNine zeroElevenTwo;

    /**
     * Gets the value of the zeroElevenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroElevenOne() {
        return zeroElevenOne;
    }

    /**
     * Sets the value of the zeroElevenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroElevenOne(String value) {
        this.zeroElevenOne = value;
    }

    /**
     * Gets the value of the zeroElevenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroNine }
     *     
     */
    public ZeroNine getZeroElevenTwo() {
        return zeroElevenTwo;
    }

    /**
     * Sets the value of the zeroElevenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroNine }
     *     
     */
    public void setZeroElevenTwo(ZeroNine value) {
        this.zeroElevenTwo = value;
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
            String theZeroElevenOne;
            theZeroElevenOne = this.getZeroElevenOne();
            strategy.appendField(locator, this, "zeroElevenOne", buffer, theZeroElevenOne);
        }
        {
            ZeroNine theZeroElevenTwo;
            theZeroElevenTwo = this.getZeroElevenTwo();
            strategy.appendField(locator, this, "zeroElevenTwo", buffer, theZeroElevenTwo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroEleven)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroEleven that = ((ZeroEleven) object);
        {
            String lhsZeroElevenOne;
            lhsZeroElevenOne = this.getZeroElevenOne();
            String rhsZeroElevenOne;
            rhsZeroElevenOne = that.getZeroElevenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroElevenOne", lhsZeroElevenOne), LocatorUtils.property(thatLocator, "zeroElevenOne", rhsZeroElevenOne), lhsZeroElevenOne, rhsZeroElevenOne)) {
                return false;
            }
        }
        {
            ZeroNine lhsZeroElevenTwo;
            lhsZeroElevenTwo = this.getZeroElevenTwo();
            ZeroNine rhsZeroElevenTwo;
            rhsZeroElevenTwo = that.getZeroElevenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroElevenTwo", lhsZeroElevenTwo), LocatorUtils.property(thatLocator, "zeroElevenTwo", rhsZeroElevenTwo), lhsZeroElevenTwo, rhsZeroElevenTwo)) {
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
            String theZeroElevenOne;
            theZeroElevenOne = this.getZeroElevenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroElevenOne", theZeroElevenOne), currentHashCode, theZeroElevenOne);
        }
        {
            ZeroNine theZeroElevenTwo;
            theZeroElevenTwo = this.getZeroElevenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroElevenTwo", theZeroElevenTwo), currentHashCode, theZeroElevenTwo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
