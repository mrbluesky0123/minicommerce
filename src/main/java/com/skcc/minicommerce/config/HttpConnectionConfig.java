package com.skcc.minicommerce.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConnectionConfig {

  @Bean
  public RestTemplate getCustomRestTemplate() {
    HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory =
        new HttpComponentsClientHttpRequestFactory();
    httpComponentsClientHttpRequestFactory.setConnectTimeout(2000);
    httpComponentsClientHttpRequestFactory.setReadTimeout(3000);
    HttpClient httpClient = HttpClientBuilder.create()
        .setMaxConnTotal(20)
        .setMaxConnPerRoute(200)
        .build();
    httpComponentsClientHttpRequestFactory.setHttpClient(httpClient);
    return new RestTemplate(httpComponentsClientHttpRequestFactory);

  }
}
