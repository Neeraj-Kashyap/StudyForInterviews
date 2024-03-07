import java.util.*;

public class LRUCache {

    private final int CACHE_SIZE;
    private Deque<Integer> doublyQueue;
    private HashSet<Integer> hashSet;

    LRUCache(int capacity){
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    public void refer(int element){
        if(!hashSet.contains(element)){
            if(doublyQueue.size() == CACHE_SIZE){
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        }else{
            doublyQueue.remove();
        }
        doublyQueue.push(element);
        hashSet.add(element);
    }
    public void display(){
        Iterator<Integer> iterator = doublyQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }

    public static void main(String[] args){

        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.display();

    }
}
