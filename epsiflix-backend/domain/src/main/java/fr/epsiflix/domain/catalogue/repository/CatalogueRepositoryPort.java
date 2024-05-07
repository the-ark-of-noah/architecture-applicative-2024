package fr.epsiflix.domain.catalogue.repository;

import fr.epsiflix.domain.catalogue.model.Product;
import fr.epsiflix.domain.shared.UniqueId;

public interface CatalogueRepository {
    void addProduct(Product product);
    void removeProduct(Product product);
    void updateProduct(Product product);
    Product getProductDetails(UniqueId productId);
    List<Product> getAllProducts();
}