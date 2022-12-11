package pl.kamil.spring2.springbootstarter.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringBootStarterIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void healthEndpointShouldReturnUP() {
        String body = this.restTemplate.getForObject("/actuator/health", String.class);

        assertThat(body).isEqualTo("{\"status\":\"UP\"}");
    }
}
