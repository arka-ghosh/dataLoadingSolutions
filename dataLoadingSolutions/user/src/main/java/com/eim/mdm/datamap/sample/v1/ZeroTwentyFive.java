
package com.eim.mdm.datamap.sample.v1;

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
 * <p>Java class for ZeroTwentyFive complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroTwentyFive">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroTwentyFiveOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha5" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroTwentyFiveTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" minOccurs="0"/>
 *         &lt;element name="zeroTwentyFiveThree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroTwentyFiveFour" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroTwentyFive", propOrder = {
    "zeroTwentyFiveOne",
    "zeroTwentyFiveTwo",
    "zeroTwentyFiveThree",
    "zeroTwentyFiveFour"
})
public class ZeroTwentyFive
    implements Equals, HashCode, ToString
{

    protected List<String> zeroTwentyFiveOne;
    protected ZeroThirteen zeroTwentyFiveTwo;
    protected Boolean zeroTwentyFiveThree;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zeroTwentyFiveFour;

    /**
     * Gets the value of the zeroTwentyFiveOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroTwentyFiveOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroTwentyFiveOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZeroTwentyFiveOne() {
        if (zeroTwentyFiveOne == null) {
            zeroTwentyFiveOne = new ArrayList<String>();
        }
        return this.zeroTwentyFiveOne;
    }

    /**
     * Gets the value of the zeroTwentyFiveTwo property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroThirteen }
     *     
     */
    public ZeroThirteen getZeroTwentyFiveTwo() {
        return zeroTwentyFiveTwo;
    }

    /**
     * Sets the value of the zeroTwentyFiveTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroThirteen }
     *     
     */
    public void setZeroTwentyFiveTwo(ZeroThirteen value) {
        this.zeroTwentyFiveTwo = value;
    }

    /**
     * Gets the value of the zeroTwentyFiveThree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroTwentyFiveThree() {
        return zeroTwentyFiveThree;
    }

    /**
     * Sets the value of the zeroTwentyFiveThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroTwentyFiveThree(Boolean value) {
        this.zeroTwentyFiveThree = value;
    }

    /**
     * Gets the value of the zeroTwentyFiveFour property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroTwentyFiveFour() {
        return zeroTwentyFiveFour;
    }

    /**
     * Sets the value of the zeroTwentyFiveFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroTwentyFiveFour(XMLGregorianCalendar value) {
        this.zeroTwentyFiveFour = value;
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
            List<String> theZeroTwentyFiveOne;
            theZeroTwentyFiveOne = (((this.zeroTwentyFiveOne!= null)&&(!this.zeroTwentyFiveOne.isEmpty()))?this.getZeroTwentyFiveOne():null);
            strategy.appendField(locator, this, "zeroTwentyFiveOne", buffer, theZeroTwentyFiveOne);
        }
        {
            ZeroThirteen theZeroTwentyFiveTwo;
            theZeroTwentyFiveTwo = this.getZeroTwentyFiveTwo();
            strategy.appendField(locator, this, "zeroTwentyFiveTwo", buffer, theZeroTwentyFiveTwo);
        }
        {
            Boolean theZeroTwentyFiveThree;
            theZeroTwentyFiveThree = this.isZeroTwentyFiveThree();
            strategy.appendField(locator, this, "zeroTwentyFiveThree", buffer, theZeroTwentyFiveThree);
        }
        {
            XMLGregorianCalendar theZeroTwentyFiveFour;
            theZeroTwentyFiveFour = this.getZeroTwentyFiveFour();
            strategy.appendField(locator, this, "zeroTwentyFiveFour", buffer, theZeroTwentyFiveFour);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroTwentyFive)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroTwentyFive that = ((ZeroTwentyFive) object);
        {
            List<String> lhsZeroTwentyFiveOne;
            lhsZeroTwentyFiveOne = (((this.zeroTwentyFiveOne!= null)&&(!this.zeroTwentyFiveOne.isEmpty()))?this.getZeroTwentyFiveOne():null);
            List<String> rhsZeroTwentyFiveOne;
            rhsZeroTwentyFiveOne = (((that.zeroTwentyFiveOne!= null)&&(!that.zeroTwentyFiveOne.isEmpty()))?that.getZeroTwentyFiveOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFiveOne", lhsZeroTwentyFiveOne), LocatorUtils.property(thatLocator, "zeroTwentyFiveOne", rhsZeroTwentyFiveOne), lhsZeroTwentyFiveOne, rhsZeroTwentyFiveOne)) {
                return false;
            }
        }
        {
            ZeroThirteen lhsZeroTwentyFiveTwo;
            lhsZeroTwentyFiveTwo = this.getZeroTwentyFiveTwo();
            ZeroThirteen rhsZeroTwentyFiveTwo;
            rhsZeroTwentyFiveTwo = that.getZeroTwentyFiveTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFiveTwo", lhsZeroTwentyFiveTwo), LocatorUtils.property(thatLocator, "zeroTwentyFiveTwo", rhsZeroTwentyFiveTwo), lhsZeroTwentyFiveTwo, rhsZeroTwentyFiveTwo)) {
                return false;
            }
        }
        {
            Boolean lhsZeroTwentyFiveThree;
            lhsZeroTwentyFiveThree = this.isZeroTwentyFiveThree();
            Boolean rhsZeroTwentyFiveThree;
            rhsZeroTwentyFiveThree = that.isZeroTwentyFiveThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFiveThree", lhsZeroTwentyFiveThree), LocatorUtils.property(thatLocator, "zeroTwentyFiveThree", rhsZeroTwentyFiveThree), lhsZeroTwentyFiveThree, rhsZeroTwentyFiveThree)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroTwentyFiveFour;
            lhsZeroTwentyFiveFour = this.getZeroTwentyFiveFour();
            XMLGregorianCalendar rhsZeroTwentyFiveFour;
            rhsZeroTwentyFiveFour = that.getZeroTwentyFiveFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroTwentyFiveFour", lhsZeroTwentyFiveFour), LocatorUtils.property(thatLocator, "zeroTwentyFiveFour", rhsZeroTwentyFiveFour), lhsZeroTwentyFiveFour, rhsZeroTwentyFiveFour)) {
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
            List<String> theZeroTwentyFiveOne;
            theZeroTwentyFiveOne = (((this.zeroTwentyFiveOne!= null)&&(!this.zeroTwentyFiveOne.isEmpty()))?this.getZeroTwentyFiveOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFiveOne", theZeroTwentyFiveOne), currentHashCode, theZeroTwentyFiveOne);
        }
        {
            ZeroThirteen theZeroTwentyFiveTwo;
            theZeroTwentyFiveTwo = this.getZeroTwentyFiveTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFiveTwo", theZeroTwentyFiveTwo), currentHashCode, theZeroTwentyFiveTwo);
        }
        {
            Boolean theZeroTwentyFiveThree;
            theZeroTwentyFiveThree = this.isZeroTwentyFiveThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFiveThree", theZeroTwentyFiveThree), currentHashCode, theZeroTwentyFiveThree);
        }
        {
            XMLGregorianCalendar theZeroTwentyFiveFour;
            theZeroTwentyFiveFour = this.getZeroTwentyFiveFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroTwentyFiveFour", theZeroTwentyFiveFour), currentHashCode, theZeroTwentyFiveFour);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
