package model;

public class Comic {
    private int id;
    private String nameComic;
    private String author;
    private String nhaSx;

    public Comic() {
    }

    public Comic(int id, String nameComic, String author, String nhaSx) {
        this.id = id;
        this.nameComic = nameComic;
        this.author = author;
        this.nhaSx = nhaSx;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "id=" + id +
                ", nameComic='" + nameComic + '\'' +
                ", author='" + author + '\'' +
                ", nhaSx='" + nhaSx + '\'' +
                '}';
    }
}
