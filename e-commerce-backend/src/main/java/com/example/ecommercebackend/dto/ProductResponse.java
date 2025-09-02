package com.example.ecommercebackend.dto;

import java.util.List;

public class ProductResponse {

    private List<ProductDTO> content;
    private Integer pageNumber;
    private Integer pageSize;
    private Long totalElements;
    private Integer totalPages;
    private Boolean lastPage;

    // Default constructor
    public ProductResponse() {
    }

    // All args constructor
    public ProductResponse(List<ProductDTO> content, Integer pageNumber, Integer pageSize,
                           Long totalElements, Integer totalPages, Boolean lastPage) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.lastPage = lastPage;
    }

    // Custom constructor (như bạn đã có sẵn)
    public ProductResponse(List<ProductDTO> content, int number, int size,
                           long totalElements, int totalPages, boolean last) {
        this.content = content;
        this.pageNumber = number;
        this.pageSize = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.lastPage = last;
    }

    // Getters & Setters
    public List<ProductDTO> getContent() {
        return content;
    }

    public void setContent(List<ProductDTO> content) {
        this.content = content;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Boolean getLastPage() {
        return lastPage;
    }

    public void setLastPage(Boolean lastPage) {
        this.lastPage = lastPage;
    }
}
