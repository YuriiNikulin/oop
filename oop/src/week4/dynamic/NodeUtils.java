package week4.dynamic;

import java.util.Objects;

/**
 * Created by yurii on 09.10.2016.
 */
public class NodeUtils {

    public static Node addToHeard(Node newNode, Node head) {
        return newNode.next = head;
    }

    public static void addToTail(Node newNode, Node head) {
        if (head.next == null) {
            head.next = newNode;
            return;
        }
        addToTail(newNode, head.next);
    }

    public static String toString(Node chain) {
        return chain != null ? chain.value + "->" + toString(chain.next) : "";
    }

    public static Node[] toArray(Node chain) {
        /*int i = 0;
        Node[] nodes = new Node[i];
        while (chain != null) {
            nodes[i] = (Node) chain.value;
            i++;
            toArray(chain.next);
        }
        return nodes;*/
        if (chain == null) {
            return new Node[]{};
        } else {
            Node[] ret = toArray(chain.next);
            Node[] res = new Node[ret.length + 1];
            res[0] = chain;
            System.arraycopy(ret, 0, res, 1, ret.length);
            return res;
        }
    }

    public static Node insertByIndex(int index, Node newNode, Node chain) {

        /*if(index==0){
            newNode.next = chain;
            return null;
        }

        return insertByIndex(--index, newNode, chain);*/

        if (index <= 0) {
            newNode.next = chain;
            return newNode;
        }

        Node iter = chain;
        while (index != 1) {
            iter = iter.next;
            index--;
        }

        Node temp = iter.next;
        newNode.next = temp;
        iter.next = newNode;

        return chain;
    }

    public static Node remove(int index, Node chain) {
        return null;
    }

    public static int indexOf(Object target, Node chain) {
        if(chain==null){
            return -1;
        }
        if (chain.value.equals(target)){
            return 1;
        }
        int res = indexOf(target, chain.next);

        if (res!=1){
            return 1+res;
        }else {
            return res;
        }
    }

    public static Node reverse() {
        return null;
    }
}
