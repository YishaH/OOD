package org.example.filters;

import org.example.File;
import org.example.FilterParam;

public abstract class FileFilter {
    public FilterParam fp;
    public abstract boolean filter(File file);

    public FileFilter(FilterParam fp) {
        this.fp = fp;
    }
}
