package com.ynd.device.service;

import com.ynd.device.dao.ProductMapper;
import com.ynd.device.domain.Product;
import com.ynd.device.domain.ProductExample;
import com.ynd.device.model.base.PageData;
import com.ynd.device.model.query.ProductQuery;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by ZhuRui on 2018/2/7.
 */
@Service
public class ProductService {

    private Logger log = Logger.getLogger(this.getClass());

    @Autowired
    private ProductMapper productMapper;


    /**
     * 类型
     */
    public void createProduct(Product product){
        productMapper.insert(product);
    }

    public void modifyProduct(Product product){
        productMapper.updateByPrimaryKey(product);
    }

    public void deleteProduct(Long id){
        productMapper.deleteByPrimaryKey(id);
    }

    public List<Product> listProduct(){
        return productMapper.selectByExample(new ProductExample());
    }

    public PageData<Product> pageProduct(ProductQuery query){

        ProductExample e = new ProductExample();
        ProductExample.Criteria c = e.createCriteria();
        if(query.getId()!=null)
            c.andIdEqualTo(query.getId());
        if(!StringUtils.isEmpty(query.getName()))
            c.andNameLike("%"+query.getName()+"%");

        Long count = productMapper.countByExample(e);

        query.adjustPageNum(count.intValue());
        e.setOrderByClause(query.getOrderField()+ " limit "+query.getOffset()+" , "+query.getPageSize());
        List<Product> list = productMapper.selectByExample(e);
        return new PageData<Product>(query.getPageNum(),query.getPageSize(),count.intValue(),list);

    }

}
