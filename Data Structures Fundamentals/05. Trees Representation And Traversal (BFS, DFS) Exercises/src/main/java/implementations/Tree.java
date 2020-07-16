package implementations;

import interfaces.AbstractTree;

import java.util.*;
import java.util.stream.Collectors;

public class Tree<E> implements AbstractTree<E> {
    private E key;
    private Tree<E> parent;
    private List<Tree<E>> children;

    public Tree(E key) {
        this.key = key;
        this.children = new ArrayList<>();
    }

    public Tree() {
        this.children = new ArrayList<>();
    }


    @Override
    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(Tree<E> child) {
        this.children.add(child);
    }

    @Override
    public Tree<E> getParent() {
        return this.parent;
    }

    @Override
    public E getKey() {
        return this.key;
    }

    @Override
    public String getAsString() {
        StringBuilder builder = new StringBuilder();

        buildWithRecurrence(builder, 0, this);

        return builder.toString().trim();
    }

    public String traverseWithBFS() {
        StringBuilder builder = new StringBuilder();
        int ident = 0;
        Deque<Tree<E>> deque = new ArrayDeque<>();

        deque.offer(this);
        while (!deque.isEmpty()) {
            Tree<E> tree = deque.poll();

            if (tree.getParent() != null) {
                ident = 2;
            }
            if (tree.children.size() == 0 && tree.parent.getParent() != null) {
                ident = 4;
            }
            builder.append(this.getPadding(ident))
                    .append(tree.getKey())
                    .append(System.lineSeparator());

            for (Tree<E> child : tree.children) {
                deque.offer(child);
            }
        }
        return builder.toString().trim();
    }


    private void buildWithRecurrence(StringBuilder builder, int ident, Tree<E> tree) {

        builder.append(this.getPadding(ident))
                .append(tree.key)
                .append(System.lineSeparator());

        for (Tree<E> child : tree.children) {
            buildWithRecurrence(builder, ident + 2, child);
        }
    }

    private String getPadding(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    public List<Tree<E>> getLeafKyesWithBfs() {
        Deque<Tree<E>> deque = new ArrayDeque<>();

        deque.offer(this);

        List<Tree<E>> allNodes = new ArrayList<>();

        while (!deque.isEmpty()) {
            Tree<E> currentTree = deque.poll();
            allNodes.add(currentTree);
            for (Tree<E> tree : currentTree.children) {
                deque.offer(tree);
            }
        }
        return allNodes;
    }

    @Override
    public List<E> getLeafKeys() {
        return getLeafKyesWithBfs().stream()
                .filter(tree -> tree.children.size() == 0)
                .map(Tree::getKey)
                .collect(Collectors.toList());
    }

    private List<Tree<E>> traverseTreeWithRecurrence(List<Tree<E>> collection, Tree<E> tree) {
        collection.add(tree);
        for (Tree<E> currentNode : tree.children) {
            traverseTreeWithRecurrence(collection, currentNode);
        }
        return collection;
    }

    @Override
    public List<E> getMiddleKeys() {
        ArrayList<Tree<E>> allKeys = new ArrayList<>();
        this.traverseTreeWithRecurrence(allKeys, this);
        return allKeys.stream()
                .filter(tree -> tree.children.size() > 0 && tree.parent != null)
                .map(Tree::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public Tree<E> getDeepestLeftmostNode() {
        List<Tree<E>> deepestLeftMostNode = new ArrayList<>();
        deepestLeftMostNode.add(new Tree<>());
        int[] maxPath = new int[1];
        int max = 0;

        findDeepestNodeDFS(deepestLeftMostNode, maxPath, max, this);

        return deepestLeftMostNode.get(0);
    }

    private void findDeepestNodeDFS(List<Tree<E>> deepestLeftMostNode, int[] maxPath, int max, Tree<E> tree) {
        if (max > maxPath[0]) {
            maxPath[0] = max;
            deepestLeftMostNode.set(0, tree);
        }
        for (Tree<E> child : tree.children) {
            findDeepestNodeDFS(deepestLeftMostNode, maxPath, max + 1, child);
        }
    }

    private int getStepsFromLeafToRoot(Tree<E> tree) {
        int counter = 0;
        Tree<E> current = tree;
        while (current.parent != null) {
            counter++;
            current = current.parent;
        }
        return counter;
    }

    private boolean isLeaf() {
        return this.children.size() == 0 && this.parent != null;
    }

    @Override
    public List<E> getLongestPath() {
        List<List<E>> longestPathNodes = new ArrayList<>();
        longestPathNodes.add(new ArrayList<>());
        int[] maxPath = new int[1];
        int max = 0;

        findLongestPathDFS(longestPathNodes, maxPath, max, this);
        int maxVal = Integer.MIN_VALUE;
        int counter = 0;
        int i;
        List<E> maxList = new ArrayList<>();
        for (i = 0; i < longestPathNodes.size(); i++) {
            if (maxVal < longestPathNodes.get(i).size()) {
                maxVal = longestPathNodes.get(i).size();
                counter = i;
                maxList = new ArrayList<>(longestPathNodes.get(i));
            }
        }
        Collections.reverse(maxList);
        return maxList;
    }

    private void findLongestPathDFS(List<List<E>> longestPathNodes, int[] maxPath, int max, Tree<E> tree) {
        if (max > maxPath[0]) {
            maxPath[0] = max;
        }

        Tree<E> current = tree;
        if (tree.isLeaf()) {
            List<E> currentList = new ArrayList<>();
            while (current != null) {
                //counter++;
                currentList.add(current.key);
                current = current.parent;
            }
            longestPathNodes.add(currentList);
        }

        for (Tree<E> child : tree.children) {
            findLongestPathDFS(longestPathNodes, maxPath, max + 1, child);
        }
    }

    @Override
    public List<List<E>> pathsWithGivenSum(int sum) {
        List<List<E>> allPaths = new ArrayList<>();
        List<List<E>> pathsWithGivenSum = new ArrayList<>();
        int[] maxPath = new int[1];
        int max = 0;

        findLongestPathDFS(allPaths, maxPath, max, this);
        int maxVal = Integer.MIN_VALUE;
        int counter = 0;
        int i;
        List<E> maxList = new ArrayList<>();
        for (i = 0; i < allPaths.size(); i++) {
            List<E> currentPath = allPaths.get(i);
            int currentSum = 0;
            for (int j = 0; j < currentPath.size(); j++) {
                currentSum = currentSum + Integer.parseInt(String.valueOf((int) currentPath.get(j)));
            }
            if (currentSum == sum) {
                Collections.reverse(currentPath);
                pathsWithGivenSum.add(currentPath);
            }
        }
        return pathsWithGivenSum;
    }

    @Override
    public List<Tree<E>> subTreesWithGivenSum(int sum) {
        List<Tree<E>> allPaths = new ArrayList<>();
        List<List<E>> allTreeSums = new ArrayList<>();

        allPaths.add(this);

        findAllPathsDFS(allPaths, this);

        for (int i = 0; i < allPaths.size(); i++) {
            Tree<E> currentTree = allPaths.get(i);
            List<E> arrList = new ArrayList<>();
            arrList.add(currentTree.key);
            for (int j = 0; j < currentTree.children.size(); j++) {
                List<E> oldlist = new ArrayList<>();
                E currentChildValue = (E) currentTree.children;
                System.out.println();
            }
            allTreeSums.add(i, arrList);
        }

        return null;
    }

    private void findAllPathsDFS(List<Tree<E>> allPaths, Tree<E> tree) {
        for (Tree<E> child : tree.children) {
            allPaths.add(child);
            findAllPathsDFS(allPaths, child);
        }
    }
}
