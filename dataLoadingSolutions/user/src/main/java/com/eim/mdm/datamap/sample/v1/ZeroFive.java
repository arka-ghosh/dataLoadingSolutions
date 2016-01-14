
package com.eim.mdm.datamap.sample.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for ZeroFive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroFive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroFiveOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" minOccurs="0"/>
 *         &lt;element name="zeroFiveTwo" type="{http://www.dhikChik.com/Sample/1.0/}year" minOccurs="0"/>
 *         &lt;element name="zeroFiveThree" type="{http://www.dhikChik.com/Sample/1.0/}Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFiveFour" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroFiveFive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="zeroFiveSix" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="zeroFiveSeven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFiveEight" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFiveNine" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="zeroFiveTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroOne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroFive", propOrder = {
    "zeroFiveOne",
    "zeroFiveTwo",
    "zeroFiveThree",
    "zeroFiveFour",
    "zeroFiveFive",
    "zeroFiveSix",
    "zeroFiveSeven",
    "zeroFiveEight",
    "zeroFiveNine",
    "zeroFiveTen"
})
public class ZeroFive
    implements Equals, HashCode, ToString
{

    protected String zeroFiveOne;
    protected String zeroFiveTwo;
    protected List<Type> zeroFiveThree;
    protected Boolean zeroFiveFour;
    protected BigDecimal zeroFiveFive;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer zeroFiveSix;
    protected List<ZeroThirteen> zeroFiveSeven;
    protected List<ZeroFourteen> zeroFiveEight;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zeroFiveNine;
    protected ZeroOne zeroFiveTen;

    /**
     * Gets the value of the zeroFiveOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFiveOne() {
        return zeroFiveOne;
    }

    /**
     * Sets the value of the zeroFiveOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFiveOne(String value) {
        this.zeroFiveOne = value;
    }

    /**
     * Gets the value of the zeroFiveTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFiveTwo() {
        return zeroFiveTwo;
    }

    /**
     * Sets the value of the zeroFiveTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFiveTwo(String value) {
        this.zeroFiveTwo = value;
    }

    /**
     * Gets the value of the zeroFiveThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFiveThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFiveThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * 
     * 
     */
    public List<Type> getZeroFiveThree() {
        if (zeroFiveThree == null) {
            zeroFiveThree = new ArrayList<Type>();
        }
        return this.zeroFiveThree;
    }

    /**
     * Gets the value of the zeroFiveFour property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroFiveFour() {
        return zeroFiveFour;
    }

    /**
     * Sets the value of the zeroFiveFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroFiveFour(Boolean value) {
        this.zeroFiveFour = value;
    }

    /**
     * Gets the value of the zeroFiveFive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroFiveFive() {
        return zeroFiveFive;
    }

    /**
     * Sets the value of the zeroFiveFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroFiveFive(BigDecimal value) {
        this.zeroFiveFive = value;
    }

    /**
     * Gets the value of the zeroFiveSix property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZeroFiveSix() {
        return zeroFiveSix;
    }

    /**
     * Sets the value of the zeroFiveSix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZeroFiveSix(Integer value) {
        this.zeroFiveSix = value;
    }

    /**
     * Gets the value of the zeroFiveSeven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFiveSeven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFiveSeven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroThirteen }
     * 
     * 
     */
    public List<ZeroThirteen> getZeroFiveSeven() {
        if (zeroFiveSeven == null) {
            zeroFiveSeven = new ArrayList<ZeroThirteen>();
        }
        return this.zeroFiveSeven;
    }

    /**
     * Gets the value of the zeroFiveEight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFiveEight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFiveEight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFourteen }
     * 
     * 
     */
    public List<ZeroFourteen> getZeroFiveEight() {
        if (zeroFiveEight == null) {
            zeroFiveEight = new ArrayList<ZeroFourteen>();
        }
        return this.zeroFiveEight;
    }

    /**
     * Gets the value of the zeroFiveNine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroFiveNine() {
        return zeroFiveNine;
    }

    /**
     * Sets the value of the zeroFiveNine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroFiveNine(XMLGregorianCalendar value) {
        this.zeroFiveNine = value;
    }

    /**
     * Gets the value of the zeroFiveTen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroOne }
     *     
     */
    public ZeroOne getZeroFiveTen() {
        return zeroFiveTen;
    }

    /**
     * Sets the value of the zeroFiveTen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroOne }
     *     
     */
    public void setZeroFiveTen(ZeroOne value) {
        this.zeroFiveTen = value;
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
            String theZeroFiveOne;
            theZeroFiveOne = this.getZeroFiveOne();
            strategy.appendField(locator, this, "zeroFiveOne", buffer, theZeroFiveOne);
        }
        {
            String theZeroFiveTwo;
            theZeroFiveTwo = this.getZeroFiveTwo();
            strategy.appendField(locator, this, "zeroFiveTwo", buffer, theZeroFiveTwo);
        }
        {
            List<Type> theZeroFiveThree;
            theZeroFiveThree = (((this.zeroFiveThree!= null)&&(!this.zeroFiveThree.isEmpty()))?this.getZeroFiveThree():null);
            strategy.appendField(locator, this, "zeroFiveThree", buffer, theZeroFiveThree);
        }
        {
            Boolean theZeroFiveFour;
            theZeroFiveFour = this.isZeroFiveFour();
            strategy.appendField(locator, this, "zeroFiveFour", buffer, theZeroFiveFour);
        }
        {
            BigDecimal theZeroFiveFive;
            theZeroFiveFive = this.getZeroFiveFive();
            strategy.appendField(locator, this, "zeroFiveFive", buffer, theZeroFiveFive);
        }
        {
            Integer theZeroFiveSix;
            theZeroFiveSix = this.getZeroFiveSix();
            strategy.appendField(locator, this, "zeroFiveSix", buffer, theZeroFiveSix);
        }
        {
            List<ZeroThirteen> theZeroFiveSeven;
            theZeroFiveSeven = (((this.zeroFiveSeven!= null)&&(!this.zeroFiveSeven.isEmpty()))?this.getZeroFiveSeven():null);
            strategy.appendField(locator, this, "zeroFiveSeven", buffer, theZeroFiveSeven);
        }
        {
            List<ZeroFourteen> theZeroFiveEight;
            theZeroFiveEight = (((this.zeroFiveEight!= null)&&(!this.zeroFiveEight.isEmpty()))?this.getZeroFiveEight():null);
            strategy.appendField(locator, this, "zeroFiveEight", buffer, theZeroFiveEight);
        }
        {
            XMLGregorianCalendar theZeroFiveNine;
            theZeroFiveNine = this.getZeroFiveNine();
            strategy.appendField(locator, this, "zeroFiveNine", buffer, theZeroFiveNine);
        }
        {
            ZeroOne theZeroFiveTen;
            theZeroFiveTen = this.getZeroFiveTen();
            strategy.appendField(locator, this, "zeroFiveTen", buffer, theZeroFiveTen);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroFive)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroFive that = ((ZeroFive) object);
        {
            String lhsZeroFiveOne;
            lhsZeroFiveOne = this.getZeroFiveOne();
            String rhsZeroFiveOne;
            rhsZeroFiveOne = that.getZeroFiveOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveOne", lhsZeroFiveOne), LocatorUtils.property(thatLocator, "zeroFiveOne", rhsZeroFiveOne), lhsZeroFiveOne, rhsZeroFiveOne)) {
                return false;
            }
        }
        {
            String lhsZeroFiveTwo;
            lhsZeroFiveTwo = this.getZeroFiveTwo();
            String rhsZeroFiveTwo;
            rhsZeroFiveTwo = that.getZeroFiveTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveTwo", lhsZeroFiveTwo), LocatorUtils.property(thatLocator, "zeroFiveTwo", rhsZeroFiveTwo), lhsZeroFiveTwo, rhsZeroFiveTwo)) {
                return false;
            }
        }
        {
            List<Type> lhsZeroFiveThree;
            lhsZeroFiveThree = (((this.zeroFiveThree!= null)&&(!this.zeroFiveThree.isEmpty()))?this.getZeroFiveThree():null);
            List<Type> rhsZeroFiveThree;
            rhsZeroFiveThree = (((that.zeroFiveThree!= null)&&(!that.zeroFiveThree.isEmpty()))?that.getZeroFiveThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveThree", lhsZeroFiveThree), LocatorUtils.property(thatLocator, "zeroFiveThree", rhsZeroFiveThree), lhsZeroFiveThree, rhsZeroFiveThree)) {
                return false;
            }
        }
        {
            Boolean lhsZeroFiveFour;
            lhsZeroFiveFour = this.isZeroFiveFour();
            Boolean rhsZeroFiveFour;
            rhsZeroFiveFour = that.isZeroFiveFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveFour", lhsZeroFiveFour), LocatorUtils.property(thatLocator, "zeroFiveFour", rhsZeroFiveFour), lhsZeroFiveFour, rhsZeroFiveFour)) {
                return false;
            }
        }
        {
            BigDecimal lhsZeroFiveFive;
            lhsZeroFiveFive = this.getZeroFiveFive();
            BigDecimal rhsZeroFiveFive;
            rhsZeroFiveFive = that.getZeroFiveFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveFive", lhsZeroFiveFive), LocatorUtils.property(thatLocator, "zeroFiveFive", rhsZeroFiveFive), lhsZeroFiveFive, rhsZeroFiveFive)) {
                return false;
            }
        }
        {
            Integer lhsZeroFiveSix;
            lhsZeroFiveSix = this.getZeroFiveSix();
            Integer rhsZeroFiveSix;
            rhsZeroFiveSix = that.getZeroFiveSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveSix", lhsZeroFiveSix), LocatorUtils.property(thatLocator, "zeroFiveSix", rhsZeroFiveSix), lhsZeroFiveSix, rhsZeroFiveSix)) {
                return false;
            }
        }
        {
            List<ZeroThirteen> lhsZeroFiveSeven;
            lhsZeroFiveSeven = (((this.zeroFiveSeven!= null)&&(!this.zeroFiveSeven.isEmpty()))?this.getZeroFiveSeven():null);
            List<ZeroThirteen> rhsZeroFiveSeven;
            rhsZeroFiveSeven = (((that.zeroFiveSeven!= null)&&(!that.zeroFiveSeven.isEmpty()))?that.getZeroFiveSeven():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveSeven", lhsZeroFiveSeven), LocatorUtils.property(thatLocator, "zeroFiveSeven", rhsZeroFiveSeven), lhsZeroFiveSeven, rhsZeroFiveSeven)) {
                return false;
            }
        }
        {
            List<ZeroFourteen> lhsZeroFiveEight;
            lhsZeroFiveEight = (((this.zeroFiveEight!= null)&&(!this.zeroFiveEight.isEmpty()))?this.getZeroFiveEight():null);
            List<ZeroFourteen> rhsZeroFiveEight;
            rhsZeroFiveEight = (((that.zeroFiveEight!= null)&&(!that.zeroFiveEight.isEmpty()))?that.getZeroFiveEight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveEight", lhsZeroFiveEight), LocatorUtils.property(thatLocator, "zeroFiveEight", rhsZeroFiveEight), lhsZeroFiveEight, rhsZeroFiveEight)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroFiveNine;
            lhsZeroFiveNine = this.getZeroFiveNine();
            XMLGregorianCalendar rhsZeroFiveNine;
            rhsZeroFiveNine = that.getZeroFiveNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveNine", lhsZeroFiveNine), LocatorUtils.property(thatLocator, "zeroFiveNine", rhsZeroFiveNine), lhsZeroFiveNine, rhsZeroFiveNine)) {
                return false;
            }
        }
        {
            ZeroOne lhsZeroFiveTen;
            lhsZeroFiveTen = this.getZeroFiveTen();
            ZeroOne rhsZeroFiveTen;
            rhsZeroFiveTen = that.getZeroFiveTen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFiveTen", lhsZeroFiveTen), LocatorUtils.property(thatLocator, "zeroFiveTen", rhsZeroFiveTen), lhsZeroFiveTen, rhsZeroFiveTen)) {
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
            String theZeroFiveOne;
            theZeroFiveOne = this.getZeroFiveOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveOne", theZeroFiveOne), currentHashCode, theZeroFiveOne);
        }
        {
            String theZeroFiveTwo;
            theZeroFiveTwo = this.getZeroFiveTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveTwo", theZeroFiveTwo), currentHashCode, theZeroFiveTwo);
        }
        {
            List<Type> theZeroFiveThree;
            theZeroFiveThree = (((this.zeroFiveThree!= null)&&(!this.zeroFiveThree.isEmpty()))?this.getZeroFiveThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveThree", theZeroFiveThree), currentHashCode, theZeroFiveThree);
        }
        {
            Boolean theZeroFiveFour;
            theZeroFiveFour = this.isZeroFiveFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveFour", theZeroFiveFour), currentHashCode, theZeroFiveFour);
        }
        {
            BigDecimal theZeroFiveFive;
            theZeroFiveFive = this.getZeroFiveFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveFive", theZeroFiveFive), currentHashCode, theZeroFiveFive);
        }
        {
            Integer theZeroFiveSix;
            theZeroFiveSix = this.getZeroFiveSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveSix", theZeroFiveSix), currentHashCode, theZeroFiveSix);
        }
        {
            List<ZeroThirteen> theZeroFiveSeven;
            theZeroFiveSeven = (((this.zeroFiveSeven!= null)&&(!this.zeroFiveSeven.isEmpty()))?this.getZeroFiveSeven():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveSeven", theZeroFiveSeven), currentHashCode, theZeroFiveSeven);
        }
        {
            List<ZeroFourteen> theZeroFiveEight;
            theZeroFiveEight = (((this.zeroFiveEight!= null)&&(!this.zeroFiveEight.isEmpty()))?this.getZeroFiveEight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveEight", theZeroFiveEight), currentHashCode, theZeroFiveEight);
        }
        {
            XMLGregorianCalendar theZeroFiveNine;
            theZeroFiveNine = this.getZeroFiveNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveNine", theZeroFiveNine), currentHashCode, theZeroFiveNine);
        }
        {
            ZeroOne theZeroFiveTen;
            theZeroFiveTen = this.getZeroFiveTen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFiveTen", theZeroFiveTen), currentHashCode, theZeroFiveTen);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
