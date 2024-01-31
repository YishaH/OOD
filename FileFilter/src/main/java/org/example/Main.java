package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.filters.CreatorFilter;
import org.example.filters.FileFilter;
import org.example.filters.FileNameFilter;
import org.example.filters.SizeFilter;
import org.example.operators.AndOperator;
import org.example.operators.OrOperator;

public class Main {
    public static void main(String[] args) {
        File file1 = new File(5, "file1", "A");
        File file2 = new File(5, "file2", "B");
        File file3 = new File(6, "file3", "A");
        File file4 = new File(5, "file4", "C");
        File file5 = new File(6, "file5", "B");
        File file6 = new File(10, "file4", "C");
        File file7 = new File(10, "file5", "B");
        List<File> fileList = new ArrayList<>();
        fileList.add(file1);
        fileList.add(file2);
        fileList.add(file3);
        fileList.add(file4);
        fileList.add(file5);
        fileList.add(file6);
        fileList.add(file7);

        // test single filter
        System.out.println("testing single filter: ");
        List<File> results1 = fileFilter(fileList, new FileNameFilter(FilterParam.createFromFileName("file2")));
        for (File file: results1) {
            System.out.println(file.toString());
        }
        System.out.println("");

        // test combo filter
        System.out.println("testing combo filter: ");
        FilterTreeNode node6 = new FilterTreeNode(new SizeFilter(FilterParam.createFromSize(5)));
        FilterTreeNode node7 = new FilterTreeNode(new CreatorFilter(FilterParam.createFromCreator("B")));
        FilterTreeNode node5 = new FilterTreeNode(new AndOperator(), node6, node7);
        FilterTreeNode node4 = new FilterTreeNode(new CreatorFilter(FilterParam.createFromCreator("A")));
        FilterTreeNode node3 = new FilterTreeNode(new OrOperator(), node4, node5);
        FilterTreeNode node2 = new FilterTreeNode(new SizeFilter(FilterParam.createFromSize(10)));
        FilterTreeNode root = new FilterTreeNode(new OrOperator(), node2, node3);
        List<File> results2 = comboFileFilter(fileList, root);
        for (File file: results2) {
            System.out.println(file.toString());
        }
        System.out.println("");
    }

    public static List<File> fileFilter(List<File> files, FileFilter fileFilter) {
        List<File> results = new ArrayList<>();
        for (File file : files) {
            if (fileFilter.filter(file)) {
                results.add(file);
            }
        }
        return results;
    }

    public static List<File> comboFileFilter(List<File> files, FilterTreeNode root) {
        List<File> results = new ArrayList<>();
        for (File file: files) {
            if (root.eval(file)) {
                results.add(file);
            }
        }
        return results;
    }
}