
    package org.springframework.api_tests;
  
    import com.intuit.karate.Results;
    import com.intuit.karate.Runner;
    // import com.intuit.karate.http.HttpServer;
    // import com.intuit.karate.http.ServerConfig;
    import org.junit.jupiter.api.Test;
  
    import static org.junit.jupiter.api.Assertions.assertEquals;
  
    class FinnabTest {
  
        @Test
        void testAll() {
            String finnab_9d4e0367fa_url = System.getenv().getOrDefault("FINNAB_9D4E0367FA_URL", "http://127.0.0.1:4010");
            Results results = Runner.path("src/test/java/org/springframework/api_tests/Finnab")
                    .systemProperty("FINNAB_9D4E0367FA_URL",finnab_9d4e0367fa_url)
                    .reportDir("testReport").parallel(1);
            assertEquals(0, results.getFailCount(), results.getErrorMessages());
        }
  
    }
