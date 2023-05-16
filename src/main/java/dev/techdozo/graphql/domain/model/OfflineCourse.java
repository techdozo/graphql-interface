package dev.techdozo.graphql.domain.model;

public record OfflineCourse(
    Integer id, String name, Double price, String startDate, String endDate, Location location)
    implements Course {}
