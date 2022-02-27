package abhinash.pubsubqueue.pubsubinterface;

import abhinash.pubsubqueue.model.Message;

public interface ISubscriber {

    String getId();
    void consume(Message message) throws InterruptedException;
}