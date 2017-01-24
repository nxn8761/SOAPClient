/**
 * SOAPDemoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.naga.services;

public class SOAPDemoServiceLocator extends org.apache.axis.client.Service implements com.naga.services.SOAPDemoService {

    public SOAPDemoServiceLocator() {
    }


    public SOAPDemoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPDemoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPDemo
    private java.lang.String SOAPDemo_address = "http://localhost:8085/SOAPWebServices/services/SOAPDemo";

    public java.lang.String getSOAPDemoAddress() {
        return SOAPDemo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPDemoWSDDServiceName = "SOAPDemo";

    public java.lang.String getSOAPDemoWSDDServiceName() {
        return SOAPDemoWSDDServiceName;
    }

    public void setSOAPDemoWSDDServiceName(java.lang.String name) {
        SOAPDemoWSDDServiceName = name;
    }

    public com.naga.services.SOAPDemo getSOAPDemo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPDemo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPDemo(endpoint);
    }

    public com.naga.services.SOAPDemo getSOAPDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.naga.services.SOAPDemoSoapBindingStub _stub = new com.naga.services.SOAPDemoSoapBindingStub(portAddress, this);
            _stub.setPortName(getSOAPDemoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPDemoEndpointAddress(java.lang.String address) {
        SOAPDemo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.naga.services.SOAPDemo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.naga.services.SOAPDemoSoapBindingStub _stub = new com.naga.services.SOAPDemoSoapBindingStub(new java.net.URL(SOAPDemo_address), this);
                _stub.setPortName(getSOAPDemoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAPDemo".equals(inputPortName)) {
            return getSOAPDemo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.naga.com", "SOAPDemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.naga.com", "SOAPDemo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPDemo".equals(portName)) {
            setSOAPDemoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
