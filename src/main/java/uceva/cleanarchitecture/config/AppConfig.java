package uceva.cleanarchitecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uceva.cleanarchitecture.application.usecase.GetAllProductsUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllUsersUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllOrdersUseCase;
import uceva.cleanarchitecture.domain.repository.ProductRepository;
import uceva.cleanarchitecture.domain.repository.UserRepository;
import uceva.cleanarchitecture.domain.repository.OrderRepository;
import uceva.cleanarchitecture.infrastructure.datasource.ProductDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.UserDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.OrderDatasource;
import uceva.cleanarchitecture.infrastructure.repository.ProductRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.UserRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.OrderRepositoryImpl;

@Configuration
public class AppConfig {

    @Bean
    UserDatasource userDatasource(){
        return new UserDatasource();
    }

    @Bean
    ProductDatasource productDatasource(){
        return new ProductDatasource();
    }

    @Bean
    OrderDatasource orderDatasource() {
        return new OrderDatasource();
    }

    @Bean
    UserRepository userRepository(UserDatasource userDatasource) {
        return new UserRepositoryImpl(userDatasource);
    }

    @Bean
    ProductRepository productRepository(ProductDatasource productDatasource) {
        return new ProductRepositoryImpl(productDatasource);
    }

    @Bean
    OrderRepository orderRepository(OrderDatasource orderDatasource) {
        return new OrderRepositoryImpl(orderDatasource);
    }

    @Bean
    GetAllUsersUseCase getAllUsersUseCase(UserRepository userRepository) {
        return new GetAllUsersUseCase(userRepository);
    }

    @Bean
    GetAllProductsUseCase getAllProductsUseCase(ProductRepository productRepository) {
        return new GetAllProductsUseCase(productRepository);
    }

    @Bean
    GetAllOrdersUseCase getAllOrdersUseCase(OrderRepository orderRepository) {
        return new GetAllOrdersUseCase(orderRepository);
    }

}
