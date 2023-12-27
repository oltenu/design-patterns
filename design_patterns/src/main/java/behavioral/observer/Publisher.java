package behavioral.observer;

import behavioral.observer.publication.Magazine;
import behavioral.observer.publication.NewsPaper;

public class Publisher {
    public EventManager eventManager = new EventManager("Magazine", "NewsPaper");

    public void publishNewsPaper(NewsPaper newsPaper){
        System.out.println("A new news paper has been published!");
        eventManager.notify("NewsPaper", newsPaper);
    }

    public void publishMagazine(Magazine magazine){
        System.out.println("A new magazine has been published!");
        eventManager.notify("Magazine", magazine);
    }
}
