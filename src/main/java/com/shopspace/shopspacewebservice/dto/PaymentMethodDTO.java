package com.shopspace.shopspacewebservice.dto;

public class PaymentMethodDTO {
    private Long id;
    private String name;
    private Integer isCreditDebitCard;

    public PaymentMethodDTO() {
    }

    public PaymentMethodDTO(Long id, String name, Integer isCreditDebitCard) {
        this.id = id;
        this.name = name;
        this.isCreditDebitCard = isCreditDebitCard;
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

    public Integer getIsCreditDebitCard() {
        return isCreditDebitCard;
    }

    public void setIsCreditDebitCard(Integer isCreditDebitCard) {
        this.isCreditDebitCard = isCreditDebitCard;
    }

    @Override
    public String toString() {
        return "PaymentMethodDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isCreditDebitCard=" + isCreditDebitCard +
                '}';
    }
}
