
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoIdCuenta;


/**
 * <p>Java class for TipoInfoMedioPagoIdCuenta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoMedioPagoIdCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCuenta" type="{http://www.rbm.com.co/esb/}TipoIdCuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoMedioPagoIdCuenta", propOrder = {
    "idCuenta"
})
public class TipoInfoMedioPagoIdCuenta {

    @XmlElement(required = true)
    protected TipoIdCuenta idCuenta;

    /**
     * Gets the value of the idCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdCuenta }
     *     
     */
    public TipoIdCuenta getIdCuenta() {
        return idCuenta;
    }

    /**
     * Sets the value of the idCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdCuenta }
     *     
     */
    public void setIdCuenta(TipoIdCuenta value) {
        this.idCuenta = value;
    }

}
