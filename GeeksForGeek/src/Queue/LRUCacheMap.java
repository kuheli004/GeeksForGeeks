package Queue;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheMap extends LinkedHashMap{
@Override
protected boolean removeEldestEntry(Map.Entry entry) {
return size() > size;
}

int size = 0;

public LRUCacheMap(int size) {
super(size, 0.25f, true);
this.size = size;
} 

public static LRUCacheMap newinstance(int size){
return new LRUCacheMap(size);
}

public void setMaxSize(int maxsize){
this.size = maxsize;
}

public static void main(String[] args) {
// LRUCacheMap lRUCacheMap = new LRUCacheMap();
LRUCacheMap lruCache = LRUCacheMap.newinstance(3);
//lruCache.setMaxSize(4);
lruCache.put("1", "2");
lruCache.put("2", "3");
lruCache.put("3", "4");
lruCache.put("4", "2");
lruCache.put("5", "1");
System.out.println(lruCache);
}
}