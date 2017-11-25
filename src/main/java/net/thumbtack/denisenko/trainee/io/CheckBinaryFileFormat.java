package net.thumbtack.denisenko.trainee.io;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;

/**
 * Class for checking format's a file for tasks
 * where there is need binary a file for I/O stream
 */
public class CheckBinaryFileFormat{

    public File getFile() {
        return file;
    }

    private File file;
    private String bin = "bin";
    private String dat = "dat";

    public CheckBinaryFileFormat(File file) throws FileException {
        setFile(file);
    }

    public CheckBinaryFileFormat(String file) throws FileException {
        this(new File(file));
    }

    /**
     * Return format a file (txt, bin, dat, xml and other)
     * @param file
     */
    private String format(File file) throws FileException {
        StringBuilder fName = new StringBuilder(file.toString());
        return fName.reverse().substring((int) file.length(), 3);
    }

    public void setFile(File file) throws FileException {
        if(format(file).equals(getBin()) || format(file).equals(getDat()))
            throw new FileException("The file hasn't correct format");
        this.file = file;
    }


    private String getBin() {
        return bin;
    }

    private String getDat() {
        return dat;
    }



}
