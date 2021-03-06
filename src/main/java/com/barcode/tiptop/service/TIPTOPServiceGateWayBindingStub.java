/**
 * TIPTOPServiceGateWayBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.barcode.tiptop.service;

public class TIPTOPServiceGateWayBindingStub extends org.apache.axis.client.Stub implements com.barcode.tiptop.service.TIPTOPServiceGateWayPortType_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[37];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateApmt110");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Request_CreateApmt110Request"), com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Response_CreateApmt110Response"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApmt110");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Request_GetApmt110Request"), com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Response_GetApmt110Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateApmt720");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Request_CreateApmt720Request"), com.barcode.tiptop.service.CreateApmt720Request_CreateApmt720Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Response_CreateApmt720Response"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateImgs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsRequest_CreateImgsRequest"), com.barcode.tiptop.service.CreateImgsRequest_CreateImgsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsResponse_CreateImgsResponse"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsfi510");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Request_GetAsfi510Request"), com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Response_GetAsfi510Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsfi511");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Request_GetAsfi511Request"), com.barcode.tiptop.service.GetAsfi511Request_GetAsfi511Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Response_GetAsfi511Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAsfi510");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Request_UpdateAsfi510Request"), com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Response_UpdateAsfi510Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsfi520");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Request_GetAsfi520Request"), com.barcode.tiptop.service.GetAsfi520Request_GetAsfi520Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Response_GetAsfi520Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAsfi520");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Request_UpdateAsfi520Request"), com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Response_UpdateAsfi520Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAqct110");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Request_UpdateAqct110Request"), com.barcode.tiptop.service.UpdateAqct110Request_UpdateAqct110Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Response_UpdateAqct110Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApmt722");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Request_GetApmt722Request"), com.barcode.tiptop.service.GetApmt722Request_GetApmt722Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Response_GetApmt722Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateApmt722");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Request_UpdateApmt722Request"), com.barcode.tiptop.service.UpdateApmt722Request_UpdateApmt722Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Response_UpdateApmt722Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsmq202");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Request_GetAsmq202Request"), com.barcode.tiptop.service.GetAsmq202Request_GetAsmq202Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Response_GetAsmq202Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsmq2022");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Request_GetAsmq2022Request"), com.barcode.tiptop.service.GetAsmq2022Request_GetAsmq2022Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Response_GetAsmq2022Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAimt324");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Request_GetAimt324Request"), com.barcode.tiptop.service.GetAimt324Request_GetAimt324Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Response_GetAimt324Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAimt324");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Request_UpdateAimt324Request"), com.barcode.tiptop.service.UpdateAimt324Request_UpdateAimt324Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Response_UpdateAimt324Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsft670");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Request_GetAsft670Request"), com.barcode.tiptop.service.GetAsft670Request_GetAsft670Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Response_GetAsft670Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAsft670");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Request_UpdateAsft670Request"), com.barcode.tiptop.service.UpdateAsft670Request_UpdateAsft670Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Response_UpdateAsft670Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAtmt261");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Request_GetAtmt261Request"), com.barcode.tiptop.service.GetAtmt261Request_GetAtmt261Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Response_GetAtmt261Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAtmt261");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Request_UpdateAtmt261Request"), com.barcode.tiptop.service.UpdateAtmt261Request_UpdateAtmt261Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Response_UpdateAtmt261Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateRvbs10");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Request_UpdateRvbs10Request"), com.barcode.tiptop.service.UpdateRvbs10Request_UpdateRvbs10Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Response_UpdateRvbs10Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateTc_imb");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbRequest_CreateTc_imbRequest"), com.barcode.tiptop.service.CreateTc_imbRequest_CreateTc_imbRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbResponse_CreateTc_imbResponse"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApmt722a");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aRequest_GetApmt722aRequest"), com.barcode.tiptop.service.GetApmt722ARequest_GetApmt722ARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aResponse_GetApmt722aResponse"));
        oper.setReturnClass(com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetApmt110a");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aRequest_GetApmt110aRequest"), com.barcode.tiptop.service.GetApmt110ARequest_GetApmt110ARequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aResponse_GetApmt110aResponse"));
        oper.setReturnClass(com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateTc_imb1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Request_CreateTc_imb1Request"), com.barcode.tiptop.service.CreateTc_imb1Request_CreateTc_imb1Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Response_CreateTc_imb1Response"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCpmt191");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Request_CreateCpmt191Request"), com.barcode.tiptop.service.CreateCpmt191Request_CreateCpmt191Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Response_CreateCpmt191Response"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAxmt620");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Request_UpdateAxmt620Request"), com.barcode.tiptop.service.UpdateAxmt620Request_UpdateAxmt620Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Response_UpdateAxmt620Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAimt301");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Request_GetAimt301Request"), com.barcode.tiptop.service.GetAimt301Request_GetAimt301Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Response_GetAimt301Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateAimt301");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Request_UpdateAimt301Request"), com.barcode.tiptop.service.UpdateAimt301Request_UpdateAimt301Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Response_UpdateAimt301Response"));
        oper.setReturnClass(com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAimt324");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Request_CreateAimt324Request"), com.barcode.tiptop.service.CreateAimt324Request_CreateAimt324Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Response_CreateAimt324Response"));
        oper.setReturnClass(com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetImgs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsRequest_GetImgsRequest"), com.barcode.tiptop.service.GetImgsRequest_GetImgsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsResponse_GetImgsResponse"));
        oper.setReturnClass(com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAsmq2021");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Request_GetAsmq2021Request"), com.barcode.tiptop.service.GetAsmq2021Request_GetAsmq2021Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Response_GetAsmq2021Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAqct110");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Request_GetAqct110Request"), com.barcode.tiptop.service.GetAqct110Request_GetAqct110Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Response_GetAqct110Response"));
        oper.setReturnClass(com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeSrv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("callbackSrv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("syncProd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeMdm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

    }

    public TIPTOPServiceGateWayBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TIPTOPServiceGateWayBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TIPTOPServiceGateWayBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Request_CreateAimt324Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateAimt324Request_CreateAimt324Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAimt324Response_CreateAimt324Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Request_CreateApmt110Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt110Response_CreateApmt110Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Request_CreateApmt720Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateApmt720Request_CreateApmt720Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateApmt720Response_CreateApmt720Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Request_CreateCpmt191Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateCpmt191Request_CreateCpmt191Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCpmt191Response_CreateCpmt191Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsRequest_CreateImgsRequest");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateImgsRequest_CreateImgsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateImgsResponse_CreateImgsResponse");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Request_CreateTc_imb1Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateTc_imb1Request_CreateTc_imb1Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imb1Response_CreateTc_imb1Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbRequest_CreateTc_imbRequest");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateTc_imbRequest_CreateTc_imbRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTc_imbResponse_CreateTc_imbResponse");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Request_GetAimt301Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAimt301Request_GetAimt301Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt301Response_GetAimt301Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Request_GetAimt324Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAimt324Request_GetAimt324Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAimt324Response_GetAimt324Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aRequest_GetApmt110aRequest");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt110ARequest_GetApmt110ARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110aResponse_GetApmt110aResponse");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Request_GetApmt110Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt110Response_GetApmt110Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aRequest_GetApmt722aRequest");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt722ARequest_GetApmt722ARequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722aResponse_GetApmt722aResponse");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Request_GetApmt722Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt722Request_GetApmt722Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetApmt722Response_GetApmt722Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Request_GetAqct110Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAqct110Request_GetAqct110Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAqct110Response_GetAqct110Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Request_GetAsfi510Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi510Response_GetAsfi510Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Request_GetAsfi511Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi511Request_GetAsfi511Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi511Response_GetAsfi511Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Request_GetAsfi520Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi520Request_GetAsfi520Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsfi520Response_GetAsfi520Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Request_GetAsft670Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsft670Request_GetAsft670Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsft670Response_GetAsft670Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Request_GetAsmq2021Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq2021Request_GetAsmq2021Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2021Response_GetAsmq2021Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Request_GetAsmq2022Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq2022Request_GetAsmq2022Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq2022Response_GetAsmq2022Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Request_GetAsmq202Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq202Request_GetAsmq202Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAsmq202Response_GetAsmq202Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Request_GetAtmt261Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAtmt261Request_GetAtmt261Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAtmt261Response_GetAtmt261Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsRequest_GetImgsRequest");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetImgsRequest_GetImgsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetImgsResponse_GetImgsResponse");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Request_UpdateAimt301Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAimt301Request_UpdateAimt301Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt301Response_UpdateAimt301Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Request_UpdateAimt324Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAimt324Request_UpdateAimt324Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAimt324Response_UpdateAimt324Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Request_UpdateApmt722Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateApmt722Request_UpdateApmt722Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateApmt722Response_UpdateApmt722Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Request_UpdateAqct110Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAqct110Request_UpdateAqct110Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAqct110Response_UpdateAqct110Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Request_UpdateAsfi510Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi510Response_UpdateAsfi510Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Request_UpdateAsfi520Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsfi520Response_UpdateAsfi520Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Request_UpdateAsft670Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsft670Request_UpdateAsft670Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAsft670Response_UpdateAsft670Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Request_UpdateAtmt261Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAtmt261Request_UpdateAtmt261Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAtmt261Response_UpdateAtmt261Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Request_UpdateAxmt620Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAxmt620Request_UpdateAxmt620Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateAxmt620Response_UpdateAxmt620Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Request_UpdateRvbs10Request");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateRvbs10Request_UpdateRvbs10Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateRvbs10Response_UpdateRvbs10Response");
            cachedSerQNames.add(qName);
            cls = com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response createApmt110(com.barcode.tiptop.service.CreateApmt110Request_CreateApmt110Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateApmt110"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateApmt110Response_CreateApmt110Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response getApmt110(com.barcode.tiptop.service.GetApmt110Request_GetApmt110Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetApmt110"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetApmt110Response_GetApmt110Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response createApmt720(com.barcode.tiptop.service.CreateApmt720Request_CreateApmt720Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateApmt720"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateApmt720Response_CreateApmt720Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse createImgs(com.barcode.tiptop.service.CreateImgsRequest_CreateImgsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateImgs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateImgsResponse_CreateImgsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response getAsfi510(com.barcode.tiptop.service.GetAsfi510Request_GetAsfi510Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsfi510"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsfi510Response_GetAsfi510Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response getAsfi511(com.barcode.tiptop.service.GetAsfi511Request_GetAsfi511Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsfi511"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsfi511Response_GetAsfi511Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response updateAsfi510(com.barcode.tiptop.service.UpdateAsfi510Request_UpdateAsfi510Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAsfi510"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAsfi510Response_UpdateAsfi510Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response getAsfi520(com.barcode.tiptop.service.GetAsfi520Request_GetAsfi520Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsfi520"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsfi520Response_GetAsfi520Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response updateAsfi520(com.barcode.tiptop.service.UpdateAsfi520Request_UpdateAsfi520Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAsfi520"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAsfi520Response_UpdateAsfi520Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response updateAqct110(com.barcode.tiptop.service.UpdateAqct110Request_UpdateAqct110Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAqct110"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAqct110Response_UpdateAqct110Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response getApmt722(com.barcode.tiptop.service.GetApmt722Request_GetApmt722Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetApmt722"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetApmt722Response_GetApmt722Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response updateApmt722(com.barcode.tiptop.service.UpdateApmt722Request_UpdateApmt722Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateApmt722"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateApmt722Response_UpdateApmt722Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response getAsmq202(com.barcode.tiptop.service.GetAsmq202Request_GetAsmq202Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsmq202"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsmq202Response_GetAsmq202Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response getAsmq2022(com.barcode.tiptop.service.GetAsmq2022Request_GetAsmq2022Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsmq2022"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsmq2022Response_GetAsmq2022Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response getAimt324(com.barcode.tiptop.service.GetAimt324Request_GetAimt324Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAimt324"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAimt324Response_GetAimt324Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response updateAimt324(com.barcode.tiptop.service.UpdateAimt324Request_UpdateAimt324Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAimt324"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAimt324Response_UpdateAimt324Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response getAsft670(com.barcode.tiptop.service.GetAsft670Request_GetAsft670Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsft670"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsft670Response_GetAsft670Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response updateAsft670(com.barcode.tiptop.service.UpdateAsft670Request_UpdateAsft670Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAsft670"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAsft670Response_UpdateAsft670Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response getAtmt261(com.barcode.tiptop.service.GetAtmt261Request_GetAtmt261Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAtmt261"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAtmt261Response_GetAtmt261Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response updateAtmt261(com.barcode.tiptop.service.UpdateAtmt261Request_UpdateAtmt261Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAtmt261"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAtmt261Response_UpdateAtmt261Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response updateRvbs10(com.barcode.tiptop.service.UpdateRvbs10Request_UpdateRvbs10Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateRvbs10"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateRvbs10Response_UpdateRvbs10Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse createTc_imb(com.barcode.tiptop.service.CreateTc_imbRequest_CreateTc_imbRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateTc_imb"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateTc_imbResponse_CreateTc_imbResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse getApmt722A(com.barcode.tiptop.service.GetApmt722ARequest_GetApmt722ARequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetApmt722a"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetApmt722AResponse_GetApmt722AResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse getApmt110A(com.barcode.tiptop.service.GetApmt110ARequest_GetApmt110ARequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetApmt110a"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetApmt110AResponse_GetApmt110AResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response createTc_imb1(com.barcode.tiptop.service.CreateTc_imb1Request_CreateTc_imb1Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateTc_imb1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateTc_imb1Response_CreateTc_imb1Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response createCpmt191(com.barcode.tiptop.service.CreateCpmt191Request_CreateCpmt191Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCpmt191"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateCpmt191Response_CreateCpmt191Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response updateAxmt620(com.barcode.tiptop.service.UpdateAxmt620Request_UpdateAxmt620Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAxmt620"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAxmt620Response_UpdateAxmt620Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response getAimt301(com.barcode.tiptop.service.GetAimt301Request_GetAimt301Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAimt301"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAimt301Response_GetAimt301Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response updateAimt301(com.barcode.tiptop.service.UpdateAimt301Request_UpdateAimt301Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateAimt301"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.UpdateAimt301Response_UpdateAimt301Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response createAimt324(com.barcode.tiptop.service.CreateAimt324Request_CreateAimt324Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAimt324"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.CreateAimt324Response_CreateAimt324Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse getImgs(com.barcode.tiptop.service.GetImgsRequest_GetImgsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetImgs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetImgsResponse_GetImgsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response getAsmq2021(com.barcode.tiptop.service.GetAsmq2021Request_GetAsmq2021Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAsmq2021"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAsmq2021Response_GetAsmq2021Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response getAqct110(com.barcode.tiptop.service.GetAqct110Request_GetAqct110Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAqct110"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response) org.apache.axis.utils.JavaUtils.convert(_resp, com.barcode.tiptop.service.GetAqct110Response_GetAqct110Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invokeSrv(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "invokeSrv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String callbackSrv(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "callbackSrv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String syncProd(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "syncProd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invokeMdm(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "invokeMdm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
