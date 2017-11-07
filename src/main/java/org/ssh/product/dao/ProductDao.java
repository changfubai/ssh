package org.ssh.product.dao;

import org.ssh.product.model.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {

    void saveProduct(Product product);

}