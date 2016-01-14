
package com.eim.mdm.datamap.sample.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for ZeroNineteen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroNineteen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroNineteenOne" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="5" minOccurs="2"/>
 *         &lt;element name="zeroNineteenTwo" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="zeroNineteenThree" type="{http://www.dhikChik.com/Sample/1.0/}year" maxOccurs="unbounded"/>
 *         &lt;element name="zeroNineteenFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwenty" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroNineteen", propOrder = {
    "zeroNineteenOne",
    "zeroNineteenTwo",
    "zeroNineteenThree",
    "zeroNineteenFour"
})
public class ZeroNineteen
    implements Equals, HashCode, ToString
{

    @XmlElement(type = Double.class)
    protected List<Double> zeroNineteenOne;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String zeroNineteenTwo;
    @XmlElement(required = true)
    protected List<String> zeroNineteenThree;
    protected ZeroTwenty zeroNineteenFour;

    /**
     * Gets the value of the zeroNineteenOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroNineteenOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroNineteenOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getZeroNineteenOne() {
        if (zeroNineteenOne == null) {
            zeroNineteenOne = new ArrayList<Double>();
        }
        return this.zeroNineteenOne;
    }

    /**
     * Gets the value of the zeroNineteenTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroNineteenTwo() {
        return zeroNineteenTwo;
    }

    /**
     * Sets the value of the zeroNineteenTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroNineteenTwo(String value) {
        this.zeroNineteenTwo = value;
    }

    /**
     * Gets the value of the zeroNineteenThree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroNineteenThree property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroNineteenThree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getZeroNineteenThree() {
        if (zeroNineteenThree == null) {
            zeroNineteenThree = new ArrayList<String>();
        }
        return this.zeroNineteenThree;
    }

    /**
     * Gets the value of the zeroNineteenFour property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTwenty }
     *     
     */
    public ZeroTwenty getZeroNineteenFour() {
        return zeroNineteenFour;
    }

    /**
     * Sets the value of the zeroNineteenFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTwenty }
     *     
     */
    public void setZeroNineteenFour(ZeroTwenty value) {
        this.zeroNineteenFour = value;
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
            List<Double> theZeroNineteenOne;
            theZeroNineteenOne = (((this.zeroNineteenOne!= null)&&(!this.zeroNineteenOne.isEmpty()))?this.getZeroNineteenOne():null);
            strategy.appendField(locator, this, "zeroNineteenOne", buffer, theZeroNineteenOne);
        }
        {
            String theZeroNineteenTwo;
            theZeroNineteenTwo = this.getZeroNineteenTwo();
            strategy.appendField(locator, this, "zeroNineteenTwo", buffer, theZeroNineteenTwo);
        }
        {
            List<String> theZeroNineteenThree;
            theZeroNineteenThree = (((this.zeroNineteenThree!= null)&&(!this.zeroNineteenThree.isEmpty()))?this.getZeroNineteenThree():null);
            strategy.appendField(locator, this, "zeroNineteenThree", buffer, theZeroNineteenThree);
        }
        {
            ZeroTwenty theZeroNineteenFour;
            theZeroNineteenFour = this.getZeroNineteenFour();
            strategy.appendField(locator, this, "zeroNineteenFour", buffer, theZeroNineteenFour);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroNineteen)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroNineteen that = ((ZeroNineteen) object);
        {
            List<Double> lhsZeroNineteenOne;
            lhsZeroNineteenOne = (((this.zeroNineteenOne!= null)&&(!this.zeroNineteenOne.isEmpty()))?this.getZeroNineteenOne():null);
            List<Double> rhsZeroNineteenOne;
            rhsZeroNineteenOne = (((that.zeroNineteenOne!= null)&&(!that.zeroNineteenOne.isEmpty()))?that.getZeroNineteenOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineteenOne", lhsZeroNineteenOne), LocatorUtils.property(thatLocator, "zeroNineteenOne", rhsZeroNineteenOne), lhsZeroNineteenOne, rhsZeroNineteenOne)) {
                return false;
            }
        }
        {
            String lhsZeroNineteenTwo;
            lhsZeroNineteenTwo = this.getZeroNineteenTwo();
            String rhsZeroNineteenTwo;
            rhsZeroNineteenTwo = that.getZeroNineteenTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineteenTwo", lhsZeroNineteenTwo), LocatorUtils.property(thatLocator, "zeroNineteenTwo", rhsZeroNineteenTwo), lhsZeroNineteenTwo, rhsZeroNineteenTwo)) {
                return false;
            }
        }
        {
            List<String> lhsZeroNineteenThree;
            lhsZeroNineteenThree = (((this.zeroNineteenThree!= null)&&(!this.zeroNineteenThree.isEmpty()))?this.getZeroNineteenThree():null);
            List<String> rhsZeroNineteenThree;
            rhsZeroNineteenThree = (((that.zeroNineteenThree!= null)&&(!that.zeroNineteenThree.isEmpty()))?that.getZeroNineteenThree():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineteenThree", lhsZeroNineteenThree), LocatorUtils.property(thatLocator, "zeroNineteenThree", rhsZeroNineteenThree), lhsZeroNineteenThree, rhsZeroNineteenThree)) {
                return false;
            }
        }
        {
            ZeroTwenty lhsZeroNineteenFour;
            lhsZeroNineteenFour = this.getZeroNineteenFour();
            ZeroTwenty rhsZeroNineteenFour;
            rhsZeroNineteenFour = that.getZeroNineteenFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroNineteenFour", lhsZeroNineteenFour), LocatorUtils.property(thatLocator, "zeroNineteenFour", rhsZeroNineteenFour), lhsZeroNineteenFour, rhsZeroNineteenFour)) {
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
            List<Double> theZeroNineteenOne;
            theZeroNineteenOne = (((this.zeroNineteenOne!= null)&&(!this.zeroNineteenOne.isEmpty()))?this.getZeroNineteenOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineteenOne", theZeroNineteenOne), currentHashCode, theZeroNineteenOne);
        }
        {
            String theZeroNineteenTwo;
            theZeroNineteenTwo = this.getZeroNineteenTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineteenTwo", theZeroNineteenTwo), currentHashCode, theZeroNineteenTwo);
        }
        {
            List<String> theZeroNineteenThree;
            theZeroNineteenThree = (((this.zeroNineteenThree!= null)&&(!this.zeroNineteenThree.isEmpty()))?this.getZeroNineteenThree():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineteenThree", theZeroNineteenThree), currentHashCode, theZeroNineteenThree);
        }
        {
            ZeroTwenty theZeroNineteenFour;
            theZeroNineteenFour = this.getZeroNineteenFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroNineteenFour", theZeroNineteenFour), currentHashCode, theZeroNineteenFour);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
