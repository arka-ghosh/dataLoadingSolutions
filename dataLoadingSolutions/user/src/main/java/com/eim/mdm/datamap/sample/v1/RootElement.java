
package com.eim.mdm.datamap.sample.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="one" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroZero">
 *                 &lt;sequence>
 *                   &lt;element name="oneOne" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroOne">
 *                           &lt;sequence>
 *                             &lt;element name="oneOneOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwo"/>
 *                             &lt;element name="oneOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThree"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="oneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFour" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="oneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFive" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="oneFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroSix" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="oneFive" type="{http://www.dhikChik.com/Sample/1.0/}ZeroSeven" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="oneSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEight" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="two" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/>
 *         &lt;element name="three" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.dhikChik.com/Sample/1.0/>year">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "one",
    "two",
    "three"
})
@XmlRootElement(name = "RootElement")
public class RootElement
    implements Equals, HashCode, ToString
{

    protected List<RootElement.One> one;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected Object two;
    protected RootElement.Three three;

    /**
     * Gets the value of the one property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the one property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RootElement.One }
     * 
     * 
     */
    public List<RootElement.One> getOne() {
        if (one == null) {
            one = new ArrayList<RootElement.One>();
        }
        return this.one;
    }

    /**
     * Gets the value of the two property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTwo() {
        return two;
    }

    /**
     * Sets the value of the two property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTwo(Object value) {
        this.two = value;
    }

    /**
     * Gets the value of the three property.
     * 
     * @return
     *     possible object is
     *     {@link RootElement.Three }
     *     
     */
    public RootElement.Three getThree() {
        return three;
    }

    /**
     * Sets the value of the three property.
     * 
     * @param value
     *     allowed object is
     *     {@link RootElement.Three }
     *     
     */
    public void setThree(RootElement.Three value) {
        this.three = value;
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
            List<RootElement.One> theOne;
            theOne = (((this.one!= null)&&(!this.one.isEmpty()))?this.getOne():null);
            strategy.appendField(locator, this, "one", buffer, theOne);
        }
        {
            Object theTwo;
            theTwo = this.getTwo();
            strategy.appendField(locator, this, "two", buffer, theTwo);
        }
        {
            RootElement.Three theThree;
            theThree = this.getThree();
            strategy.appendField(locator, this, "three", buffer, theThree);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RootElement)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RootElement that = ((RootElement) object);
        {
            List<RootElement.One> lhsOne;
            lhsOne = (((this.one!= null)&&(!this.one.isEmpty()))?this.getOne():null);
            List<RootElement.One> rhsOne;
            rhsOne = (((that.one!= null)&&(!that.one.isEmpty()))?that.getOne():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "one", lhsOne), LocatorUtils.property(thatLocator, "one", rhsOne), lhsOne, rhsOne)) {
                return false;
            }
        }
        {
            Object lhsTwo;
            lhsTwo = this.getTwo();
            Object rhsTwo;
            rhsTwo = that.getTwo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "two", lhsTwo), LocatorUtils.property(thatLocator, "two", rhsTwo), lhsTwo, rhsTwo)) {
                return false;
            }
        }
        {
            RootElement.Three lhsThree;
            lhsThree = this.getThree();
            RootElement.Three rhsThree;
            rhsThree = that.getThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "three", lhsThree), LocatorUtils.property(thatLocator, "three", rhsThree), lhsThree, rhsThree)) {
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
            List<RootElement.One> theOne;
            theOne = (((this.one!= null)&&(!this.one.isEmpty()))?this.getOne():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "one", theOne), currentHashCode, theOne);
        }
        {
            Object theTwo;
            theTwo = this.getTwo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "two", theTwo), currentHashCode, theTwo);
        }
        {
            RootElement.Three theThree;
            theThree = this.getThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "three", theThree), currentHashCode, theThree);
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
     *     &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroZero">
     *       &lt;sequence>
     *         &lt;element name="oneOne" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroOne">
     *                 &lt;sequence>
     *                   &lt;element name="oneOneOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwo"/>
     *                   &lt;element name="oneOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThree"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="oneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFour" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="oneThree" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFive" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="oneFour" type="{http://www.dhikChik.com/Sample/1.0/}ZeroSix" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="oneFive" type="{http://www.dhikChik.com/Sample/1.0/}ZeroSeven" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="oneSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEight" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oneOne",
        "oneTwo",
        "oneThree",
        "oneFour",
        "oneFive",
        "oneSix"
    })
    public static class One
        extends ZeroZero
        implements Equals, HashCode, ToString
    {

        protected List<RootElement.One.OneOne> oneOne;
        protected List<ZeroFour> oneTwo;
        protected List<ZeroFive> oneThree;
        protected List<ZeroSix> oneFour;
        protected List<ZeroSeven> oneFive;
        protected List<ZeroEight> oneSix;

        /**
         * Gets the value of the oneOne property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneOne property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneOne().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RootElement.One.OneOne }
         * 
         * 
         */
        public List<RootElement.One.OneOne> getOneOne() {
            if (oneOne == null) {
                oneOne = new ArrayList<RootElement.One.OneOne>();
            }
            return this.oneOne;
        }

        /**
         * Gets the value of the oneTwo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneTwo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneTwo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroFour }
         * 
         * 
         */
        public List<ZeroFour> getOneTwo() {
            if (oneTwo == null) {
                oneTwo = new ArrayList<ZeroFour>();
            }
            return this.oneTwo;
        }

        /**
         * Gets the value of the oneThree property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneThree property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneThree().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroFive }
         * 
         * 
         */
        public List<ZeroFive> getOneThree() {
            if (oneThree == null) {
                oneThree = new ArrayList<ZeroFive>();
            }
            return this.oneThree;
        }

        /**
         * Gets the value of the oneFour property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneFour property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneFour().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroSix }
         * 
         * 
         */
        public List<ZeroSix> getOneFour() {
            if (oneFour == null) {
                oneFour = new ArrayList<ZeroSix>();
            }
            return this.oneFour;
        }

        /**
         * Gets the value of the oneFive property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneFive property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneFive().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroSeven }
         * 
         * 
         */
        public List<ZeroSeven> getOneFive() {
            if (oneFive == null) {
                oneFive = new ArrayList<ZeroSeven>();
            }
            return this.oneFive;
        }

        /**
         * Gets the value of the oneSix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneSix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneSix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZeroEight }
         * 
         * 
         */
        public List<ZeroEight> getOneSix() {
            if (oneSix == null) {
                oneSix = new ArrayList<ZeroEight>();
            }
            return this.oneSix;
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
            super.appendFields(locator, buffer, strategy);
            {
                List<RootElement.One.OneOne> theOneOne;
                theOneOne = (((this.oneOne!= null)&&(!this.oneOne.isEmpty()))?this.getOneOne():null);
                strategy.appendField(locator, this, "oneOne", buffer, theOneOne);
            }
            {
                List<ZeroFour> theOneTwo;
                theOneTwo = (((this.oneTwo!= null)&&(!this.oneTwo.isEmpty()))?this.getOneTwo():null);
                strategy.appendField(locator, this, "oneTwo", buffer, theOneTwo);
            }
            {
                List<ZeroFive> theOneThree;
                theOneThree = (((this.oneThree!= null)&&(!this.oneThree.isEmpty()))?this.getOneThree():null);
                strategy.appendField(locator, this, "oneThree", buffer, theOneThree);
            }
            {
                List<ZeroSix> theOneFour;
                theOneFour = (((this.oneFour!= null)&&(!this.oneFour.isEmpty()))?this.getOneFour():null);
                strategy.appendField(locator, this, "oneFour", buffer, theOneFour);
            }
            {
                List<ZeroSeven> theOneFive;
                theOneFive = (((this.oneFive!= null)&&(!this.oneFive.isEmpty()))?this.getOneFive():null);
                strategy.appendField(locator, this, "oneFive", buffer, theOneFive);
            }
            {
                List<ZeroEight> theOneSix;
                theOneSix = (((this.oneSix!= null)&&(!this.oneSix.isEmpty()))?this.getOneSix():null);
                strategy.appendField(locator, this, "oneSix", buffer, theOneSix);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof RootElement.One)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final RootElement.One that = ((RootElement.One) object);
            {
                List<RootElement.One.OneOne> lhsOneOne;
                lhsOneOne = (((this.oneOne!= null)&&(!this.oneOne.isEmpty()))?this.getOneOne():null);
                List<RootElement.One.OneOne> rhsOneOne;
                rhsOneOne = (((that.oneOne!= null)&&(!that.oneOne.isEmpty()))?that.getOneOne():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneOne", lhsOneOne), LocatorUtils.property(thatLocator, "oneOne", rhsOneOne), lhsOneOne, rhsOneOne)) {
                    return false;
                }
            }
            {
                List<ZeroFour> lhsOneTwo;
                lhsOneTwo = (((this.oneTwo!= null)&&(!this.oneTwo.isEmpty()))?this.getOneTwo():null);
                List<ZeroFour> rhsOneTwo;
                rhsOneTwo = (((that.oneTwo!= null)&&(!that.oneTwo.isEmpty()))?that.getOneTwo():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneTwo", lhsOneTwo), LocatorUtils.property(thatLocator, "oneTwo", rhsOneTwo), lhsOneTwo, rhsOneTwo)) {
                    return false;
                }
            }
            {
                List<ZeroFive> lhsOneThree;
                lhsOneThree = (((this.oneThree!= null)&&(!this.oneThree.isEmpty()))?this.getOneThree():null);
                List<ZeroFive> rhsOneThree;
                rhsOneThree = (((that.oneThree!= null)&&(!that.oneThree.isEmpty()))?that.getOneThree():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneThree", lhsOneThree), LocatorUtils.property(thatLocator, "oneThree", rhsOneThree), lhsOneThree, rhsOneThree)) {
                    return false;
                }
            }
            {
                List<ZeroSix> lhsOneFour;
                lhsOneFour = (((this.oneFour!= null)&&(!this.oneFour.isEmpty()))?this.getOneFour():null);
                List<ZeroSix> rhsOneFour;
                rhsOneFour = (((that.oneFour!= null)&&(!that.oneFour.isEmpty()))?that.getOneFour():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneFour", lhsOneFour), LocatorUtils.property(thatLocator, "oneFour", rhsOneFour), lhsOneFour, rhsOneFour)) {
                    return false;
                }
            }
            {
                List<ZeroSeven> lhsOneFive;
                lhsOneFive = (((this.oneFive!= null)&&(!this.oneFive.isEmpty()))?this.getOneFive():null);
                List<ZeroSeven> rhsOneFive;
                rhsOneFive = (((that.oneFive!= null)&&(!that.oneFive.isEmpty()))?that.getOneFive():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneFive", lhsOneFive), LocatorUtils.property(thatLocator, "oneFive", rhsOneFive), lhsOneFive, rhsOneFive)) {
                    return false;
                }
            }
            {
                List<ZeroEight> lhsOneSix;
                lhsOneSix = (((this.oneSix!= null)&&(!this.oneSix.isEmpty()))?this.getOneSix():null);
                List<ZeroEight> rhsOneSix;
                rhsOneSix = (((that.oneSix!= null)&&(!that.oneSix.isEmpty()))?that.getOneSix():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "oneSix", lhsOneSix), LocatorUtils.property(thatLocator, "oneSix", rhsOneSix), lhsOneSix, rhsOneSix)) {
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
            int currentHashCode = super.hashCode(locator, strategy);
            {
                List<RootElement.One.OneOne> theOneOne;
                theOneOne = (((this.oneOne!= null)&&(!this.oneOne.isEmpty()))?this.getOneOne():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneOne", theOneOne), currentHashCode, theOneOne);
            }
            {
                List<ZeroFour> theOneTwo;
                theOneTwo = (((this.oneTwo!= null)&&(!this.oneTwo.isEmpty()))?this.getOneTwo():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneTwo", theOneTwo), currentHashCode, theOneTwo);
            }
            {
                List<ZeroFive> theOneThree;
                theOneThree = (((this.oneThree!= null)&&(!this.oneThree.isEmpty()))?this.getOneThree():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneThree", theOneThree), currentHashCode, theOneThree);
            }
            {
                List<ZeroSix> theOneFour;
                theOneFour = (((this.oneFour!= null)&&(!this.oneFour.isEmpty()))?this.getOneFour():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneFour", theOneFour), currentHashCode, theOneFour);
            }
            {
                List<ZeroSeven> theOneFive;
                theOneFive = (((this.oneFive!= null)&&(!this.oneFive.isEmpty()))?this.getOneFive():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneFive", theOneFive), currentHashCode, theOneFive);
            }
            {
                List<ZeroEight> theOneSix;
                theOneSix = (((this.oneSix!= null)&&(!this.oneSix.isEmpty()))?this.getOneSix():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneSix", theOneSix), currentHashCode, theOneSix);
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
         *     &lt;extension base="{http://www.dhikChik.com/Sample/1.0/}ZeroOne">
         *       &lt;sequence>
         *         &lt;element name="oneOneOne" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwo"/>
         *         &lt;element name="oneOneTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThree"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "oneOneOne",
            "oneOneTwo"
        })
        public static class OneOne
            extends ZeroOne
            implements Equals, HashCode, ToString
        {

            @XmlElement(required = true)
            protected ZeroTwo oneOneOne;
            @XmlElement(required = true)
            protected ZeroThree oneOneTwo;

            /**
             * Gets the value of the oneOneOne property.
             * 
             * @return
             *     possible object is
             *     {@link ZeroTwo }
             *     
             */
            public ZeroTwo getOneOneOne() {
                return oneOneOne;
            }

            /**
             * Sets the value of the oneOneOne property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZeroTwo }
             *     
             */
            public void setOneOneOne(ZeroTwo value) {
                this.oneOneOne = value;
            }

            /**
             * Gets the value of the oneOneTwo property.
             * 
             * @return
             *     possible object is
             *     {@link ZeroThree }
             *     
             */
            public ZeroThree getOneOneTwo() {
                return oneOneTwo;
            }

            /**
             * Sets the value of the oneOneTwo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ZeroThree }
             *     
             */
            public void setOneOneTwo(ZeroThree value) {
                this.oneOneTwo = value;
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
                super.appendFields(locator, buffer, strategy);
                {
                    ZeroTwo theOneOneOne;
                    theOneOneOne = this.getOneOneOne();
                    strategy.appendField(locator, this, "oneOneOne", buffer, theOneOneOne);
                }
                {
                    ZeroThree theOneOneTwo;
                    theOneOneTwo = this.getOneOneTwo();
                    strategy.appendField(locator, this, "oneOneTwo", buffer, theOneOneTwo);
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
                if (!(object instanceof RootElement.One.OneOne)) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                    return false;
                }
                final RootElement.One.OneOne that = ((RootElement.One.OneOne) object);
                {
                    ZeroTwo lhsOneOneOne;
                    lhsOneOneOne = this.getOneOneOne();
                    ZeroTwo rhsOneOneOne;
                    rhsOneOneOne = that.getOneOneOne();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "oneOneOne", lhsOneOneOne), LocatorUtils.property(thatLocator, "oneOneOne", rhsOneOneOne), lhsOneOneOne, rhsOneOneOne)) {
                        return false;
                    }
                }
                {
                    ZeroThree lhsOneOneTwo;
                    lhsOneOneTwo = this.getOneOneTwo();
                    ZeroThree rhsOneOneTwo;
                    rhsOneOneTwo = that.getOneOneTwo();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "oneOneTwo", lhsOneOneTwo), LocatorUtils.property(thatLocator, "oneOneTwo", rhsOneOneTwo), lhsOneOneTwo, rhsOneOneTwo)) {
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
                int currentHashCode = super.hashCode(locator, strategy);
                {
                    ZeroTwo theOneOneOne;
                    theOneOneOne = this.getOneOneOne();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneOneOne", theOneOneOne), currentHashCode, theOneOneOne);
                }
                {
                    ZeroThree theOneOneTwo;
                    theOneOneTwo = this.getOneOneTwo();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oneOneTwo", theOneOneTwo), currentHashCode, theOneOneTwo);
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.dhikChik.com/Sample/1.0/>year">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Three
        implements Equals, HashCode, ToString
    {

        @XmlValue
        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof RootElement.Three)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final RootElement.Three that = ((RootElement.Three) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
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
                String theValue;
                theValue = this.getValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
