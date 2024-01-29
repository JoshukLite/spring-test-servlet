package org.example.web;

import lombok.SneakyThrows;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class SimpleServletTest {

    @LocalServerPort
    private int port;

    @Test
    @SneakyThrows
    void testGet() {
        // data
        // given
        // when
        WebTestClient webClient = WebTestClient.bindToServer()
                .baseUrl("http://localhost:" + port + "/")
                .build();
        webClient.get()
                .uri("/servlet")
                .exchange()
                .expectStatus()
                .isOk()
                .expectBody(String.class)
                .value(Matchers.equalTo("GET RESPONSE FROM SERVLET"));
        // verify
    }
}
