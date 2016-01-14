
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
 * <p>Java class for ZeroTwentyOne complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwentyOne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2" minOccurs="0"/>
 *         &lt;element name="zeroTwentyOneTwo" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/>
 *         &lt;element name="zeroTwentyOneThree" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="zeroTwentyOneFour" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="zeroTwentyOneFive" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyOneSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyOneSeven" type="{http://www.dhikChik.com/Sample/1.0/}alpha1"/>
 *         &lt;element name="zeroTwentyOneEight" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEighteen" maxOccurs="unbounded"/>
 *         &lt;element name="zeroTwentyOneNine" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" minOccurs="0"/>
 *         &lt;element name="zeroTwentyOneTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwentyOne", propOrder = {
    "zeroTwentyOneOne",
    "zeroTwentyOneTwo",
    "zeroTwentyOneThree",
    "zeroTwentyOneFour",
    "zeroTwentyOneFive",
    "zeroTwentyOneSix",
    "zeroTwentyOneSeven",
    "zeroTwentyOneEight",
    "zeroTwentyOneNine",
    "zeroTwentyOneTen"
})
public class ZeroTwentyOne
    implements Equals, HashCode, ToString
{

    protected String zeroTwentyOneOne;
    @XmlElement(type = Boolean.class)
    protected List<Boolean> zeroTwentyOneTwo;
    @XmlSchemaType(name = "unsignedInt")
    protected Long zeroTwentyOneThree;
    @XmlElement(required = true)
    protected BigDecimal zeroTwentyOneFour;
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> zeroTwentyOneFive;
    protected ZeroTen zeroTwentyOneSix;
    @XmlElement(required = true)
    protected String zeroTwentyOneSeven;
    @XmlElement(required = true)
    protected List<ZeroEighteen> zeroTwentyOneEight;
    protected String zeroTwentyOneNine;
    protected List<ZeroTen> zeroTwentyOneTen;

    /**
     * Gets the value of the zeroTwentyOneOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyOneOne() {
        return zeroTwentyOneOne;
    }

    /**
     * Sets the value of the zeroTwentyOneOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyOneOne(String value) {
        this.zeroTwentyOneOne = value;
    }

    /**
     * Gets the value of the zeroTwentyOneTwo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyOneTwo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyOneTwo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getZeroTwentyOneTwo() {
        if (zeroTwentyOneTwo == null) {
            zeroTwentyOneTwo = new ArrayList<Boolean>();
        }
        return this.zeroTwentyOneTwo;
    }

    /**
     * Gets the value of the zeroTwentyOneThree property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getZeroTwentyOneThree() {
        return zeroTwentyOneThree;
    }

    /**
     * Sets the value of the zeroTwentyOneThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setZeroTwentyOneThree(Long value) {
        this.zeroTwentyOneThree = value;
    }

    /**
     * Gets the value of the zeroTwentyOneFour property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroTwentyOneFour() {
        return zeroTwentyOneFour;
    }

    /**
     * Sets the value of the zeroTwentyOneFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroTwentyOneFour(BigDecimal value) {
        this.zeroTwentyOneFour = value;
    }

    /**
     * Gets the value of the zeroTwentyOneFive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyOneFive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyOneFive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getZeroTwentyOneFive() {
        if (zeroTwentyOneFive == null) {
            zeroTwentyOneFive = new ArrayList<XMLGregorianCalendar>();
        }
        return this.zeroTwentyOneFive;
    }

    /**
     * Gets the value of the zeroTwentyOneSix property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroTwentyOneSix() {
        return zeroTwentyOneSix;
    }

    /**
     * Sets the value of the zeroTwentyOneSix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroTwentyOneSix(ZeroTen value) {
        this.zeroTwentyOneSix = value;
    }

    /**
     * Gets the value of the zeroTwentyOneSeven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyOneSeven() {
        return zeroTwentyOneSeven;
    }

    /**
     * Sets the value of the zeroTwentyOneSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyOneSeven(String value) {
        this.zeroTwentyOneSeven = value;
    }

    /**
     * Gets the value of the zeroTwentyOneEight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyOneEight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyOneEight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroEighteen }
     * 
     * 
     */
    public List<ZeroEighteen> getZeroTwentyOneEight() {
        if (zeroTwentyOneEight == null) {
            zeroTwentyOneEight = new ArrayList<ZeroEighteen>();
        }
        return this.zeroTwentyOneEight;
    }

    /**
     * Gets the value of the zeroTwentyOneNine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroTwentyOneNine() {
        return zeroTwentyOneNine;
    }

    /**
     * Sets the value of the zeroTwentyOneNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroTwentyOneNine(String value) {
        this.zeroTwentyOneNine = value;
    }

    /**
     * Gets the value of the zeroTwentyOneTen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyOneTen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyOneTen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTen }
     * 
     * 
     */
    public List<ZeroTen> getZeroTwentyOneTen() {
        if (zeroTwentyOneTen == null) {
            zeroTwentyOneTen = new ArrayList<ZeroTen>();
        }
        return this.zeroTwentyOneTen;
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
            String theZeroTwentyOneOne;
            theZeroTwentyOneOne = this.getZeroTwentyOneOne();
            strategy.appendField(locator, this, "zeroTwentyOneOne", buffer, theZeroTwentyOneOne);
        }
        {
            List<Boolean> theZeroTwentyOneTwo;
            theZeroTwentyOneTwo = (((this.zeroTwentyOneTwo!= null)&&(!this.zeroTwentyOneTwo.isEmpty()))?this.getZeroTwentyOneTwo():null);
            strategy.appendField(locator, this, "zeroTwentyOneTwo", buffer, theZeroTwentyOneTwo);
        }
        {
            Long theZeroTwentyOneThree;
            theZeroTwentyOneThree = this.getZeroTwentyOneThree();
            strategy.appendField(locator, this, "zeroTwentyOneThree", buffer, theZeroTwentyOneThree);
        }
        {
            BigDecimal theZeroTwentyOneFour;
            theZeroTwentyOneFour = this.getZeroTwentyOneFour();
            strategy.appendField(locator, this, "zeroTwentyOneFour", buffer, theZeroTwentyOneFour);
        }
        {
            List<XMLGregorianCalendar> theZeroTwentyOneFive;
            theZeroTwentyOneFive = (((this.zeroTwentyOneFive!= null)&&(!this.zeroTwentyOneFive.isEmpty()))?this.getZeroTwentyOneFive():null);
            strategy.appendField(locator, this, "zeroTwentyOneFive", buffer, theZeroTwentyOneFive);
        }
        {
            ZeroTen theZeroTwentyOneSix;
            theZeroTwentyOneSix = this.getZeroTwentyOneSix();
            strategy.appendField(locator, this, "zeroTwentyOneSix", buffer, theZeroTwentyOneSix);
        }
        {
            String theZeroTwentyOneSeven;
            theZeroTwentyOneSeven = this.getZeroTwentyOneSeven();
            strategy.appendField(locator, this, "zeroTwentyOneSeven", buffer, theZeroTwentyOneSeven);
        }
        {
            List<ZeroEighteen> theZeroTwentyOneEight;
            theZeroTwentyOneEight = (((this.zeroTwentyOneEight!= null)&&(!this.zeroTwentyOneEight.isEmpty()))?this.getZeroTwentyOneEight():null);
            strategy.appendField(locator, this, "zeroTwentyOneEight", buffer, theZeroTwentyOneEight);
        }
        {
            String theZeroTwentyOneNine;
            theZeroTwentyOneNine = this.getZeroTwentyOneNine();
            strategy.appendField(locator, this, "zeroTwentyOneNine", buffer, theZeroTwentyOneNine);
        }
        {
            List<ZeroTen> theZeroTwentyOneTen;
            theZeroTwentyOneTen = (((this.zeroTwentyOneTen!= null)&&(!this.zeroTwentyOneTen.isEmpty()))?this.getZeroTwentyOneTen():null);
            strategy.appendField(locator, this, "zeroTwentyOneTen", buffer, theZeroTwentyOneTen);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwentyOne)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwentyOne that = ((ZeroTwentyOne) object);
        {
            String lhsZeroTwentyOneOne;
            lhsZeroTwentyOneOne = this.getZeroTwentyOneOne();
            String rhsZeroTwentyOneOne;
            rhsZeroTwentyOneOne = that.getZeroTwentyOneOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneOne", lhsZeroTwentyOneOne), LocatorUtils.property(thatLocator, "zeroTwentyOneOne", rhsZeroTwentyOneOne), lhsZeroTwentyOneOne, rhsZeroTwentyOneOne)) {
                return false;
            }
        }
        {
            List<Boolean> lhsZeroTwentyOneTwo;
            lhsZeroTwentyOneTwo = (((this.zeroTwentyOneTwo!= null)&&(!this.zeroTwentyOneTwo.isEmpty()))?this.getZeroTwentyOneTwo():null);
            List<Boolean> rhsZeroTwentyOneTwo;
            rhsZeroTwentyOneTwo = (((that.zeroTwentyOneTwo!= null)&&(!that.zeroTwentyOneTwo.isEmpty()))?that.getZeroTwentyOneTwo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneTwo", lhsZeroTwentyOneTwo), LocatorUtils.property(thatLocator, "zeroTwentyOneTwo", rhsZeroTwentyOneTwo), lhsZeroTwentyOneTwo, rhsZeroTwentyOneTwo)) {
                return false;
            }
        }
        {
            Long lhsZeroTwentyOneThree;
            lhsZeroTwentyOneThree = this.getZeroTwentyOneThree();
            Long rhsZeroTwentyOneThree;
            rhsZeroTwentyOneThree = that.getZeroTwentyOneThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneThree", lhsZeroTwentyOneThree), LocatorUtils.property(thatLocator, "zeroTwentyOneThree", rhsZeroTwentyOneThree), lhsZeroTwentyOneThree, rhsZeroTwentyOneThree)) {
                return false;
            }
        }
        {
            BigDecimal lhsZeroTwentyOneFour;
            lhsZeroTwentyOneFour = this.getZeroTwentyOneFour();
            BigDecimal rhsZeroTwentyOneFour;
            rhsZeroTwentyOneFour = that.getZeroTwentyOneFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneFour", lhsZeroTwentyOneFour), LocatorUtils.property(thatLocator, "zeroTwentyOneFour", rhsZeroTwentyOneFour), lhsZeroTwentyOneFour, rhsZeroTwentyOneFour)) {
                return false;
            }
        }
        {
            List<XMLGregorianCalendar> lhsZeroTwentyOneFive;
            lhsZeroTwentyOneFive = (((this.zeroTwentyOneFive!= null)&&(!this.zeroTwentyOneFive.isEmpty()))?this.getZeroTwentyOneFive():null);
            List<XMLGregorianCalendar> rhsZeroTwentyOneFive;
            rhsZeroTwentyOneFive = (((that.zeroTwentyOneFive!= null)&&(!that.zeroTwentyOneFive.isEmpty()))?that.getZeroTwentyOneFive():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneFive", lhsZeroTwentyOneFive), LocatorUtils.property(thatLocator, "zeroTwentyOneFive", rhsZeroTwentyOneFive), lhsZeroTwentyOneFive, rhsZeroTwentyOneFive)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroTwentyOneSix;
            lhsZeroTwentyOneSix = this.getZeroTwentyOneSix();
            ZeroTen rhsZeroTwentyOneSix;
            rhsZeroTwentyOneSix = that.getZeroTwentyOneSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneSix", lhsZeroTwentyOneSix), LocatorUtils.property(thatLocator, "zeroTwentyOneSix", rhsZeroTwentyOneSix), lhsZeroTwentyOneSix, rhsZeroTwentyOneSix)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyOneSeven;
            lhsZeroTwentyOneSeven = this.getZeroTwentyOneSeven();
            String rhsZeroTwentyOneSeven;
            rhsZeroTwentyOneSeven = that.getZeroTwentyOneSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneSeven", lhsZeroTwentyOneSeven), LocatorUtils.property(thatLocator, "zeroTwentyOneSeven", rhsZeroTwentyOneSeven), lhsZeroTwentyOneSeven, rhsZeroTwentyOneSeven)) {
                return false;
            }
        }
        {
            List<ZeroEighteen> lhsZeroTwentyOneEight;
            lhsZeroTwentyOneEight = (((this.zeroTwentyOneEight!= null)&&(!this.zeroTwentyOneEight.isEmpty()))?this.getZeroTwentyOneEight():null);
            List<ZeroEighteen> rhsZeroTwentyOneEight;
            rhsZeroTwentyOneEight = (((that.zeroTwentyOneEight!= null)&&(!that.zeroTwentyOneEight.isEmpty()))?that.getZeroTwentyOneEight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneEight", lhsZeroTwentyOneEight), LocatorUtils.property(thatLocator, "zeroTwentyOneEight", rhsZeroTwentyOneEight), lhsZeroTwentyOneEight, rhsZeroTwentyOneEight)) {
                return false;
            }
        }
        {
            String lhsZeroTwentyOneNine;
            lhsZeroTwentyOneNine = this.getZeroTwentyOneNine();
            String rhsZeroTwentyOneNine;
            rhsZeroTwentyOneNine = that.getZeroTwentyOneNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneNine", lhsZeroTwentyOneNine), LocatorUtils.property(thatLocator, "zeroTwentyOneNine", rhsZeroTwentyOneNine), lhsZeroTwentyOneNine, rhsZeroTwentyOneNine)) {
                return false;
            }
        }
        {
            List<ZeroTen> lhsZeroTwentyOneTen;
            lhsZeroTwentyOneTen = (((this.zeroTwentyOneTen!= null)&&(!this.zeroTwentyOneTen.isEmpty()))?this.getZeroTwentyOneTen():null);
            List<ZeroTen> rhsZeroTwentyOneTen;
            rhsZeroTwentyOneTen = (((that.zeroTwentyOneTen!= null)&&(!that.zeroTwentyOneTen.isEmpty()))?that.getZeroTwentyOneTen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyOneTen", lhsZeroTwentyOneTen), LocatorUtils.property(thatLocator, "zeroTwentyOneTen", rhsZeroTwentyOneTen), lhsZeroTwentyOneTen, rhsZeroTwentyOneTen)) {
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
            String theZeroTwentyOneOne;
            theZeroTwentyOneOne = this.getZeroTwentyOneOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneOne", theZeroTwentyOneOne), currentHashCode, theZeroTwentyOneOne);
        }
        {
            List<Boolean> theZeroTwentyOneTwo;
            theZeroTwentyOneTwo = (((this.zeroTwentyOneTwo!= null)&&(!this.zeroTwentyOneTwo.isEmpty()))?this.getZeroTwentyOneTwo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneTwo", theZeroTwentyOneTwo), currentHashCode, theZeroTwentyOneTwo);
        }
        {
            Long theZeroTwentyOneThree;
            theZeroTwentyOneThree = this.getZeroTwentyOneThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneThree", theZeroTwentyOneThree), currentHashCode, theZeroTwentyOneThree);
        }
        {
            BigDecimal theZeroTwentyOneFour;
            theZeroTwentyOneFour = this.getZeroTwentyOneFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneFour", theZeroTwentyOneFour), currentHashCode, theZeroTwentyOneFour);
        }
        {
            List<XMLGregorianCalendar> theZeroTwentyOneFive;
            theZeroTwentyOneFive = (((this.zeroTwentyOneFive!= null)&&(!this.zeroTwentyOneFive.isEmpty()))?this.getZeroTwentyOneFive():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneFive", theZeroTwentyOneFive), currentHashCode, theZeroTwentyOneFive);
        }
        {
            ZeroTen theZeroTwentyOneSix;
            theZeroTwentyOneSix = this.getZeroTwentyOneSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneSix", theZeroTwentyOneSix), currentHashCode, theZeroTwentyOneSix);
        }
        {
            String theZeroTwentyOneSeven;
            theZeroTwentyOneSeven = this.getZeroTwentyOneSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneSeven", theZeroTwentyOneSeven), currentHashCode, theZeroTwentyOneSeven);
        }
        {
            List<ZeroEighteen> theZeroTwentyOneEight;
            theZeroTwentyOneEight = (((this.zeroTwentyOneEight!= null)&&(!this.zeroTwentyOneEight.isEmpty()))?this.getZeroTwentyOneEight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneEight", theZeroTwentyOneEight), currentHashCode, theZeroTwentyOneEight);
        }
        {
            String theZeroTwentyOneNine;
            theZeroTwentyOneNine = this.getZeroTwentyOneNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneNine", theZeroTwentyOneNine), currentHashCode, theZeroTwentyOneNine);
        }
        {
            List<ZeroTen> theZeroTwentyOneTen;
            theZeroTwentyOneTen = (((this.zeroTwentyOneTen!= null)&&(!this.zeroTwentyOneTen.isEmpty()))?this.getZeroTwentyOneTen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyOneTen", theZeroTwentyOneTen), currentHashCode, theZeroTwentyOneTen);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
