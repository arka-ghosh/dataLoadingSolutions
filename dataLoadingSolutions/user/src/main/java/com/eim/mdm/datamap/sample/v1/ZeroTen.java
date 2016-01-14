
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
 * <p>Java class for ZeroTen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *         &lt;element name="zeroTenTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha80"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTen", propOrder = {
    "zeroTenOne",
    "zeroTenTwo"
})
public class ZeroTen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroTenOne;
    @XmlElement(required = true)
    protected String zeroTenTwo;

    /**
     * Gets the value of the zeroTenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTenOne() {
        return zeroTenOne;
    }

    /**
     * Sets the value of the zeroTenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTenOne(String value) {
        this.zeroTenOne = value;
    }

    /**
     * Gets the value of the zeroTenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTenTwo() {
        return zeroTenTwo;
    }

    /**
     * Sets the value of the zeroTenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTenTwo(String value) {
        this.zeroTenTwo = value;
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
            String theZeroTenOne;
            theZeroTenOne = this.getZeroTenOne();
            strategy.appendField(locator, this, "zeroTenOne", buffer, theZeroTenOne);
        }
        {
            String theZeroTenTwo;
            theZeroTenTwo = this.getZeroTenTwo();
            strategy.appendField(locator, this, "zeroTenTwo", buffer, theZeroTenTwo);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTen that = ((ZeroTen) object);
        {
            String lhsZeroTenOne;
            lhsZeroTenOne = this.getZeroTenOne();
            String rhsZeroTenOne;
            rhsZeroTenOne = that.getZeroTenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTenOne", lhsZeroTenOne), LocatorUtils.property(thatLocator, "zeroTenOne", rhsZeroTenOne), lhsZeroTenOne, rhsZeroTenOne)) {
                return false;
            }
        }
        {
            String lhsZeroTenTwo;
            lhsZeroTenTwo = this.getZeroTenTwo();
            String rhsZeroTenTwo;
            rhsZeroTenTwo = that.getZeroTenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTenTwo", lhsZeroTenTwo), LocatorUtils.property(thatLocator, "zeroTenTwo", rhsZeroTenTwo), lhsZeroTenTwo, rhsZeroTenTwo)) {
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
            String theZeroTenOne;
            theZeroTenOne = this.getZeroTenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTenOne", theZeroTenOne), currentHashCode, theZeroTenOne);
        }
        {
            String theZeroTenTwo;
            theZeroTenTwo = this.getZeroTenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTenTwo", theZeroTenTwo), currentHashCode, theZeroTenTwo);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
