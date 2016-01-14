
package com.eim.mdm.datamap.sample.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for ZeroTwentyThree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwentyThree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyThreeOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha2" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeThree" type="{http://www.dhikChik.com/Sample/1.0/}Type" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeFour" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" maxOccurs="unbounded"/>
 *         &lt;element name="zeroTwentyThreeFive" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeSix" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeSeven" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="zeroTwentyThreeEight" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEighteen"/>
 *         &lt;element name="zeroTwentyThreeNine" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="zeroTwentyThreeTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwentyThree", propOrder = {
    "zeroTwentyThreeOne",
    "zeroTwentyThreeTwo",
    "zeroTwentyThreeThree",
    "zeroTwentyThreeFour",
    "zeroTwentyThreeFive",
    "zeroTwentyThreeSix",
    "zeroTwentyThreeSeven",
    "zeroTwentyThreeEight",
    "zeroTwentyThreeNine",
    "zeroTwentyThreeTen"
})
public class ZeroTwentyThree
    implements Equals, HashCode, ToString
{

    protected List<ZeroFourteen> zeroTwentyThreeOne;
    protected String zeroTwentyThreeTwo;
    protected Type zeroTwentyThreeThree;
    @XmlElement(required = true)
    protected List<String> zeroTwentyThreeFour;
    protected ZeroTen zeroTwentyThreeFive;
    @XmlElement(type = Boolean.class)
    protected List<Boolean> zeroTwentyThreeSix;
    @XmlElement(required = true)
    protected BigDecimal zeroTwentyThreeSeven;
    @XmlElement(required = true)
    protected ZeroEighteen zeroTwentyThreeEight;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zeroTwentyThreeNine;
    protected ZeroTen zeroTwentyThreeTen;

    /**
     * Gets the value of the zeroTwentyThreeOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyThreeOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyThreeOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFourteen }
     * 
     * 
     */
    public List<ZeroFourteen> getZeroTwentyThreeOne() {
        if (zeroTwentyThreeOne == null) {
            zeroTwentyThreeOne = new ArrayList<ZeroFourteen>();
        }
        return this.zeroTwentyThreeOne;
    }

    /**
     * Gets the value of the zeroTwentyThreeTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyThreeTwo() {
        return zeroTwentyThreeTwo;
    }

    /**
     * Sets the value of the zeroTwentyThreeTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyThreeTwo(String value) {
        this.zeroTwentyThreeTwo = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeThree property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getZeroTwentyThreeThree() {
        return zeroTwentyThreeThree;
    }

    /**
     * Sets the value of the zeroTwentyThreeThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setZeroTwentyThreeThree(Type value) {
        this.zeroTwentyThreeThree = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeFour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyThreeFour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyThreeFour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZeroTwentyThreeFour() {
        if (zeroTwentyThreeFour == null) {
            zeroTwentyThreeFour = new ArrayList<String>();
        }
        return this.zeroTwentyThreeFour;
    }

    /**
     * Gets the value of the zeroTwentyThreeFive property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroTwentyThreeFive() {
        return zeroTwentyThreeFive;
    }

    /**
     * Sets the value of the zeroTwentyThreeFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroTwentyThreeFive(ZeroTen value) {
        this.zeroTwentyThreeFive = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeSix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyThreeSix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyThreeSix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getZeroTwentyThreeSix() {
        if (zeroTwentyThreeSix == null) {
            zeroTwentyThreeSix = new ArrayList<Boolean>();
        }
        return this.zeroTwentyThreeSix;
    }

    /**
     * Gets the value of the zeroTwentyThreeSeven property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroTwentyThreeSeven() {
        return zeroTwentyThreeSeven;
    }

    /**
     * Sets the value of the zeroTwentyThreeSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroTwentyThreeSeven(BigDecimal value) {
        this.zeroTwentyThreeSeven = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeEight property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroEighteen }
     *     
     */
    public ZeroEighteen getZeroTwentyThreeEight() {
        return zeroTwentyThreeEight;
    }

    /**
     * Sets the value of the zeroTwentyThreeEight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroEighteen }
     *     
     */
    public void setZeroTwentyThreeEight(ZeroEighteen value) {
        this.zeroTwentyThreeEight = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeNine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroTwentyThreeNine() {
        return zeroTwentyThreeNine;
    }

    /**
     * Sets the value of the zeroTwentyThreeNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroTwentyThreeNine(XMLGregorianCalendar value) {
        this.zeroTwentyThreeNine = value;
    }

    /**
     * Gets the value of the zeroTwentyThreeTen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroTwentyThreeTen() {
        return zeroTwentyThreeTen;
    }

    /**
     * Sets the value of the zeroTwentyThreeTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroTwentyThreeTen(ZeroTen value) {
        this.zeroTwentyThreeTen = value;
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
            List<ZeroFourteen> theZeroTwentyThreeOne;
            theZeroTwentyThreeOne = (((this.zeroTwentyThreeOne!= null)&&(!this.zeroTwentyThreeOne.isEmpty()))?this.getZeroTwentyThreeOne():null);
            strategy.appendField(locator, this, "zeroTwentyThreeOne", buffer, theZeroTwentyThreeOne);
        }
        {
            String theZeroTwentyThreeTwo;
            theZeroTwentyThreeTwo = this.getZeroTwentyThreeTwo();
            strategy.appendField(locator, this, "zeroTwentyThreeTwo", buffer, theZeroTwentyThreeTwo);
        }
        {
            Type theZeroTwentyThreeThree;
            theZeroTwentyThreeThree = this.getZeroTwentyThreeThree();
            strategy.appendField(locator, this, "zeroTwentyThreeThree", buffer, theZeroTwentyThreeThree);
        }
        {
            List<String> theZeroTwentyThreeFour;
            theZeroTwentyThreeFour = (((this.zeroTwentyThreeFour!= null)&&(!this.zeroTwentyThreeFour.isEmpty()))?this.getZeroTwentyThreeFour():null);
            strategy.appendField(locator, this, "zeroTwentyThreeFour", buffer, theZeroTwentyThreeFour);
        }
        {
            ZeroTen theZeroTwentyThreeFive;
            theZeroTwentyThreeFive = this.getZeroTwentyThreeFive();
            strategy.appendField(locator, this, "zeroTwentyThreeFive", buffer, theZeroTwentyThreeFive);
        }
        {
            List<Boolean> theZeroTwentyThreeSix;
            theZeroTwentyThreeSix = (((this.zeroTwentyThreeSix!= null)&&(!this.zeroTwentyThreeSix.isEmpty()))?this.getZeroTwentyThreeSix():null);
            strategy.appendField(locator, this, "zeroTwentyThreeSix", buffer, theZeroTwentyThreeSix);
        }
        {
            BigDecimal theZeroTwentyThreeSeven;
            theZeroTwentyThreeSeven = this.getZeroTwentyThreeSeven();
            strategy.appendField(locator, this, "zeroTwentyThreeSeven", buffer, theZeroTwentyThreeSeven);
        }
        {
            ZeroEighteen theZeroTwentyThreeEight;
            theZeroTwentyThreeEight = this.getZeroTwentyThreeEight();
            strategy.appendField(locator, this, "zeroTwentyThreeEight", buffer, theZeroTwentyThreeEight);
        }
        {
            XMLGregorianCalendar theZeroTwentyThreeNine;
            theZeroTwentyThreeNine = this.getZeroTwentyThreeNine();
            strategy.appendField(locator, this, "zeroTwentyThreeNine", buffer, theZeroTwentyThreeNine);
        }
        {
            ZeroTen theZeroTwentyThreeTen;
            theZeroTwentyThreeTen = this.getZeroTwentyThreeTen();
            strategy.appendField(locator, this, "zeroTwentyThreeTen", buffer, theZeroTwentyThreeTen);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwentyThree)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwentyThree that = ((ZeroTwentyThree) object);
        {
            List<ZeroFourteen> lhsZeroTwentyThreeOne;
            lhsZeroTwentyThreeOne = (((this.zeroTwentyThreeOne!= null)&&(!this.zeroTwentyThreeOne.isEmpty()))?this.getZeroTwentyThreeOne():null);
            List<ZeroFourteen> rhsZeroTwentyThreeOne;
            rhsZeroTwentyThreeOne = (((that.zeroTwentyThreeOne!= null)&&(!that.zeroTwentyThreeOne.isEmpty()))?that.getZeroTwentyThreeOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeOne", lhsZeroTwentyThreeOne), LocatorUtils.property(thatLocator, "zeroTwentyThreeOne", rhsZeroTwentyThreeOne), lhsZeroTwentyThreeOne, rhsZeroTwentyThreeOne)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyThreeTwo;
            lhsZeroTwentyThreeTwo = this.getZeroTwentyThreeTwo();
            String rhsZeroTwentyThreeTwo;
            rhsZeroTwentyThreeTwo = that.getZeroTwentyThreeTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeTwo", lhsZeroTwentyThreeTwo), LocatorUtils.property(thatLocator, "zeroTwentyThreeTwo", rhsZeroTwentyThreeTwo), lhsZeroTwentyThreeTwo, rhsZeroTwentyThreeTwo)) {
                return false;
            }
        }
        {
            Type lhsZeroTwentyThreeThree;
            lhsZeroTwentyThreeThree = this.getZeroTwentyThreeThree();
            Type rhsZeroTwentyThreeThree;
            rhsZeroTwentyThreeThree = that.getZeroTwentyThreeThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeThree", lhsZeroTwentyThreeThree), LocatorUtils.property(thatLocator, "zeroTwentyThreeThree", rhsZeroTwentyThreeThree), lhsZeroTwentyThreeThree, rhsZeroTwentyThreeThree)) {
                return false;
            }
        }
        {
            List<String> lhsZeroTwentyThreeFour;
            lhsZeroTwentyThreeFour = (((this.zeroTwentyThreeFour!= null)&&(!this.zeroTwentyThreeFour.isEmpty()))?this.getZeroTwentyThreeFour():null);
            List<String> rhsZeroTwentyThreeFour;
            rhsZeroTwentyThreeFour = (((that.zeroTwentyThreeFour!= null)&&(!that.zeroTwentyThreeFour.isEmpty()))?that.getZeroTwentyThreeFour():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeFour", lhsZeroTwentyThreeFour), LocatorUtils.property(thatLocator, "zeroTwentyThreeFour", rhsZeroTwentyThreeFour), lhsZeroTwentyThreeFour, rhsZeroTwentyThreeFour)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroTwentyThreeFive;
            lhsZeroTwentyThreeFive = this.getZeroTwentyThreeFive();
            ZeroTen rhsZeroTwentyThreeFive;
            rhsZeroTwentyThreeFive = that.getZeroTwentyThreeFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeFive", lhsZeroTwentyThreeFive), LocatorUtils.property(thatLocator, "zeroTwentyThreeFive", rhsZeroTwentyThreeFive), lhsZeroTwentyThreeFive, rhsZeroTwentyThreeFive)) {
                return false;
            }
        }
        {
            List<Boolean> lhsZeroTwentyThreeSix;
            lhsZeroTwentyThreeSix = (((this.zeroTwentyThreeSix!= null)&&(!this.zeroTwentyThreeSix.isEmpty()))?this.getZeroTwentyThreeSix():null);
            List<Boolean> rhsZeroTwentyThreeSix;
            rhsZeroTwentyThreeSix = (((that.zeroTwentyThreeSix!= null)&&(!that.zeroTwentyThreeSix.isEmpty()))?that.getZeroTwentyThreeSix():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeSix", lhsZeroTwentyThreeSix), LocatorUtils.property(thatLocator, "zeroTwentyThreeSix", rhsZeroTwentyThreeSix), lhsZeroTwentyThreeSix, rhsZeroTwentyThreeSix)) {
                return false;
            }
        }
        {
            BigDecimal lhsZeroTwentyThreeSeven;
            lhsZeroTwentyThreeSeven = this.getZeroTwentyThreeSeven();
            BigDecimal rhsZeroTwentyThreeSeven;
            rhsZeroTwentyThreeSeven = that.getZeroTwentyThreeSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeSeven", lhsZeroTwentyThreeSeven), LocatorUtils.property(thatLocator, "zeroTwentyThreeSeven", rhsZeroTwentyThreeSeven), lhsZeroTwentyThreeSeven, rhsZeroTwentyThreeSeven)) {
                return false;
            }
        }
        {
            ZeroEighteen lhsZeroTwentyThreeEight;
            lhsZeroTwentyThreeEight = this.getZeroTwentyThreeEight();
            ZeroEighteen rhsZeroTwentyThreeEight;
            rhsZeroTwentyThreeEight = that.getZeroTwentyThreeEight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeEight", lhsZeroTwentyThreeEight), LocatorUtils.property(thatLocator, "zeroTwentyThreeEight", rhsZeroTwentyThreeEight), lhsZeroTwentyThreeEight, rhsZeroTwentyThreeEight)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroTwentyThreeNine;
            lhsZeroTwentyThreeNine = this.getZeroTwentyThreeNine();
            XMLGregorianCalendar rhsZeroTwentyThreeNine;
            rhsZeroTwentyThreeNine = that.getZeroTwentyThreeNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeNine", lhsZeroTwentyThreeNine), LocatorUtils.property(thatLocator, "zeroTwentyThreeNine", rhsZeroTwentyThreeNine), lhsZeroTwentyThreeNine, rhsZeroTwentyThreeNine)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroTwentyThreeTen;
            lhsZeroTwentyThreeTen = this.getZeroTwentyThreeTen();
            ZeroTen rhsZeroTwentyThreeTen;
            rhsZeroTwentyThreeTen = that.getZeroTwentyThreeTen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyThreeTen", lhsZeroTwentyThreeTen), LocatorUtils.property(thatLocator, "zeroTwentyThreeTen", rhsZeroTwentyThreeTen), lhsZeroTwentyThreeTen, rhsZeroTwentyThreeTen)) {
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
            List<ZeroFourteen> theZeroTwentyThreeOne;
            theZeroTwentyThreeOne = (((this.zeroTwentyThreeOne!= null)&&(!this.zeroTwentyThreeOne.isEmpty()))?this.getZeroTwentyThreeOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeOne", theZeroTwentyThreeOne), currentHashCode, theZeroTwentyThreeOne);
        }
        {
            String theZeroTwentyThreeTwo;
            theZeroTwentyThreeTwo = this.getZeroTwentyThreeTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeTwo", theZeroTwentyThreeTwo), currentHashCode, theZeroTwentyThreeTwo);
        }
        {
            Type theZeroTwentyThreeThree;
            theZeroTwentyThreeThree = this.getZeroTwentyThreeThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeThree", theZeroTwentyThreeThree), currentHashCode, theZeroTwentyThreeThree);
        }
        {
            List<String> theZeroTwentyThreeFour;
            theZeroTwentyThreeFour = (((this.zeroTwentyThreeFour!= null)&&(!this.zeroTwentyThreeFour.isEmpty()))?this.getZeroTwentyThreeFour():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeFour", theZeroTwentyThreeFour), currentHashCode, theZeroTwentyThreeFour);
        }
        {
            ZeroTen theZeroTwentyThreeFive;
            theZeroTwentyThreeFive = this.getZeroTwentyThreeFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeFive", theZeroTwentyThreeFive), currentHashCode, theZeroTwentyThreeFive);
        }
        {
            List<Boolean> theZeroTwentyThreeSix;
            theZeroTwentyThreeSix = (((this.zeroTwentyThreeSix!= null)&&(!this.zeroTwentyThreeSix.isEmpty()))?this.getZeroTwentyThreeSix():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeSix", theZeroTwentyThreeSix), currentHashCode, theZeroTwentyThreeSix);
        }
        {
            BigDecimal theZeroTwentyThreeSeven;
            theZeroTwentyThreeSeven = this.getZeroTwentyThreeSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeSeven", theZeroTwentyThreeSeven), currentHashCode, theZeroTwentyThreeSeven);
        }
        {
            ZeroEighteen theZeroTwentyThreeEight;
            theZeroTwentyThreeEight = this.getZeroTwentyThreeEight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeEight", theZeroTwentyThreeEight), currentHashCode, theZeroTwentyThreeEight);
        }
        {
            XMLGregorianCalendar theZeroTwentyThreeNine;
            theZeroTwentyThreeNine = this.getZeroTwentyThreeNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeNine", theZeroTwentyThreeNine), currentHashCode, theZeroTwentyThreeNine);
        }
        {
            ZeroTen theZeroTwentyThreeTen;
            theZeroTwentyThreeTen = this.getZeroTwentyThreeTen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyThreeTen", theZeroTwentyThreeTen), currentHashCode, theZeroTwentyThreeTen);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
