package Threads.NotifyWait;

public class MessageResource {

    private String resource;

    MessageResource(String resource){
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}
