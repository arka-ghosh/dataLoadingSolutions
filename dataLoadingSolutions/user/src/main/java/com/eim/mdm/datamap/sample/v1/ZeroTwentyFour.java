
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
 * <p>Java class for ZeroTwentyFour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwentyFour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyFourOne" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zeroTwentyFourTwo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="zeroTwentyFourTwoOne"/>
 *               &lt;enumeration value="zeroTwentyFourTwoTwo"/>
 *               &lt;enumeration value="zeroTwentyFourTwoThree"/>
 *               &lt;enumeration value="zeroTwentyFourTwoFour"/>
 *               &lt;enumeration value="zeroTwentyFourTwoFive"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zeroTwentyFourThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyFourFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyFourFive" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwentyFour", propOrder = {
    "zeroTwentyFourOne",
    "zeroTwentyFourTwo",
    "zeroTwentyFourThree",
    "zeroTwentyFourFour",
    "zeroTwentyFourFive"
})
public class ZeroTwentyFour
    implements Equals, HashCode, ToString
{

    protected Long zeroTwentyFourOne;
    protected String zeroTwentyFourTwo;
    protected ZeroThirteen zeroTwentyFourThree;
    protected ZeroTen zeroTwentyFourFour;
    protected String zeroTwentyFourFive;

    /**
     * Gets the value of the zeroTwentyFourOne property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getZeroTwentyFourOne() {
        return zeroTwentyFourOne;
    }

    /**
     * Sets the value of the zeroTwentyFourOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setZeroTwentyFourOne(Long value) {
        this.zeroTwentyFourOne = value;
    }

    /**
     * Gets the value of the zeroTwentyFourTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyFourTwo() {
        return zeroTwentyFourTwo;
    }

    /**
     * Sets the value of the zeroTwentyFourTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyFourTwo(String value) {
        this.zeroTwentyFourTwo = value;
    }

    /**
     * Gets the value of the zeroTwentyFourThree property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroThirteen }
     *     
     */
    public ZeroThirteen getZeroTwentyFourThree() {
        return zeroTwentyFourThree;
    }

    /**
     * Sets the value of the zeroTwentyFourThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroThirteen }
     *     
     */
    public void setZeroTwentyFourThree(ZeroThirteen value) {
        this.zeroTwentyFourThree = value;
    }

    /**
     * Gets the value of the zeroTwentyFourFour property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroTwentyFourFour() {
        return zeroTwentyFourFour;
    }

    /**
     * Sets the value of the zeroTwentyFourFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroTwentyFourFour(ZeroTen value) {
        this.zeroTwentyFourFour = value;
    }

    /**
     * Gets the value of the zeroTwentyFourFive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyFourFive() {
        return zeroTwentyFourFive;
    }

    /**
     * Sets the value of the zeroTwentyFourFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyFourFive(String value) {
        this.zeroTwentyFourFive = value;
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
            Long theZeroTwentyFourOne;
            theZeroTwentyFourOne = this.getZeroTwentyFourOne();
            strategy.appendField(locator, this, "zeroTwentyFourOne", buffer, theZeroTwentyFourOne);
        }
        {
            String theZeroTwentyFourTwo;
            theZeroTwentyFourTwo = this.getZeroTwentyFourTwo();
            strategy.appendField(locator, this, "zeroTwentyFourTwo", buffer, theZeroTwentyFourTwo);
        }
        {
            ZeroThirteen theZeroTwentyFourThree;
            theZeroTwentyFourThree = this.getZeroTwentyFourThree();
            strategy.appendField(locator, this, "zeroTwentyFourThree", buffer, theZeroTwentyFourThree);
        }
        {
            ZeroTen theZeroTwentyFourFour;
            theZeroTwentyFourFour = this.getZeroTwentyFourFour();
            strategy.appendField(locator, this, "zeroTwentyFourFour", buffer, theZeroTwentyFourFour);
        }
        {
            String theZeroTwentyFourFive;
            theZeroTwentyFourFive = this.getZeroTwentyFourFive();
            strategy.appendField(locator, this, "zeroTwentyFourFive", buffer, theZeroTwentyFourFive);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwentyFour)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwentyFour that = ((ZeroTwentyFour) object);
        {
            Long lhsZeroTwentyFourOne;
            lhsZeroTwentyFourOne = this.getZeroTwentyFourOne();
            Long rhsZeroTwentyFourOne;
            rhsZeroTwentyFourOne = that.getZeroTwentyFourOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFourOne", lhsZeroTwentyFourOne), LocatorUtils.property(thatLocator, "zeroTwentyFourOne", rhsZeroTwentyFourOne), lhsZeroTwentyFourOne, rhsZeroTwentyFourOne)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyFourTwo;
            lhsZeroTwentyFourTwo = this.getZeroTwentyFourTwo();
            String rhsZeroTwentyFourTwo;
            rhsZeroTwentyFourTwo = that.getZeroTwentyFourTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFourTwo", lhsZeroTwentyFourTwo), LocatorUtils.property(thatLocator, "zeroTwentyFourTwo", rhsZeroTwentyFourTwo), lhsZeroTwentyFourTwo, rhsZeroTwentyFourTwo)) {
                return false;
            }
        }
        {
            ZeroThirteen lhsZeroTwentyFourThree;
            lhsZeroTwentyFourThree = this.getZeroTwentyFourThree();
            ZeroThirteen rhsZeroTwentyFourThree;
            rhsZeroTwentyFourThree = that.getZeroTwentyFourThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFourThree", lhsZeroTwentyFourThree), LocatorUtils.property(thatLocator, "zeroTwentyFourThree", rhsZeroTwentyFourThree), lhsZeroTwentyFourThree, rhsZeroTwentyFourThree)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroTwentyFourFour;
            lhsZeroTwentyFourFour = this.getZeroTwentyFourFour();
            ZeroTen rhsZeroTwentyFourFour;
            rhsZeroTwentyFourFour = that.getZeroTwentyFourFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFourFour", lhsZeroTwentyFourFour), LocatorUtils.property(thatLocator, "zeroTwentyFourFour", rhsZeroTwentyFourFour), lhsZeroTwentyFourFour, rhsZeroTwentyFourFour)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyFourFive;
            lhsZeroTwentyFourFive = this.getZeroTwentyFourFive();
            String rhsZeroTwentyFourFive;
            rhsZeroTwentyFourFive = that.getZeroTwentyFourFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFourFive", lhsZeroTwentyFourFive), LocatorUtils.property(thatLocator, "zeroTwentyFourFive", rhsZeroTwentyFourFive), lhsZeroTwentyFourFive, rhsZeroTwentyFourFive)) {
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
            Long theZeroTwentyFourOne;
            theZeroTwentyFourOne = this.getZeroTwentyFourOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFourOne", theZeroTwentyFourOne), currentHashCode, theZeroTwentyFourOne);
        }
        {
            String theZeroTwentyFourTwo;
            theZeroTwentyFourTwo = this.getZeroTwentyFourTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFourTwo", theZeroTwentyFourTwo), currentHashCode, theZeroTwentyFourTwo);
        }
        {
            ZeroThirteen theZeroTwentyFourThree;
            theZeroTwentyFourThree = this.getZeroTwentyFourThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFourThree", theZeroTwentyFourThree), currentHashCode, theZeroTwentyFourThree);
        }
        {
            ZeroTen theZeroTwentyFourFour;
            theZeroTwentyFourFour = this.getZeroTwentyFourFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFourFour", theZeroTwentyFourFour), currentHashCode, theZeroTwentyFourFour);
        }
        {
            String theZeroTwentyFourFive;
            theZeroTwentyFourFive = this.getZeroTwentyFourFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFourFive", theZeroTwentyFourFive), currentHashCode, theZeroTwentyFourFive);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
