import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q146_LRU {


    static class Element{
        int value;
        int key;
        Element previous;
        Element next;
        Element (int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    static class LRUCache{
        Element head=new Element(0,0),tail=new Element(0,0);
        Map<Integer,Element> map = new HashMap<>();
        int capacity;

        public LRUCache(int capacity) {
            this.capacity=capacity;
            head.next=tail;
            tail.previous=head;
        }
        public int get(int key) {
            if(map.containsKey(key)){

                Element e = map.get(key);
                remove(e);
                insert(e);
                return e.value;
            }

            return -1;
        }
        public void put(int key, int value) {

            if(map.containsKey(key)){
                remove(map.get(key));

            }
            //if cache is full
            if(capacity == map.size()){
                remove(tail.previous);
            }

            insert(new Element (key,value));

        }

        // 1--> 2 , e =2
        // map.remove(2)..1
        // 2.previous = 1, 1.next = 2.next =null , 1.next = null
        //
        public void remove(Element e){
           map.remove(e.key);
           e.previous.next=e.next;
           e.next.previous = e.previous;

        }

        void insert(Element node){

            map.put(node.key,node);
            Element headNext = head.next;
            head.next = node;
            node.previous = head;
            node.next = headNext;
            headNext.previous = node;
        }
    }

    public static void main(String args[]){


    }
}
