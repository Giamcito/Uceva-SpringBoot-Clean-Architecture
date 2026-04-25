package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Review;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * DataSource para generar datos de reseñas simuladas.
 * 
 * Utiliza Faker para generar datos realistas de prueba.
 */
public class ReviewDatasource {

    private final Faker faker = new Faker();
    private final Random random = new Random();
    
    private final String[] comments = {
        "Excelente producto, muy recomendado. Llegó en perfecto estado.",
        "Buena calidad a precio justo. Satisfecho con la compra.",
        "No me impresionó mucho. Esperaba más por el precio.",
        "Producto defectuoso. Fue reemplazado rápidamente.",
        "Entrega rápida y producto en excelentes condiciones.",
        "La mejor compra que he hecho. Volveré a comprar.",
        "Producto promedio. Nada de especial.",
        "Muy satisfecho. Lo vuelvo a comprar sin dudarlo.",
        "Llego dañado, pero el servicio al cliente fue excepcional.",
        "Recomendado 100%. Producto de calidad garantizada.",
        "Precio un poco alto, pero la calidad lo justifica.",
        "Exactamente lo que esperaba. Muy contento.",
        "No funciona como se describe. Deseo devolverlo.",
        "Superó mis expectativas. Excelente compra.",
        "Entrega tardía, pero el producto llegó en buen estado."
    };

    public List<Review> getAll(int countReviews) {
        List<Review> reviews = new ArrayList<>();
        for (int i = 1; i <= countReviews; i++) {
            reviews.add(generateReview(i));
        }
        return reviews;
    }

    private Review generateReview(Integer id) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return new Review(
                id,
                faker.number().numberBetween(1, 100),
                faker.number().numberBetween(1, 50),
                faker.number().numberBetween(1, 5),
                randomComment(),
                LocalDate.now().minusDays(random.nextInt(365)).format(formatter)
        );
    }

    private String randomComment() {
        return comments[random.nextInt(comments.length)];
    }
}
