package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Review;
import uceva.cleanarchitecture.domain.repository.ReviewRepository;

import java.util.List;

/**
 * Caso de uso para obtener todas las reseñas.
 * 
 * Encapsula la lógica de negocio de recuperar reseñas.
 */
public class GetAllReviewsUseCase {

    private final ReviewRepository reviewRepository;

    public GetAllReviewsUseCase(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> execute(int countReviews) {
        return reviewRepository.getAll(countReviews);
    }
}
