package sg.ctx.dnt;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author yumiao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
@ComponentScan("sg.ctx")
@MapperScan("sg.ctx.dnt.repository")
public class DntApplication implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DntApplication.class);

    public static void main( String[] args )
    {
        SpringApplication.run(DntApplication.class, args );
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
