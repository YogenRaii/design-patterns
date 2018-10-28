package com.eprogrammerz.examples.gof.patterns.composite.filesystem;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Application {
    public static void main(String[] args) {

        Drive cdrive = new Drive("C");
        Directory appdir = new Directory("applications");
        Directory datadir = new Directory("my data");
        Directory coursedir = new Directory("cs525");
        File excelfile = new File("msexcel.exe", 2353256);
        File wordfile = new File("msword.exe", 3363858);
        File studentsfile = new File("students.doc", 34252);
        Link fileLink = new Link("fileLink", "C:/cs525/students.doc");
        cdrive.addFileSystem(appdir);
        cdrive.addFileSystem(datadir);
        datadir.addFileSystem(coursedir);
        appdir.addFileSystem(excelfile);
        appdir.addFileSystem(wordfile);
        coursedir.addFileSystem(studentsfile);
        coursedir.addFileSystem(fileLink);

        cdrive.print();
    }
}
