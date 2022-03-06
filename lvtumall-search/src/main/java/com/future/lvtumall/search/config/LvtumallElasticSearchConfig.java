package com.future.lvtumall.search.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: aya
 * @createTime: 2020-06-04 16:46
 **/

@Configuration
public class LvtumallElasticSearchConfig {

    // @Bean
    // public RestHighLevelClient esRestClient(){
    //     RestHighLevelClient client = new RestHighLevelClient(
    //             RestClient.builder(new HttpHost("192.168.137.14", 9200, "http")));
    //     return  client;
    // }

    public static final RequestOptions COMMON_OPTIONS;
    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();
        // builder.addHeader("Authorization", "Bearer " + TOKEN);
        // builder.setHttpAsyncResponseConsumerFactory(
        //         new HttpAsyncResponseConsumerFactory
        //                 .HeapBufferedResponseConsumerFactory(30 * 1024 * 1024 * 1024));
        COMMON_OPTIONS = builder.build();
    }

    @Bean
    public RestHighLevelClient esRestClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("47.93.103.176", 9200, "http")));
        return  client;
    }

}
