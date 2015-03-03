package org.frenchfrie;

import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by henri on 27/02/15.
 */
public class Starter {

    public static void main(String args[]){
        new SpringApplicationBuilder()
                .showBanner(false)
                .sources(Application.class)
                .run(args);
    }
}
