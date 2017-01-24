package com.naga.services;

public class SOAPDemoProxy implements com.naga.services.SOAPDemo {
  private String _endpoint = null;
  private com.naga.services.SOAPDemo sOAPDemo = null;
  
  public SOAPDemoProxy() {
    _initSOAPDemoProxy();
  }
  
  public SOAPDemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initSOAPDemoProxy();
  }
  
  private void _initSOAPDemoProxy() {
    try {
      sOAPDemo = (new com.naga.services.SOAPDemoServiceLocator()).getSOAPDemo();
      if (sOAPDemo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOAPDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOAPDemo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOAPDemo != null)
      ((javax.xml.rpc.Stub)sOAPDemo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.naga.services.SOAPDemo getSOAPDemo() {
    if (sOAPDemo == null)
      _initSOAPDemoProxy();
    return sOAPDemo;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (sOAPDemo == null)
      _initSOAPDemoProxy();
    return sOAPDemo.add(a, b);
  }
  
  
}