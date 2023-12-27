package behavioral.observer.listeners;

import behavioral.observer.publication.Publication;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperArchiver implements EventListener {
    private final List<Publication> newsPaperList;

    public NewsPaperArchiver() {
        newsPaperList = new ArrayList<>();
    }

    @Override
    public void update(String publicationType, Publication publication) {
        System.out.println("A new NewsPaper has been archived!");
        newsPaperList.add(publication);
    }

    public void showArchive() {
        newsPaperList.forEach(a -> System.out.println(a.getName()));
    }
}
