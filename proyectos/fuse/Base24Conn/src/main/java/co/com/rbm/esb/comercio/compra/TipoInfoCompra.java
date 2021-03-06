
package co.com.rbm.esb.comercio.compra;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.rbm.esb.TipoInfoImpuestos;
import co.com.rbm.esb.TipoMontoDetallado;


/**
 * <p>Java class for TipoInfoCompra complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoInfoCompra"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="infoImpuestos" type="{http://www.rbm.com.co/esb/}TipoInfoImpuestos" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="montoDetallado" type="{http://www.rbm.com.co/esb/}TipoMontoDetallado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referencia" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoReferencia" minOccurs="0"/&gt;
 *         &lt;element name="cantidadCuotas" type="{http://www.rbm.com.co/esb/comercio/compra/}TipoCantidadCuotas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoInfoCompra", propOrder = {
    "montoTotal",
    "infoImpuestos",
    "montoDetallado",
    "referencia",
    "cantidadCuotas"
})
public class TipoInfoCompra {

    @XmlElement(required = true)
    protected BigDecimal montoTotal;
    protected List<TipoInfoImpuestos> infoImpuestos;
    protected List<TipoMontoDetallado> montoDetallado;
    protected String referencia;
    protected Integer cantidadCuotas;

    /**
     * Gets the value of the montoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    /**
     * Sets the value of the montoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotal(BigDecimal value) {
        this.montoTotal = value;
    }

    /**
     * Gets the value of the infoImpuestos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoImpuestos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoImpuestos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInfoImpuestos }
     * 
     * 
     */
    public List<TipoInfoImpuestos> getInfoImpuestos() {
        if (infoImpuestos == null) {
            infoImpuestos = new ArrayList<TipoInfoImpuestos>();
        }
        return this.infoImpuestos;
    }

    /**
     * Gets the value of the montoDetallado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the montoDetallado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMontoDetallado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMontoDetallado }
     * 
     * 
     */
    public List<TipoMontoDetallado> getMontoDetallado() {
        if (montoDetallado == null) {
            montoDetallado = new ArrayList<TipoMontoDetallado>();
        }
        return this.montoDetallado;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the cantidadCuotas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    /**
     * Sets the value of the cantidadCuotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadCuotas(Integer value) {
        this.cantidadCuotas = value;
    }

}
