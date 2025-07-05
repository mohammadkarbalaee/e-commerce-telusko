package mohammad.fullstack.ai.ecommercetelusko;

import org.springframework.stereotype.Component;

/**
 * By using {@link Component} annotation,
 * we tell the Spring framework to create this object for us in the
 * IoC container.
 */
@Component
public class Dev {
    /**
     * We want to use this example function
     * as an example way of showing how Spring works.
     */
    public void build() {
        System.out.println("Hello World!");
    }
}
