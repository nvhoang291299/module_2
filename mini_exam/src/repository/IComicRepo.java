package repository;

import model.Comic;

public interface IComicRepo {
    void displayAll();

    void addComic(Comic comic);
}
