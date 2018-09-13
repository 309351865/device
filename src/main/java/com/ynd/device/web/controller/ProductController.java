package com.ynd.device.web.controller;

import com.ynd.device.domain.Product;
import com.ynd.device.model.base.ApiResult;
import com.ynd.device.model.query.ProductQuery;
import com.ynd.device.service.ProductService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ZhuRui on 2018/2/7.
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    private Logger log = Logger.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/view",method={ RequestMethod.GET, RequestMethod.POST})
    public ModelAndView view(){
        return  new ModelAndView("product/product");
    }

    @RequestMapping(value = "/view1",method={ RequestMethod.GET, RequestMethod.POST})
    public ModelAndView view1(){
        return  new ModelAndView("product/product");
    }

    @RequestMapping(value = "/view2",method={ RequestMethod.GET, RequestMethod.POST})
    public String view2(){
        return  "product/product";
    }

//    @PostMapping("create")
    @RequestMapping(value = "/create",method={ RequestMethod.GET, RequestMethod.POST})
    public ApiResult createProduct(HttpServletRequest request, Product product){
        productService.createProduct(product);
        return ApiResult.success();
    }

    @PostMapping("/update")
    public ApiResult updateProduct(Product product){
        productService.modifyProduct(product);
        return ApiResult.success();
    }

    @PostMapping("/delete")
    public ApiResult deleteProduct(@RequestParam long id){
        productService.deleteProduct(id);
        return ApiResult.success();
    }

    @GetMapping("/list")
    public ApiResult listProduct(){
        return ApiResult.success(productService.listProduct());
    }

    @GetMapping("/page")
    public ApiResult pageProduct(ProductQuery query){
        return ApiResult.success(productService.pageProduct(query));
    }







}
