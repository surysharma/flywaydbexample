package com.thebigscale;

import org.flywaydb.core.Flyway;

/**as
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        var flyway = Flyway.configure().schemas("flyway_test_schema")
                .dataSource("jdbc:postgresql://localhost/flyway-service", "flyway-service",
                        "password")
//                .dataSource("jdbc:postgresql://localhost/sureshsharma", null, null)
                .load()
                .migrate();
        System.out.println( "Flyway example's hello world!" );
    }
}
