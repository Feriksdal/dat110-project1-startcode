package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

import static no.hvl.dat110.messaging.MessageConfig.SEGMENTSIZE;

public class Message {

	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START

		if (data != null && data.length < SEGMENTSIZE){
			this.data = data;
		} else {
			throw new RuntimeException("Incorreect message data");
		}

			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
