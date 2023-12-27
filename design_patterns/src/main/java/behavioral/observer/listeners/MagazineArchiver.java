package behavioral.observer.listeners;

import behavioral.observer.publication.Publication;

import java.util.ArrayList;
import java.util.List;

public class MagazineArchiver implements EventListener{
    private final List<Publication> magazines;

    public MagazineArchiver(){
        magazines = new ArrayList<>();
    }

    @Override
    public void update(String publicationType, Publication publication) {
        System.out.println("A new magazine has been archived!");
        magazines.add(publication);
    }

    public void showArchive(){
        magazines.forEach(a -> System.out.println(a.getName()));
    }
}
