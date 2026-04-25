package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Review;

import java.util.List;

/**
 * Contrato del repositorio de reseñas.
 * 
 * Define el contrato para acceder a los datos de reseñas
 * de manera independiente de la infraestructura.
 */
public abstract class ReviewRepository {
    public abstract List<Review> getAll(int countReviews);
}
