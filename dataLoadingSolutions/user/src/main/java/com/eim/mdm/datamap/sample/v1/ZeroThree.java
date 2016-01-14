
package com.eim.mdm.datamap.sample.v1;

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
 * <p>Java class for ZeroThree complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroThree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroThreeOne" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[A-Z][A-Z][A-Z]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="zeroThreeTwo" type="{http://www.dhikChik.com/Sample/1.0/}alpha80" minOccurs="0"/>
 *         &lt;element name="zeroThreeThree" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0-9][0-9][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroThree", propOrder = {
    "zeroThreeOne",
    "zeroThreeTwo",
    "zeroThreeThree"
})
public class ZeroThree
    implements Equals, HashCode, ToString
{

    protected String zeroThreeOne;
    protected String zeroThreeTwo;
    protected String zeroThreeThree;

    /**
     * Gets the value of the zeroThreeOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThreeOne() {
        return zeroThreeOne;
    }

    /**
     * Sets the value of the zeroThreeOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThreeOne(String value) {
        this.zeroThreeOne = value;
    }

    /**
     * Gets the value of the zeroThreeTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThreeTwo() {
        return zeroThreeTwo;
    }

    /**
     * Sets the value of the zeroThreeTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThreeTwo(String value) {
        this.zeroThreeTwo = value;
    }

    /**
     * Gets the value of the zeroThreeThree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroThreeThree() {
        return zeroThreeThree;
    }

    /**
     * Sets the value of the zeroThreeThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroThreeThree(String value) {
        this.zeroThreeThree = value;
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
            String theZeroThreeOne;
            theZeroThreeOne = this.getZeroThreeOne();
            strategy.appendField(locator, this, "zeroThreeOne", buffer, theZeroThreeOne);
        }
        {
            String theZeroThreeTwo;
            theZeroThreeTwo = this.getZeroThreeTwo();
            strategy.appendField(locator, this, "zeroThreeTwo", buffer, theZeroThreeTwo);
        }
        {
            String theZeroThreeThree;
            theZeroThreeThree = this.getZeroThreeThree();
            strategy.appendField(locator, this, "zeroThreeThree", buffer, theZeroThreeThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroThree)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroThree that = ((ZeroThree) object);
        {
            String lhsZeroThreeOne;
            lhsZeroThreeOne = this.getZeroThreeOne();
            String rhsZeroThreeOne;
            rhsZeroThreeOne = that.getZeroThreeOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThreeOne", lhsZeroThreeOne), LocatorUtils.property(thatLocator, "zeroThreeOne", rhsZeroThreeOne), lhsZeroThreeOne, rhsZeroThreeOne)) {
                return false;
            }
        }
        {
            String lhsZeroThreeTwo;
            lhsZeroThreeTwo = this.getZeroThreeTwo();
            String rhsZeroThreeTwo;
            rhsZeroThreeTwo = that.getZeroThreeTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThreeTwo", lhsZeroThreeTwo), LocatorUtils.property(thatLocator, "zeroThreeTwo", rhsZeroThreeTwo), lhsZeroThreeTwo, rhsZeroThreeTwo)) {
                return false;
            }
        }
        {
            String lhsZeroThreeThree;
            lhsZeroThreeThree = this.getZeroThreeThree();
            String rhsZeroThreeThree;
            rhsZeroThreeThree = that.getZeroThreeThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroThreeThree", lhsZeroThreeThree), LocatorUtils.property(thatLocator, "zeroThreeThree", rhsZeroThreeThree), lhsZeroThreeThree, rhsZeroThreeThree)) {
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
            String theZeroThreeOne;
            theZeroThreeOne = this.getZeroThreeOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThreeOne", theZeroThreeOne), currentHashCode, theZeroThreeOne);
        }
        {
            String theZeroThreeTwo;
            theZeroThreeTwo = this.getZeroThreeTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThreeTwo", theZeroThreeTwo), currentHashCode, theZeroThreeTwo);
        }
        {
            String theZeroThreeThree;
            theZeroThreeThree = this.getZeroThreeThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroThreeThree", theZeroThreeThree), currentHashCode, theZeroThreeThree);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
