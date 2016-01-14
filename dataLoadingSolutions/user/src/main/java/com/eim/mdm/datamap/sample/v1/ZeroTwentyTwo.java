
package com.eim.mdm.datamap.sample.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * <p>Java class for ZeroTwentyTwo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwentyTwo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyTwoOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoTwo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zeroTwentyTwoThree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zeroTwentyTwoFour" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoFive" type="{http://www.dhikChik.com/Sample/1.0/}Type" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoSeven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoEight" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyFive" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoNine" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="zeroTwentyTwoTen" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwentyTwo", propOrder = {
    "zeroTwentyTwoOne",
    "zeroTwentyTwoTwo",
    "zeroTwentyTwoThree",
    "zeroTwentyTwoFour",
    "zeroTwentyTwoFive",
    "zeroTwentyTwoSix",
    "zeroTwentyTwoSeven",
    "zeroTwentyTwoEight",
    "zeroTwentyTwoNine",
    "zeroTwentyTwoTen"
})
public class ZeroTwentyTwo
    implements Equals, HashCode, ToString
{

    protected String zeroTwentyTwoOne;
    protected boolean zeroTwentyTwoTwo;
    protected boolean zeroTwentyTwoThree;
    protected List<String> zeroTwentyTwoFour;
    protected Type zeroTwentyTwoFive;
    protected List<ZeroThirteen> zeroTwentyTwoSix;
    protected ZeroTen zeroTwentyTwoSeven;
    protected List<ZeroTwentyFive> zeroTwentyTwoEight;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger zeroTwentyTwoNine;
    protected String zeroTwentyTwoTen;

    /**
     * Gets the value of the zeroTwentyTwoOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyTwoOne() {
        return zeroTwentyTwoOne;
    }

    /**
     * Sets the value of the zeroTwentyTwoOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyTwoOne(String value) {
        this.zeroTwentyTwoOne = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoTwo property.
     * 
     */
    public boolean isZeroTwentyTwoTwo() {
        return zeroTwentyTwoTwo;
    }

    /**
     * Sets the value of the zeroTwentyTwoTwo property.
     * 
     */
    public void setZeroTwentyTwoTwo(boolean value) {
        this.zeroTwentyTwoTwo = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoThree property.
     * 
     */
    public boolean isZeroTwentyTwoThree() {
        return zeroTwentyTwoThree;
    }

    /**
     * Sets the value of the zeroTwentyTwoThree property.
     * 
     */
    public void setZeroTwentyTwoThree(boolean value) {
        this.zeroTwentyTwoThree = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoFour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyTwoFour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyTwoFour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZeroTwentyTwoFour() {
        if (zeroTwentyTwoFour == null) {
            zeroTwentyTwoFour = new ArrayList<String>();
        }
        return this.zeroTwentyTwoFour;
    }

    /**
     * Gets the value of the zeroTwentyTwoFive property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getZeroTwentyTwoFive() {
        return zeroTwentyTwoFive;
    }

    /**
     * Sets the value of the zeroTwentyTwoFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setZeroTwentyTwoFive(Type value) {
        this.zeroTwentyTwoFive = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoSix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyTwoSix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyTwoSix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroThirteen }
     * 
     * 
     */
    public List<ZeroThirteen> getZeroTwentyTwoSix() {
        if (zeroTwentyTwoSix == null) {
            zeroTwentyTwoSix = new ArrayList<ZeroThirteen>();
        }
        return this.zeroTwentyTwoSix;
    }

    /**
     * Gets the value of the zeroTwentyTwoSeven property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroTwentyTwoSeven() {
        return zeroTwentyTwoSeven;
    }

    /**
     * Sets the value of the zeroTwentyTwoSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroTwentyTwoSeven(ZeroTen value) {
        this.zeroTwentyTwoSeven = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoEight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyTwoEight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyTwoEight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTwentyFive }
     * 
     * 
     */
    public List<ZeroTwentyFive> getZeroTwentyTwoEight() {
        if (zeroTwentyTwoEight == null) {
            zeroTwentyTwoEight = new ArrayList<ZeroTwentyFive>();
        }
        return this.zeroTwentyTwoEight;
    }

    /**
     * Gets the value of the zeroTwentyTwoNine property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZeroTwentyTwoNine() {
        return zeroTwentyTwoNine;
    }

    /**
     * Sets the value of the zeroTwentyTwoNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZeroTwentyTwoNine(BigInteger value) {
        this.zeroTwentyTwoNine = value;
    }

    /**
     * Gets the value of the zeroTwentyTwoTen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyTwoTen() {
        return zeroTwentyTwoTen;
    }

    /**
     * Sets the value of the zeroTwentyTwoTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyTwoTen(String value) {
        this.zeroTwentyTwoTen = value;
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
            String theZeroTwentyTwoOne;
            theZeroTwentyTwoOne = this.getZeroTwentyTwoOne();
            strategy.appendField(locator, this, "zeroTwentyTwoOne", buffer, theZeroTwentyTwoOne);
        }
        {
            boolean theZeroTwentyTwoTwo;
            theZeroTwentyTwoTwo = this.isZeroTwentyTwoTwo();
            strategy.appendField(locator, this, "zeroTwentyTwoTwo", buffer, theZeroTwentyTwoTwo);
        }
        {
            boolean theZeroTwentyTwoThree;
            theZeroTwentyTwoThree = this.isZeroTwentyTwoThree();
            strategy.appendField(locator, this, "zeroTwentyTwoThree", buffer, theZeroTwentyTwoThree);
        }
        {
            List<String> theZeroTwentyTwoFour;
            theZeroTwentyTwoFour = (((this.zeroTwentyTwoFour!= null)&&(!this.zeroTwentyTwoFour.isEmpty()))?this.getZeroTwentyTwoFour():null);
            strategy.appendField(locator, this, "zeroTwentyTwoFour", buffer, theZeroTwentyTwoFour);
        }
        {
            Type theZeroTwentyTwoFive;
            theZeroTwentyTwoFive = this.getZeroTwentyTwoFive();
            strategy.appendField(locator, this, "zeroTwentyTwoFive", buffer, theZeroTwentyTwoFive);
        }
        {
            List<ZeroThirteen> theZeroTwentyTwoSix;
            theZeroTwentyTwoSix = (((this.zeroTwentyTwoSix!= null)&&(!this.zeroTwentyTwoSix.isEmpty()))?this.getZeroTwentyTwoSix():null);
            strategy.appendField(locator, this, "zeroTwentyTwoSix", buffer, theZeroTwentyTwoSix);
        }
        {
            ZeroTen theZeroTwentyTwoSeven;
            theZeroTwentyTwoSeven = this.getZeroTwentyTwoSeven();
            strategy.appendField(locator, this, "zeroTwentyTwoSeven", buffer, theZeroTwentyTwoSeven);
        }
        {
            List<ZeroTwentyFive> theZeroTwentyTwoEight;
            theZeroTwentyTwoEight = (((this.zeroTwentyTwoEight!= null)&&(!this.zeroTwentyTwoEight.isEmpty()))?this.getZeroTwentyTwoEight():null);
            strategy.appendField(locator, this, "zeroTwentyTwoEight", buffer, theZeroTwentyTwoEight);
        }
        {
            BigInteger theZeroTwentyTwoNine;
            theZeroTwentyTwoNine = this.getZeroTwentyTwoNine();
            strategy.appendField(locator, this, "zeroTwentyTwoNine", buffer, theZeroTwentyTwoNine);
        }
        {
            String theZeroTwentyTwoTen;
            theZeroTwentyTwoTen = this.getZeroTwentyTwoTen();
            strategy.appendField(locator, this, "zeroTwentyTwoTen", buffer, theZeroTwentyTwoTen);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwentyTwo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwentyTwo that = ((ZeroTwentyTwo) object);
        {
            String lhsZeroTwentyTwoOne;
            lhsZeroTwentyTwoOne = this.getZeroTwentyTwoOne();
            String rhsZeroTwentyTwoOne;
            rhsZeroTwentyTwoOne = that.getZeroTwentyTwoOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoOne", lhsZeroTwentyTwoOne), LocatorUtils.property(thatLocator, "zeroTwentyTwoOne", rhsZeroTwentyTwoOne), lhsZeroTwentyTwoOne, rhsZeroTwentyTwoOne)) {
                return false;
            }
        }
        {
            boolean lhsZeroTwentyTwoTwo;
            lhsZeroTwentyTwoTwo = this.isZeroTwentyTwoTwo();
            boolean rhsZeroTwentyTwoTwo;
            rhsZeroTwentyTwoTwo = that.isZeroTwentyTwoTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoTwo", lhsZeroTwentyTwoTwo), LocatorUtils.property(thatLocator, "zeroTwentyTwoTwo", rhsZeroTwentyTwoTwo), lhsZeroTwentyTwoTwo, rhsZeroTwentyTwoTwo)) {
                return false;
            }
        }
        {
            boolean lhsZeroTwentyTwoThree;
            lhsZeroTwentyTwoThree = this.isZeroTwentyTwoThree();
            boolean rhsZeroTwentyTwoThree;
            rhsZeroTwentyTwoThree = that.isZeroTwentyTwoThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoThree", lhsZeroTwentyTwoThree), LocatorUtils.property(thatLocator, "zeroTwentyTwoThree", rhsZeroTwentyTwoThree), lhsZeroTwentyTwoThree, rhsZeroTwentyTwoThree)) {
                return false;
            }
        }
        {
            List<String> lhsZeroTwentyTwoFour;
            lhsZeroTwentyTwoFour = (((this.zeroTwentyTwoFour!= null)&&(!this.zeroTwentyTwoFour.isEmpty()))?this.getZeroTwentyTwoFour():null);
            List<String> rhsZeroTwentyTwoFour;
            rhsZeroTwentyTwoFour = (((that.zeroTwentyTwoFour!= null)&&(!that.zeroTwentyTwoFour.isEmpty()))?that.getZeroTwentyTwoFour():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoFour", lhsZeroTwentyTwoFour), LocatorUtils.property(thatLocator, "zeroTwentyTwoFour", rhsZeroTwentyTwoFour), lhsZeroTwentyTwoFour, rhsZeroTwentyTwoFour)) {
                return false;
            }
        }
        {
            Type lhsZeroTwentyTwoFive;
            lhsZeroTwentyTwoFive = this.getZeroTwentyTwoFive();
            Type rhsZeroTwentyTwoFive;
            rhsZeroTwentyTwoFive = that.getZeroTwentyTwoFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoFive", lhsZeroTwentyTwoFive), LocatorUtils.property(thatLocator, "zeroTwentyTwoFive", rhsZeroTwentyTwoFive), lhsZeroTwentyTwoFive, rhsZeroTwentyTwoFive)) {
                return false;
            }
        }
        {
            List<ZeroThirteen> lhsZeroTwentyTwoSix;
            lhsZeroTwentyTwoSix = (((this.zeroTwentyTwoSix!= null)&&(!this.zeroTwentyTwoSix.isEmpty()))?this.getZeroTwentyTwoSix():null);
            List<ZeroThirteen> rhsZeroTwentyTwoSix;
            rhsZeroTwentyTwoSix = (((that.zeroTwentyTwoSix!= null)&&(!that.zeroTwentyTwoSix.isEmpty()))?that.getZeroTwentyTwoSix():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoSix", lhsZeroTwentyTwoSix), LocatorUtils.property(thatLocator, "zeroTwentyTwoSix", rhsZeroTwentyTwoSix), lhsZeroTwentyTwoSix, rhsZeroTwentyTwoSix)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroTwentyTwoSeven;
            lhsZeroTwentyTwoSeven = this.getZeroTwentyTwoSeven();
            ZeroTen rhsZeroTwentyTwoSeven;
            rhsZeroTwentyTwoSeven = that.getZeroTwentyTwoSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoSeven", lhsZeroTwentyTwoSeven), LocatorUtils.property(thatLocator, "zeroTwentyTwoSeven", rhsZeroTwentyTwoSeven), lhsZeroTwentyTwoSeven, rhsZeroTwentyTwoSeven)) {
                return false;
            }
        }
        {
            List<ZeroTwentyFive> lhsZeroTwentyTwoEight;
            lhsZeroTwentyTwoEight = (((this.zeroTwentyTwoEight!= null)&&(!this.zeroTwentyTwoEight.isEmpty()))?this.getZeroTwentyTwoEight():null);
            List<ZeroTwentyFive> rhsZeroTwentyTwoEight;
            rhsZeroTwentyTwoEight = (((that.zeroTwentyTwoEight!= null)&&(!that.zeroTwentyTwoEight.isEmpty()))?that.getZeroTwentyTwoEight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoEight", lhsZeroTwentyTwoEight), LocatorUtils.property(thatLocator, "zeroTwentyTwoEight", rhsZeroTwentyTwoEight), lhsZeroTwentyTwoEight, rhsZeroTwentyTwoEight)) {
                return false;
            }
        }
        {
            BigInteger lhsZeroTwentyTwoNine;
            lhsZeroTwentyTwoNine = this.getZeroTwentyTwoNine();
            BigInteger rhsZeroTwentyTwoNine;
            rhsZeroTwentyTwoNine = that.getZeroTwentyTwoNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoNine", lhsZeroTwentyTwoNine), LocatorUtils.property(thatLocator, "zeroTwentyTwoNine", rhsZeroTwentyTwoNine), lhsZeroTwentyTwoNine, rhsZeroTwentyTwoNine)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyTwoTen;
            lhsZeroTwentyTwoTen = this.getZeroTwentyTwoTen();
            String rhsZeroTwentyTwoTen;
            rhsZeroTwentyTwoTen = that.getZeroTwentyTwoTen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyTwoTen", lhsZeroTwentyTwoTen), LocatorUtils.property(thatLocator, "zeroTwentyTwoTen", rhsZeroTwentyTwoTen), lhsZeroTwentyTwoTen, rhsZeroTwentyTwoTen)) {
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
            String theZeroTwentyTwoOne;
            theZeroTwentyTwoOne = this.getZeroTwentyTwoOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoOne", theZeroTwentyTwoOne), currentHashCode, theZeroTwentyTwoOne);
        }
        {
            boolean theZeroTwentyTwoTwo;
            theZeroTwentyTwoTwo = this.isZeroTwentyTwoTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoTwo", theZeroTwentyTwoTwo), currentHashCode, theZeroTwentyTwoTwo);
        }
        {
            boolean theZeroTwentyTwoThree;
            theZeroTwentyTwoThree = this.isZeroTwentyTwoThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoThree", theZeroTwentyTwoThree), currentHashCode, theZeroTwentyTwoThree);
        }
        {
            List<String> theZeroTwentyTwoFour;
            theZeroTwentyTwoFour = (((this.zeroTwentyTwoFour!= null)&&(!this.zeroTwentyTwoFour.isEmpty()))?this.getZeroTwentyTwoFour():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoFour", theZeroTwentyTwoFour), currentHashCode, theZeroTwentyTwoFour);
        }
        {
            Type theZeroTwentyTwoFive;
            theZeroTwentyTwoFive = this.getZeroTwentyTwoFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoFive", theZeroTwentyTwoFive), currentHashCode, theZeroTwentyTwoFive);
        }
        {
            List<ZeroThirteen> theZeroTwentyTwoSix;
            theZeroTwentyTwoSix = (((this.zeroTwentyTwoSix!= null)&&(!this.zeroTwentyTwoSix.isEmpty()))?this.getZeroTwentyTwoSix():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoSix", theZeroTwentyTwoSix), currentHashCode, theZeroTwentyTwoSix);
        }
        {
            ZeroTen theZeroTwentyTwoSeven;
            theZeroTwentyTwoSeven = this.getZeroTwentyTwoSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoSeven", theZeroTwentyTwoSeven), currentHashCode, theZeroTwentyTwoSeven);
        }
        {
            List<ZeroTwentyFive> theZeroTwentyTwoEight;
            theZeroTwentyTwoEight = (((this.zeroTwentyTwoEight!= null)&&(!this.zeroTwentyTwoEight.isEmpty()))?this.getZeroTwentyTwoEight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoEight", theZeroTwentyTwoEight), currentHashCode, theZeroTwentyTwoEight);
        }
        {
            BigInteger theZeroTwentyTwoNine;
            theZeroTwentyTwoNine = this.getZeroTwentyTwoNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoNine", theZeroTwentyTwoNine), currentHashCode, theZeroTwentyTwoNine);
        }
        {
            String theZeroTwentyTwoTen;
            theZeroTwentyTwoTen = this.getZeroTwentyTwoTen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyTwoTen", theZeroTwentyTwoTen), currentHashCode, theZeroTwentyTwoTen);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
