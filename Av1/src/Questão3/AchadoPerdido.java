package Questão3;

public class AchadoPerdido implements Publicacao {
    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String localAchado;
    private String dataHora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String localAchado, String dataHora) {
        this.foto = foto;
        this.localAchado = localAchado;
        this.dataHora = dataHora;
    }

    @Override
    public String buscarTitulo(String tituloBuscado) {
        if (titulo.equals(tituloBuscado)) {
            return "Título: " + titulo + "\nDescrição: " + descricao + "\nLocal Achado: " + localAchado;
        } else {
            return "Não encontrado";
        }
    }

    @Override
    public void visualizarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Foto: " + foto);
        System.out.println("Local Achado: " + localAchado);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
    }
}