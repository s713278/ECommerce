package com.zensar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.zensar.cart.service.ItemPriceService;
import com.zensar.util.ItemPriceFactory;
import com.zensar.util.PaymentTypeEnum;

@Configuration
public class CartNCheckoutConfig {

	@Value("${spring.redis.host}")
    private String REDIS_HOSTNAME;
    @Value("${spring.redis.port}")
    private int REDIS_PORT;
    
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration(REDIS_HOSTNAME, REDIS_PORT);
        JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder().usePooling().build();
        JedisConnectionFactory jedisConFactory = new JedisConnectionFactory(configuration,jedisClientConfiguration);
        jedisConFactory.afterPropertiesSet();
		return jedisConFactory;
	}
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate(){
		RedisTemplate<String, Object> template = new RedisTemplate<>();
	    template.setConnectionFactory(jedisConnectionFactory());
		return  template;
	}
	
	
	@Bean
	public ItemPriceFactory itemPriceFactory() {
		return new ItemPriceFactory();
	}
	
	@Bean
	public ItemPriceService itemPriceService() {
		return itemPriceFactory().getItemPrice(PaymentTypeEnum.Default);
	}
}
