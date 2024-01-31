package org.example;

public class FilterParam {
    private final int size;
    private final boolean hasSize;
    private final String fileName;
    private final boolean hasFileName;
    private final String creator;
    private final boolean hasCreator;

    // Constructor

    private FilterParam(int size, boolean hasSize,
                       String fileName, boolean hasFileName,
                       String creator, boolean hasCreator) {
        this.size = size;
        this.hasSize = hasSize;
        this.fileName = fileName;
        this.hasFileName = hasFileName;
        this.creator = creator;
        this.hasCreator = hasCreator;
    }


    // create methods
    public static FilterParam createFromSize(int size) {
        return new FilterParam(size, true,
                null, false,
                null, false);
    }

    public static FilterParam createFromFileName(String fileName) {
        return new FilterParam(-1, false,
                fileName, true,
                null, false);
    }

    public static FilterParam createFromCreator(String creator) {
        return new FilterParam(-1, false,
                null, false,
                creator, true);
    }

    // getters
    public int getSize() {
        if (hasSize) {
            return size;
        }
        return -1;
    }

    public String getFileName() {
        if (hasFileName) {
            return fileName;
        }
        return null;
    }
    public String getCreator() {
        if (hasCreator) {
            return creator;
        }
        return null;
    }
}
