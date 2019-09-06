package demo.model;

import lombok.Data;

import java.util.UUID;

@Data
public class MSDEMessage {
    private final UUID id = UUID.randomUUID();
    private final String message = "Congratulations from MSDE! Welcome to your new Spring Application.";
}
