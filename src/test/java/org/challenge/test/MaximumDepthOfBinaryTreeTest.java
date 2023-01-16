package org.challenge.test;

import org.challenge.MaximumDepthOfBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void test() {
        Assertions.assertEquals(0, new MaximumDepthOfBinaryTree().maxDepth(null));
        Assertions.assertEquals(1, new MaximumDepthOfBinaryTree().maxDepth(new MaximumDepthOfBinaryTree.TreeNode()));
        Assertions.assertEquals(2, new MaximumDepthOfBinaryTree().maxDepth(new MaximumDepthOfBinaryTree.TreeNode(0,
                new MaximumDepthOfBinaryTree.TreeNode(), null)));
        Assertions.assertEquals(3, new MaximumDepthOfBinaryTree().maxDepth(new MaximumDepthOfBinaryTree.TreeNode(1,
                new MaximumDepthOfBinaryTree.TreeNode(2, null, null),
                new MaximumDepthOfBinaryTree.TreeNode(3,
                        new MaximumDepthOfBinaryTree.TreeNode(4, null, null),
                        new MaximumDepthOfBinaryTree.TreeNode(5, null,  null)))));
    }

}
