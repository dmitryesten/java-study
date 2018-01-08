package net.thumbtack.denisenko.trainee.io;

import net.thumbtack.denisenko.trainee.exceptions.FileException;
import java.io.File;

/**
 * Class for checking format's a file for tasks
 * where there is need binary a file for I/O stream
 */

// REVU seems that not used

public class CheckBinaryFileFormat{

    public File getFile() {
        return file;
    }

    private File file;
    private static String bin = "bin";
    private static String dat = "dat";

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
        // REVU too complex. Why do you need to reverse ?
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
