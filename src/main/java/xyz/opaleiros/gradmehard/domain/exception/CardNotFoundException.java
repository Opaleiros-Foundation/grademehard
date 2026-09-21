package xyz.opaleiros.gradmehard.domain.exception;

public class CardNotFoundException extends RuntimeException {
    public CardNotFoundException(String id) {
        super("Card com id" + id + "não encontrado");
    }
}
