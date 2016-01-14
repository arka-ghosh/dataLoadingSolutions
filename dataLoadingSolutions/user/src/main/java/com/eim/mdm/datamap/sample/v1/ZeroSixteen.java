
package com.eim.mdm.datamap.sample.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ZeroSixteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroSixteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroSixteenOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroSixteen", propOrder = {
    "zeroSixteenOne"
})
public class ZeroSixteen
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<ZeroTen> zeroSixteenOne;

    /**
     * Gets the value of the zeroSixteenOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroSixteenOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroSixteenOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTen }
     * 
     * 
     */
    public List<ZeroTen> getZeroSixteenOne() {
        if (zeroSixteenOne == null) {
            zeroSixteenOne = new ArrayList<ZeroTen>();
        }
        return this.zeroSixteenOne;
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
            List<ZeroTen> theZeroSixteenOne;
            theZeroSixteenOne = (((this.zeroSixteenOne!= null)&&(!this.zeroSixteenOne.isEmpty()))?this.getZeroSixteenOne():null);
            strategy.appendField(locator, this, "zeroSixteenOne", buffer, theZeroSixteenOne);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroSixteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroSixteen that = ((ZeroSixteen) object);
        {
            List<ZeroTen> lhsZeroSixteenOne;
            lhsZeroSixteenOne = (((this.zeroSixteenOne!= null)&&(!this.zeroSixteenOne.isEmpty()))?this.getZeroSixteenOne():null);
            List<ZeroTen> rhsZeroSixteenOne;
            rhsZeroSixteenOne = (((that.zeroSixteenOne!= null)&&(!that.zeroSixteenOne.isEmpty()))?that.getZeroSixteenOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroSixteenOne", lhsZeroSixteenOne), LocatorUtils.property(thatLocator, "zeroSixteenOne", rhsZeroSixteenOne), lhsZeroSixteenOne, rhsZeroSixteenOne)) {
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
            List<ZeroTen> theZeroSixteenOne;
            theZeroSixteenOne = (((this.zeroSixteenOne!= null)&&(!this.zeroSixteenOne.isEmpty()))?this.getZeroSixteenOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroSixteenOne", theZeroSixteenOne), currentHashCode, theZeroSixteenOne);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
