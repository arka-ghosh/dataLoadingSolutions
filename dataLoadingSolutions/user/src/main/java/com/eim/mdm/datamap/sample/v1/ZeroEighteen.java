
package com.eim.mdm.datamap.sample.v1;

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
 * <p>Java class for ZeroEighteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroEighteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroEighteenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2"/>
 *         &lt;element name="zeroEighteenTwo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroEighteenThree" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroEighteen", propOrder = {
    "zeroEighteenOne",
    "zeroEighteenTwo",
    "zeroEighteenThree"
})
public class ZeroEighteen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroEighteenOne;
    protected Boolean zeroEighteenTwo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zeroEighteenThree;

    /**
     * Gets the value of the zeroEighteenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroEighteenOne() {
        return zeroEighteenOne;
    }

    /**
     * Sets the value of the zeroEighteenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroEighteenOne(String value) {
        this.zeroEighteenOne = value;
    }

    /**
     * Gets the value of the zeroEighteenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroEighteenTwo() {
        return zeroEighteenTwo;
    }

    /**
     * Sets the value of the zeroEighteenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroEighteenTwo(Boolean value) {
        this.zeroEighteenTwo = value;
    }

    /**
     * Gets the value of the zeroEighteenThree property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroEighteenThree() {
        return zeroEighteenThree;
    }

    /**
     * Sets the value of the zeroEighteenThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroEighteenThree(XMLGregorianCalendar value) {
        this.zeroEighteenThree = value;
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
            String theZeroEighteenOne;
            theZeroEighteenOne = this.getZeroEighteenOne();
            strategy.appendField(locator, this, "zeroEighteenOne", buffer, theZeroEighteenOne);
        }
        {
            Boolean theZeroEighteenTwo;
            theZeroEighteenTwo = this.isZeroEighteenTwo();
            strategy.appendField(locator, this, "zeroEighteenTwo", buffer, theZeroEighteenTwo);
        }
        {
            XMLGregorianCalendar theZeroEighteenThree;
            theZeroEighteenThree = this.getZeroEighteenThree();
            strategy.appendField(locator, this, "zeroEighteenThree", buffer, theZeroEighteenThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroEighteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroEighteen that = ((ZeroEighteen) object);
        {
            String lhsZeroEighteenOne;
            lhsZeroEighteenOne = this.getZeroEighteenOne();
            String rhsZeroEighteenOne;
            rhsZeroEighteenOne = that.getZeroEighteenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEighteenOne", lhsZeroEighteenOne), LocatorUtils.property(thatLocator, "zeroEighteenOne", rhsZeroEighteenOne), lhsZeroEighteenOne, rhsZeroEighteenOne)) {
                return false;
            }
        }
        {
            Boolean lhsZeroEighteenTwo;
            lhsZeroEighteenTwo = this.isZeroEighteenTwo();
            Boolean rhsZeroEighteenTwo;
            rhsZeroEighteenTwo = that.isZeroEighteenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEighteenTwo", lhsZeroEighteenTwo), LocatorUtils.property(thatLocator, "zeroEighteenTwo", rhsZeroEighteenTwo), lhsZeroEighteenTwo, rhsZeroEighteenTwo)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroEighteenThree;
            lhsZeroEighteenThree = this.getZeroEighteenThree();
            XMLGregorianCalendar rhsZeroEighteenThree;
            rhsZeroEighteenThree = that.getZeroEighteenThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroEighteenThree", lhsZeroEighteenThree), LocatorUtils.property(thatLocator, "zeroEighteenThree", rhsZeroEighteenThree), lhsZeroEighteenThree, rhsZeroEighteenThree)) {
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
            String theZeroEighteenOne;
            theZeroEighteenOne = this.getZeroEighteenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEighteenOne", theZeroEighteenOne), currentHashCode, theZeroEighteenOne);
        }
        {
            Boolean theZeroEighteenTwo;
            theZeroEighteenTwo = this.isZeroEighteenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEighteenTwo", theZeroEighteenTwo), currentHashCode, theZeroEighteenTwo);
        }
        {
            XMLGregorianCalendar theZeroEighteenThree;
            theZeroEighteenThree = this.getZeroEighteenThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroEighteenThree", theZeroEighteenThree), currentHashCode, theZeroEighteenThree);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
