/**
 * Created by Jason on 7/15/17.
 */
import java.util.LinkedList;

public class versionList {
    public int id;
    private LinkedNode start;
    private LinkedNode head;

    private class LinkedNode {
        private LinkedNode() {
            head = new LinkedNode();
            start = head;
        }

    }


}
