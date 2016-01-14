
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
 * <p>Java class for ZeroEight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroEight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroEightOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha25" minOccurs="0"/>
 *         &lt;element name="zeroEightTwo" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         &lt;element name="zeroEightThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroEight", propOrder = {
    "zeroEightOne",
    "zeroEightTwo",
    "zeroEightThree"
})
public class ZeroEight
    implements Equals, HashCode, ToString
{

    protected String zeroEightOne;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger zeroEightTwo;
    protected List<ZeroTen> zeroEightThree;

    /**
     * Gets the value of the zeroEightOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroEightOne() {
        return zeroEightOne;
    }

    /**
     * Sets the value of the zeroEightOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroEightOne(String value) {
        this.zeroEightOne = value;
    }

    /**
     * Gets the value of the zeroEightTwo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZeroEightTwo() {
        return zeroEightTwo;
    }

    /**
     * Sets the value of the zeroEightTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZeroEightTwo(BigInteger value) {
        this.zeroEightTwo = value;
    }

    /**
     * Gets the value of the zeroEightThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroEightThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroEightThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTen }
     * 
     * 
     */
    public List<ZeroTen> getZeroEightThree() {
        if (zeroEightThree == null) {
            zeroEightThree = new ArrayList<ZeroTen>();
        }
        return this.zeroEightThree;
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
            String theZeroEightOne;
            theZeroEightOne = this.getZeroEightOne();
            strategy.appendField(locator, this, "zeroEightOne", buffer, theZeroEightOne);
        }
        {
            BigInteger theZeroEightTwo;
            theZeroEightTwo = this.getZeroEightTwo();
            strategy.appendField(locator, this, "zeroEightTwo", buffer, theZeroEightTwo);
        }
        {
            List<ZeroTen> theZeroEightThree;
            theZeroEightThree = (((this.zeroEightThree!= null)&&(!this.zeroEightThree.isEmpty()))?this.getZeroEightThree():null);
            strategy.appendField(locator, this, "zeroEightThree", buffer, theZeroEightThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroEight)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroEight that = ((ZeroEight) object);
        {
            String lhsZeroEightOne;
            lhsZeroEightOne = this.getZeroEightOne();
            String rhsZeroEightOne;
            rhsZeroEightOne = that.getZeroEightOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEightOne", lhsZeroEightOne), LocatorUtils.property(thatLocator, "zeroEightOne", rhsZeroEightOne), lhsZeroEightOne, rhsZeroEightOne)) {
                return false;
            }
        }
        {
            BigInteger lhsZeroEightTwo;
            lhsZeroEightTwo = this.getZeroEightTwo();
            BigInteger rhsZeroEightTwo;
            rhsZeroEightTwo = that.getZeroEightTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEightTwo", lhsZeroEightTwo), LocatorUtils.property(thatLocator, "zeroEightTwo", rhsZeroEightTwo), lhsZeroEightTwo, rhsZeroEightTwo)) {
                return false;
            }
        }
        {
            List<ZeroTen> lhsZeroEightThree;
            lhsZeroEightThree = (((this.zeroEightThree!= null)&&(!this.zeroEightThree.isEmpty()))?this.getZeroEightThree():null);
            List<ZeroTen> rhsZeroEightThree;
            rhsZeroEightThree = (((that.zeroEightThree!= null)&&(!that.zeroEightThree.isEmpty()))?that.getZeroEightThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEightThree", lhsZeroEightThree), LocatorUtils.property(thatLocator, "zeroEightThree", rhsZeroEightThree), lhsZeroEightThree, rhsZeroEightThree)) {
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
            String theZeroEightOne;
            theZeroEightOne = this.getZeroEightOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEightOne", theZeroEightOne), currentHashCode, theZeroEightOne);
        }
        {
            BigInteger theZeroEightTwo;
            theZeroEightTwo = this.getZeroEightTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEightTwo", theZeroEightTwo), currentHashCode, theZeroEightTwo);
        }
        {
            List<ZeroTen> theZeroEightThree;
            theZeroEightThree = (((this.zeroEightThree!= null)&&(!this.zeroEightThree.isEmpty()))?this.getZeroEightThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEightThree", theZeroEightThree), currentHashCode, theZeroEightThree);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
