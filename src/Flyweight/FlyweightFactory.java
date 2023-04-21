package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    // Store of flyweight objects - can be final if length is known
    private static Map<String, ConcreteFlyweight> cache = new HashMap<>();

    // Lazy instantiation
    public ConcreteFlyweight getFlyweightLazy(String name){
        if(cache.containsKey(name)){
            return cache.get(name);
        }else{
            return new ConcreteFlyweight(name);
        }
    }

    // Fixed instantiation (would be ideal to change the cache data structure if we know the amount)
    static{
        for (int i = 0; i < 10; i++) {
            cache.put(Integer.toString(i), new ConcreteFlyweight(Integer.toString(i)));
        }
    }
    public ConcreteFlyweight getFlyweightInitialized(String name){
        return cache.get(name);
    }



}
