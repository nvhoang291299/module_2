package service;

import model.Comic;
import repository.IComicRepo;
import repository.impl.ComicRepo;
import service.impl.IComicService;

import java.util.Scanner;

public class ComicService implements IComicService {
    IComicRepo iComicRepo = new ComicRepo();
    @Override
    public void addComic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma truyen:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten truyen:");
        String nameComic = sc.nextLine();
        System.out.println("nhap ten tac gia:");
        String author = sc.nextLine();
        System.out.println("nhap nha san xuat:");
        String nhaSx = sc.nextLine();

        Comic comic = new Comic(id, nameComic, author, nhaSx);
        iComicRepo.addComic(comic);
    }

}
