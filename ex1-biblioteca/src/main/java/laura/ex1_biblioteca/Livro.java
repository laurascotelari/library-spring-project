package laura.ex1_biblioteca;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;

    //construtor
    public Livro(int id, String titulo, String autor, int ano){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }

    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }



    
}
