package org.trivadis.websocket.socket;

import java.io.IOException;

import com.sun.grizzly.tcp.Request;
import com.sun.grizzly.websockets.*;

/**
 * This class represents a web socket application; it creates new sockets and
 * passes messages to all connected users
 * 
 * @author Andy Moncsek, Trivadis CH
 * 
 */
public class ChatApplication extends WebSocketApplication {


    @Override
    public WebSocket createWebSocket(ProtocolHandler protocolHandler, WebSocketListener... listeners) {
        return new ChatSocket(protocolHandler,listeners);
    }

    @Override
    public void onMessage(WebSocket socket, String text) {
        System.out.println(text);
        for (final WebSocket webSocket : getWebSockets()) {
            if (socket != webSocket) {
                webSocket.send(text);
            }
        }
    }

	@Override
	/**
	 * return true if you want to communicate over websocket otherwise return false
	 */
	public boolean isApplicationRequest(Request arg0) {
		return true;
	}

}
