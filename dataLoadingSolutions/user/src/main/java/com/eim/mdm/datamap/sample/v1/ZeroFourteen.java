
package com.eim.mdm.datamap.sample.v1;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for ZeroFourteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroFourteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://www.dhikChik.com/Sample/1.0/}email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourteenOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFifteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourteenTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFifteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourteenThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroFourteenFour" type="{http://www.dhikChik.com/Sample/1.0/}DateRange" minOccurs="0"/>
 *         &lt;element name="zeroFourteenFive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroFourteenSix" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroFourteen", propOrder = {
    "email",
    "zeroFourteenOne",
    "zeroFourteenTwo",
    "zeroFourteenThree",
    "zeroFourteenFour",
    "zeroFourteenFive",
    "zeroFourteenSix"
})
public class ZeroFourteen
    implements Equals, HashCode, ToString
{

    protected List<String> email;
    protected List<ZeroFifteen> zeroFourteenOne;
    protected List<ZeroFifteen> zeroFourteenTwo;
    protected List<ZeroTen> zeroFourteenThree;
    protected DateRange zeroFourteenFour;
    protected Boolean zeroFourteenFive;
    protected String zeroFourteenSix;

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEmail() {
        if (email == null) {
            email = new ArrayList<String>();
        }
        return this.email;
    }

    /**
     * Gets the value of the zeroFourteenOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourteenOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourteenOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFifteen }
     * 
     * 
     */
    public List<ZeroFifteen> getZeroFourteenOne() {
        if (zeroFourteenOne == null) {
            zeroFourteenOne = new ArrayList<ZeroFifteen>();
        }
        return this.zeroFourteenOne;
    }

    /**
     * Gets the value of the zeroFourteenTwo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourteenTwo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourteenTwo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFifteen }
     * 
     * 
     */
    public List<ZeroFifteen> getZeroFourteenTwo() {
        if (zeroFourteenTwo == null) {
            zeroFourteenTwo = new ArrayList<ZeroFifteen>();
        }
        return this.zeroFourteenTwo;
    }

    /**
     * Gets the value of the zeroFourteenThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroFourteenThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroFourteenThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTen }
     * 
     * 
     */
    public List<ZeroTen> getZeroFourteenThree() {
        if (zeroFourteenThree == null) {
            zeroFourteenThree = new ArrayList<ZeroTen>();
        }
        return this.zeroFourteenThree;
    }

    /**
     * Gets the value of the zeroFourteenFour property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getZeroFourteenFour() {
        return zeroFourteenFour;
    }

    /**
     * Sets the value of the zeroFourteenFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setZeroFourteenFour(DateRange value) {
        this.zeroFourteenFour = value;
    }

    /**
     * Gets the value of the zeroFourteenFive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroFourteenFive() {
        return zeroFourteenFive;
    }

    /**
     * Sets the value of the zeroFourteenFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroFourteenFive(Boolean value) {
        this.zeroFourteenFive = value;
    }

    /**
     * Gets the value of the zeroFourteenSix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroFourteenSix() {
        return zeroFourteenSix;
    }

    /**
     * Sets the value of the zeroFourteenSix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroFourteenSix(String value) {
        this.zeroFourteenSix = value;
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
            List<String> theEmail;
            theEmail = (((this.email!= null)&&(!this.email.isEmpty()))?this.getEmail():null);
            strategy.appendField(locator, this, "email", buffer, theEmail);
        }
        {
            List<ZeroFifteen> theZeroFourteenOne;
            theZeroFourteenOne = (((this.zeroFourteenOne!= null)&&(!this.zeroFourteenOne.isEmpty()))?this.getZeroFourteenOne():null);
            strategy.appendField(locator, this, "zeroFourteenOne", buffer, theZeroFourteenOne);
        }
        {
            List<ZeroFifteen> theZeroFourteenTwo;
            theZeroFourteenTwo = (((this.zeroFourteenTwo!= null)&&(!this.zeroFourteenTwo.isEmpty()))?this.getZeroFourteenTwo():null);
            strategy.appendField(locator, this, "zeroFourteenTwo", buffer, theZeroFourteenTwo);
        }
        {
            List<ZeroTen> theZeroFourteenThree;
            theZeroFourteenThree = (((this.zeroFourteenThree!= null)&&(!this.zeroFourteenThree.isEmpty()))?this.getZeroFourteenThree():null);
            strategy.appendField(locator, this, "zeroFourteenThree", buffer, theZeroFourteenThree);
        }
        {
            DateRange theZeroFourteenFour;
            theZeroFourteenFour = this.getZeroFourteenFour();
            strategy.appendField(locator, this, "zeroFourteenFour", buffer, theZeroFourteenFour);
        }
        {
            Boolean theZeroFourteenFive;
            theZeroFourteenFive = this.isZeroFourteenFive();
            strategy.appendField(locator, this, "zeroFourteenFive", buffer, theZeroFourteenFive);
        }
        {
            String theZeroFourteenSix;
            theZeroFourteenSix = this.getZeroFourteenSix();
            strategy.appendField(locator, this, "zeroFourteenSix", buffer, theZeroFourteenSix);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroFourteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroFourteen that = ((ZeroFourteen) object);
        {
            List<String> lhsEmail;
            lhsEmail = (((this.email!= null)&&(!this.email.isEmpty()))?this.getEmail():null);
            List<String> rhsEmail;
            rhsEmail = (((that.email!= null)&&(!that.email.isEmpty()))?that.getEmail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            List<ZeroFifteen> lhsZeroFourteenOne;
            lhsZeroFourteenOne = (((this.zeroFourteenOne!= null)&&(!this.zeroFourteenOne.isEmpty()))?this.getZeroFourteenOne():null);
            List<ZeroFifteen> rhsZeroFourteenOne;
            rhsZeroFourteenOne = (((that.zeroFourteenOne!= null)&&(!that.zeroFourteenOne.isEmpty()))?that.getZeroFourteenOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenOne", lhsZeroFourteenOne), LocatorUtils.property(thatLocator, "zeroFourteenOne", rhsZeroFourteenOne), lhsZeroFourteenOne, rhsZeroFourteenOne)) {
                return false;
            }
        }
        {
            List<ZeroFifteen> lhsZeroFourteenTwo;
            lhsZeroFourteenTwo = (((this.zeroFourteenTwo!= null)&&(!this.zeroFourteenTwo.isEmpty()))?this.getZeroFourteenTwo():null);
            List<ZeroFifteen> rhsZeroFourteenTwo;
            rhsZeroFourteenTwo = (((that.zeroFourteenTwo!= null)&&(!that.zeroFourteenTwo.isEmpty()))?that.getZeroFourteenTwo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenTwo", lhsZeroFourteenTwo), LocatorUtils.property(thatLocator, "zeroFourteenTwo", rhsZeroFourteenTwo), lhsZeroFourteenTwo, rhsZeroFourteenTwo)) {
                return false;
            }
        }
        {
            List<ZeroTen> lhsZeroFourteenThree;
            lhsZeroFourteenThree = (((this.zeroFourteenThree!= null)&&(!this.zeroFourteenThree.isEmpty()))?this.getZeroFourteenThree():null);
            List<ZeroTen> rhsZeroFourteenThree;
            rhsZeroFourteenThree = (((that.zeroFourteenThree!= null)&&(!that.zeroFourteenThree.isEmpty()))?that.getZeroFourteenThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenThree", lhsZeroFourteenThree), LocatorUtils.property(thatLocator, "zeroFourteenThree", rhsZeroFourteenThree), lhsZeroFourteenThree, rhsZeroFourteenThree)) {
                return false;
            }
        }
        {
            DateRange lhsZeroFourteenFour;
            lhsZeroFourteenFour = this.getZeroFourteenFour();
            DateRange rhsZeroFourteenFour;
            rhsZeroFourteenFour = that.getZeroFourteenFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenFour", lhsZeroFourteenFour), LocatorUtils.property(thatLocator, "zeroFourteenFour", rhsZeroFourteenFour), lhsZeroFourteenFour, rhsZeroFourteenFour)) {
                return false;
            }
        }
        {
            Boolean lhsZeroFourteenFive;
            lhsZeroFourteenFive = this.isZeroFourteenFive();
            Boolean rhsZeroFourteenFive;
            rhsZeroFourteenFive = that.isZeroFourteenFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenFive", lhsZeroFourteenFive), LocatorUtils.property(thatLocator, "zeroFourteenFive", rhsZeroFourteenFive), lhsZeroFourteenFive, rhsZeroFourteenFive)) {
                return false;
            }
        }
        {
            String lhsZeroFourteenSix;
            lhsZeroFourteenSix = this.getZeroFourteenSix();
            String rhsZeroFourteenSix;
            rhsZeroFourteenSix = that.getZeroFourteenSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroFourteenSix", lhsZeroFourteenSix), LocatorUtils.property(thatLocator, "zeroFourteenSix", rhsZeroFourteenSix), lhsZeroFourteenSix, rhsZeroFourteenSix)) {
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
            List<String> theEmail;
            theEmail = (((this.email!= null)&&(!this.email.isEmpty()))?this.getEmail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
        }
        {
            List<ZeroFifteen> theZeroFourteenOne;
            theZeroFourteenOne = (((this.zeroFourteenOne!= null)&&(!this.zeroFourteenOne.isEmpty()))?this.getZeroFourteenOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenOne", theZeroFourteenOne), currentHashCode, theZeroFourteenOne);
        }
        {
            List<ZeroFifteen> theZeroFourteenTwo;
            theZeroFourteenTwo = (((this.zeroFourteenTwo!= null)&&(!this.zeroFourteenTwo.isEmpty()))?this.getZeroFourteenTwo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenTwo", theZeroFourteenTwo), currentHashCode, theZeroFourteenTwo);
        }
        {
            List<ZeroTen> theZeroFourteenThree;
            theZeroFourteenThree = (((this.zeroFourteenThree!= null)&&(!this.zeroFourteenThree.isEmpty()))?this.getZeroFourteenThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenThree", theZeroFourteenThree), currentHashCode, theZeroFourteenThree);
        }
        {
            DateRange theZeroFourteenFour;
            theZeroFourteenFour = this.getZeroFourteenFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenFour", theZeroFourteenFour), currentHashCode, theZeroFourteenFour);
        }
        {
            Boolean theZeroFourteenFive;
            theZeroFourteenFive = this.isZeroFourteenFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenFive", theZeroFourteenFive), currentHashCode, theZeroFourteenFive);
        }
        {
            String theZeroFourteenSix;
            theZeroFourteenSix = this.getZeroFourteenSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroFourteenSix", theZeroFourteenSix), currentHashCode, theZeroFourteenSix);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
