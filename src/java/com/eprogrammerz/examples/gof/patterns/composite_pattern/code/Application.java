package com.eprogrammerz.examples.gof.patterns.composite_pattern.code;

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
        cdrive.addDir(appdir);
        cdrive.addDir(datadir);
        datadir.addDir(coursedir);
        appdir.addFile(excelfile);
        appdir.addFile(wordfile);
        coursedir.addFile(studentsfile);
        cdrive.print();
    }
}
