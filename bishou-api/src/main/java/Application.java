import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 *
 */
@SpringBootApplication(scanBasePackages = { "com.lkzlee" })
public class Application
{

	public static void main(String[] args)
	{
		System.setProperty("druid.logType", "log4j2");
		//设置配置文件
//		System.setProperty("spring.config.location", "classpath:config.properties");
		SpringApplication.run(Application.class, args);
	}
}
