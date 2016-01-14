
package com.eim.mdm.datamap.sample.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ZeroOne complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroOne">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroSeventeen">
 *       &lt;sequence>
 *         &lt;element name="zeroOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha10"/>
 *         &lt;element name="zeroOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha10" minOccurs="0"/>
 *         &lt;element name="zeroOneThree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroOneFour" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="zeroOneFive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zeroOneSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEighteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroOneSeven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroOneEight" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroOne", propOrder = {
    "zeroOneOne",
    "zeroOneTwo",
    "zeroOneThree",
    "zeroOneFour",
    "zeroOneFive",
    "zeroOneSix",
    "zeroOneSeven",
    "zeroOneEight"
})
@XmlSeeAlso({
    com.eim.mdm.datamap.sample.v1.RootElement.One.OneOne.class
})
public class ZeroOne
    extends ZeroSeventeen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroOneOne;
    protected String zeroOneTwo;
    @XmlElement(required = true)
    protected String zeroOneThree;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger zeroOneFour;
    protected boolean zeroOneFive;
    protected List<ZeroEighteen> zeroOneSix;
    protected ZeroTen zeroOneSeven;
    protected String zeroOneEight;

    /**
     * Gets the value of the zeroOneOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroOneOne() {
        return zeroOneOne;
    }

    /**
     * Sets the value of the zeroOneOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroOneOne(String value) {
        this.zeroOneOne = value;
    }

    /**
     * Gets the value of the zeroOneTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroOneTwo() {
        return zeroOneTwo;
    }

    /**
     * Sets the value of the zeroOneTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroOneTwo(String value) {
        this.zeroOneTwo = value;
    }

    /**
     * Gets the value of the zeroOneThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroOneThree() {
        return zeroOneThree;
    }

    /**
     * Sets the value of the zeroOneThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroOneThree(String value) {
        this.zeroOneThree = value;
    }

    /**
     * Gets the value of the zeroOneFour property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZeroOneFour() {
        return zeroOneFour;
    }

    /**
     * Sets the value of the zeroOneFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZeroOneFour(BigInteger value) {
        this.zeroOneFour = value;
    }

    /**
     * Gets the value of the zeroOneFive property.
     * 
     */
    public boolean isZeroOneFive() {
        return zeroOneFive;
    }

    /**
     * Sets the value of the zeroOneFive property.
     * 
     */
    public void setZeroOneFive(boolean value) {
        this.zeroOneFive = value;
    }

    /**
     * Gets the value of the zeroOneSix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroOneSix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroOneSix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroEighteen }
     * 
     * 
     */
    public List<ZeroEighteen> getZeroOneSix() {
        if (zeroOneSix == null) {
            zeroOneSix = new ArrayList<ZeroEighteen>();
        }
        return this.zeroOneSix;
    }

    /**
     * Gets the value of the zeroOneSeven property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroOneSeven() {
        return zeroOneSeven;
    }

    /**
     * Sets the value of the zeroOneSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroOneSeven(ZeroTen value) {
        this.zeroOneSeven = value;
    }

    /**
     * Gets the value of the zeroOneEight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroOneEight() {
        return zeroOneEight;
    }

    /**
     * Sets the value of the zeroOneEight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroOneEight(String value) {
        this.zeroOneEight = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            String theZeroOneOne;
            theZeroOneOne = this.getZeroOneOne();
            strategy.appendField(locator, this, "zeroOneOne", buffer, theZeroOneOne);
        }
        {
            String theZeroOneTwo;
            theZeroOneTwo = this.getZeroOneTwo();
            strategy.appendField(locator, this, "zeroOneTwo", buffer, theZeroOneTwo);
        }
        {
            String theZeroOneThree;
            theZeroOneThree = this.getZeroOneThree();
            strategy.appendField(locator, this, "zeroOneThree", buffer, theZeroOneThree);
        }
        {
            BigInteger theZeroOneFour;
            theZeroOneFour = this.getZeroOneFour();
            strategy.appendField(locator, this, "zeroOneFour", buffer, theZeroOneFour);
        }
        {
            boolean theZeroOneFive;
            theZeroOneFive = this.isZeroOneFive();
            strategy.appendField(locator, this, "zeroOneFive", buffer, theZeroOneFive);
        }
        {
            List<ZeroEighteen> theZeroOneSix;
            theZeroOneSix = (((this.zeroOneSix!= null)&&(!this.zeroOneSix.isEmpty()))?this.getZeroOneSix():null);
            strategy.appendField(locator, this, "zeroOneSix", buffer, theZeroOneSix);
        }
        {
            ZeroTen theZeroOneSeven;
            theZeroOneSeven = this.getZeroOneSeven();
            strategy.appendField(locator, this, "zeroOneSeven", buffer, theZeroOneSeven);
        }
        {
            String theZeroOneEight;
            theZeroOneEight = this.getZeroOneEight();
            strategy.appendField(locator, this, "zeroOneEight", buffer, theZeroOneEight);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroOne)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ZeroOne that = ((ZeroOne) object);
        {
            String lhsZeroOneOne;
            lhsZeroOneOne = this.getZeroOneOne();
            String rhsZeroOneOne;
            rhsZeroOneOne = that.getZeroOneOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneOne", lhsZeroOneOne), LocatorUtils.property(thatLocator, "zeroOneOne", rhsZeroOneOne), lhsZeroOneOne, rhsZeroOneOne)) {
                return false;
            }
        }
        {
            String lhsZeroOneTwo;
            lhsZeroOneTwo = this.getZeroOneTwo();
            String rhsZeroOneTwo;
            rhsZeroOneTwo = that.getZeroOneTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneTwo", lhsZeroOneTwo), LocatorUtils.property(thatLocator, "zeroOneTwo", rhsZeroOneTwo), lhsZeroOneTwo, rhsZeroOneTwo)) {
                return false;
            }
        }
        {
            String lhsZeroOneThree;
            lhsZeroOneThree = this.getZeroOneThree();
            String rhsZeroOneThree;
            rhsZeroOneThree = that.getZeroOneThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneThree", lhsZeroOneThree), LocatorUtils.property(thatLocator, "zeroOneThree", rhsZeroOneThree), lhsZeroOneThree, rhsZeroOneThree)) {
                return false;
            }
        }
        {
            BigInteger lhsZeroOneFour;
            lhsZeroOneFour = this.getZeroOneFour();
            BigInteger rhsZeroOneFour;
            rhsZeroOneFour = that.getZeroOneFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneFour", lhsZeroOneFour), LocatorUtils.property(thatLocator, "zeroOneFour", rhsZeroOneFour), lhsZeroOneFour, rhsZeroOneFour)) {
                return false;
            }
        }
        {
            boolean lhsZeroOneFive;
            lhsZeroOneFive = this.isZeroOneFive();
            boolean rhsZeroOneFive;
            rhsZeroOneFive = that.isZeroOneFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneFive", lhsZeroOneFive), LocatorUtils.property(thatLocator, "zeroOneFive", rhsZeroOneFive), lhsZeroOneFive, rhsZeroOneFive)) {
                return false;
            }
        }
        {
            List<ZeroEighteen> lhsZeroOneSix;
            lhsZeroOneSix = (((this.zeroOneSix!= null)&&(!this.zeroOneSix.isEmpty()))?this.getZeroOneSix():null);
            List<ZeroEighteen> rhsZeroOneSix;
            rhsZeroOneSix = (((that.zeroOneSix!= null)&&(!that.zeroOneSix.isEmpty()))?that.getZeroOneSix():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneSix", lhsZeroOneSix), LocatorUtils.property(thatLocator, "zeroOneSix", rhsZeroOneSix), lhsZeroOneSix, rhsZeroOneSix)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroOneSeven;
            lhsZeroOneSeven = this.getZeroOneSeven();
            ZeroTen rhsZeroOneSeven;
            rhsZeroOneSeven = that.getZeroOneSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneSeven", lhsZeroOneSeven), LocatorUtils.property(thatLocator, "zeroOneSeven", rhsZeroOneSeven), lhsZeroOneSeven, rhsZeroOneSeven)) {
                return false;
            }
        }
        {
            String lhsZeroOneEight;
            lhsZeroOneEight = this.getZeroOneEight();
            String rhsZeroOneEight;
            rhsZeroOneEight = that.getZeroOneEight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroOneEight", lhsZeroOneEight), LocatorUtils.property(thatLocator, "zeroOneEight", rhsZeroOneEight), lhsZeroOneEight, rhsZeroOneEight)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theZeroOneOne;
            theZeroOneOne = this.getZeroOneOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneOne", theZeroOneOne), currentHashCode, theZeroOneOne);
        }
        {
            String theZeroOneTwo;
            theZeroOneTwo = this.getZeroOneTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneTwo", theZeroOneTwo), currentHashCode, theZeroOneTwo);
        }
        {
            String theZeroOneThree;
            theZeroOneThree = this.getZeroOneThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneThree", theZeroOneThree), currentHashCode, theZeroOneThree);
        }
        {
            BigInteger theZeroOneFour;
            theZeroOneFour = this.getZeroOneFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneFour", theZeroOneFour), currentHashCode, theZeroOneFour);
        }
        {
            boolean theZeroOneFive;
            theZeroOneFive = this.isZeroOneFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneFive", theZeroOneFive), currentHashCode, theZeroOneFive);
        }
        {
            List<ZeroEighteen> theZeroOneSix;
            theZeroOneSix = (((this.zeroOneSix!= null)&&(!this.zeroOneSix.isEmpty()))?this.getZeroOneSix():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneSix", theZeroOneSix), currentHashCode, theZeroOneSix);
        }
        {
            ZeroTen theZeroOneSeven;
            theZeroOneSeven = this.getZeroOneSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneSeven", theZeroOneSeven), currentHashCode, theZeroOneSeven);
        }
        {
            String theZeroOneEight;
            theZeroOneEight = this.getZeroOneEight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroOneEight", theZeroOneEight), currentHashCode, theZeroOneEight);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
