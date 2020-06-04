package Database;
public class ColecaoLivro {
int idlivro;
String titulo;
String autor;
int ano;
double preco;
String foto;
int editoria_ideditora;
public ColecaoLivro(int idlivro, String titulo, String autor,int ano,
double preco, String foto, int editora_ideditora){
this.idlivro=idlivro;
this.titulo=titulo;
this.autor=autor;
this.ano=ano;
this.preco=preco;
this.foto=foto;
this.editoria_ideditora = editoria_ideditora;
}
public int getIdlivro(){
    return idlivro;
}
public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;}
public int getAno(){
    return ano;
}
public double getPreco(){
    return preco;
}
public String getFoto(){
    return foto;
}
public int geteditoria_ideditora(){
    return editoria_ideditora;
}
}
