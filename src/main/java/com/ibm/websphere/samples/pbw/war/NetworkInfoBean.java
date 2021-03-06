//
// COPYRIGHT LICENSE: This information contains sample code provided in source code form. You may copy,
// modify, and distribute these sample programs in any form without payment to IBM for the purposes of
// developing, using, marketing or distributing application programs conforming to the application
// programming interface for the operating platform for which the sample code is written.
// Notwithstanding anything to the contrary, IBM PROVIDES THE SAMPLE SOURCE CODE ON AN "AS IS" BASIS
// AND IBM DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, ANY IMPLIED
// WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY QUALITY, FITNESS FOR A PARTICULAR PURPOSE,
// TITLE, AND ANY WARRANTY OR CONDITION OF NON-INFRINGEMENT. IBM SHALL NOT BE LIABLE FOR ANY DIRECT,
// INDIRECT, INCIDENTAL, SPECIAL OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF THE
// SAMPLE SOURCE CODE. IBM HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS
// OR MODIFICATIONS TO THE SAMPLE SOURCE CODE.
//
// (C) COPYRIGHT International Business Machines Corp., 2001,2011
// All Rights Reserved * Licensed Materials - Property of IBM
//
package com.ibm.websphere.samples.pbw.war;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;


@Named("networkInfo")
@RequestScoped
public class NetworkInfoBean implements Serializable {

  private String serverAddress;
  private String serverHost;

  public NetworkInfoBean () {
    super();
  }

  public String getServerAddress() {
    try {
       InetAddress localhost = InetAddress.getLocalHost();
       serverAddress = localhost.getHostAddress().trim();
    }
    catch (UnknownHostException e) {
      System.err.println("Fatal error: cannot get  IP Address from NetworkInfoBean : " + e.getMessage());
    }
		return serverAddress;
	}

  public String getServerHost() {
    try {
       InetAddress localhost = InetAddress.getLocalHost();
       serverHost = localhost.getHostName().trim();
    }
    catch (UnknownHostException e) {
      System.err.println("Fatal error: cannot get  hostname from NetworkInfoBean : " + e.getMessage());
    }
    return serverHost;
  }


}
