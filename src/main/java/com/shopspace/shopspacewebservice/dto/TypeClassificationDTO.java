package com.shopspace.shopspacewebservice.dto;

public class TypeClassificationDTO {
    private Long id;
    private String name;
    private ClassificationCategoriesDTO classificationCategories;
    private Integer available;

    public TypeClassificationDTO() {
    }

    public TypeClassificationDTO(Long id, String name, ClassificationCategoriesDTO classificationCategories) {
        this.id = id;
        this.name = name;
        this.classificationCategories = classificationCategories;
    }

    public TypeClassificationDTO(Long id, String name, ClassificationCategoriesDTO classificationCategories, Integer available) {
        this.id = id;
        this.name = name;
        this.classificationCategories = classificationCategories;
        this.available = available;
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

    public ClassificationCategoriesDTO getClassificationCategories() {
        return classificationCategories;
    }

    public void setClassificationCategories(ClassificationCategoriesDTO classificationCategories) {
        this.classificationCategories = classificationCategories;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "TypeClassificationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classificationCategories=" + classificationCategories +
                ", available=" + available +
                '}';
    }
}
