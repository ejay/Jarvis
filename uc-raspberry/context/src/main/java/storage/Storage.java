package storage;

import redis.clients.jedis.Jedis;

public class Storage {
    private String host;

    public Storage(String host) {
        this.host = host;
    }

    public void store(String key, String value){
        try(
                Jedis jedis = new Jedis(host)
                ){
            jedis.set(key, value);
        }
    }
}
