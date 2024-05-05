package fr.epsiflix.domain.catalogue.repository;

public interface CatelogueRepository {
    void addProduct(Product product);
    void removeProduct(Product product);
    void updateProduct(Product product);
    Product getProductDetails(UniqueId productId);
    List<Product> getAllProducts();
}