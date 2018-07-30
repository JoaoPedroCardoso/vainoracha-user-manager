package br.com.vainoracha.user.manager.service

import br.com.vainoracha.user.manager.model.Test
import org.springframework.stereotype.Service

/**
 * Created by JoaoPedroCardoso on 24/05/18
 */
@Service
class TestService{

    fun hello(name: String) : Test = Test("Hello $name!")
}