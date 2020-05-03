/*
    Copyright (c) 2015-2016 SAP Ariba, Inc.
    All rights reserved. Patents pending.

    Responsible: Gopal Sundaram
*/
package com.example.springboot;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

//Needed for JSON, use the method for binding

public class Response
{
    @XmlType(name="Response")
    public enum Status {OK, ERROR, ALREADY_EXISTS,BAD_REQUEST}

    private Status status;

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }
}
