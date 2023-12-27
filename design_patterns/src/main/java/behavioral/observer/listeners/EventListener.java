package behavioral.observer.listeners;

import behavioral.observer.publication.Publication;

public interface EventListener {
    void update(String publicationType, Publication publication);
}
