
package com.eim.mdm.datamap.sample.v1;

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
 * <p>Java class for ZeroFour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroFour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroFourOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2"/>
 *         &lt;element name="zeroFourTwo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="zeroFourThree" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="zeroFourOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha1"/>
 *                   &lt;element name="zeroFourOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwenty" minOccurs="0"/>
 *                   &lt;element name="zeroFourOneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyOne" maxOccurs="unbounded"/>
 *                   &lt;element name="zeroFourOneFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zeroFourFour" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="zeroFourOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha1"/>
 *                   &lt;element name="zeroFourOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyTwo" minOccurs="0"/>
 *                   &lt;element name="zeroFourOneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyThree" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zeroFourFive" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyFour" minOccurs="0"/>
 *         &lt;element name="zeroFourSix" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="zeroFourSeven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourEight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zeroFourNine" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zeroFourTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourEleven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroFourTwelve" type="{http://www.dhikChik.com/Sample/1.0/}alpha25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroFour", propOrder = {
    "zeroFourOne",
    "zeroFourTwo",
    "zeroFourThree",
    "zeroFourFour",
    "zeroFourFive",
    "zeroFourSix",
    "zeroFourSeven",
    "zeroFourEight",
    "zeroFourNine",
    "zeroFourTen",
    "zeroFourEleven",
    "zeroFourTwelve"
})
public class ZeroFour
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroFourOne;
    @XmlSchemaType(name = "unsignedInt")
    protected long zeroFourTwo;
    protected List<ZeroFour.ZeroFourThree> zeroFourThree;
    protected List<ZeroFour.ZeroFourFour> zeroFourFour;
    protected ZeroTwentyFour zeroFourFive;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zeroFourSix;
    protected List<ZeroFourteen> zeroFourSeven;
    @XmlElement(required = true)
    protected String zeroFourEight;
    protected boolean zeroFourNine;
    protected List<ZeroThirteen> zeroFourTen;
    protected ZeroTen zeroFourEleven;
    @XmlElement(required = true)
    protected String zeroFourTwelve;

    /**
     * Gets the value of the zeroFourOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFourOne() {
        return zeroFourOne;
    }

    /**
     * Sets the value of the zeroFourOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFourOne(String value) {
        this.zeroFourOne = value;
    }

    /**
     * Gets the value of the zeroFourTwo property.
     * 
     */
    public long getZeroFourTwo() {
        return zeroFourTwo;
    }

    /**
     * Sets the value of the zeroFourTwo property.
     * 
     */
    public void setZeroFourTwo(long value) {
        this.zeroFourTwo = value;
    }

    /**
     * Gets the value of the zeroFourThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFour.ZeroFourThree }
     * 
     * 
     */
    public List<ZeroFour.ZeroFourThree> getZeroFourThree() {
        if (zeroFourThree == null) {
            zeroFourThree = new ArrayList<ZeroFour.ZeroFourThree>();
        }
        return this.zeroFourThree;
    }

    /**
     * Gets the value of the zeroFourFour property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourFour property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourFour().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFour.ZeroFourFour }
     * 
     * 
     */
    public List<ZeroFour.ZeroFourFour> getZeroFourFour() {
        if (zeroFourFour == null) {
            zeroFourFour = new ArrayList<ZeroFour.ZeroFourFour>();
        }
        return this.zeroFourFour;
    }

    /**
     * Gets the value of the zeroFourFive property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTwentyFour }
     *     
     */
    public ZeroTwentyFour getZeroFourFive() {
        return zeroFourFive;
    }

    /**
     * Sets the value of the zeroFourFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTwentyFour }
     *     
     */
    public void setZeroFourFive(ZeroTwentyFour value) {
        this.zeroFourFive = value;
    }

    /**
     * Gets the value of the zeroFourSix property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroFourSix() {
        return zeroFourSix;
    }

    /**
     * Sets the value of the zeroFourSix property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroFourSix(XMLGregorianCalendar value) {
        this.zeroFourSix = value;
    }

    /**
     * Gets the value of the zeroFourSeven property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourSeven property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourSeven().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFourteen }
     * 
     * 
     */
    public List<ZeroFourteen> getZeroFourSeven() {
        if (zeroFourSeven == null) {
            zeroFourSeven = new ArrayList<ZeroFourteen>();
        }
        return this.zeroFourSeven;
    }

    /**
     * Gets the value of the zeroFourEight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFourEight() {
        return zeroFourEight;
    }

    /**
     * Sets the value of the zeroFourEight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFourEight(String value) {
        this.zeroFourEight = value;
    }

    /**
     * Gets the value of the zeroFourNine property.
     * 
     */
    public boolean isZeroFourNine() {
        return zeroFourNine;
    }

    /**
     * Sets the value of the zeroFourNine property.
     * 
     */
    public void setZeroFourNine(boolean value) {
        this.zeroFourNine = value;
    }

    /**
     * Gets the value of the zeroFourTen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourTen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourTen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroThirteen }
     * 
     * 
     */
    public List<ZeroThirteen> getZeroFourTen() {
        if (zeroFourTen == null) {
            zeroFourTen = new ArrayList<ZeroThirteen>();
        }
        return this.zeroFourTen;
    }

    /**
     * Gets the value of the zeroFourEleven property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroFourEleven() {
        return zeroFourEleven;
    }

    /**
     * Sets the value of the zeroFourEleven property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroFourEleven(ZeroTen value) {
        this.zeroFourEleven = value;
    }

    /**
     * Gets the value of the zeroFourTwelve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFourTwelve() {
        return zeroFourTwelve;
    }

    /**
     * Sets the value of the zeroFourTwelve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFourTwelve(String value) {
        this.zeroFourTwelve = value;
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
            String theZeroFourOne;
            theZeroFourOne = this.getZeroFourOne();
            strategy.appendField(locator, this, "zeroFourOne", buffer, theZeroFourOne);
        }
        {
            long theZeroFourTwo;
            theZeroFourTwo = this.getZeroFourTwo();
            strategy.appendField(locator, this, "zeroFourTwo", buffer, theZeroFourTwo);
        }
        {
            List<ZeroFour.ZeroFourThree> theZeroFourThree;
            theZeroFourThree = (((this.zeroFourThree!= null)&&(!this.zeroFourThree.isEmpty()))?this.getZeroFourThree():null);
            strategy.appendField(locator, this, "zeroFourThree", buffer, theZeroFourThree);
        }
        {
            List<ZeroFour.ZeroFourFour> theZeroFourFour;
            theZeroFourFour = (((this.zeroFourFour!= null)&&(!this.zeroFourFour.isEmpty()))?this.getZeroFourFour():null);
            strategy.appendField(locator, this, "zeroFourFour", buffer, theZeroFourFour);
        }
        {
            ZeroTwentyFour theZeroFourFive;
            theZeroFourFive = this.getZeroFourFive();
            strategy.appendField(locator, this, "zeroFourFive", buffer, theZeroFourFive);
        }
        {
            XMLGregorianCalendar theZeroFourSix;
            theZeroFourSix = this.getZeroFourSix();
            strategy.appendField(locator, this, "zeroFourSix", buffer, theZeroFourSix);
        }
        {
            List<ZeroFourteen> theZeroFourSeven;
            theZeroFourSeven = (((this.zeroFourSeven!= null)&&(!this.zeroFourSeven.isEmpty()))?this.getZeroFourSeven():null);
            strategy.appendField(locator, this, "zeroFourSeven", buffer, theZeroFourSeven);
        }
        {
            String theZeroFourEight;
            theZeroFourEight = this.getZeroFourEight();
            strategy.appendField(locator, this, "zeroFourEight", buffer, theZeroFourEight);
        }
        {
            boolean theZeroFourNine;
            theZeroFourNine = this.isZeroFourNine();
            strategy.appendField(locator, this, "zeroFourNine", buffer, theZeroFourNine);
        }
        {
            List<ZeroThirteen> theZeroFourTen;
            theZeroFourTen = (((this.zeroFourTen!= null)&&(!this.zeroFourTen.isEmpty()))?this.getZeroFourTen():null);
            strategy.appendField(locator, this, "zeroFourTen", buffer, theZeroFourTen);
        }
        {
            ZeroTen theZeroFourEleven;
            theZeroFourEleven = this.getZeroFourEleven();
            strategy.appendField(locator, this, "zeroFourEleven", buffer, theZeroFourEleven);
        }
        {
            String theZeroFourTwelve;
            theZeroFourTwelve = this.getZeroFourTwelve();
            strategy.appendField(locator, this, "zeroFourTwelve", buffer, theZeroFourTwelve);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroFour)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroFour that = ((ZeroFour) object);
        {
            String lhsZeroFourOne;
            lhsZeroFourOne = this.getZeroFourOne();
            String rhsZeroFourOne;
            rhsZeroFourOne = that.getZeroFourOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOne", lhsZeroFourOne), LocatorUtils.property(thatLocator, "zeroFourOne", rhsZeroFourOne), lhsZeroFourOne, rhsZeroFourOne)) {
                return false;
            }
        }
        {
            long lhsZeroFourTwo;
            lhsZeroFourTwo = this.getZeroFourTwo();
            long rhsZeroFourTwo;
            rhsZeroFourTwo = that.getZeroFourTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourTwo", lhsZeroFourTwo), LocatorUtils.property(thatLocator, "zeroFourTwo", rhsZeroFourTwo), lhsZeroFourTwo, rhsZeroFourTwo)) {
                return false;
            }
        }
        {
            List<ZeroFour.ZeroFourThree> lhsZeroFourThree;
            lhsZeroFourThree = (((this.zeroFourThree!= null)&&(!this.zeroFourThree.isEmpty()))?this.getZeroFourThree():null);
            List<ZeroFour.ZeroFourThree> rhsZeroFourThree;
            rhsZeroFourThree = (((that.zeroFourThree!= null)&&(!that.zeroFourThree.isEmpty()))?that.getZeroFourThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourThree", lhsZeroFourThree), LocatorUtils.property(thatLocator, "zeroFourThree", rhsZeroFourThree), lhsZeroFourThree, rhsZeroFourThree)) {
                return false;
            }
        }
        {
            List<ZeroFour.ZeroFourFour> lhsZeroFourFour;
            lhsZeroFourFour = (((this.zeroFourFour!= null)&&(!this.zeroFourFour.isEmpty()))?this.getZeroFourFour():null);
            List<ZeroFour.ZeroFourFour> rhsZeroFourFour;
            rhsZeroFourFour = (((that.zeroFourFour!= null)&&(!that.zeroFourFour.isEmpty()))?that.getZeroFourFour():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourFour", lhsZeroFourFour), LocatorUtils.property(thatLocator, "zeroFourFour", rhsZeroFourFour), lhsZeroFourFour, rhsZeroFourFour)) {
                return false;
            }
        }
        {
            ZeroTwentyFour lhsZeroFourFive;
            lhsZeroFourFive = this.getZeroFourFive();
            ZeroTwentyFour rhsZeroFourFive;
            rhsZeroFourFive = that.getZeroFourFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourFive", lhsZeroFourFive), LocatorUtils.property(thatLocator, "zeroFourFive", rhsZeroFourFive), lhsZeroFourFive, rhsZeroFourFive)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroFourSix;
            lhsZeroFourSix = this.getZeroFourSix();
            XMLGregorianCalendar rhsZeroFourSix;
            rhsZeroFourSix = that.getZeroFourSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourSix", lhsZeroFourSix), LocatorUtils.property(thatLocator, "zeroFourSix", rhsZeroFourSix), lhsZeroFourSix, rhsZeroFourSix)) {
                return false;
            }
        }
        {
            List<ZeroFourteen> lhsZeroFourSeven;
            lhsZeroFourSeven = (((this.zeroFourSeven!= null)&&(!this.zeroFourSeven.isEmpty()))?this.getZeroFourSeven():null);
            List<ZeroFourteen> rhsZeroFourSeven;
            rhsZeroFourSeven = (((that.zeroFourSeven!= null)&&(!that.zeroFourSeven.isEmpty()))?that.getZeroFourSeven():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourSeven", lhsZeroFourSeven), LocatorUtils.property(thatLocator, "zeroFourSeven", rhsZeroFourSeven), lhsZeroFourSeven, rhsZeroFourSeven)) {
                return false;
            }
        }
        {
            String lhsZeroFourEight;
            lhsZeroFourEight = this.getZeroFourEight();
            String rhsZeroFourEight;
            rhsZeroFourEight = that.getZeroFourEight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourEight", lhsZeroFourEight), LocatorUtils.property(thatLocator, "zeroFourEight", rhsZeroFourEight), lhsZeroFourEight, rhsZeroFourEight)) {
                return false;
            }
        }
        {
            boolean lhsZeroFourNine;
            lhsZeroFourNine = this.isZeroFourNine();
            boolean rhsZeroFourNine;
            rhsZeroFourNine = that.isZeroFourNine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourNine", lhsZeroFourNine), LocatorUtils.property(thatLocator, "zeroFourNine", rhsZeroFourNine), lhsZeroFourNine, rhsZeroFourNine)) {
                return false;
            }
        }
        {
            List<ZeroThirteen> lhsZeroFourTen;
            lhsZeroFourTen = (((this.zeroFourTen!= null)&&(!this.zeroFourTen.isEmpty()))?this.getZeroFourTen():null);
            List<ZeroThirteen> rhsZeroFourTen;
            rhsZeroFourTen = (((that.zeroFourTen!= null)&&(!that.zeroFourTen.isEmpty()))?that.getZeroFourTen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourTen", lhsZeroFourTen), LocatorUtils.property(thatLocator, "zeroFourTen", rhsZeroFourTen), lhsZeroFourTen, rhsZeroFourTen)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroFourEleven;
            lhsZeroFourEleven = this.getZeroFourEleven();
            ZeroTen rhsZeroFourEleven;
            rhsZeroFourEleven = that.getZeroFourEleven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourEleven", lhsZeroFourEleven), LocatorUtils.property(thatLocator, "zeroFourEleven", rhsZeroFourEleven), lhsZeroFourEleven, rhsZeroFourEleven)) {
                return false;
            }
        }
        {
            String lhsZeroFourTwelve;
            lhsZeroFourTwelve = this.getZeroFourTwelve();
            String rhsZeroFourTwelve;
            rhsZeroFourTwelve = that.getZeroFourTwelve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourTwelve", lhsZeroFourTwelve), LocatorUtils.property(thatLocator, "zeroFourTwelve", rhsZeroFourTwelve), lhsZeroFourTwelve, rhsZeroFourTwelve)) {
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
            String theZeroFourOne;
            theZeroFourOne = this.getZeroFourOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOne", theZeroFourOne), currentHashCode, theZeroFourOne);
        }
        {
            long theZeroFourTwo;
            theZeroFourTwo = this.getZeroFourTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourTwo", theZeroFourTwo), currentHashCode, theZeroFourTwo);
        }
        {
            List<ZeroFour.ZeroFourThree> theZeroFourThree;
            theZeroFourThree = (((this.zeroFourThree!= null)&&(!this.zeroFourThree.isEmpty()))?this.getZeroFourThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourThree", theZeroFourThree), currentHashCode, theZeroFourThree);
        }
        {
            List<ZeroFour.ZeroFourFour> theZeroFourFour;
            theZeroFourFour = (((this.zeroFourFour!= null)&&(!this.zeroFourFour.isEmpty()))?this.getZeroFourFour():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourFour", theZeroFourFour), currentHashCode, theZeroFourFour);
        }
        {
            ZeroTwentyFour theZeroFourFive;
            theZeroFourFive = this.getZeroFourFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourFive", theZeroFourFive), currentHashCode, theZeroFourFive);
        }
        {
            XMLGregorianCalendar theZeroFourSix;
            theZeroFourSix = this.getZeroFourSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourSix", theZeroFourSix), currentHashCode, theZeroFourSix);
        }
        {
            List<ZeroFourteen> theZeroFourSeven;
            theZeroFourSeven = (((this.zeroFourSeven!= null)&&(!this.zeroFourSeven.isEmpty()))?this.getZeroFourSeven():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourSeven", theZeroFourSeven), currentHashCode, theZeroFourSeven);
        }
        {
            String theZeroFourEight;
            theZeroFourEight = this.getZeroFourEight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourEight", theZeroFourEight), currentHashCode, theZeroFourEight);
        }
        {
            boolean theZeroFourNine;
            theZeroFourNine = this.isZeroFourNine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourNine", theZeroFourNine), currentHashCode, theZeroFourNine);
        }
        {
            List<ZeroThirteen> theZeroFourTen;
            theZeroFourTen = (((this.zeroFourTen!= null)&&(!this.zeroFourTen.isEmpty()))?this.getZeroFourTen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourTen", theZeroFourTen), currentHashCode, theZeroFourTen);
        }
        {
            ZeroTen theZeroFourEleven;
            theZeroFourEleven = this.getZeroFourEleven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourEleven", theZeroFourEleven), currentHashCode, theZeroFourEleven);
        }
        {
            String theZeroFourTwelve;
            theZeroFourTwelve = this.getZeroFourTwelve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourTwelve", theZeroFourTwelve), currentHashCode, theZeroFourTwelve);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="zeroFourOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha1"/>
     *         &lt;element name="zeroFourOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyTwo" minOccurs="0"/>
     *         &lt;element name="zeroFourOneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyThree" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zeroFourOneOne",
        "zeroFourOneTwo",
        "zeroFourOneThree"
    })
    public static class ZeroFourFour
        implements Equals, HashCode, ToString
    {

        protected String zeroFourOneOne;
        protected ZeroTwentyTwo zeroFourOneTwo;
        protected List<ZeroTwentyThree> zeroFourOneThree;

        /**
         * Gets the value of the zeroFourOneOne property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZeroFourOneOne() {
            return zeroFourOneOne;
        }

        /**
         * Sets the value of the zeroFourOneOne property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZeroFourOneOne(String value) {
            this.zeroFourOneOne = value;
        }

        /**
         * Gets the value of the zeroFourOneTwo property.
         * 
         * @return
         *     possible object is
         *     {@link ZeroTwentyTwo }
         *     
         */
        public ZeroTwentyTwo getZeroFourOneTwo() {
            return zeroFourOneTwo;
        }

        /**
         * Sets the value of the zeroFourOneTwo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZeroTwentyTwo }
         *     
         */
        public void setZeroFourOneTwo(ZeroTwentyTwo value) {
            this.zeroFourOneTwo = value;
        }

        /**
         * Gets the value of the zeroFourOneThree property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zeroFourOneThree property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZeroFourOneThree().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroTwentyThree }
         * 
         * 
         */
        public List<ZeroTwentyThree> getZeroFourOneThree() {
            if (zeroFourOneThree == null) {
                zeroFourOneThree = new ArrayList<ZeroTwentyThree>();
            }
            return this.zeroFourOneThree;
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
                String theZeroFourOneOne;
                theZeroFourOneOne = this.getZeroFourOneOne();
                strategy.appendField(locator, this, "zeroFourOneOne", buffer, theZeroFourOneOne);
            }
            {
                ZeroTwentyTwo theZeroFourOneTwo;
                theZeroFourOneTwo = this.getZeroFourOneTwo();
                strategy.appendField(locator, this, "zeroFourOneTwo", buffer, theZeroFourOneTwo);
            }
            {
                List<ZeroTwentyThree> theZeroFourOneThree;
                theZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                strategy.appendField(locator, this, "zeroFourOneThree", buffer, theZeroFourOneThree);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ZeroFour.ZeroFourFour)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ZeroFour.ZeroFourFour that = ((ZeroFour.ZeroFourFour) object);
            {
                String lhsZeroFourOneOne;
                lhsZeroFourOneOne = this.getZeroFourOneOne();
                String rhsZeroFourOneOne;
                rhsZeroFourOneOne = that.getZeroFourOneOne();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneOne", lhsZeroFourOneOne), LocatorUtils.property(thatLocator, "zeroFourOneOne", rhsZeroFourOneOne), lhsZeroFourOneOne, rhsZeroFourOneOne)) {
                    return false;
                }
            }
            {
                ZeroTwentyTwo lhsZeroFourOneTwo;
                lhsZeroFourOneTwo = this.getZeroFourOneTwo();
                ZeroTwentyTwo rhsZeroFourOneTwo;
                rhsZeroFourOneTwo = that.getZeroFourOneTwo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneTwo", lhsZeroFourOneTwo), LocatorUtils.property(thatLocator, "zeroFourOneTwo", rhsZeroFourOneTwo), lhsZeroFourOneTwo, rhsZeroFourOneTwo)) {
                    return false;
                }
            }
            {
                List<ZeroTwentyThree> lhsZeroFourOneThree;
                lhsZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                List<ZeroTwentyThree> rhsZeroFourOneThree;
                rhsZeroFourOneThree = (((that.zeroFourOneThree!= null)&&(!that.zeroFourOneThree.isEmpty()))?that.getZeroFourOneThree():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneThree", lhsZeroFourOneThree), LocatorUtils.property(thatLocator, "zeroFourOneThree", rhsZeroFourOneThree), lhsZeroFourOneThree, rhsZeroFourOneThree)) {
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
                String theZeroFourOneOne;
                theZeroFourOneOne = this.getZeroFourOneOne();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneOne", theZeroFourOneOne), currentHashCode, theZeroFourOneOne);
            }
            {
                ZeroTwentyTwo theZeroFourOneTwo;
                theZeroFourOneTwo = this.getZeroFourOneTwo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneTwo", theZeroFourOneTwo), currentHashCode, theZeroFourOneTwo);
            }
            {
                List<ZeroTwentyThree> theZeroFourOneThree;
                theZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneThree", theZeroFourOneThree), currentHashCode, theZeroFourOneThree);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="zeroFourOneOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha1"/>
     *         &lt;element name="zeroFourOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwenty" minOccurs="0"/>
     *         &lt;element name="zeroFourOneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyOne" maxOccurs="unbounded"/>
     *         &lt;element name="zeroFourOneFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zeroFourOneOne",
        "zeroFourOneTwo",
        "zeroFourOneThree",
        "zeroFourOneFour"
    })
    public static class ZeroFourThree
        implements Equals, HashCode, ToString
    {

        protected String zeroFourOneOne;
        protected ZeroTwenty zeroFourOneTwo;
        protected List<ZeroTwentyOne> zeroFourOneThree;
        protected List<ZeroTen> zeroFourOneFour;

        /**
         * Gets the value of the zeroFourOneOne property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZeroFourOneOne() {
            return zeroFourOneOne;
        }

        /**
         * Sets the value of the zeroFourOneOne property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZeroFourOneOne(String value) {
            this.zeroFourOneOne = value;
        }

        /**
         * Gets the value of the zeroFourOneTwo property.
         * 
         * @return
         *     possible object is
         *     {@link ZeroTwenty }
         *     
         */
        public ZeroTwenty getZeroFourOneTwo() {
            return zeroFourOneTwo;
        }

        /**
         * Sets the value of the zeroFourOneTwo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ZeroTwenty }
         *     
         */
        public void setZeroFourOneTwo(ZeroTwenty value) {
            this.zeroFourOneTwo = value;
        }

        /**
         * Gets the value of the zeroFourOneThree property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zeroFourOneThree property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZeroFourOneThree().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroTwentyOne }
         * 
         * 
         */
        public List<ZeroTwentyOne> getZeroFourOneThree() {
            if (zeroFourOneThree == null) {
                zeroFourOneThree = new ArrayList<ZeroTwentyOne>();
            }
            return this.zeroFourOneThree;
        }

        /**
         * Gets the value of the zeroFourOneFour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zeroFourOneFour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZeroFourOneFour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroTen }
         * 
         * 
         */
        public List<ZeroTen> getZeroFourOneFour() {
            if (zeroFourOneFour == null) {
                zeroFourOneFour = new ArrayList<ZeroTen>();
            }
            return this.zeroFourOneFour;
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
                String theZeroFourOneOne;
                theZeroFourOneOne = this.getZeroFourOneOne();
                strategy.appendField(locator, this, "zeroFourOneOne", buffer, theZeroFourOneOne);
            }
            {
                ZeroTwenty theZeroFourOneTwo;
                theZeroFourOneTwo = this.getZeroFourOneTwo();
                strategy.appendField(locator, this, "zeroFourOneTwo", buffer, theZeroFourOneTwo);
            }
            {
                List<ZeroTwentyOne> theZeroFourOneThree;
                theZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                strategy.appendField(locator, this, "zeroFourOneThree", buffer, theZeroFourOneThree);
            }
            {
                List<ZeroTen> theZeroFourOneFour;
                theZeroFourOneFour = (((this.zeroFourOneFour!= null)&&(!this.zeroFourOneFour.isEmpty()))?this.getZeroFourOneFour():null);
                strategy.appendField(locator, this, "zeroFourOneFour", buffer, theZeroFourOneFour);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof ZeroFour.ZeroFourThree)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ZeroFour.ZeroFourThree that = ((ZeroFour.ZeroFourThree) object);
            {
                String lhsZeroFourOneOne;
                lhsZeroFourOneOne = this.getZeroFourOneOne();
                String rhsZeroFourOneOne;
                rhsZeroFourOneOne = that.getZeroFourOneOne();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneOne", lhsZeroFourOneOne), LocatorUtils.property(thatLocator, "zeroFourOneOne", rhsZeroFourOneOne), lhsZeroFourOneOne, rhsZeroFourOneOne)) {
                    return false;
                }
            }
            {
                ZeroTwenty lhsZeroFourOneTwo;
                lhsZeroFourOneTwo = this.getZeroFourOneTwo();
                ZeroTwenty rhsZeroFourOneTwo;
                rhsZeroFourOneTwo = that.getZeroFourOneTwo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneTwo", lhsZeroFourOneTwo), LocatorUtils.property(thatLocator, "zeroFourOneTwo", rhsZeroFourOneTwo), lhsZeroFourOneTwo, rhsZeroFourOneTwo)) {
                    return false;
                }
            }
            {
                List<ZeroTwentyOne> lhsZeroFourOneThree;
                lhsZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                List<ZeroTwentyOne> rhsZeroFourOneThree;
                rhsZeroFourOneThree = (((that.zeroFourOneThree!= null)&&(!that.zeroFourOneThree.isEmpty()))?that.getZeroFourOneThree():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneThree", lhsZeroFourOneThree), LocatorUtils.property(thatLocator, "zeroFourOneThree", rhsZeroFourOneThree), lhsZeroFourOneThree, rhsZeroFourOneThree)) {
                    return false;
                }
            }
            {
                List<ZeroTen> lhsZeroFourOneFour;
                lhsZeroFourOneFour = (((this.zeroFourOneFour!= null)&&(!this.zeroFourOneFour.isEmpty()))?this.getZeroFourOneFour():null);
                List<ZeroTen> rhsZeroFourOneFour;
                rhsZeroFourOneFour = (((that.zeroFourOneFour!= null)&&(!that.zeroFourOneFour.isEmpty()))?that.getZeroFourOneFour():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourOneFour", lhsZeroFourOneFour), LocatorUtils.property(thatLocator, "zeroFourOneFour", rhsZeroFourOneFour), lhsZeroFourOneFour, rhsZeroFourOneFour)) {
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
                String theZeroFourOneOne;
                theZeroFourOneOne = this.getZeroFourOneOne();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneOne", theZeroFourOneOne), currentHashCode, theZeroFourOneOne);
            }
            {
                ZeroTwenty theZeroFourOneTwo;
                theZeroFourOneTwo = this.getZeroFourOneTwo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneTwo", theZeroFourOneTwo), currentHashCode, theZeroFourOneTwo);
            }
            {
                List<ZeroTwentyOne> theZeroFourOneThree;
                theZeroFourOneThree = (((this.zeroFourOneThree!= null)&&(!this.zeroFourOneThree.isEmpty()))?this.getZeroFourOneThree():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneThree", theZeroFourOneThree), currentHashCode, theZeroFourOneThree);
            }
            {
                List<ZeroTen> theZeroFourOneFour;
                theZeroFourOneFour = (((this.zeroFourOneFour!= null)&&(!this.zeroFourOneFour.isEmpty()))?this.getZeroFourOneFour():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourOneFour", theZeroFourOneFour), currentHashCode, theZeroFourOneFour);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
