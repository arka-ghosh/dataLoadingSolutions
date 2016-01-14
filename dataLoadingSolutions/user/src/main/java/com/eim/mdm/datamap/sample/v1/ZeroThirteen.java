
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
 * <p>Java class for ZeroThirteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroThirteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroThirteenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *         &lt;element name="zeroThirteenTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *         &lt;element name="zeroThirteenThree" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *         &lt;element name="zeroThirteenFour" type="{http://www.dhikChik.com/Sample/1.0/}alpha3"/>
 *         &lt;element name="zeroThirteenFive" type="{http://www.dhikChik.com/Sample/1.0/}alpha10"/>
 *         &lt;element name="zeroThirteenSix" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zeroThirteenSeven" type="{http://www.dhikChik.com/Sample/1.0/}DateRange"/>
 *         &lt;element name="zeroThirteenEight" type="{http://www.dhikChik.com/Sample/1.0/}Type"/>
 *         &lt;element name="zeroThirteenNine" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwo"/>
 *         &lt;element name="zeroThirteenTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThree"/>
 *         &lt;element name="zeroThirteenEleven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroThirteen", propOrder = {
    "zeroThirteenOne",
    "zeroThirteenTwo",
    "zeroThirteenThree",
    "zeroThirteenFour",
    "zeroThirteenFive",
    "zeroThirteenSix",
    "zeroThirteenSeven",
    "zeroThirteenEight",
    "zeroThirteenNine",
    "zeroThirteenTen",
    "zeroThirteenEleven"
})
public class ZeroThirteen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroThirteenOne;
    @XmlElement(required = true)
    protected String zeroThirteenTwo;
    @XmlElement(required = true)
    protected String zeroThirteenThree;
    @XmlElement(required = true)
    protected String zeroThirteenFour;
    @XmlElement(required = true)
    protected String zeroThirteenFive;
    protected boolean zeroThirteenSix;
    @XmlElement(required = true)
    protected DateRange zeroThirteenSeven;
    @XmlElement(required = true)
    protected Type zeroThirteenEight;
    @XmlElement(required = true)
    protected ZeroTwo zeroThirteenNine;
    @XmlElement(required = true)
    protected ZeroThree zeroThirteenTen;
    @XmlElement(required = true)
    protected ZeroFourteen zeroThirteenEleven;

    /**
     * Gets the value of the zeroThirteenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThirteenOne() {
        return zeroThirteenOne;
    }

    /**
     * Sets the value of the zeroThirteenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThirteenOne(String value) {
        this.zeroThirteenOne = value;
    }

    /**
     * Gets the value of the zeroThirteenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThirteenTwo() {
        return zeroThirteenTwo;
    }

    /**
     * Sets the value of the zeroThirteenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThirteenTwo(String value) {
        this.zeroThirteenTwo = value;
    }

    /**
     * Gets the value of the zeroThirteenThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThirteenThree() {
        return zeroThirteenThree;
    }

    /**
     * Sets the value of the zeroThirteenThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThirteenThree(String value) {
        this.zeroThirteenThree = value;
    }

    /**
     * Gets the value of the zeroThirteenFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThirteenFour() {
        return zeroThirteenFour;
    }

    /**
     * Sets the value of the zeroThirteenFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThirteenFour(String value) {
        this.zeroThirteenFour = value;
    }

    /**
     * Gets the value of the zeroThirteenFive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThirteenFive() {
        return zeroThirteenFive;
    }

    /**
     * Sets the value of the zeroThirteenFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThirteenFive(String value) {
        this.zeroThirteenFive = value;
    }

    /**
     * Gets the value of the zeroThirteenSix property.
     * 
     */
    public boolean isZeroThirteenSix() {
        return zeroThirteenSix;
    }

    /**
     * Sets the value of the zeroThirteenSix property.
     * 
     */
    public void setZeroThirteenSix(boolean value) {
        this.zeroThirteenSix = value;
    }

    /**
     * Gets the value of the zeroThirteenSeven property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getZeroThirteenSeven() {
        return zeroThirteenSeven;
    }

    /**
     * Sets the value of the zeroThirteenSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setZeroThirteenSeven(DateRange value) {
        this.zeroThirteenSeven = value;
    }

    /**
     * Gets the value of the zeroThirteenEight property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getZeroThirteenEight() {
        return zeroThirteenEight;
    }

    /**
     * Sets the value of the zeroThirteenEight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setZeroThirteenEight(Type value) {
        this.zeroThirteenEight = value;
    }

    /**
     * Gets the value of the zeroThirteenNine property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTwo }
     *     
     */
    public ZeroTwo getZeroThirteenNine() {
        return zeroThirteenNine;
    }

    /**
     * Sets the value of the zeroThirteenNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTwo }
     *     
     */
    public void setZeroThirteenNine(ZeroTwo value) {
        this.zeroThirteenNine = value;
    }

    /**
     * Gets the value of the zeroThirteenTen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroThree }
     *     
     */
    public ZeroThree getZeroThirteenTen() {
        return zeroThirteenTen;
    }

    /**
     * Sets the value of the zeroThirteenTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroThree }
     *     
     */
    public void setZeroThirteenTen(ZeroThree value) {
        this.zeroThirteenTen = value;
    }

    /**
     * Gets the value of the zeroThirteenEleven property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroFourteen }
     *     
     */
    public ZeroFourteen getZeroThirteenEleven() {
        return zeroThirteenEleven;
    }

    /**
     * Sets the value of the zeroThirteenEleven property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroFourteen }
     *     
     */
    public void setZeroThirteenEleven(ZeroFourteen value) {
        this.zeroThirteenEleven = value;
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
            String theZeroThirteenOne;
            theZeroThirteenOne = this.getZeroThirteenOne();
            strategy.appendField(locator, this, "zeroThirteenOne", buffer, theZeroThirteenOne);
        }
        {
            String theZeroThirteenTwo;
            theZeroThirteenTwo = this.getZeroThirteenTwo();
            strategy.appendField(locator, this, "zeroThirteenTwo", buffer, theZeroThirteenTwo);
        }
        {
            String theZeroThirteenThree;
            theZeroThirteenThree = this.getZeroThirteenThree();
            strategy.appendField(locator, this, "zeroThirteenThree", buffer, theZeroThirteenThree);
        }
        {
            String theZeroThirteenFour;
            theZeroThirteenFour = this.getZeroThirteenFour();
            strategy.appendField(locator, this, "zeroThirteenFour", buffer, theZeroThirteenFour);
        }
        {
            String theZeroThirteenFive;
            theZeroThirteenFive = this.getZeroThirteenFive();
            strategy.appendField(locator, this, "zeroThirteenFive", buffer, theZeroThirteenFive);
        }
        {
            boolean theZeroThirteenSix;
            theZeroThirteenSix = this.isZeroThirteenSix();
            strategy.appendField(locator, this, "zeroThirteenSix", buffer, theZeroThirteenSix);
        }
        {
            DateRange theZeroThirteenSeven;
            theZeroThirteenSeven = this.getZeroThirteenSeven();
            strategy.appendField(locator, this, "zeroThirteenSeven", buffer, theZeroThirteenSeven);
        }
        {
            Type theZeroThirteenEight;
            theZeroThirteenEight = this.getZeroThirteenEight();
            strategy.appendField(locator, this, "zeroThirteenEight", buffer, theZeroThirteenEight);
        }
        {
            ZeroTwo theZeroThirteenNine;
            theZeroThirteenNine = this.getZeroThirteenNine();
            strategy.appendField(locator, this, "zeroThirteenNine", buffer, theZeroThirteenNine);
        }
        {
            ZeroThree theZeroThirteenTen;
            theZeroThirteenTen = this.getZeroThirteenTen();
            strategy.appendField(locator, this, "zeroThirteenTen", buffer, theZeroThirteenTen);
        }
        {
            ZeroFourteen theZeroThirteenEleven;
            theZeroThirteenEleven = this.getZeroThirteenEleven();
            strategy.appendField(locator, this, "zeroThirteenEleven", buffer, theZeroThirteenEleven);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroThirteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroThirteen that = ((ZeroThirteen) object);
        {
            String lhsZeroThirteenOne;
            lhsZeroThirteenOne = this.getZeroThirteenOne();
            String rhsZeroThirteenOne;
            rhsZeroThirteenOne = that.getZeroThirteenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenOne", lhsZeroThirteenOne), LocatorUtils.property(thatLocator, "zeroThirteenOne", rhsZeroThirteenOne), lhsZeroThirteenOne, rhsZeroThirteenOne)) {
                return false;
            }
        }
        {
            String lhsZeroThirteenTwo;
            lhsZeroThirteenTwo = this.getZeroThirteenTwo();
            String rhsZeroThirteenTwo;
            rhsZeroThirteenTwo = that.getZeroThirteenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenTwo", lhsZeroThirteenTwo), LocatorUtils.property(thatLocator, "zeroThirteenTwo", rhsZeroThirteenTwo), lhsZeroThirteenTwo, rhsZeroThirteenTwo)) {
                return false;
            }
        }
        {
            String lhsZeroThirteenThree;
            lhsZeroThirteenThree = this.getZeroThirteenThree();
            String rhsZeroThirteenThree;
            rhsZeroThirteenThree = that.getZeroThirteenThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenThree", lhsZeroThirteenThree), LocatorUtils.property(thatLocator, "zeroThirteenThree", rhsZeroThirteenThree), lhsZeroThirteenThree, rhsZeroThirteenThree)) {
                return false;
            }
        }
        {
            String lhsZeroThirteenFour;
            lhsZeroThirteenFour = this.getZeroThirteenFour();
            String rhsZeroThirteenFour;
            rhsZeroThirteenFour = that.getZeroThirteenFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenFour", lhsZeroThirteenFour), LocatorUtils.property(thatLocator, "zeroThirteenFour", rhsZeroThirteenFour), lhsZeroThirteenFour, rhsZeroThirteenFour)) {
                return false;
            }
        }
        {
            String lhsZeroThirteenFive;
            lhsZeroThirteenFive = this.getZeroThirteenFive();
            String rhsZeroThirteenFive;
            rhsZeroThirteenFive = that.getZeroThirteenFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenFive", lhsZeroThirteenFive), LocatorUtils.property(thatLocator, "zeroThirteenFive", rhsZeroThirteenFive), lhsZeroThirteenFive, rhsZeroThirteenFive)) {
                return false;
            }
        }
        {
            boolean lhsZeroThirteenSix;
            lhsZeroThirteenSix = this.isZeroThirteenSix();
            boolean rhsZeroThirteenSix;
            rhsZeroThirteenSix = that.isZeroThirteenSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenSix", lhsZeroThirteenSix), LocatorUtils.property(thatLocator, "zeroThirteenSix", rhsZeroThirteenSix), lhsZeroThirteenSix, rhsZeroThirteenSix)) {
                return false;
            }
        }
        {
            DateRange lhsZeroThirteenSeven;
            lhsZeroThirteenSeven = this.getZeroThirteenSeven();
            DateRange rhsZeroThirteenSeven;
            rhsZeroThirteenSeven = that.getZeroThirteenSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenSeven", lhsZeroThirteenSeven), LocatorUtils.property(thatLocator, "zeroThirteenSeven", rhsZeroThirteenSeven), lhsZeroThirteenSeven, rhsZeroThirteenSeven)) {
                return false;
            }
        }
        {
            Type lhsZeroThirteenEight;
            lhsZeroThirteenEight = this.getZeroThirteenEight();
            Type rhsZeroThirteenEight;
            rhsZeroThirteenEight = that.getZeroThirteenEight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenEight", lhsZeroThirteenEight), LocatorUtils.property(thatLocator, "zeroThirteenEight", rhsZeroThirteenEight), lhsZeroThirteenEight, rhsZeroThirteenEight)) {
                return false;
            }
        }
        {
            ZeroTwo lhsZeroThirteenNine;
            lhsZeroThirteenNine = this.getZeroThirteenNine();
            ZeroTwo rhsZeroThirteenNine;
            rhsZeroThirteenNine = that.getZeroThirteenNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenNine", lhsZeroThirteenNine), LocatorUtils.property(thatLocator, "zeroThirteenNine", rhsZeroThirteenNine), lhsZeroThirteenNine, rhsZeroThirteenNine)) {
                return false;
            }
        }
        {
            ZeroThree lhsZeroThirteenTen;
            lhsZeroThirteenTen = this.getZeroThirteenTen();
            ZeroThree rhsZeroThirteenTen;
            rhsZeroThirteenTen = that.getZeroThirteenTen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenTen", lhsZeroThirteenTen), LocatorUtils.property(thatLocator, "zeroThirteenTen", rhsZeroThirteenTen), lhsZeroThirteenTen, rhsZeroThirteenTen)) {
                return false;
            }
        }
        {
            ZeroFourteen lhsZeroThirteenEleven;
            lhsZeroThirteenEleven = this.getZeroThirteenEleven();
            ZeroFourteen rhsZeroThirteenEleven;
            rhsZeroThirteenEleven = that.getZeroThirteenEleven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThirteenEleven", lhsZeroThirteenEleven), LocatorUtils.property(thatLocator, "zeroThirteenEleven", rhsZeroThirteenEleven), lhsZeroThirteenEleven, rhsZeroThirteenEleven)) {
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
            String theZeroThirteenOne;
            theZeroThirteenOne = this.getZeroThirteenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenOne", theZeroThirteenOne), currentHashCode, theZeroThirteenOne);
        }
        {
            String theZeroThirteenTwo;
            theZeroThirteenTwo = this.getZeroThirteenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenTwo", theZeroThirteenTwo), currentHashCode, theZeroThirteenTwo);
        }
        {
            String theZeroThirteenThree;
            theZeroThirteenThree = this.getZeroThirteenThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenThree", theZeroThirteenThree), currentHashCode, theZeroThirteenThree);
        }
        {
            String theZeroThirteenFour;
            theZeroThirteenFour = this.getZeroThirteenFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenFour", theZeroThirteenFour), currentHashCode, theZeroThirteenFour);
        }
        {
            String theZeroThirteenFive;
            theZeroThirteenFive = this.getZeroThirteenFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenFive", theZeroThirteenFive), currentHashCode, theZeroThirteenFive);
        }
        {
            boolean theZeroThirteenSix;
            theZeroThirteenSix = this.isZeroThirteenSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenSix", theZeroThirteenSix), currentHashCode, theZeroThirteenSix);
        }
        {
            DateRange theZeroThirteenSeven;
            theZeroThirteenSeven = this.getZeroThirteenSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenSeven", theZeroThirteenSeven), currentHashCode, theZeroThirteenSeven);
        }
        {
            Type theZeroThirteenEight;
            theZeroThirteenEight = this.getZeroThirteenEight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenEight", theZeroThirteenEight), currentHashCode, theZeroThirteenEight);
        }
        {
            ZeroTwo theZeroThirteenNine;
            theZeroThirteenNine = this.getZeroThirteenNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenNine", theZeroThirteenNine), currentHashCode, theZeroThirteenNine);
        }
        {
            ZeroThree theZeroThirteenTen;
            theZeroThirteenTen = this.getZeroThirteenTen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenTen", theZeroThirteenTen), currentHashCode, theZeroThirteenTen);
        }
        {
            ZeroFourteen theZeroThirteenEleven;
            theZeroThirteenEleven = this.getZeroThirteenEleven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThirteenEleven", theZeroThirteenEleven), currentHashCode, theZeroThirteenEleven);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
