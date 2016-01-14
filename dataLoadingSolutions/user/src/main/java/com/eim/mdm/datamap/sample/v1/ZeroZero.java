
package com.eim.mdm.datamap.sample.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for ZeroZero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZeroZero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zeroZeroOne" type="{http://www.dhikChik.com/Sample/1.0/}alpha3" minOccurs="0"/>
 *         &lt;element name="zeroZeroTwo" type="{http://www.dhikChik.com/Sample/1.0/}ZeroNine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroZeroThree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroZeroFour" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="zeroZeroFive" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroZeroSix" type="{http://www.dhikChik.com/Sample/1.0/}ZeroEleven" minOccurs="0"/>
 *         &lt;element name="zeroZeroSeven" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwelve" minOccurs="0"/>
 *         &lt;element name="zeroZeroEight" type="{http://www.dhikChik.com/Sample/1.0/}ZeroThirteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroZeroNine" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTwo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroZeroTen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroZeroEleven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroZeroTwelve" type="{http://www.dhikChik.com/Sample/1.0/}Type" minOccurs="0"/>
 *         &lt;element name="zeroZeroThirteen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="zeroZeroFourteen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zeroZeroFifteen" type="{http://www.dhikChik.com/Sample/1.0/}DateRange" minOccurs="0"/>
 *         &lt;element name="zeroZeroSixteen" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="zeroZeroSeventeen" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="zeroZeroEighteen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroFourteen" minOccurs="0"/>
 *         &lt;element name="zeroZeroNineteen" type="{http://www.dhikChik.com/Sample/1.0/}ZeroTen" minOccurs="0"/>
 *         &lt;element name="zeroZeroTwenty" type="{http://www.dhikChik.com/Sample/1.0/}ZeroSixteen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZeroZero", propOrder = {
    "zeroZeroOne",
    "zeroZeroTwo",
    "zeroZeroThree",
    "zeroZeroFour",
    "zeroZeroFive",
    "zeroZeroSix",
    "zeroZeroSeven",
    "zeroZeroEight",
    "zeroZeroNine",
    "zeroZeroTen",
    "zeroZeroEleven",
    "zeroZeroTwelve",
    "zeroZeroThirteen",
    "zeroZeroFourteen",
    "zeroZeroFifteen",
    "zeroZeroSixteen",
    "zeroZeroSeventeen",
    "zeroZeroEighteen",
    "zeroZeroNineteen",
    "zeroZeroTwenty"
})
@XmlSeeAlso({
    com.eim.mdm.datamap.sample.v1.RootElement.One.class
})
public class ZeroZero
    implements Equals, HashCode, ToString
{

    protected String zeroZeroOne;
    protected List<ZeroNine> zeroZeroTwo;
    protected Boolean zeroZeroThree;
    @XmlSchemaType(name = "unsignedInt")
    protected Long zeroZeroFour;
    protected ZeroTen zeroZeroFive;
    protected ZeroEleven zeroZeroSix;
    protected ZeroTwelve zeroZeroSeven;
    protected List<ZeroThirteen> zeroZeroEight;
    protected List<ZeroTwo> zeroZeroNine;
    protected List<ZeroFourteen> zeroZeroTen;
    protected Boolean zeroZeroEleven;
    protected Type zeroZeroTwelve;
    protected List<ZeroTen> zeroZeroThirteen;
    protected Boolean zeroZeroFourteen;
    protected DateRange zeroZeroFifteen;
    protected BigDecimal zeroZeroSixteen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zeroZeroSeventeen;
    protected ZeroFourteen zeroZeroEighteen;
    protected ZeroTen zeroZeroNineteen;
    protected ZeroSixteen zeroZeroTwenty;

    /**
     * Gets the value of the zeroZeroOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZeroZeroOne() {
        return zeroZeroOne;
    }

    /**
     * Sets the value of the zeroZeroOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZeroZeroOne(String value) {
        this.zeroZeroOne = value;
    }

    /**
     * Gets the value of the zeroZeroTwo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroZeroTwo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroZeroTwo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroNine }
     * 
     * 
     */
    public List<ZeroNine> getZeroZeroTwo() {
        if (zeroZeroTwo == null) {
            zeroZeroTwo = new ArrayList<ZeroNine>();
        }
        return this.zeroZeroTwo;
    }

    /**
     * Gets the value of the zeroZeroThree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroZeroThree() {
        return zeroZeroThree;
    }

    /**
     * Sets the value of the zeroZeroThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroZeroThree(Boolean value) {
        this.zeroZeroThree = value;
    }

    /**
     * Gets the value of the zeroZeroFour property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getZeroZeroFour() {
        return zeroZeroFour;
    }

    /**
     * Sets the value of the zeroZeroFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setZeroZeroFour(Long value) {
        this.zeroZeroFour = value;
    }

    /**
     * Gets the value of the zeroZeroFive property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroZeroFive() {
        return zeroZeroFive;
    }

    /**
     * Sets the value of the zeroZeroFive property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroZeroFive(ZeroTen value) {
        this.zeroZeroFive = value;
    }

    /**
     * Gets the value of the zeroZeroSix property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroEleven }
     *     
     */
    public ZeroEleven getZeroZeroSix() {
        return zeroZeroSix;
    }

    /**
     * Sets the value of the zeroZeroSix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroEleven }
     *     
     */
    public void setZeroZeroSix(ZeroEleven value) {
        this.zeroZeroSix = value;
    }

    /**
     * Gets the value of the zeroZeroSeven property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTwelve }
     *     
     */
    public ZeroTwelve getZeroZeroSeven() {
        return zeroZeroSeven;
    }

    /**
     * Sets the value of the zeroZeroSeven property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTwelve }
     *     
     */
    public void setZeroZeroSeven(ZeroTwelve value) {
        this.zeroZeroSeven = value;
    }

    /**
     * Gets the value of the zeroZeroEight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroZeroEight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroZeroEight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroThirteen }
     * 
     * 
     */
    public List<ZeroThirteen> getZeroZeroEight() {
        if (zeroZeroEight == null) {
            zeroZeroEight = new ArrayList<ZeroThirteen>();
        }
        return this.zeroZeroEight;
    }

    /**
     * Gets the value of the zeroZeroNine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroZeroNine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroZeroNine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTwo }
     * 
     * 
     */
    public List<ZeroTwo> getZeroZeroNine() {
        if (zeroZeroNine == null) {
            zeroZeroNine = new ArrayList<ZeroTwo>();
        }
        return this.zeroZeroNine;
    }

    /**
     * Gets the value of the zeroZeroTen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroZeroTen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroZeroTen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroFourteen }
     * 
     * 
     */
    public List<ZeroFourteen> getZeroZeroTen() {
        if (zeroZeroTen == null) {
            zeroZeroTen = new ArrayList<ZeroFourteen>();
        }
        return this.zeroZeroTen;
    }

    /**
     * Gets the value of the zeroZeroEleven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroZeroEleven() {
        return zeroZeroEleven;
    }

    /**
     * Sets the value of the zeroZeroEleven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroZeroEleven(Boolean value) {
        this.zeroZeroEleven = value;
    }

    /**
     * Gets the value of the zeroZeroTwelve property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getZeroZeroTwelve() {
        return zeroZeroTwelve;
    }

    /**
     * Sets the value of the zeroZeroTwelve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setZeroZeroTwelve(Type value) {
        this.zeroZeroTwelve = value;
    }

    /**
     * Gets the value of the zeroZeroThirteen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zeroZeroThirteen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZeroZeroThirteen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZeroTen }
     * 
     * 
     */
    public List<ZeroTen> getZeroZeroThirteen() {
        if (zeroZeroThirteen == null) {
            zeroZeroThirteen = new ArrayList<ZeroTen>();
        }
        return this.zeroZeroThirteen;
    }

    /**
     * Gets the value of the zeroZeroFourteen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroZeroFourteen() {
        return zeroZeroFourteen;
    }

    /**
     * Sets the value of the zeroZeroFourteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroZeroFourteen(Boolean value) {
        this.zeroZeroFourteen = value;
    }

    /**
     * Gets the value of the zeroZeroFifteen property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getZeroZeroFifteen() {
        return zeroZeroFifteen;
    }

    /**
     * Sets the value of the zeroZeroFifteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setZeroZeroFifteen(DateRange value) {
        this.zeroZeroFifteen = value;
    }

    /**
     * Gets the value of the zeroZeroSixteen property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZeroZeroSixteen() {
        return zeroZeroSixteen;
    }

    /**
     * Sets the value of the zeroZeroSixteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZeroZeroSixteen(BigDecimal value) {
        this.zeroZeroSixteen = value;
    }

    /**
     * Gets the value of the zeroZeroSeventeen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZeroZeroSeventeen() {
        return zeroZeroSeventeen;
    }

    /**
     * Sets the value of the zeroZeroSeventeen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZeroZeroSeventeen(XMLGregorianCalendar value) {
        this.zeroZeroSeventeen = value;
    }

    /**
     * Gets the value of the zeroZeroEighteen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroFourteen }
     *     
     */
    public ZeroFourteen getZeroZeroEighteen() {
        return zeroZeroEighteen;
    }

    /**
     * Sets the value of the zeroZeroEighteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroFourteen }
     *     
     */
    public void setZeroZeroEighteen(ZeroFourteen value) {
        this.zeroZeroEighteen = value;
    }

    /**
     * Gets the value of the zeroZeroNineteen property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroTen }
     *     
     */
    public ZeroTen getZeroZeroNineteen() {
        return zeroZeroNineteen;
    }

    /**
     * Sets the value of the zeroZeroNineteen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroTen }
     *     
     */
    public void setZeroZeroNineteen(ZeroTen value) {
        this.zeroZeroNineteen = value;
    }

    /**
     * Gets the value of the zeroZeroTwenty property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroSixteen }
     *     
     */
    public ZeroSixteen getZeroZeroTwenty() {
        return zeroZeroTwenty;
    }

    /**
     * Sets the value of the zeroZeroTwenty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroSixteen }
     *     
     */
    public void setZeroZeroTwenty(ZeroSixteen value) {
        this.zeroZeroTwenty = value;
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
            String theZeroZeroOne;
            theZeroZeroOne = this.getZeroZeroOne();
            strategy.appendField(locator, this, "zeroZeroOne", buffer, theZeroZeroOne);
        }
        {
            List<ZeroNine> theZeroZeroTwo;
            theZeroZeroTwo = (((this.zeroZeroTwo!= null)&&(!this.zeroZeroTwo.isEmpty()))?this.getZeroZeroTwo():null);
            strategy.appendField(locator, this, "zeroZeroTwo", buffer, theZeroZeroTwo);
        }
        {
            Boolean theZeroZeroThree;
            theZeroZeroThree = this.isZeroZeroThree();
            strategy.appendField(locator, this, "zeroZeroThree", buffer, theZeroZeroThree);
        }
        {
            Long theZeroZeroFour;
            theZeroZeroFour = this.getZeroZeroFour();
            strategy.appendField(locator, this, "zeroZeroFour", buffer, theZeroZeroFour);
        }
        {
            ZeroTen theZeroZeroFive;
            theZeroZeroFive = this.getZeroZeroFive();
            strategy.appendField(locator, this, "zeroZeroFive", buffer, theZeroZeroFive);
        }
        {
            ZeroEleven theZeroZeroSix;
            theZeroZeroSix = this.getZeroZeroSix();
            strategy.appendField(locator, this, "zeroZeroSix", buffer, theZeroZeroSix);
        }
        {
            ZeroTwelve theZeroZeroSeven;
            theZeroZeroSeven = this.getZeroZeroSeven();
            strategy.appendField(locator, this, "zeroZeroSeven", buffer, theZeroZeroSeven);
        }
        {
            List<ZeroThirteen> theZeroZeroEight;
            theZeroZeroEight = (((this.zeroZeroEight!= null)&&(!this.zeroZeroEight.isEmpty()))?this.getZeroZeroEight():null);
            strategy.appendField(locator, this, "zeroZeroEight", buffer, theZeroZeroEight);
        }
        {
            List<ZeroTwo> theZeroZeroNine;
            theZeroZeroNine = (((this.zeroZeroNine!= null)&&(!this.zeroZeroNine.isEmpty()))?this.getZeroZeroNine():null);
            strategy.appendField(locator, this, "zeroZeroNine", buffer, theZeroZeroNine);
        }
        {
            List<ZeroFourteen> theZeroZeroTen;
            theZeroZeroTen = (((this.zeroZeroTen!= null)&&(!this.zeroZeroTen.isEmpty()))?this.getZeroZeroTen():null);
            strategy.appendField(locator, this, "zeroZeroTen", buffer, theZeroZeroTen);
        }
        {
            Boolean theZeroZeroEleven;
            theZeroZeroEleven = this.isZeroZeroEleven();
            strategy.appendField(locator, this, "zeroZeroEleven", buffer, theZeroZeroEleven);
        }
        {
            Type theZeroZeroTwelve;
            theZeroZeroTwelve = this.getZeroZeroTwelve();
            strategy.appendField(locator, this, "zeroZeroTwelve", buffer, theZeroZeroTwelve);
        }
        {
            List<ZeroTen> theZeroZeroThirteen;
            theZeroZeroThirteen = (((this.zeroZeroThirteen!= null)&&(!this.zeroZeroThirteen.isEmpty()))?this.getZeroZeroThirteen():null);
            strategy.appendField(locator, this, "zeroZeroThirteen", buffer, theZeroZeroThirteen);
        }
        {
            Boolean theZeroZeroFourteen;
            theZeroZeroFourteen = this.isZeroZeroFourteen();
            strategy.appendField(locator, this, "zeroZeroFourteen", buffer, theZeroZeroFourteen);
        }
        {
            DateRange theZeroZeroFifteen;
            theZeroZeroFifteen = this.getZeroZeroFifteen();
            strategy.appendField(locator, this, "zeroZeroFifteen", buffer, theZeroZeroFifteen);
        }
        {
            BigDecimal theZeroZeroSixteen;
            theZeroZeroSixteen = this.getZeroZeroSixteen();
            strategy.appendField(locator, this, "zeroZeroSixteen", buffer, theZeroZeroSixteen);
        }
        {
            XMLGregorianCalendar theZeroZeroSeventeen;
            theZeroZeroSeventeen = this.getZeroZeroSeventeen();
            strategy.appendField(locator, this, "zeroZeroSeventeen", buffer, theZeroZeroSeventeen);
        }
        {
            ZeroFourteen theZeroZeroEighteen;
            theZeroZeroEighteen = this.getZeroZeroEighteen();
            strategy.appendField(locator, this, "zeroZeroEighteen", buffer, theZeroZeroEighteen);
        }
        {
            ZeroTen theZeroZeroNineteen;
            theZeroZeroNineteen = this.getZeroZeroNineteen();
            strategy.appendField(locator, this, "zeroZeroNineteen", buffer, theZeroZeroNineteen);
        }
        {
            ZeroSixteen theZeroZeroTwenty;
            theZeroZeroTwenty = this.getZeroZeroTwenty();
            strategy.appendField(locator, this, "zeroZeroTwenty", buffer, theZeroZeroTwenty);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ZeroZero)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ZeroZero that = ((ZeroZero) object);
        {
            String lhsZeroZeroOne;
            lhsZeroZeroOne = this.getZeroZeroOne();
            String rhsZeroZeroOne;
            rhsZeroZeroOne = that.getZeroZeroOne();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroOne", lhsZeroZeroOne), LocatorUtils.property(thatLocator, "zeroZeroOne", rhsZeroZeroOne), lhsZeroZeroOne, rhsZeroZeroOne)) {
                return false;
            }
        }
        {
            List<ZeroNine> lhsZeroZeroTwo;
            lhsZeroZeroTwo = (((this.zeroZeroTwo!= null)&&(!this.zeroZeroTwo.isEmpty()))?this.getZeroZeroTwo():null);
            List<ZeroNine> rhsZeroZeroTwo;
            rhsZeroZeroTwo = (((that.zeroZeroTwo!= null)&&(!that.zeroZeroTwo.isEmpty()))?that.getZeroZeroTwo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroTwo", lhsZeroZeroTwo), LocatorUtils.property(thatLocator, "zeroZeroTwo", rhsZeroZeroTwo), lhsZeroZeroTwo, rhsZeroZeroTwo)) {
                return false;
            }
        }
        {
            Boolean lhsZeroZeroThree;
            lhsZeroZeroThree = this.isZeroZeroThree();
            Boolean rhsZeroZeroThree;
            rhsZeroZeroThree = that.isZeroZeroThree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroThree", lhsZeroZeroThree), LocatorUtils.property(thatLocator, "zeroZeroThree", rhsZeroZeroThree), lhsZeroZeroThree, rhsZeroZeroThree)) {
                return false;
            }
        }
        {
            Long lhsZeroZeroFour;
            lhsZeroZeroFour = this.getZeroZeroFour();
            Long rhsZeroZeroFour;
            rhsZeroZeroFour = that.getZeroZeroFour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroFour", lhsZeroZeroFour), LocatorUtils.property(thatLocator, "zeroZeroFour", rhsZeroZeroFour), lhsZeroZeroFour, rhsZeroZeroFour)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroZeroFive;
            lhsZeroZeroFive = this.getZeroZeroFive();
            ZeroTen rhsZeroZeroFive;
            rhsZeroZeroFive = that.getZeroZeroFive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroFive", lhsZeroZeroFive), LocatorUtils.property(thatLocator, "zeroZeroFive", rhsZeroZeroFive), lhsZeroZeroFive, rhsZeroZeroFive)) {
                return false;
            }
        }
        {
            ZeroEleven lhsZeroZeroSix;
            lhsZeroZeroSix = this.getZeroZeroSix();
            ZeroEleven rhsZeroZeroSix;
            rhsZeroZeroSix = that.getZeroZeroSix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroSix", lhsZeroZeroSix), LocatorUtils.property(thatLocator, "zeroZeroSix", rhsZeroZeroSix), lhsZeroZeroSix, rhsZeroZeroSix)) {
                return false;
            }
        }
        {
            ZeroTwelve lhsZeroZeroSeven;
            lhsZeroZeroSeven = this.getZeroZeroSeven();
            ZeroTwelve rhsZeroZeroSeven;
            rhsZeroZeroSeven = that.getZeroZeroSeven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroSeven", lhsZeroZeroSeven), LocatorUtils.property(thatLocator, "zeroZeroSeven", rhsZeroZeroSeven), lhsZeroZeroSeven, rhsZeroZeroSeven)) {
                return false;
            }
        }
        {
            List<ZeroThirteen> lhsZeroZeroEight;
            lhsZeroZeroEight = (((this.zeroZeroEight!= null)&&(!this.zeroZeroEight.isEmpty()))?this.getZeroZeroEight():null);
            List<ZeroThirteen> rhsZeroZeroEight;
            rhsZeroZeroEight = (((that.zeroZeroEight!= null)&&(!that.zeroZeroEight.isEmpty()))?that.getZeroZeroEight():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroEight", lhsZeroZeroEight), LocatorUtils.property(thatLocator, "zeroZeroEight", rhsZeroZeroEight), lhsZeroZeroEight, rhsZeroZeroEight)) {
                return false;
            }
        }
        {
            List<ZeroTwo> lhsZeroZeroNine;
            lhsZeroZeroNine = (((this.zeroZeroNine!= null)&&(!this.zeroZeroNine.isEmpty()))?this.getZeroZeroNine():null);
            List<ZeroTwo> rhsZeroZeroNine;
            rhsZeroZeroNine = (((that.zeroZeroNine!= null)&&(!that.zeroZeroNine.isEmpty()))?that.getZeroZeroNine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroNine", lhsZeroZeroNine), LocatorUtils.property(thatLocator, "zeroZeroNine", rhsZeroZeroNine), lhsZeroZeroNine, rhsZeroZeroNine)) {
                return false;
            }
        }
        {
            List<ZeroFourteen> lhsZeroZeroTen;
            lhsZeroZeroTen = (((this.zeroZeroTen!= null)&&(!this.zeroZeroTen.isEmpty()))?this.getZeroZeroTen():null);
            List<ZeroFourteen> rhsZeroZeroTen;
            rhsZeroZeroTen = (((that.zeroZeroTen!= null)&&(!that.zeroZeroTen.isEmpty()))?that.getZeroZeroTen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroTen", lhsZeroZeroTen), LocatorUtils.property(thatLocator, "zeroZeroTen", rhsZeroZeroTen), lhsZeroZeroTen, rhsZeroZeroTen)) {
                return false;
            }
        }
        {
            Boolean lhsZeroZeroEleven;
            lhsZeroZeroEleven = this.isZeroZeroEleven();
            Boolean rhsZeroZeroEleven;
            rhsZeroZeroEleven = that.isZeroZeroEleven();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroEleven", lhsZeroZeroEleven), LocatorUtils.property(thatLocator, "zeroZeroEleven", rhsZeroZeroEleven), lhsZeroZeroEleven, rhsZeroZeroEleven)) {
                return false;
            }
        }
        {
            Type lhsZeroZeroTwelve;
            lhsZeroZeroTwelve = this.getZeroZeroTwelve();
            Type rhsZeroZeroTwelve;
            rhsZeroZeroTwelve = that.getZeroZeroTwelve();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroTwelve", lhsZeroZeroTwelve), LocatorUtils.property(thatLocator, "zeroZeroTwelve", rhsZeroZeroTwelve), lhsZeroZeroTwelve, rhsZeroZeroTwelve)) {
                return false;
            }
        }
        {
            List<ZeroTen> lhsZeroZeroThirteen;
            lhsZeroZeroThirteen = (((this.zeroZeroThirteen!= null)&&(!this.zeroZeroThirteen.isEmpty()))?this.getZeroZeroThirteen():null);
            List<ZeroTen> rhsZeroZeroThirteen;
            rhsZeroZeroThirteen = (((that.zeroZeroThirteen!= null)&&(!that.zeroZeroThirteen.isEmpty()))?that.getZeroZeroThirteen():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroThirteen", lhsZeroZeroThirteen), LocatorUtils.property(thatLocator, "zeroZeroThirteen", rhsZeroZeroThirteen), lhsZeroZeroThirteen, rhsZeroZeroThirteen)) {
                return false;
            }
        }
        {
            Boolean lhsZeroZeroFourteen;
            lhsZeroZeroFourteen = this.isZeroZeroFourteen();
            Boolean rhsZeroZeroFourteen;
            rhsZeroZeroFourteen = that.isZeroZeroFourteen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroFourteen", lhsZeroZeroFourteen), LocatorUtils.property(thatLocator, "zeroZeroFourteen", rhsZeroZeroFourteen), lhsZeroZeroFourteen, rhsZeroZeroFourteen)) {
                return false;
            }
        }
        {
            DateRange lhsZeroZeroFifteen;
            lhsZeroZeroFifteen = this.getZeroZeroFifteen();
            DateRange rhsZeroZeroFifteen;
            rhsZeroZeroFifteen = that.getZeroZeroFifteen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroFifteen", lhsZeroZeroFifteen), LocatorUtils.property(thatLocator, "zeroZeroFifteen", rhsZeroZeroFifteen), lhsZeroZeroFifteen, rhsZeroZeroFifteen)) {
                return false;
            }
        }
        {
            BigDecimal lhsZeroZeroSixteen;
            lhsZeroZeroSixteen = this.getZeroZeroSixteen();
            BigDecimal rhsZeroZeroSixteen;
            rhsZeroZeroSixteen = that.getZeroZeroSixteen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroSixteen", lhsZeroZeroSixteen), LocatorUtils.property(thatLocator, "zeroZeroSixteen", rhsZeroZeroSixteen), lhsZeroZeroSixteen, rhsZeroZeroSixteen)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsZeroZeroSeventeen;
            lhsZeroZeroSeventeen = this.getZeroZeroSeventeen();
            XMLGregorianCalendar rhsZeroZeroSeventeen;
            rhsZeroZeroSeventeen = that.getZeroZeroSeventeen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroSeventeen", lhsZeroZeroSeventeen), LocatorUtils.property(thatLocator, "zeroZeroSeventeen", rhsZeroZeroSeventeen), lhsZeroZeroSeventeen, rhsZeroZeroSeventeen)) {
                return false;
            }
        }
        {
            ZeroFourteen lhsZeroZeroEighteen;
            lhsZeroZeroEighteen = this.getZeroZeroEighteen();
            ZeroFourteen rhsZeroZeroEighteen;
            rhsZeroZeroEighteen = that.getZeroZeroEighteen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroEighteen", lhsZeroZeroEighteen), LocatorUtils.property(thatLocator, "zeroZeroEighteen", rhsZeroZeroEighteen), lhsZeroZeroEighteen, rhsZeroZeroEighteen)) {
                return false;
            }
        }
        {
            ZeroTen lhsZeroZeroNineteen;
            lhsZeroZeroNineteen = this.getZeroZeroNineteen();
            ZeroTen rhsZeroZeroNineteen;
            rhsZeroZeroNineteen = that.getZeroZeroNineteen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroNineteen", lhsZeroZeroNineteen), LocatorUtils.property(thatLocator, "zeroZeroNineteen", rhsZeroZeroNineteen), lhsZeroZeroNineteen, rhsZeroZeroNineteen)) {
                return false;
            }
        }
        {
            ZeroSixteen lhsZeroZeroTwenty;
            lhsZeroZeroTwenty = this.getZeroZeroTwenty();
            ZeroSixteen rhsZeroZeroTwenty;
            rhsZeroZeroTwenty = that.getZeroZeroTwenty();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "zeroZeroTwenty", lhsZeroZeroTwenty), LocatorUtils.property(thatLocator, "zeroZeroTwenty", rhsZeroZeroTwenty), lhsZeroZeroTwenty, rhsZeroZeroTwenty)) {
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
            String theZeroZeroOne;
            theZeroZeroOne = this.getZeroZeroOne();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroOne", theZeroZeroOne), currentHashCode, theZeroZeroOne);
        }
        {
            List<ZeroNine> theZeroZeroTwo;
            theZeroZeroTwo = (((this.zeroZeroTwo!= null)&&(!this.zeroZeroTwo.isEmpty()))?this.getZeroZeroTwo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroTwo", theZeroZeroTwo), currentHashCode, theZeroZeroTwo);
        }
        {
            Boolean theZeroZeroThree;
            theZeroZeroThree = this.isZeroZeroThree();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroThree", theZeroZeroThree), currentHashCode, theZeroZeroThree);
        }
        {
            Long theZeroZeroFour;
            theZeroZeroFour = this.getZeroZeroFour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroFour", theZeroZeroFour), currentHashCode, theZeroZeroFour);
        }
        {
            ZeroTen theZeroZeroFive;
            theZeroZeroFive = this.getZeroZeroFive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroFive", theZeroZeroFive), currentHashCode, theZeroZeroFive);
        }
        {
            ZeroEleven theZeroZeroSix;
            theZeroZeroSix = this.getZeroZeroSix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroSix", theZeroZeroSix), currentHashCode, theZeroZeroSix);
        }
        {
            ZeroTwelve theZeroZeroSeven;
            theZeroZeroSeven = this.getZeroZeroSeven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroSeven", theZeroZeroSeven), currentHashCode, theZeroZeroSeven);
        }
        {
            List<ZeroThirteen> theZeroZeroEight;
            theZeroZeroEight = (((this.zeroZeroEight!= null)&&(!this.zeroZeroEight.isEmpty()))?this.getZeroZeroEight():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroEight", theZeroZeroEight), currentHashCode, theZeroZeroEight);
        }
        {
            List<ZeroTwo> theZeroZeroNine;
            theZeroZeroNine = (((this.zeroZeroNine!= null)&&(!this.zeroZeroNine.isEmpty()))?this.getZeroZeroNine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroNine", theZeroZeroNine), currentHashCode, theZeroZeroNine);
        }
        {
            List<ZeroFourteen> theZeroZeroTen;
            theZeroZeroTen = (((this.zeroZeroTen!= null)&&(!this.zeroZeroTen.isEmpty()))?this.getZeroZeroTen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroTen", theZeroZeroTen), currentHashCode, theZeroZeroTen);
        }
        {
            Boolean theZeroZeroEleven;
            theZeroZeroEleven = this.isZeroZeroEleven();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroEleven", theZeroZeroEleven), currentHashCode, theZeroZeroEleven);
        }
        {
            Type theZeroZeroTwelve;
            theZeroZeroTwelve = this.getZeroZeroTwelve();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroTwelve", theZeroZeroTwelve), currentHashCode, theZeroZeroTwelve);
        }
        {
            List<ZeroTen> theZeroZeroThirteen;
            theZeroZeroThirteen = (((this.zeroZeroThirteen!= null)&&(!this.zeroZeroThirteen.isEmpty()))?this.getZeroZeroThirteen():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroThirteen", theZeroZeroThirteen), currentHashCode, theZeroZeroThirteen);
        }
        {
            Boolean theZeroZeroFourteen;
            theZeroZeroFourteen = this.isZeroZeroFourteen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroFourteen", theZeroZeroFourteen), currentHashCode, theZeroZeroFourteen);
        }
        {
            DateRange theZeroZeroFifteen;
            theZeroZeroFifteen = this.getZeroZeroFifteen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroFifteen", theZeroZeroFifteen), currentHashCode, theZeroZeroFifteen);
        }
        {
            BigDecimal theZeroZeroSixteen;
            theZeroZeroSixteen = this.getZeroZeroSixteen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroSixteen", theZeroZeroSixteen), currentHashCode, theZeroZeroSixteen);
        }
        {
            XMLGregorianCalendar theZeroZeroSeventeen;
            theZeroZeroSeventeen = this.getZeroZeroSeventeen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroSeventeen", theZeroZeroSeventeen), currentHashCode, theZeroZeroSeventeen);
        }
        {
            ZeroFourteen theZeroZeroEighteen;
            theZeroZeroEighteen = this.getZeroZeroEighteen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroEighteen", theZeroZeroEighteen), currentHashCode, theZeroZeroEighteen);
        }
        {
            ZeroTen theZeroZeroNineteen;
            theZeroZeroNineteen = this.getZeroZeroNineteen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroNineteen", theZeroZeroNineteen), currentHashCode, theZeroZeroNineteen);
        }
        {
            ZeroSixteen theZeroZeroTwenty;
            theZeroZeroTwenty = this.getZeroZeroTwenty();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "zeroZeroTwenty", theZeroZeroTwenty), currentHashCode, theZeroZeroTwenty);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
