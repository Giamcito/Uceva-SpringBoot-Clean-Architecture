package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllOrdersUseCase;
import uceva.cleanarchitecture.domain.entity.Order;

import java.util.List;

/**
 * Controlador REST para órdenes.
 * 
 * Expone el endpoint GET /orders/{countOrders} para obtener órdenes.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final GetAllOrdersUseCase getAllOrdersUseCase;

    public OrderController(GetAllOrdersUseCase getAllOrdersUseCase) {
        this.getAllOrdersUseCase = getAllOrdersUseCase;
    }

    /**
     * Obtiene una lista de órdenes.
     * 
     * @param countOrders Cantidad de órdenes a recuperar
     * @return Lista de órdenes
     */
    @GetMapping("/{countOrders}")
    public List<Order> getAll(@PathVariable int countOrders) {
        return getAllOrdersUseCase.execute(countOrders);
    }
}