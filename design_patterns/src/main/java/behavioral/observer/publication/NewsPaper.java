package behavioral.observer.publication;

public class NewsPaper implements Publication{
    private final String name;
    private final String editor;

    public NewsPaper(String name, String editor) {
        this.name = name;
        this.editor = editor;
    }

    public String getName(){
        return name;
    }

    public String getEditor(){
        return editor;
    }
}
