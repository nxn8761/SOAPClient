/**
 * SOAPDemoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.naga.services;

public interface SOAPDemoService extends javax.xml.rpc.Service {
    public java.lang.String getSOAPDemoAddress();

    public com.naga.services.SOAPDemo getSOAPDemo() throws javax.xml.rpc.ServiceException;

    public com.naga.services.SOAPDemo getSOAPDemo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
