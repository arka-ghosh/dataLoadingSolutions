
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
 * <p>Java class for ZeroFifteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroFifteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroFifteenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha10" minOccurs="0"/>
 *         &lt;element name="zeroFifteenTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" minOccurs="0"/>
 *         &lt;element name="zeroFifTeenThree" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.dhikChik.com/Sample/1.0/}alpha25">
 *               &lt;enumeration value="zeroFifteenThreeOne"/>
 *               &lt;enumeration value="zeroFifteenThreeTwo"/>
 *               &lt;enumeration value="zeroFifteenThreeThree"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zeroFifteenFour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroFifteenFive" type="{http://www.dhikChik.com/Sample/1.0/}alpha2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroFifteen", propOrder = {
    "zeroFifteenOne",
    "zeroFifteenTwo",
    "zeroFifTeenThree",
    "zeroFifteenFour",
    "zeroFifteenFive"
})
public class ZeroFifteen
    implements Equals, HashCode, ToString
{

    protected String zeroFifteenOne;
    protected String zeroFifteenTwo;
    protected String zeroFifTeenThree;
    protected Boolean zeroFifteenFour;
    protected String zeroFifteenFive;

    /**
     * Gets the value of the zeroFifteenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFifteenOne() {
        return zeroFifteenOne;
    }

    /**
     * Sets the value of the zeroFifteenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFifteenOne(String value) {
        this.zeroFifteenOne = value;
    }

    /**
     * Gets the value of the zeroFifteenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFifteenTwo() {
        return zeroFifteenTwo;
    }

    /**
     * Sets the value of the zeroFifteenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFifteenTwo(String value) {
        this.zeroFifteenTwo = value;
    }

    /**
     * Gets the value of the zeroFifTeenThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFifTeenThree() {
        return zeroFifTeenThree;
    }

    /**
     * Sets the value of the zeroFifTeenThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFifTeenThree(String value) {
        this.zeroFifTeenThree = value;
    }

    /**
     * Gets the value of the zeroFifteenFour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroFifteenFour() {
        return zeroFifteenFour;
    }

    /**
     * Sets the value of the zeroFifteenFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroFifteenFour(Boolean value) {
        this.zeroFifteenFour = value;
    }

    /**
     * Gets the value of the zeroFifteenFive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFifteenFive() {
        return zeroFifteenFive;
    }

    /**
     * Sets the value of the zeroFifteenFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFifteenFive(String value) {
        this.zeroFifteenFive = value;
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
            String theZeroFifteenOne;
            theZeroFifteenOne = this.getZeroFifteenOne();
            strategy.appendField(locator, this, "zeroFifteenOne", buffer, theZeroFifteenOne);
        }
        {
            String theZeroFifteenTwo;
            theZeroFifteenTwo = this.getZeroFifteenTwo();
            strategy.appendField(locator, this, "zeroFifteenTwo", buffer, theZeroFifteenTwo);
        }
        {
            String theZeroFifTeenThree;
            theZeroFifTeenThree = this.getZeroFifTeenThree();
            strategy.appendField(locator, this, "zeroFifTeenThree", buffer, theZeroFifTeenThree);
        }
        {
            Boolean theZeroFifteenFour;
            theZeroFifteenFour = this.isZeroFifteenFour();
            strategy.appendField(locator, this, "zeroFifteenFour", buffer, theZeroFifteenFour);
        }
        {
            String theZeroFifteenFive;
            theZeroFifteenFive = this.getZeroFifteenFive();
            strategy.appendField(locator, this, "zeroFifteenFive", buffer, theZeroFifteenFive);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroFifteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroFifteen that = ((ZeroFifteen) object);
        {
            String lhsZeroFifteenOne;
            lhsZeroFifteenOne = this.getZeroFifteenOne();
            String rhsZeroFifteenOne;
            rhsZeroFifteenOne = that.getZeroFifteenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFifteenOne", lhsZeroFifteenOne), LocatorUtils.property(thatLocator, "zeroFifteenOne", rhsZeroFifteenOne), lhsZeroFifteenOne, rhsZeroFifteenOne)) {
                return false;
            }
        }
        {
            String lhsZeroFifteenTwo;
            lhsZeroFifteenTwo = this.getZeroFifteenTwo();
            String rhsZeroFifteenTwo;
            rhsZeroFifteenTwo = that.getZeroFifteenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFifteenTwo", lhsZeroFifteenTwo), LocatorUtils.property(thatLocator, "zeroFifteenTwo", rhsZeroFifteenTwo), lhsZeroFifteenTwo, rhsZeroFifteenTwo)) {
                return false;
            }
        }
        {
            String lhsZeroFifTeenThree;
            lhsZeroFifTeenThree = this.getZeroFifTeenThree();
            String rhsZeroFifTeenThree;
            rhsZeroFifTeenThree = that.getZeroFifTeenThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFifTeenThree", lhsZeroFifTeenThree), LocatorUtils.property(thatLocator, "zeroFifTeenThree", rhsZeroFifTeenThree), lhsZeroFifTeenThree, rhsZeroFifTeenThree)) {
                return false;
            }
        }
        {
            Boolean lhsZeroFifteenFour;
            lhsZeroFifteenFour = this.isZeroFifteenFour();
            Boolean rhsZeroFifteenFour;
            rhsZeroFifteenFour = that.isZeroFifteenFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFifteenFour", lhsZeroFifteenFour), LocatorUtils.property(thatLocator, "zeroFifteenFour", rhsZeroFifteenFour), lhsZeroFifteenFour, rhsZeroFifteenFour)) {
                return false;
            }
        }
        {
            String lhsZeroFifteenFive;
            lhsZeroFifteenFive = this.getZeroFifteenFive();
            String rhsZeroFifteenFive;
            rhsZeroFifteenFive = that.getZeroFifteenFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFifteenFive", lhsZeroFifteenFive), LocatorUtils.property(thatLocator, "zeroFifteenFive", rhsZeroFifteenFive), lhsZeroFifteenFive, rhsZeroFifteenFive)) {
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
            String theZeroFifteenOne;
            theZeroFifteenOne = this.getZeroFifteenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFifteenOne", theZeroFifteenOne), currentHashCode, theZeroFifteenOne);
        }
        {
            String theZeroFifteenTwo;
            theZeroFifteenTwo = this.getZeroFifteenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFifteenTwo", theZeroFifteenTwo), currentHashCode, theZeroFifteenTwo);
        }
        {
            String theZeroFifTeenThree;
            theZeroFifTeenThree = this.getZeroFifTeenThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFifTeenThree", theZeroFifTeenThree), currentHashCode, theZeroFifTeenThree);
        }
        {
            Boolean theZeroFifteenFour;
            theZeroFifteenFour = this.isZeroFifteenFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFifteenFour", theZeroFifteenFour), currentHashCode, theZeroFifteenFour);
        }
        {
            String theZeroFifteenFive;
            theZeroFifteenFive = this.getZeroFifteenFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFifteenFive", theZeroFifteenFive), currentHashCode, theZeroFifteenFive);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
