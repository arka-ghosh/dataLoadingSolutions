
package com.eim.mdm.datamap.sample.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ZeroSeventeen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroSeventeen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroSeventeenOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroSeventeen", propOrder = {
    "zeroSeventeenOne"
})
@XmlSeeAlso({
    ZeroOne.class
})
public class ZeroSeventeen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected String zeroSeventeenOne;

    /**
     * Gets the value of the zeroSeventeenOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroSeventeenOne() {
        return zeroSeventeenOne;
    }

    /**
     * Sets the value of the zeroSeventeenOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroSeventeenOne(String value) {
        this.zeroSeventeenOne = value;
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
            String theZeroSeventeenOne;
            theZeroSeventeenOne = this.getZeroSeventeenOne();
            strategy.appendField(locator, this, "zeroSeventeenOne", buffer, theZeroSeventeenOne);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroSeventeen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroSeventeen that = ((ZeroSeventeen) object);
        {
            String lhsZeroSeventeenOne;
            lhsZeroSeventeenOne = this.getZeroSeventeenOne();
            String rhsZeroSeventeenOne;
            rhsZeroSeventeenOne = that.getZeroSeventeenOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSeventeenOne", lhsZeroSeventeenOne), LocatorUtils.property(thatLocator, "zeroSeventeenOne", rhsZeroSeventeenOne), lhsZeroSeventeenOne, rhsZeroSeventeenOne)) {
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
            String theZeroSeventeenOne;
            theZeroSeventeenOne = this.getZeroSeventeenOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSeventeenOne", theZeroSeventeenOne), currentHashCode, theZeroSeventeenOne);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
