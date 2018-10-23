
package co.com.rbm.esb.comercio.compra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.rbm.esb.comercio.compra package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CompraProcesarSolicitud_QNAME = new QName("http://www.rbm.com.co/esb/comercio/compra/", "compraProcesarSolicitud");
    private final static QName _CompraProcesarRespuesta_QNAME = new QName("http://www.rbm.com.co/esb/comercio/compra/", "compraProcesarRespuesta");
    private final static QName _CompraReversarSolicitud_QNAME = new QName("http://www.rbm.com.co/esb/comercio/compra/", "compraReversarSolicitud");
    private final static QName _CompraReversarRespuesta_QNAME = new QName("http://www.rbm.com.co/esb/comercio/compra/", "compraReversarRespuesta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.rbm.esb.comercio.compra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoSolicitudCompra }
     * 
     */
    public TipoSolicitudCompra createTipoSolicitudCompra() {
        return new TipoSolicitudCompra();
    }

    /**
     * Create an instance of {@link TipoRespuesta }
     * 
     */
    public TipoRespuesta createTipoRespuesta() {
        return new TipoRespuesta();
    }

    /**
     * Create an instance of {@link TipoInfoMedioPago }
     * 
     */
    public TipoInfoMedioPago createTipoInfoMedioPago() {
        return new TipoInfoMedioPago();
    }

    /**
     * Create an instance of {@link TipoInfoCompra }
     * 
     */
    public TipoInfoCompra createTipoInfoCompra() {
        return new TipoInfoCompra();
    }

    /**
     * Create an instance of {@link TipoCabeceraSolicitud }
     * 
     */
    public TipoCabeceraSolicitud createTipoCabeceraSolicitud() {
        return new TipoCabeceraSolicitud();
    }

    /**
     * Create an instance of {@link TipoInfoCompraResp }
     * 
     */
    public TipoInfoCompraResp createTipoInfoCompraResp() {
        return new TipoInfoCompraResp();
    }

    /**
     * Create an instance of {@link TipoSolicitudCancelacion }
     * 
     */
    public TipoSolicitudCancelacion createTipoSolicitudCancelacion() {
        return new TipoSolicitudCancelacion();
    }

    /**
     * Create an instance of {@link TipoInfoMedioPagoIdCuenta }
     * 
     */
    public TipoInfoMedioPagoIdCuenta createTipoInfoMedioPagoIdCuenta() {
        return new TipoInfoMedioPagoIdCuenta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSolicitudCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rbm.com.co/esb/comercio/compra/", name = "compraProcesarSolicitud")
    public JAXBElement<TipoSolicitudCompra> createCompraProcesarSolicitud(TipoSolicitudCompra value) {
        return new JAXBElement<TipoSolicitudCompra>(_CompraProcesarSolicitud_QNAME, TipoSolicitudCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rbm.com.co/esb/comercio/compra/", name = "compraProcesarRespuesta")
    public JAXBElement<TipoRespuesta> createCompraProcesarRespuesta(TipoRespuesta value) {
        return new JAXBElement<TipoRespuesta>(_CompraProcesarRespuesta_QNAME, TipoRespuesta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSolicitudCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rbm.com.co/esb/comercio/compra/", name = "compraReversarSolicitud")
    public JAXBElement<TipoSolicitudCompra> createCompraReversarSolicitud(TipoSolicitudCompra value) {
        return new JAXBElement<TipoSolicitudCompra>(_CompraReversarSolicitud_QNAME, TipoSolicitudCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoRespuesta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rbm.com.co/esb/comercio/compra/", name = "compraReversarRespuesta")
    public JAXBElement<TipoRespuesta> createCompraReversarRespuesta(TipoRespuesta value) {
        return new JAXBElement<TipoRespuesta>(_CompraReversarRespuesta_QNAME, TipoRespuesta.class, null, value);
    }

}
