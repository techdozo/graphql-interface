package dev.techdozo.graphql.domain.model;

public record OnlineCourse(Integer id, String name, Double price, String startDate, String endDate)
    implements Course {}
