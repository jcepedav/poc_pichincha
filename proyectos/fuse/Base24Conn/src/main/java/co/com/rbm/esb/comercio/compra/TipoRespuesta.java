
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoInfoRespuesta;
import co.com.rbm.esb.comercio.TipoInfoTerminal;


/**
 * <p>Java class for TipoRespuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoRespuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cabeceraRespuesta" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoCabeceraSolicitud"/&gt;
 *         &lt;element name="infoRespuesta" type="{http://www.rbm.com.co/esb/}TipoInfoRespuesta"/&gt;
 *         &lt;element name="infoCompraResp" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoInfoCompraResp" minOccurs="0"/&gt;
 *         &lt;element name="idTransaccionAutorizador" type="{http://www.rbm.com.co/esb/}TipoIdTransaccionAutorizador" minOccurs="0"/&gt;
 *         &lt;element name="infoTerminal" type="{http://www.rbm.com.co/esb/comercio/}TipoInfoTerminal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRespuesta", propOrder = {
    "cabeceraRespuesta",
    "infoRespuesta",
    "infoCompraResp",
    "idTransaccionAutorizador",
    "infoTerminal"
})
public class TipoRespuesta {

    @XmlElement(required = true)
    protected TipoCabeceraSolicitud cabeceraRespuesta;
    @XmlElement(required = true)
    protected TipoInfoRespuesta infoRespuesta;
    protected TipoInfoCompraResp infoCompraResp;
    protected Long idTransaccionAutorizador;
    protected TipoInfoTerminal infoTerminal;

    /**
     * Gets the value of the cabeceraRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCabeceraSolicitud }
     *     
     */
    public TipoCabeceraSolicitud getCabeceraRespuesta() {
        return cabeceraRespuesta;
    }

    /**
     * Sets the value of the cabeceraRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCabeceraSolicitud }
     *     
     */
    public void setCabeceraRespuesta(TipoCabeceraSolicitud value) {
        this.cabeceraRespuesta = value;
    }

    /**
     * Gets the value of the infoRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoRespuesta }
     *     
     */
    public TipoInfoRespuesta getInfoRespuesta() {
        return infoRespuesta;
    }

    /**
     * Sets the value of the infoRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoRespuesta }
     *     
     */
    public void setInfoRespuesta(TipoInfoRespuesta value) {
        this.infoRespuesta = value;
    }

    /**
     * Gets the value of the infoCompraResp property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoCompraResp }
     *     
     */
    public TipoInfoCompraResp getInfoCompraResp() {
        return infoCompraResp;
    }

    /**
     * Sets the value of the infoCompraResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoCompraResp }
     *     
     */
    public void setInfoCompraResp(TipoInfoCompraResp value) {
        this.infoCompraResp = value;
    }

    /**
     * Gets the value of the idTransaccionAutorizador property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdTransaccionAutorizador() {
        return idTransaccionAutorizador;
    }

    /**
     * Sets the value of the idTransaccionAutorizador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdTransaccionAutorizador(Long value) {
        this.idTransaccionAutorizador = value;
    }

    /**
     * Gets the value of the infoTerminal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInfoTerminal }
     *     
     */
    public TipoInfoTerminal getInfoTerminal() {
        return infoTerminal;
    }

    /**
     * Sets the value of the infoTerminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInfoTerminal }
     *     
     */
    public void setInfoTerminal(TipoInfoTerminal value) {
        this.infoTerminal = value;
    }

}
