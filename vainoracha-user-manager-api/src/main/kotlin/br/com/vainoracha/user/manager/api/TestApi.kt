package br.com.vainoracha.user.manager.api

import br.com.vainoracha.user.manager.api.representation.TestRepresentation
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */
@RequestMapping
interface TestApi {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/hello/{name}", produces = [(MediaType.APPLICATION_JSON_UTF8_VALUE)])
    fun hello(@PathVariable(value = "name") name: String): TestRepresentation

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @PutMapping("/hello/{name}", produces = [(MediaType.APPLICATION_JSON_UTF8_VALUE)])
    fun helloPut(@PathVariable(value = "name") name: String): TestRepresentation
}