package com.example;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-11T20:01:01.953+02:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "DoubleItService", 
                  wsdlLocation = "file:/Users/orciuch/example/demo/src/main/java/com/example/DoubleIt1.wsdl",
                  targetNamespace = "http://www.example.org/contract/DoubleIt") 
public class DoubleItService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/contract/DoubleIt", "DoubleItService");
    public final static QName DoubleItPort = new QName("http://www.example.org/contract/DoubleIt", "DoubleItPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/orciuch/example/demo/src/main/java/com/example/DoubleIt1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DoubleItService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/orciuch/example/demo/src/main/java/com/example/DoubleIt1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DoubleItService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DoubleItService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DoubleItService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DoubleItService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DoubleItService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DoubleItService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DoubleItPortType
     */
    @WebEndpoint(name = "DoubleItPort")
    public DoubleItPortType getDoubleItPort() {
        return super.getPort(DoubleItPort, DoubleItPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DoubleItPortType
     */
    @WebEndpoint(name = "DoubleItPort")
    public DoubleItPortType getDoubleItPort(WebServiceFeature... features) {
        return super.getPort(DoubleItPort, DoubleItPortType.class, features);
    }

}