/**
 * 
 */
package br.com.ww.dm.ws.soap;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

/**
 * @author 4013697
 *
 */
public class SOAPConnector extends WebServiceGatewaySupport {
	 public Object callWebService(String url, Object request){
	        return getWebServiceTemplate().marshalSendAndReceive(url, request);
	    }
}
