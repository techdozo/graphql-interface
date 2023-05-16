package dev.techdozo.graphql.domain.model;

import java.util.List;

public record Movie(String title, String director, List<String> actors) implements Media {}
