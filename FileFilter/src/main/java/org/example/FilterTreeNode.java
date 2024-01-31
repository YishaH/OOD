package org.example;

import org.example.filters.FileFilter;
import org.example.operators.Operator;

public class FilterTreeNode {
    private FileFilter fileFilter;
    private Operator operator;
    private FilterTreeNode left, right;

    // leaf node
    public FilterTreeNode(FileFilter fileFilter) {
        this.fileFilter = fileFilter;
        operator = null;
        left = right = null;
    }

    // non-leaf node
    public FilterTreeNode(Operator operator, FilterTreeNode left, FilterTreeNode right) {
        fileFilter = null;
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public boolean eval(File file) {
        // leaf node
        if (this.fileFilter != null) {
            return fileFilter.filter(file);
        }

        // non-leaf node
        boolean leftEval = this.left.eval(file);
        boolean rightEval = this.right.eval(file);
        return this.operator.calc(leftEval, rightEval);
    }
}
