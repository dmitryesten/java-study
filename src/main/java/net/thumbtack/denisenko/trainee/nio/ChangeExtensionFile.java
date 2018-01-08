package net.thumbtack.denisenko.trainee.nio;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


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

    public void change() throws IOException {
        File[] listOfFiles = folder.listFiles(filter);
        StringBuilder name;
        for (File file: listOfFiles) {
            name = new StringBuilder(file.getName());
            name.replace(name.indexOf("."), name.length(), ".bin");
            Files.move(file.toPath(), new File(folder.getAbsoluteFile()+"\\"+name.toString()).toPath(), REPLACE_EXISTING );
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
