package week4.dynamic;

/**
 * Created by yurii on 09.10.2016.
 */
public class TestNode {
    public static void main(String[] args) {

        Node head = new Node(1,new Node(2,new Node(3,null)));

        NodeUtils nodeUtils = new NodeUtils();

        nodeUtils.addToHeard(new Node(4,null));
        nodeUtils.addToTail(new Node(4,null));


    }
}
