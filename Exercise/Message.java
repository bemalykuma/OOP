package Exercise;

import java.io.Serializable;

public class Message implements Serializable {
    private String messageA;
    private String messageB;

    public String getMessageA() {
        return messageA;
    }

    public String getMessageB() {
        return messageB;
    }

    public void setMessageA(String messageA) {
        this.messageA = messageA;
    }

    public void setMessageB(String messageB) {
        this.messageB = messageB;
    }
    
    
            
}
