package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * DataSource para generar datos de órdenes simulados.
 * 
 * Utiliza Faker para generar datos realistas de prueba.
 */
public class OrderDatasource {

    private final Faker faker = new Faker();
    private final Random random = new Random();
    private final String[] statuses = {
            "Pending",
            "Processing",
            "Completed",
            "Cancelled"
    };

    public List<Order> getAll(int countOrders) {
        List<Order> orders = new ArrayList<>();
        for (int i = 1; i <= countOrders; i++) {
            orders.add(generateOrder(i));
        }
        return orders;
    }

    private Order generateOrder(Integer id) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return new Order(
                id,
                generateOrderNumber(id),
                faker.name().fullName(),
                faker.number().randomDouble(2, 10000, 500000),
                randomStatus(),
                LocalDateTime.now().minusDays(random.nextInt(30)).format(formatter),
                faker.number().numberBetween(1, 20)
        );
    }

    private String generateOrderNumber(Integer id) {
        return "ORD-" + System.currentTimeMillis() + "-" + id;
    }

    private String randomStatus() {
        return statuses[random.nextInt(statuses.length)];
    }
}