package repository.impl;


import model.Comic;
import repository.IComicRepo;

import java.util.List;

public class ComicRepo implements IComicRepo {
    static List<Comic> list;
    static {
        list.add(new Comic(1,"a", "s", "d"));
        list.add(new Comic(2,"a", "s", "d"));
        list.add(new Comic(3,"a", "s", "d"));
        list.add(new Comic(4,"a", "s", "d"));
    }

    @Override
    public void displayAll() {

    }

    @Override
    public void addComic(Comic comic) {

    }

}
