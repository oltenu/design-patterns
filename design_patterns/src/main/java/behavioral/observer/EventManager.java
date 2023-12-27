package behavioral.observer;

import behavioral.observer.listeners.EventListener;
import behavioral.observer.publication.Publication;

import java.util.*;

public class EventManager {
    private final HashMap<String, List<EventListener>> listeners;

    public EventManager(String... publications){
        listeners = new HashMap<>();
        for(String publication : publications){
            listeners.put(publication, new ArrayList<>());
        }
    }

    public void subscribe(String publicationType, behavioral.observer.listeners.EventListener listener){
        listeners.get(publicationType).add(listener);
    }

    public void unsubscribe(String publicationType, EventListener listener){
        listeners.get(publicationType).remove(listener);
    }

    public void notify(String publicationType, Publication publication){
        listeners.get(publicationType).forEach(a -> a.update(publicationType, publication));
    }
}
