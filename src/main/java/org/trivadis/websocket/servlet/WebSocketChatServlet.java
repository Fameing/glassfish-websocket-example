package org.trivadis.websocket.servlet;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import org.trivadis.websocket.socket.ChatApplication;



import com.sun.grizzly.websockets.WebSocketEngine;


/**
 * This class represents a servlet starting a webSocket application
 * 
 * @author Andy Moncsek, Trivadis CH
 * 
 */
public class WebSocketChatServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2454863708244770534L;
	private final ChatApplication app = new ChatApplication();
       

	 @Override
	public void init(ServletConfig config) throws ServletException {
		   WebSocketEngine.getEngine().register(app);
	 }
}
