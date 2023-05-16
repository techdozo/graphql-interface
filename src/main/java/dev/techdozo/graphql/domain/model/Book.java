package dev.techdozo.graphql.domain.model;

public record Book(String name, String publisher, String author) implements Media {}
