package laura.ex1_biblioteca;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("biblioteca")
public class Controller {
    private List<Livro> livros;
    private List<String> titulos;
    private List<String> autores;

    public Controller(){
        livros = new ArrayList<>();
        titulos = new ArrayList<>();
        autores = new ArrayList<>();

        //preenchendo a lista de livros
        livros.add(new Livro(2, "O Cortiço", "Aluísio Azevedo", 1890));
        livros.add(new Livro(3, "Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881));
        livros.add(new Livro(4, "A Moreninha", "Joaquim Manuel de Macedo", 1844));
        livros.add(new Livro(5, "Iracema", "José de Alencar", 1865));
        livros.add(new Livro(6, "Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
        livros.add(new Livro(7, "Macunaíma", "Mário de Andrade", 1928));
        livros.add(new Livro(8, "Vidas Secas", "Graciliano Ramos", 1938));
        livros.add(new Livro(9, "O Guarani", "José de Alencar", 1857));
        livros.add(new Livro(10, "Os Sertões", "Euclides da Cunha", 1902));

        livros.stream().forEach(livro -> {
            titulos.add(livro.getTitulo());
            autores.add(livro.getAutor());
        });
    }

    @GetMapping
    public String mensagemDeBemVindo() {
        return "Bem Vindo a Nossa Biblioteca!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return livros;
    }

    @GetMapping("/titulos")
    public List<String> getTitulos() {
        return titulos;
    }

    @GetMapping("/autores")
    public List<String> getAutores() {
        return autores;
    }


    
    
    
}
