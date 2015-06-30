//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.01 at 12:12:13 AM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for BaseMqttMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseMqttMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Topic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="QoS" type="{http://baczkowicz.pl/mqtt-spy/common}qos"/&gt;
 *         &lt;element name="Retained" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseMqttMessage", propOrder = {
    "topic",
    "payload",
    "qoS",
    "retained"
})
public class BaseMqttMessage implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "Topic", required = true)
    protected String topic;
    @XmlElement(name = "Payload", required = true)
    protected String payload;
    @XmlElement(name = "QoS")
    protected int qoS;
    @XmlElement(name = "Retained")
    protected boolean retained;

    /**
     * Default no-arg constructor
     * 
     */
    public BaseMqttMessage() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BaseMqttMessage(final String topic, final String payload, final int qoS, final boolean retained) {
        this.topic = topic;
        this.payload = payload;
        this.qoS = qoS;
        this.retained = retained;
    }

    /**
     * Gets the value of the topic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the value of the topic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopic(String value) {
        this.topic = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayload(String value) {
        this.payload = value;
    }

    /**
     * Gets the value of the qoS property.
     * 
     */
    public int getQoS() {
        return qoS;
    }

    /**
     * Sets the value of the qoS property.
     * 
     */
    public void setQoS(int value) {
        this.qoS = value;
    }

    /**
     * Gets the value of the retained property.
     * 
     */
    public boolean isRetained() {
        return retained;
    }

    /**
     * Sets the value of the retained property.
     * 
     */
    public void setRetained(boolean value) {
        this.retained = value;
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
            String theTopic;
            theTopic = this.getTopic();
            strategy.appendField(locator, this, "topic", buffer, theTopic);
        }
        {
            String thePayload;
            thePayload = this.getPayload();
            strategy.appendField(locator, this, "payload", buffer, thePayload);
        }
        {
            int theQoS;
            theQoS = this.getQoS();
            strategy.appendField(locator, this, "qoS", buffer, theQoS);
        }
        {
            boolean theRetained;
            theRetained = this.isRetained();
            strategy.appendField(locator, this, "retained", buffer, theRetained);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BaseMqttMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final BaseMqttMessage that = ((BaseMqttMessage) object);
        {
            String lhsTopic;
            lhsTopic = this.getTopic();
            String rhsTopic;
            rhsTopic = that.getTopic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topic", lhsTopic), LocatorUtils.property(thatLocator, "topic", rhsTopic), lhsTopic, rhsTopic)) {
                return false;
            }
        }
        {
            String lhsPayload;
            lhsPayload = this.getPayload();
            String rhsPayload;
            rhsPayload = that.getPayload();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payload", lhsPayload), LocatorUtils.property(thatLocator, "payload", rhsPayload), lhsPayload, rhsPayload)) {
                return false;
            }
        }
        {
            int lhsQoS;
            lhsQoS = this.getQoS();
            int rhsQoS;
            rhsQoS = that.getQoS();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qoS", lhsQoS), LocatorUtils.property(thatLocator, "qoS", rhsQoS), lhsQoS, rhsQoS)) {
                return false;
            }
        }
        {
            boolean lhsRetained;
            lhsRetained = this.isRetained();
            boolean rhsRetained;
            rhsRetained = that.isRetained();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retained", lhsRetained), LocatorUtils.property(thatLocator, "retained", rhsRetained), lhsRetained, rhsRetained)) {
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
            String theTopic;
            theTopic = this.getTopic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topic", theTopic), currentHashCode, theTopic);
        }
        {
            String thePayload;
            thePayload = this.getPayload();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payload", thePayload), currentHashCode, thePayload);
        }
        {
            int theQoS;
            theQoS = this.getQoS();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qoS", theQoS), currentHashCode, theQoS);
        }
        {
            boolean theRetained;
            theRetained = this.isRetained();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retained", theRetained), currentHashCode, theRetained);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof BaseMqttMessage) {
            final BaseMqttMessage copy = ((BaseMqttMessage) draftCopy);
            if (this.topic!= null) {
                String sourceTopic;
                sourceTopic = this.getTopic();
                String copyTopic = ((String) strategy.copy(LocatorUtils.property(locator, "topic", sourceTopic), sourceTopic));
                copy.setTopic(copyTopic);
            } else {
                copy.topic = null;
            }
            if (this.payload!= null) {
                String sourcePayload;
                sourcePayload = this.getPayload();
                String copyPayload = ((String) strategy.copy(LocatorUtils.property(locator, "payload", sourcePayload), sourcePayload));
                copy.setPayload(copyPayload);
            } else {
                copy.payload = null;
            }
            {
                int sourceQoS;
                sourceQoS = this.getQoS();
                int copyQoS = strategy.copy(LocatorUtils.property(locator, "qoS", sourceQoS), sourceQoS);
                copy.setQoS(copyQoS);
            }
            {
                boolean sourceRetained;
                sourceRetained = this.isRetained();
                boolean copyRetained = strategy.copy(LocatorUtils.property(locator, "retained", sourceRetained), sourceRetained);
                copy.setRetained(copyRetained);
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BaseMqttMessage();
    }

}
