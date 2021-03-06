package example1;

import example1.message.Message;

public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    //Factory method
    public abstract Message createMessage();
}
