package abhinash.pubsubqueue.model;

import abhinash.pubsubqueue.pubsubinterface.ISubscriber;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@AllArgsConstructor
public class TopicSubscriber {
    private final AtomicInteger offset;
    private final ISubscriber subscriber;

    public TopicSubscriber(@NonNull final ISubscriber subscriber) {
        this.subscriber = subscriber;
        this.offset = new AtomicInteger(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this.subscriber.getId() == ((TopicSubscriber) o).subscriber.getId()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriber.getId());
    }
}