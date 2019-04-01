package com.sise.controller;

import com.sise.service.RedisService;
import com.sise.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Gentle
 * @Date: 2019/3/30 22:43
 * @Description: redis 调用 api
 */
@RestController
@RequestMapping(value = "api/redis/")
public class RedisController {
    @Autowired
    RedisService redisService;


    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @param value  redis存入的值
     * @param time 该参数是指时间。时间以秒为计算单位
     * @return 返回
     */
    @PostMapping(value = "set")
    public Integer set(@RequestParam(value = "key") String key,
                      @RequestParam(value = "value") String value,
                      @RequestParam(value = "time",required = false) Integer time){
        if (time==null){
            redisService.set(key,value);
        }else {
            redisService.set(key,value,time);
        }
        return 0;
    }

    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @param value  redis存入的值
     * @param time 该参数是指时间。时间以秒为计算单位
     * @param field 哈希存入 redis 的字段，传入需要指定
     * @return
     */
    @PostMapping(value = "hset")
    public Integer hset(@RequestParam(value = "key") String key,
                      @RequestParam(value = "value") String value,
                      @RequestParam(value = "field") String field,
                      @RequestParam(value = "time",required = false) Integer time){
        if (time==null){
            redisService.hashSet(key,field,value);
        }else {
            redisService.hashSet(key,field,value,time);
        }
        return 0;
    }
    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @param field 哈希存入 redis 的字段，传入需要指定
     * @return 返回 redis 哈希槽中存的值
     */
    @PostMapping(value = "hset")
    public String hget(@RequestParam(value = "key") String key,
                        @RequestParam(value = "field") String field){

        return redisService.hashGet(key, field);
    }

    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @return 返回键对应的值
     */
    @PostMapping(value = "get")
    public String get(@RequestParam(value = "key") String key){
        return redisService.get(key);
    }

    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @param count 增加的值，如果不穿该参数，redis 自增是 +1,传入 2  则加 2
     * @return
     */
    @PostMapping(value = "incr")
    public Long incr(@RequestParam(value = "key") String key,@RequestParam(value = "count",required = false) Integer count){

        if (count==null){
            return redisService.incr(key);
        }
        return redisService.incr(key,count);

    }
    /**
     * @Author  Gentle
     * @param key redis存入的键
     * @param count 减少的值，如果不穿该参数，redis 自增是 -1,传入 2  则减 2
     * @return
     */
    @PostMapping(value = "decr")
    public Long decr(@RequestParam(value = "key") String key,@RequestParam(value = "count",required = false) Integer count){

        if (count==null){
            return redisService.decr(key);
        }
        return redisService.decr(key,count);
    }
    /**
     * @Author  Gentle
     * @param keys 批量获取，传入相对应的键
     * @return  返回对应的值
     */
    @PostMapping(value = "getMany")
    public List<String> getMany(@RequestParam(value = "keys") String keys){
        List<String> strings = JsonUtils.jsonToList(keys, String.class);
        return redisService.getMany(strings);
    }

}
