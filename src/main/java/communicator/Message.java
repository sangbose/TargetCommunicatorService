package main.java.communicator;

public class Message {

	private String from;
	private String to;
    private String body;

    public Message() {
    }

    public Message(String from, String to, String body) {
    	this.from = from;
        this.to = to;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }
    
    public String getTo() {
        return to;
    }

    public void setFrom(String from) {
        this.from = from;
    }
    
    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Message{from=%s, to=%s, body=%s}", getFrom(),getTo(), getBody());
    }

}
