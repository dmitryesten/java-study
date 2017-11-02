package net.thumbtack.denisenko.trainee.exceptions;

import java.io.File;

public class FileException extends Exception {

    private File file;

    public FileException(){
        super("File is not found");
    }

    public FileException(File file){
        super("File "+file+" is not found");
        this.file = file;
    }


}
