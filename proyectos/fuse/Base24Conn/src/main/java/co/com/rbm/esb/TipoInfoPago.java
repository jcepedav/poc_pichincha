
package co.com.rbm.esb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoInfoPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FIIDEntidadAdquiriente" type="{http://www.rbm.com.co/esb/}TipoFIIDEntidad"/&gt;
 *         &lt;element name="numAutorizacion" type="{http://www.rbm.com.co/esb/}TipoNumAutorizacion"/&gt;
 *         &lt;element name="codConvenioRecaudo" type="{http://www.rbm.com.co/esb/}TipoCodConvenio"/&gt;
 *         &lt;element name="numReferenciaPago" type="{http://www.rbm.com.co/esb/}TipoNumReferenciaPago"/&gt;
 *         &lt;element name="monto" type="{http://www.rbm.com.co/esb/}TipoMonto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoPago", propOrder = {
    "fiidEntidadAdquiriente",
    "numAutorizacion",
    "codConvenioRecaudo",
    "numReferenciaPago",
    "monto"
})
public class TipoInfoPago {

    @XmlElement(name = "FIIDEntidadAdquiriente", required = true)
    protected String fiidEntidadAdquiriente;
    @XmlElement(required = true)
    protected String numAutorizacion;
    @XmlElement(required = true)
    protected String codConvenioRecaudo;
    @XmlElement(required = true)
    protected String numReferenciaPago;
    @XmlElement(required = true)
    protected BigDecimal monto;

    /**
     * Gets the value of the fiidEntidadAdquiriente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIIDEntidadAdquiriente() {
        return fiidEntidadAdquiriente;
    }

    /**
     * Sets the value of the fiidEntidadAdquiriente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIIDEntidadAdquiriente(String value) {
        this.fiidEntidadAdquiriente = value;
    }

    /**
     * Gets the value of the numAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    /**
     * Sets the value of the numAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAutorizacion(String value) {
        this.numAutorizacion = value;
    }

    /**
     * Gets the value of the codConvenioRecaudo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConvenioRecaudo() {
        return codConvenioRecaudo;
    }

    /**
     * Sets the value of the codConvenioRecaudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConvenioRecaudo(String value) {
        this.codConvenioRecaudo = value;
    }

    /**
     * Gets the value of the numReferenciaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumReferenciaPago() {
        return numReferenciaPago;
    }

    /**
     * Sets the value of the numReferenciaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumReferenciaPago(String value) {
        this.numReferenciaPago = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

}
