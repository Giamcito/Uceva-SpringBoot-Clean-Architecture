package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Order;

import java.util.List;

/**
 * Contrato del repositorio de órdenes.
 * 
 * Define el contrato para acceder a los datos de órdenes
 * de manera independiente de la infraestructura.
 */
public abstract class OrderRepository {
    public abstract List<Order> getAll(int countOrders);
}