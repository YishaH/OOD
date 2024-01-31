package org.example.filters;

import org.example.File;
import org.example.FilterParam;

public class SizeFilter extends FileFilter{
    public SizeFilter(FilterParam fp) {
        super(fp);
    }

    @Override
    public boolean filter(File file) {
        int size = fp.getSize();
        return size == file.getSize();
    }
}
