package behavioral.observer.publication;

public class Magazine implements Publication{
    private final String name;
    private final String editor;

    public Magazine(String name, String editor) {
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
