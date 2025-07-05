package mohammad.fullstack.ai.ecommercetelusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * This is where I am making this decision for my career.
 * I want and will be a fullstack AI developer in Germany.
 */
@SpringBootApplication
public class ECommerceTeluskoApplication {

    public static void main(String[] args) {
        /**
         * For Spring apps to work, there should be a container
         * inside JVM named, IoC (Inversion of Control) container.
         * Tha following line creates that container.
         */
        ApplicationContext context = SpringApplication.run(ECommerceTeluskoApplication.class, args);

        /**
         * When we create an object by ourselves,
         * we are responsible for handling it because it will be
         * created outside the IoC container.
         */
        Dev dev = new Dev();
        dev.build();

        /**
         * This will be handled by Spring though.
         * If you run it this way, you get
         */
        Dev dev2 = context.getBean(Dev.class);
        dev2.build();
    }
}
