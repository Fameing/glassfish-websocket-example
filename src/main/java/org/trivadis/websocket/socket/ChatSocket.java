package org.trivadis.websocket.socket;

import com.sun.grizzly.websockets.DefaultWebSocket;
import com.sun.grizzly.websockets.ProtocolHandler;
import com.sun.grizzly.websockets.WebSocketListener;
/**
 * This class represents a chat socket associated with a client
 * 
 * @author Andy Moncsek, Trivadis CH
 * 
 */
public class ChatSocket extends DefaultWebSocket {

    public ChatSocket(ProtocolHandler handler, WebSocketListener... listeners) {
		super(handler, listeners);
	}
}
