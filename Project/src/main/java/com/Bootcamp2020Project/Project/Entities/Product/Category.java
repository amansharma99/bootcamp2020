package com.Bootcamp2020Project.Project.Entities.Product;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Product> products;
    private String name;
    @ManyToOne
    @JoinColumn(name = "ParentId")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private Set<Category> subCategories;

    public Category() {
        parentCategory = null;
    }

    public Category(String name) {
        this.name = name;
        parentCategory = null;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<Category> subCategories) {
        this.subCategories = subCategories;
    }
    public void addSubCategory(Category category){
        if(category != null){
            if(subCategories == null)
                subCategories = new HashSet<>();

            subCategories.add(category);
            category.setParentCategory(this);
        }
    }



    @Override
    public String toString() {
        return "Category{" +
                "products=" + products +
                ", name='" + name + '\'' +
                ", parentCategory=" + parentCategory +
                ", subCategories=" + subCategories +
                '}';
    }
}