package org.example.filters;

import org.example.File;
import org.example.FilterParam;

public class CreatorFilter extends FileFilter{
    public CreatorFilter(FilterParam fp) {
        super(fp);
    }

    @Override
    public boolean filter(File file) {
        String creator = fp.getCreator();
        return creator == file.getCreator();
    }
}
