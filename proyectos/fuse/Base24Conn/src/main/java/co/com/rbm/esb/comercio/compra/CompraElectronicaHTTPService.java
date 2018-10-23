package co.com.rbm.esb.comercio.compra;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630262
 * 2017-07-27T13:15:23.375-03:00
 * Generated source version: 3.1.5.redhat-630262
 * 
 */
@WebServiceClient(name = "CompraElectronica_HTTP_Service", 
                  wsdlLocation = "file:../../CompraElectronica/CompraElectronicaService.wsdl",
                  targetNamespace = "http://www.rbm.com.co/esb/comercio/compra/") 
public class CompraElectronicaHTTPService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.rbm.com.co/esb/comercio/compra/", "CompraElectronica_HTTP_Service");
    public final static QName CompraElectronicaHTTPPort = new QName("http://www.rbm.com.co/esb/comercio/compra/", "CompraElectronica_HTTP_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:../../CompraElectronica/CompraElectronicaService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CompraElectronicaHTTPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:../../CompraElectronica/CompraElectronicaService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CompraElectronicaHTTPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CompraElectronicaHTTPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompraElectronicaHTTPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CompraElectronicaHTTPService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CompraElectronicaHTTPService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CompraElectronicaHTTPService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CompraElectronicaMsgSetPortType
     */
    @WebEndpoint(name = "CompraElectronica_HTTP_Port")
    public CompraElectronicaMsgSetPortType getCompraElectronicaHTTPPort() {
        return super.getPort(CompraElectronicaHTTPPort, CompraElectronicaMsgSetPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompraElectronicaMsgSetPortType
     */
    @WebEndpoint(name = "CompraElectronica_HTTP_Port")
    public CompraElectronicaMsgSetPortType getCompraElectronicaHTTPPort(WebServiceFeature... features) {
        return super.getPort(CompraElectronicaHTTPPort, CompraElectronicaMsgSetPortType.class, features);
    }

}