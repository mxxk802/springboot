package com.mxxk.designPattern.Composite;

import java.util.Enumeration;

/**
 * Tree
 *
 * @auther zhang
 * @date 2020/12/11
 **/
public class Tree {

    private TreeNode root=null;

    public Tree(String  name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree=new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        tree.root.add(nodeC);

        Enumeration<TreeNode> nodes=tree.root.getChildren();
        while(nodes.hasMoreElements()){
            System.out.println(nodes.nextElement().getName());

        }

    }
}
