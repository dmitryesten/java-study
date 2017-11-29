package net.thumbtack.denisenko.trainee.nio;

import net.thumbtack.denisenko.trainee.exceptions.FileException;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;


public class ChangeExtensionFile {

    private File folder;

    public ChangeExtensionFile(File folder) throws FileException {
        setFolder(folder);
    }

    public ChangeExtensionFile(String folder) throws FileException {
        this(new File(folder));
    }

    private FilenameFilter filter = new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            return (name.endsWith(".dat")) ? true : false;
        }
    };

    public void change(){
        File[] listOfFiles = folder.listFiles(filter);
        StringBuilder name;
        for (File file: listOfFiles) {
            name = new StringBuilder(file.getName());
            name.replace(name.indexOf("."), name.length(), ".bin");
            file.renameTo(new File(folder.getAbsoluteFile()+"\\"+name.toString()));
        }
    }

    public File getFolder() {
        return folder;
    }

    private void setFolder(File folder) throws FileException {
        if(!folder.isDirectory())
            throw  new FileException(folder+" isn't directory");
        else this.folder = folder;
    }


}
