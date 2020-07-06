package dk.apaq.billy.mapping;

import dk.apaq.billy.model.Product;

public class SingularProductMapping extends ProductMapping implements SingularMapping<Product> {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product contact) {
        this.product = contact;
    }

    @Override
    public Product getEntity() {
        resolveExtraData(product);
        return product;
    }

}
