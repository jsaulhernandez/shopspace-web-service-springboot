package com.shopspace.shopspacewebservice.dto;

public class ViewProductDTO {
    private Long id;
    private String image;
    private String color;
    private Integer stock;
    private Long productId;

    public ViewProductDTO() {
    }

    public ViewProductDTO(Long id, String image, String color, Integer stock, Long productId) {
        this.id = id;
        this.image = image;
        this.color = color;
        this.stock = stock;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ViewProductDTO{" +
                "id=" + id +
                ", image='" + image + '\'' +
                ", color='" + color + '\'' +
                ", stock=" + stock +
                ", productId=" + productId +
                '}';
    }
}
