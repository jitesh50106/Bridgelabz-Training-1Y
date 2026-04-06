package com.gla;

public class Library {

    private LibraryRepository libraryRepository;

    public Library() {
        this.libraryRepository = new LibraryRepository();
    }

    public LibraryRepository getLibraryRepository() {
        return libraryRepository;
    }
}