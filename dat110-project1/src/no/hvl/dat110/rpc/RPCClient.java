package no.hvl.dat110.rpc;

import no.hvl.dat110.TODO;
import no.hvl.dat110.messaging.*;

public class RPCClient {

	private MessagingClient msgclient;
	private Connection connection;
	
	public RPCClient(String server, int port) {
	
		msgclient = new MessagingClient(server,port);
	}
	
	public void connect() {
		
		// TODO - START
		// connect using the underlying messaging layer connection

		connection = msgclient.connect();
		
		// TODO - END
	}
	
	public void disconnect() {
		
		// TODO - START
		// disconnect/close the underlying messaging connection
		connection.close();

		// TODO - END
	}
	
	public byte[] call(byte rpcid, byte[] params) {
		
		byte[] returnval = null;
		
		// TODO - START

		connection.send(new Message(params));
		returnval = connection.receive().getData();

		/* 
		 * 
		Make a remote call on the RPC server by sending an RPC request message
		and receive an RPC reply message
		
		params is the marshalled parameters from the client-stub
				
		The rpcid, params, and return value must be encapsulated/decapsulated
		according to the RPC message format
			
		*/



		// TODO - END
		return returnval;
		
	}

}
