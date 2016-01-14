
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
 * <p>Java class for ZeroSix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroSix">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroSixOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" minOccurs="0"/>
 *         &lt;element name="zeroSixTwo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="zeroSixThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwentyFive" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroSix", propOrder = {
    "zeroSixOne",
    "zeroSixTwo",
    "zeroSixThree"
})
public class ZeroSix
    implements Equals, HashCode, ToString
{

    protected String zeroSixOne;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger zeroSixTwo;
    protected List<ZeroTwentyFive> zeroSixThree;

    /**
     * Gets the value of the zeroSixOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroSixOne() {
        return zeroSixOne;
    }

    /**
     * Sets the value of the zeroSixOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroSixOne(String value) {
        this.zeroSixOne = value;
    }

    /**
     * Gets the value of the zeroSixTwo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZeroSixTwo() {
        return zeroSixTwo;
    }

    /**
     * Sets the value of the zeroSixTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZeroSixTwo(BigInteger value) {
        this.zeroSixTwo = value;
    }

    /**
     * Gets the value of the zeroSixThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroSixThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroSixThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTwentyFive }
     * 
     * 
     */
    public List<ZeroTwentyFive> getZeroSixThree() {
        if (zeroSixThree == null) {
            zeroSixThree = new ArrayList<ZeroTwentyFive>();
        }
        return this.zeroSixThree;
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
            String theZeroSixOne;
            theZeroSixOne = this.getZeroSixOne();
            strategy.appendField(locator, this, "zeroSixOne", buffer, theZeroSixOne);
        }
        {
            BigInteger theZeroSixTwo;
            theZeroSixTwo = this.getZeroSixTwo();
            strategy.appendField(locator, this, "zeroSixTwo", buffer, theZeroSixTwo);
        }
        {
            List<ZeroTwentyFive> theZeroSixThree;
            theZeroSixThree = (((this.zeroSixThree!= null)&&(!this.zeroSixThree.isEmpty()))?this.getZeroSixThree():null);
            strategy.appendField(locator, this, "zeroSixThree", buffer, theZeroSixThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroSix)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroSix that = ((ZeroSix) object);
        {
            String lhsZeroSixOne;
            lhsZeroSixOne = this.getZeroSixOne();
            String rhsZeroSixOne;
            rhsZeroSixOne = that.getZeroSixOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSixOne", lhsZeroSixOne), LocatorUtils.property(thatLocator, "zeroSixOne", rhsZeroSixOne), lhsZeroSixOne, rhsZeroSixOne)) {
                return false;
            }
        }
        {
            BigInteger lhsZeroSixTwo;
            lhsZeroSixTwo = this.getZeroSixTwo();
            BigInteger rhsZeroSixTwo;
            rhsZeroSixTwo = that.getZeroSixTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSixTwo", lhsZeroSixTwo), LocatorUtils.property(thatLocator, "zeroSixTwo", rhsZeroSixTwo), lhsZeroSixTwo, rhsZeroSixTwo)) {
                return false;
            }
        }
        {
            List<ZeroTwentyFive> lhsZeroSixThree;
            lhsZeroSixThree = (((this.zeroSixThree!= null)&&(!this.zeroSixThree.isEmpty()))?this.getZeroSixThree():null);
            List<ZeroTwentyFive> rhsZeroSixThree;
            rhsZeroSixThree = (((that.zeroSixThree!= null)&&(!that.zeroSixThree.isEmpty()))?that.getZeroSixThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSixThree", lhsZeroSixThree), LocatorUtils.property(thatLocator, "zeroSixThree", rhsZeroSixThree), lhsZeroSixThree, rhsZeroSixThree)) {
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
            String theZeroSixOne;
            theZeroSixOne = this.getZeroSixOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSixOne", theZeroSixOne), currentHashCode, theZeroSixOne);
        }
        {
            BigInteger theZeroSixTwo;
            theZeroSixTwo = this.getZeroSixTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSixTwo", theZeroSixTwo), currentHashCode, theZeroSixTwo);
        }
        {
            List<ZeroTwentyFive> theZeroSixThree;
            theZeroSixThree = (((this.zeroSixThree!= null)&&(!this.zeroSixThree.isEmpty()))?this.getZeroSixThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSixThree", theZeroSixThree), currentHashCode, theZeroSixThree);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
