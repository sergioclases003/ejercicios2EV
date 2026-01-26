public class post14 {
    private String titulo;
    private int likes;
    private int dislikes;

    public post14(String titulo) {
        this.titulo = titulo;
        this.likes = 0;
        this.dislikes = 0;
    }

    public void darLike() {
        likes++;
    }

    public void darDislike() {
        dislikes++;
    }

    public int popularidad() {
        return likes - dislikes;
    }

    public static void main(String[] args) {
        post14 miPost = new post14("Aprendiendo Java");
        miPost.darLike();
        miPost.darLike();
        miPost.darLike();
        miPost.darDislike();
        System.out.println("Post: " + miPost.titulo);
        System.out.println("Popularidad: " + miPost.popularidad());
    }
}
