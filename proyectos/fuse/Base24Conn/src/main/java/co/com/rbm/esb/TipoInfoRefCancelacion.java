
package co.com.rbm.esb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoInfoRefCancelacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoRefCancelacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numAprobacion" type="{http://www.rbm.com.co/esb/}TipoNumAprobacion"/&gt;
 *         &lt;element name="idTransaccionAutorizador" type="{http://www.rbm.com.co/esb/}TipoIdTransaccionAutorizador"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoRefCancelacion", propOrder = {
    "numAprobacion",
    "idTransaccionAutorizador"
})
public class TipoInfoRefCancelacion {

    @XmlElement(required = true)
    protected String numAprobacion;
    protected long idTransaccionAutorizador;

    /**
     * Gets the value of the numAprobacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAprobacion() {
        return numAprobacion;
    }

    /**
     * Sets the value of the numAprobacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAprobacion(String value) {
        this.numAprobacion = value;
    }

    /**
     * Gets the value of the idTransaccionAutorizador property.
     * 
     */
    public long getIdTransaccionAutorizador() {
        return idTransaccionAutorizador;
    }

    /**
     * Sets the value of the idTransaccionAutorizador property.
     * 
     */
    public void setIdTransaccionAutorizador(long value) {
        this.idTransaccionAutorizador = value;
    }

}
