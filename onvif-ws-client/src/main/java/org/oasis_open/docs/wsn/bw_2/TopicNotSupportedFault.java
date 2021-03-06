
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-02-29T15:12:53.853+01:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "TopicNotSupportedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class TopicNotSupportedFault extends Exception {
    
    private org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType topicNotSupportedFault;

    public TopicNotSupportedFault() {
        super();
    }
    
    public TopicNotSupportedFault(String message) {
        super(message);
    }
    
    public TopicNotSupportedFault(String message, Throwable cause) {
        super(message, cause);
    }

    public TopicNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType topicNotSupportedFault) {
        super(message);
        this.topicNotSupportedFault = topicNotSupportedFault;
    }

    public TopicNotSupportedFault(String message, org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType topicNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.topicNotSupportedFault = topicNotSupportedFault;
    }

    public org.oasis_open.docs.wsn.b_2.TopicNotSupportedFaultType getFaultInfo() {
        return this.topicNotSupportedFault;
    }
}
