package org.jdnet.loginExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.webjars.WebJarAssetLocator;

import java.util.Set;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
        WebJarAssetLocator locator = new WebJarAssetLocator();
    }
}

/**
 * See below for code to identify path for bootstrap files to embed in templates:
 *         String fullPathToBootstrap = locator.getFullPath("bootstrap.js");
 *         System.out.println(fullPathToBootstrap);
 */
