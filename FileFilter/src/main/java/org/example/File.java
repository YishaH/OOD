package org.example;

public class File {
    public int size;
    public String name;
    public String creator;

    public File(int size, String name, String creator) {
        this.size = size;
        this.name = name;
        this.creator = creator;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", creator='" + creator + '\'' +
                '}';
    }
}
