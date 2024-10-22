package com.gustav.bookstore.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.gustav.bookstore.domain.dto.AuthorDTO
import com.gustav.bookstore.domain.entity.AuthorEntity
import com.gustav.bookstore.service.AuthorService
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@SpringBootTest()
@AutoConfigureMockMvc
class AuthorControllerTest @Autowired constructor (
    private val mockMvc: MockMvc,
    @MockBean val authorService: AuthorService
) {
    val objectMapper = ObjectMapper()

    @DisplayName("test that AuthorController returns 200 POST response")
    @Test
    fun `test that AuthorController returns 200 POST response`() {
        mockMvc.post("/v1/authors/create") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(
                AuthorDTO(
                    id = null,
                    name = "Test Name",
                    age = 31,
                    image = "bestimg.jpg",
                    description = "Test Description",
                )
            )
        }.andExpect {
            status { isCreated() }
        }
    }
}