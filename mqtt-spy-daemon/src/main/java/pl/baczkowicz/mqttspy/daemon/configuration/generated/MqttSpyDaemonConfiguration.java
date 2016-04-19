//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.19 at 11:09:41 PM BST 
//


package pl.baczkowicz.mqttspy.daemon.configuration.generated;

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
import pl.baczkowicz.spy.common.generated.Formatting;


/**
 * <p>Java class for MqttSpyDaemonConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttSpyDaemonConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Connection" type="{http://baczkowicz.pl/mqtt-spy/daemon/configuration}DaemonMqttConnectionDetails"/&gt;
 *         &lt;element name="Formatting" type="{http://baczkowicz.pl/spy/common}Formatting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttSpyDaemonConfiguration", propOrder = {
    "connection",
    "formatting"
})
public class MqttSpyDaemonConfiguration
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Connection", required = true)
    protected DaemonMqttConnectionDetails connection;
    @XmlElement(name = "Formatting")
    protected Formatting formatting;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link DaemonMqttConnectionDetails }
     *     
     */
    public DaemonMqttConnectionDetails getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaemonMqttConnectionDetails }
     *     
     */
    public void setConnection(DaemonMqttConnectionDetails value) {
        this.connection = value;
    }

    /**
     * Gets the value of the formatting property.
     * 
     * @return
     *     possible object is
     *     {@link Formatting }
     *     
     */
    public Formatting getFormatting() {
        return formatting;
    }

    /**
     * Sets the value of the formatting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatting }
     *     
     */
    public void setFormatting(Formatting value) {
        this.formatting = value;
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
            DaemonMqttConnectionDetails theConnection;
            theConnection = this.getConnection();
            strategy.appendField(locator, this, "connection", buffer, theConnection);
        }
        {
            Formatting theFormatting;
            theFormatting = this.getFormatting();
            strategy.appendField(locator, this, "formatting", buffer, theFormatting);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MqttSpyDaemonConfiguration)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MqttSpyDaemonConfiguration that = ((MqttSpyDaemonConfiguration) object);
        {
            DaemonMqttConnectionDetails lhsConnection;
            lhsConnection = this.getConnection();
            DaemonMqttConnectionDetails rhsConnection;
            rhsConnection = that.getConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connection", lhsConnection), LocatorUtils.property(thatLocator, "connection", rhsConnection), lhsConnection, rhsConnection)) {
                return false;
            }
        }
        {
            Formatting lhsFormatting;
            lhsFormatting = this.getFormatting();
            Formatting rhsFormatting;
            rhsFormatting = that.getFormatting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatting", lhsFormatting), LocatorUtils.property(thatLocator, "formatting", rhsFormatting), lhsFormatting, rhsFormatting)) {
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
            DaemonMqttConnectionDetails theConnection;
            theConnection = this.getConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connection", theConnection), currentHashCode, theConnection);
        }
        {
            Formatting theFormatting;
            theFormatting = this.getFormatting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatting", theFormatting), currentHashCode, theFormatting);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
