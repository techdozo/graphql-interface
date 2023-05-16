package dev.techdozo.graphql.controller;

import dev.techdozo.graphql.domain.model.*;
import java.util.Collection;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@AllArgsConstructor
public class GraphQLController {

    @QueryMapping()
    public Collection<Course> courses() {
      log.info("Fetching all courses..");
      return List.of(
          new OnlineCourse(1, "Effective Java", 20.99, "01/01/2023", "01/31/2023"),
          new OnlineCourse(2, "Learning Python", 16.99, "03/01/2023", "03/31/2023"),
          new OnlineCourse(2, "Deep Learning", 36.99, "04/01/2023", "04/30/2023"),
          new OfflineCourse(
              1, "Java Basic", 20.99, "01/01/2023", "01/31/2023", new Location("Mumbai")),
          new OfflineCourse(
              2, "Python Basic", 16.99, "03/01/2023", "03/31/2023", new Location("Pune")),
          new OfflineCourse(
              3, "Deep Learning", 36.99, "03/01/2023", "03/31/2023", new Location("New Delhi")));
    }

  @QueryMapping()
  public Collection<Media> allMedia() {
    log.info("Fetching all media..");
    return List.of(
        new Book("Zero to One", "Crown Business", "Peter Thiel"),
        new Book("The Lean Startup", "VIKIN", "Eric Ries"),
        new Movie(
            "The Shawshank Redemption",
            "Frank Darabont",
            List.of("Tim Robbins", "Morgan Freeman", "Bob Gunton")),
        new Movie(
            "The Godfather",
            "Francis Ford Coppola",
            List.of("Marlon Brando", "Al Pacino", "James Caan")));
  }
}
