package uceva.cleanarchitecture.domain.entity;

/**
 * Entidad que representa una reseña de un producto.
 * 
 * Contiene la información de una reseña incluyendo
 * referencias al usuario y producto, calificación,
 * comentario y fecha.
 */
public class Review {
    public Integer id;
    public Integer userId;
    public Integer productId;
    public Integer rating;
    public String comment;
    public String date;

    public Review(Integer id, Integer userId, Integer productId, Integer rating, String comment, String date) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }
}
