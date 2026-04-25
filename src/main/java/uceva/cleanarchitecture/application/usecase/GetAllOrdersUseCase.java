package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Order;
import uceva.cleanarchitecture.domain.repository.OrderRepository;

import java.util.List;

/**
 * Caso de uso para obtener todas las órdenes.
 * 
 * Encapsula la lógica de negocio de recuperar órdenes.
 */
public class GetAllOrdersUseCase {

    private final OrderRepository orderRepository;

    public GetAllOrdersUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> execute(int countOrders) {
        return orderRepository.getAll(countOrders);
    }
}