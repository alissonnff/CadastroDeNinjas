package dev.franca.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Controller
@RequestMapping // Anotation para as rotas

public class NinjaController {

    @GetMapping("/boasvindas") // Anotation que "pega" informações do meu metodo;
    public String boasVindas(){

        return "Essa é minha primeira mensagem nessa rota";
    }
}
