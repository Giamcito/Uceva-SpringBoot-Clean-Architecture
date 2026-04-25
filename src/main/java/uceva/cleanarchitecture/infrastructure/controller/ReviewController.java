package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllReviewsUseCase;
import uceva.cleanarchitecture.domain.entity.Review;

import java.util.List;

/**
 * Controlador REST para reseñas.
 * 
 * Expone el endpoint GET /reviews/{countReviews} para obtener reseñas.
 */
@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final GetAllReviewsUseCase getAllReviewsUseCase;

    public ReviewController(GetAllReviewsUseCase getAllReviewsUseCase) {
        this.getAllReviewsUseCase = getAllReviewsUseCase;
    }

    /**
     * Obtiene una lista de reseñas.
     * 
     * @param countReviews Cantidad de reseñas a recuperar
     * @return Lista de reseñas
     */
    @GetMapping("/{countReviews}")
    public List<Review> getAll(@PathVariable int countReviews) {
        return getAllReviewsUseCase.execute(countReviews);
    }
}
