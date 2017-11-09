package net.thumbtack.denisenko.trainee.exceptions;

import java.io.File;

public class FileException extends Exception {

    private File file;

    public FileException(){
        super();
    }

    public FileException(String message){
        super(message);
    }

    public FileException(String message, Throwable throwable){
        super(message, throwable);
    }

    public FileException(String message, Throwable throwable, File file){
        super(message, throwable);
        this.file = file;
    }

    public File getFile() {
        return file;
    }

}
