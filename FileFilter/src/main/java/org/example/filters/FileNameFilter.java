package org.example.filters;

import org.example.File;
import org.example.FilterParam;

public class FileNameFilter extends FileFilter{
    public FileNameFilter(FilterParam fp) {
        super(fp);
    }

    @Override
    public boolean filter(File file) {
        String fileName = fp.getFileName();
        return fileName.equals(file.getName());
    }
}
