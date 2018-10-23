
package co.com.rbm.esb.comercio;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.rbm.esb.comercio package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.rbm.esb.comercio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoInfoPuntoInteraccion }
     * 
     */
    public TipoInfoPuntoInteraccion createTipoInfoPuntoInteraccion() {
        return new TipoInfoPuntoInteraccion();
    }

    /**
     * Create an instance of {@link TipoInfoUbicacion }
     * 
     */
    public TipoInfoUbicacion createTipoInfoUbicacion() {
        return new TipoInfoUbicacion();
    }

    /**
     * Create an instance of {@link TipoInfoTerminal }
     * 
     */
    public TipoInfoTerminal createTipoInfoTerminal() {
        return new TipoInfoTerminal();
    }

}
